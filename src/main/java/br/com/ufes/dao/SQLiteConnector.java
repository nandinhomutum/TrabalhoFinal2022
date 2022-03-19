
package br.com.ufes.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLiteConnector implements IConnector {

    private Connection conn;

    private SQLiteConnector() {
    }

    public static SQLiteConnector getInstance() {
        return NewSingletonHolder.INSTANCE;
    }

    private static class NewSingletonHolder {

        private static final SQLiteConnector INSTANCE = new SQLiteConnector();
    }

    @Override
    public Connection connect() {
        if (null == this.getConn()) {
            try {
                // db parameters  
                String url = "jdbc:sqlite:bancoDB.db";
               
                this.conn = DriverManager.getConnection(url);

                System.out.println("Connection to SQLite has been established.");

            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        return this.conn;
    }
    
    public void disconect(){
        if (null != this.getConn()) {        
            try {                
              conn.close();
              System.out.println("Disconected from SQLite.");
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public Connection connect(String url) {
        if (null == this.getConn()) {
            try {
                this.conn = DriverManager.getConnection(url);

                System.out.println("Connection to SQLite has been established.");

            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        return this.conn;
    }

    private Connection getConn() {
        return conn;
    }

}
