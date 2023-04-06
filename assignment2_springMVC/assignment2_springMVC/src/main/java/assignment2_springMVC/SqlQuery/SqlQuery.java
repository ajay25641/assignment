package assignment2_springMVC.SqlQuery;

public class SqlQuery {
 
	public static final String  GET_CUSTOMER_QUERY="SELECT * FROM CUSTOMERS;";
    public static final String GET_TRANSACTION_QUERY="SELECT * FROM TRANSACTION;";
    public static final String INSERT_TRANSACTION_QUERY="INSERT INTO TRANSACTION (customerId,value) values(?,?);";
}
