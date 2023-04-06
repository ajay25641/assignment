package com.example.assignment2.Repository;

import com.example.assignment2.Constants.Constants;
import com.example.assignment2.Model.Transaction;
import com.example.assignment2.SqlQuery.SqlQuery;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Repository
public class TransactionRepository {
    Connection connection;
    TransactionRepository() throws SQLException {
        connection = DriverManager.getConnection(Constants.DB_URL,Constants.USER_NAME,Constants.PASSWORD);
    }



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
                log.info("successfully inserted");
                isInserted=true;
            }

        } catch (SQLException e) {
            log.info(e.toString());
        }
        return isInserted;

    }
}
