package com.example.assignment2.Repository;

import com.example.assignment2.Constants.Constants;
import com.example.assignment2.Model.Customer;
import com.example.assignment2.Model.Transaction;
import com.example.assignment2.SqlQuery.SqlQuery;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


@Repository
public class CustomerRepository {


    Connection connection;
    CustomerRepository() throws SQLException {
        connection = DriverManager.getConnection(Constants.DB_URL,Constants.USER_NAME,Constants.PASSWORD);
    }



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
