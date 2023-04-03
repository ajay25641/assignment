package org.example;



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception{

        String pathCustomer="C:\\Users\\ajay1.kumar\\Desktop\\customer.txt";
        String pathTransaction="C:\\Users\\ajay1.kumar\\Desktop\\transaction.txt";
        String pathConsolidated="C:\\Users\\ajay1.kumar\\Desktop\\Consolidated.txt";

        //for reading customer file
        FileReader fr=new FileReader(pathCustomer);
        BufferedReader br=new BufferedReader(fr);



        //store customer and transaction data into an arraylist
        ArrayList<Customer> customers=new ArrayList<>();
        ArrayList<Transaction>transactions=new ArrayList<>();



        //reading line by line text using bufferedReader
        String text=br.readLine();
        while(text!=null){
            //splitting string based on ","
            String temp[]=text.split(",");

            //extracting data
            String name=temp[0].trim();

            int id=Integer.parseInt(temp[1].trim());

            String location=temp[2].trim();

            customers.add(new Customer(name,id,location));

            text=br.readLine();//forwarding to next line
        }


        //for reading transaction file
        fr=new FileReader(pathTransaction);
        br=new BufferedReader(fr);

        text= br.readLine();

        while(text!=null){
            String temp[]=text.split(",");

            int id=Integer.parseInt(temp[0].trim());

            int value=Integer.parseInt(temp[1].trim());

            transactions.add(new Transaction(id,value));

            text= br.readLine();;

        }

        //calculating our result
        Calculation.calculate(customers,transactions);


        //for exporting our result into a file
        FileWriter fw=new FileWriter(pathConsolidated);

        for(Customer customer:customers){
            fw.write(customer.name+","+customer.customerId+","+customer.value+System.lineSeparator());
        }



        fr.close();;
        fw.close();

    }
}