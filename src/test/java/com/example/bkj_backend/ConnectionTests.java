package com.example.bkj_backend;

import org.junit.Test;
import java.sql.Connection;
import java.sql.DriverManager;

import static org.springframework.test.util.AssertionErrors.fail;

public class ConnectionTests {
    static {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testConnection() {
        try(Connection con =
                    DriverManager.getConnection(
                            "jdbc:mysql://203.252.112.23:3306/juliet", // Corrected Connection String
                            "jy8457",
                            "isel2023")){
            System.out.println(con);
        } catch (Exception e) {
            e.printStackTrace();  // add this line
            fail(e.getMessage());
        }
    }


}
