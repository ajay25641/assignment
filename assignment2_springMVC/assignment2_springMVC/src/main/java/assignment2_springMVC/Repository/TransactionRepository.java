package assignment2_springMVC.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

import org.springframework.stereotype.Component;

import assignment2_springMVC.Constants.Constants;
import assignment2_springMVC.Model.Transaction;
import assignment2_springMVC.SqlQuery.SqlQuery;


@Component
public class TransactionRepository {

	static Connection connection;
	static {
		try {
			Class.forName("org.postgresql.Driver ");
			try {
				connection = DriverManager.getConnection(Constants.DB_URL,Constants.USER_NAME,Constants.PASSWORD);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    TransactionRepository() throws SQLException {
		/*
		 * try { Class.forName("org.postgresql.Driver "); connection =
		 * DriverManager.getConnection(Constants.DB_URL,Constants.USER_NAME,Constants.
		 * PASSWORD); } catch (ClassNotFoundException e) { // TODO Auto-generated catch
		 * block e.printStackTrace(); } //connection =
		 * DriverManager.getConnection(Constants.DB_URL,Constants.USER_NAME,Constants.
		 * PASSWORD);
		 */    }



    public List<Transaction> getTransactionDetails(){
        List<Transaction> transactions=new ArrayList<>();

        try{
            Statement statement=connection.createStatement();
            ResultSet rs=statement.executeQuery(SqlQuery.GET_TRANSACTION_QUERY);

            while(rs.next()){
                transactions.add(new Transaction(rs.getInt("customerId"),rs.getInt("value")));

            }

        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return transactions;

    }

    public boolean addTransaction(Transaction transaction)  {
        boolean isInserted=false;
        try {
            PreparedStatement statement=connection.prepareStatement(SqlQuery.INSERT_TRANSACTION_QUERY);
            statement.setInt(1,transaction.getCustomerId());
            statement.setInt(2,transaction.getValue());
            int result=statement.executeUpdate();
            if(result>0){
                System.out.println("successfully inserted");
                isInserted=true;
            }

        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return isInserted;

    }
	
}
