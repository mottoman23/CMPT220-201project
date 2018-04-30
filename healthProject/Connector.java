import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

public class Connector {
	public static void main(String[] args) {
		try {
			// The newInstance() call is a work around for some
			// broken Java implementations

			Class.forName("com.mysql.jdbc.Driver").newInstance();
		} catch (Exception ex) {
			System.out.println("Ex");
		}
		Connection conn = null;
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
		if (conn != null) {
			System.out.println("Connection is not null.");
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
					+ "hasHealthInsurance CHAR(1),\r\n" + "age INT(3),\r\n" + "homeCity VARCHAR(50),\r\n"
					+ "homeState VARCHAR(50))");

			// Now do something with the ResultSet ....
		} catch (SQLException ex) {
			// handle any errors
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		}
	}

	public static void insertCompany(Company c, Connection conn) {
		String sql = ("INSERT INTO Company (CompanyName, CompanyBudget, AmountOfClients, OfficeLocation, AmountOfEmployees"
				+ "VALUES (c.compName, c.compBudget, c.clientNum, c.officeLoc, c.employeeNum)");
	}
	
	public static void insertPerson(Person p, Connection conn) {
		String sql = ("INSERT INTO Person (PersonName, Gender, YearlySalary, HasHealthInsurance, Age, HomeCity, HomeState"
				+ "VALUES (p.personName, p.gender, p.salary, p.hasHealthInsurance, p.age, p.homeCity, p.homeState)");
	}

}