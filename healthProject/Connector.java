import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

public class Connector {
	static Connection conn = null;
	public static void initialize() {
		try {
			// The newInstance() call is a work around for some
			// broken Java implementations

			Class.forName("com.mysql.jdbc.Driver").newInstance();
		} catch (Exception ex) {
			System.out.println("Ex");
		}
		try {
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/healthproject?user=root&password=Mottoman23&useSSL=false");

			// Do something with the Connection

		} catch (SQLException ex) {
			// handle any errors
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		}
		if (conn == null) {
			System.out.println("You are not connected to the databse.");
		}
		else {
			System.out.println("You have successfully connected to the database.");
		}
		// createTable(conn);
	}

	public static void createTable(Connection conn) {
		Statement stmt = null;
		ResultSet rs = null;

		try {
			stmt = (Statement) conn.createStatement();
			stmt.executeUpdate("CREATE TABLE Persons (\r\n" + "id INT(5) AUTO_INCREMENT PRIMARY KEY,\r\n"
					+ "name VARCHAR(50) NOT NULL,\r\n" + "gender CHAR(1),\r\n" + "salary DECIMAL(10, 2),\r\n"
					+ "hasHealthInsurance CHAR(1),\r\n" + "age INT(3),\r\n");

			// Now do something with the ResultSet ....
		} catch (SQLException ex) {
			// handle any errors
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		}
	}

	public static void insertCompany(Company c) {
		initialize();
		String sql = ("INSERT INTO Companies (name, budget, clientNum, officeLoc, employeeNum)"
				+ "VALUES (?, ?, ?, ?, ?)");
		try {
			PreparedStatement preparedStatement;
			preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setString(1, c.getName());
			preparedStatement.setDouble(2, c.getBudget());
			preparedStatement.setInt(3, c.getClientNum());
			preparedStatement.setString(4, c.getOfficeLoc());
			preparedStatement.setInt(5, c.getEmployeeNum());
			preparedStatement.executeUpdate();
			System.out.println("You have successfully inserted a company to the database.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void insertPerson(Person p) {
		initialize();
		String sql = "INSERT INTO Persons (name, gender, salary, hasHealthInsurance, age)"
				+ "VALUES (?, ?, ?, ?, ?)";
		try {
			PreparedStatement preparedStatement;
			preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setString(1, p.getName());
			preparedStatement.setBoolean(2, p.getGender());
			preparedStatement.setDouble(3, p.getSalary());
			preparedStatement.setBoolean(4, p.getInsuranceState());
			preparedStatement.setInt(5, p.getAge());
			preparedStatement.executeUpdate();
			System.out.println("You have successfully inserted a person to the database.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}