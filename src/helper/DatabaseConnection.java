package helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static String url="";
    private static String userName="";
    private static String password="";
    private static Connection cnx=null;

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cnx= DriverManager.getConnection(url,userName, password);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static Connection getConn(){
        return cnx;
    }




}
