package com.kodilla.jdbc;

import org.junit.jupiter.api.Test;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static org.junit.jupiter.api.Assertions.*;

class DbManagerTestSuite {

    @Test
    void testConnect() throws SQLException {
        //Given
        //When
        DbManager dbManager = DbManager.getInstance();
        //Then
        assertNotNull(dbManager.getConnection());
    }

    @Test
    void testSelectUsers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();
        //When
        String sqlQuery = "SELECT * FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);
        //Then
        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getInt("ID") + ", " +
                    rs.getString("FIRSTNAM") + ", " +
                    rs.getString("LASTNAME"));
            counter++;
        }
        rs.close();
        statement.close();
        assertEquals(3, counter);
    }

    @Test
    void testSelectUserAndPosts() throws SQLException {

        DbManager dbManager = DbManager.getInstance();
        String sqlQuerty = "SELECT U.FIRSTNAM, U.LASTNAME, COUNT(*) AS POSTNUMBER FROM USERS U JOIN POSTS P ON U.ID = P.USER_ID  GROUP BY P.USER_ID  HAVING COUNT(*)>2";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuerty);

        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getString("U.FIRSTNAM") + " " + rs.getString("U.LASTNAME") + " " + rs.getInt("POSTNUMBER"));
        }
        rs.close();
        statement.close();
        assertEquals(2, counter);
    }
}