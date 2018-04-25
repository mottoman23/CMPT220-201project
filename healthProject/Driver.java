import java.util.Scanner;

public class Driver {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Please enter a command.");
		System.out.println("'P' for creating a new person/'C' for creating a new company.");
		System.out.println("'X' to exit the program.");
		String cmd = sc.nextLine().toUpperCase();
		switch(cmd) {
			case "P" :
				System.out.println("You are creating a new person.");
				break;
			case "C" :
				System.out.println("You are creating a new company.");
				createCompany();
				break;
			case "X" :
				System.out.println("You are exiting the program.");
				break;
			default :
				System.out.println("Invalid command.");
				break;
		}
	}
	public static void createCompany() {
		System.out.println("Please enter your company name.");
		String compName = sc.nextLine();
		System.out.println("Please enter your company's budget.");
		double compBudget = sc.nextDouble();
		System.out.println("Please enter the number of clients your company has.");
		int clientNum = sc.nextInt();
		System.out.println("Please enter the office location of your company.");
		String officeLoc = sc.nextLine();
		System.out.println("Please enter the number of employees your company has.");
		int employeeNum = sc.nextInt();
		
		Company c = new Company(compName, compBudget, clientNum, officeLoc, employeeNum);
	}
}
