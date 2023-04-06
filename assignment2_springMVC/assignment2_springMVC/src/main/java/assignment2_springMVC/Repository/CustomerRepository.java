package assignment2_springMVC.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

import org.springframework.stereotype.Component;

import assignment2_springMVC.Constants.Constants;
import assignment2_springMVC.Model.Customer;
import assignment2_springMVC.SqlQuery.SqlQuery;


@Component
public class CustomerRepository {
	
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
    CustomerRepository() throws SQLException {
		/*
		 * try { Class.forName("org.postgresql.Driver "); connection =
		 * DriverManager.getConnection(Constants.DB_URL,Constants.USER_NAME,Constants.
		 * PASSWORD); } catch (ClassNotFoundException e) { // TODO Auto-generated catch
		 * block e.printStackTrace(); } //connection =
		 * DriverManager.getConnection(Constants.DB_URL,Constants.USER_NAME,Constants.
		 * PASSWORD);
		 */    }



    public List<Customer> getCustomerDetails(){
        List<Customer> customerList=new ArrayList<>();



        try {

            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(SqlQuery.GET_CUSTOMER_QUERY);
            // Extract data from result set
            while (rs.next()) {
                // Retrieve by column name
                //System.out.println("customerId: " + rs.getInt("customerId"));
                //System.out.println("name: " + rs.getString("name"));
                //System.out.println("price: " + rs.getInt("price"));

                customerList.add(new Customer(rs.getString("name"),rs.getInt("customerId"),rs.getString("location")));

            }


            /*CallableStatement outsampleproc = connection.prepareCall("{ CALL \"SampleSchema\".prodoutdemo(?) }");
            outsampleproc.registerOutParameter(1, Types.VARCHAR);
            outsampleproc.execute();
            String name = outsampleproc.getString(1);
            System.out.println(name);
            outsampleproc.close();*/

        }

        catch (SQLException sq){
            System.out.println(sq);
        }
        finally {

        }
        return customerList;
    }

}
