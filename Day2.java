// Exception Handling

// Exception?  -Errors that occur at runtime
// Exception when ocurrs, will abruptly terminate the problem
// So, we need to handle exceptions


// 1) Checked Exception - checked during compile time

// 2) Unchecked Exception - Not checked during compilation and occurs at runtime

// 3) Error - Power failure, hardware failure

// Checked Exceptions: 
// - SQLException
// - IOException
// - ClassNotFoundException

// RuntimeException -> Unchecked Exceptions
//  - NullPointerException
//  - ArithmeticException
//  - IndexOutOfBoundException
//  - NumberFormatException

//RuntimeException is the parent class 

/*
import java.util.Scanner;
class Test 
{
	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter two numbers: ");
		a = sc.nextInt();
		b = sc.nextInt();
		try {
			System.out.println("Result: " + a / b);
			// If an exception occurs, actually an object of the respective exception class
			//is created
			// ArithmeticException class object is thrown
			//throw new ArithmeticException(); - will generate except
		}
		catch(Exception e) {
			System.out.println(e);

			System.out.println("Exception Handled");
		}

		System.out.print("Task Done");
	}

}
*/

// Exception generated by User

/*
class Test {
	public static void main(String[] args) {
		
			System.out.println("generating exception");
			throw new ArithmeticException("created for fun");
			// System.out.print("Exception generated");
	}
}
*/

// Java Database Connection(JDBC) - Project

/*
Steps:
1) Register the Driver
2) Create Connection
3) Create Statement
4) Execute Statement with SQL query
5) Close the connection


*/

import java.sql.*;
class DatabaseConnection {
	public static void main(String[] args) {
		try{
			// Register the Driver
			// Get MySQL connector for Java

			Class.forName("com.mysql.cj.jdbc.Driver");

			// Create connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/essentials", "root", "system");

			//Create Statement
			Statement st = con.createStatement();

			//Executing Query
			ResultSet rs = st.executeQuery("select * from student;");

			while(rs.next())
			{
				System.out.println("Roll: " + rs.getInt(1));
				System.out.println("Name: " + rs.getString(2));
				System.out.println("Mark: " + rs.getInt(3));
			}
		
			//Close connection
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
			System.out.println("Exception Handled");
		}
		

	}

}