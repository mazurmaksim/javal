package db.stored;

import java.sql.*;

public class StoredProcedure {

// H2 does not maintain stored procedures
// For other databases stored procedure is CREATE PROCEDURE BooksCount(out cnt INT) BEGIN SELECT COUNT(*) INTO cnt from Books; END
    public static void main(String[] args) throws ClassNotFoundException {
        String dbUrl = "jdbc:h2:mem:test";
        String userName = "sa";
        String password = "";
        Class.forName("org.h2.Driver");
        try(Connection conn = DriverManager.getConnection(dbUrl, userName, password);
            Statement statement = conn.createStatement()) {

            statement.executeUpdate("DROP TABLE IF EXISTS Books");
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS Books(id INTEGER NOT NULL AUTO_INCREMENT, name VARCHAR, dt DATE)");
            statement.executeUpdate("INSERT INTO Books(name) values('It')");
            statement.executeUpdate("INSERT INTO Books(name) values('Dark castle')");

            CallableStatement callableStatement = conn.prepareCall("{call BooksCount(?)}");
            callableStatement.registerOutParameter(1, Types.BIGINT);
            callableStatement.execute();
            System.out.println(callableStatement.getInt(1));

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
