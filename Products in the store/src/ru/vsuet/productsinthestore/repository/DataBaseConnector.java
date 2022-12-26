package ru.vsuet.productsinthestore.repository;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnector {
    public static final String DB_URL="jdbc:h2:~/test";
    public static final String DB_USER="sa";

    public static final String DB_PASSWORD="sa";
    private final Connection connection;

    public DataBaseConnector(){
        try {
            connection = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
            System.out.println("DB: "+connection.getMetaData().getDatabaseProductName());
        }catch (SQLException e){
            throw new RuntimeException("Errror while DB connecting ....",e);
        }
    }
    public Connection getConnection() {
        return connection;
    }
}
