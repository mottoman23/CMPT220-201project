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
				createPerson();
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
		sc.nextLine();
		String officeLoc = sc.nextLine();
		System.out.println("Please enter the number of employees your company has.");
		int employeeNum = sc.nextInt();
		
		Company c = new Company(compName, compBudget, clientNum, officeLoc, employeeNum);
		Connector.insertCompany(c);
	}
		
		public static void createPerson() {
			System.out.println("Please enter your name.");
			String personName = sc.nextLine();
			System.out.println("Please enter your gender (true for male/false for female).");
			boolean gender = sc.nextBoolean();
			System.out.println("Please enter your yearly salary.");
			double salary = sc.nextDouble();
			System.out.println("You have health insurance; true or false?");
			sc.nextLine();
			boolean hasHealthInsurance = sc.nextBoolean();
			System.out.println("Please enter your age.");
			int age = sc.nextInt();
			
			Person p = new Person(personName, gender, salary, hasHealthInsurance, age);
			Connector.insertPerson(p);
		}
	}
