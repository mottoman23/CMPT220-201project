import java.util.Scanner;

public class Company {
	private String name;
	private double budget;
	private int clientNum;
	private String officeLoc;
	private int employeeNum;
	
	public Company (String name, double budget, int clientNum, String officeLoc, int employeeNum) {
		this.name = name;
		this.budget = budget;
		this.clientNum = clientNum;
		this.officeLoc = officeLoc;
		this.employeeNum = employeeNum;
	}
	
	String getName() {
		return this.name;
	}
	
	double getBudget() {
		return this.budget;
	}
	
	int getClientNum() {
		return this.clientNum;
	}
	
	String getOfficeLoc() {
		return this.officeLoc;
	}
	
	int getEmployeeNum() {
		return this.employeeNum;
	}
	
	void setName(String updatedName) {
		this.name = updatedName;
	}
	
	void setBudget(double updatedBudget) {
		this.budget = updatedBudget;
	}
	
	void setClientNum(int updatedClientNum) {
		this.clientNum = updatedClientNum;
	}
	
	void setOfficeLoc(String updatedOfficeLoc) {
		this.officeLoc = updatedOfficeLoc;
	}
	
	void setEmployeeNum(int updatedEmployeeNum) {
		this.employeeNum = updatedEmployeeNum;
	}
	
	public static void main(String[] args) {
		Company c1 = new Company("UnitedHealthCare", 10000000, 6000000, "Minnetonka", 250000);
		System.out.println(c1.officeLoc); //example
		Scanner input = new Scanner(System.in); //example
		String newOfficeLoc = input.nextLine(); //example
		c1.setOfficeLoc(newOfficeLoc); //example
		System.out.println(c1.officeLoc); //example
	}
}
