package bank.management.system;

import java.sql.*;

public class Conn{
    Connection connection;
    Statement statement;
    public Conn(){
        try{
            //Step-1
            Class.forName("oracle.jdbc.driver.OracleDriver");
            //Step-2
            connection= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","atm", "silicon");
            //Step-3
            statement = connection.createStatement();
           // System.out.println(statement);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public Statement getStatement() {
        return statement;
    }
}
