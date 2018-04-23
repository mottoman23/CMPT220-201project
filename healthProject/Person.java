import java.util.Scanner;

public class Person {
	private String name;
	private boolean gender;
	private double salary;
	private boolean hasHealthInsurance;
	private int age;
	private String homeCity;
	private String homeState;
	
	public Person (String name, boolean gender, double salary, boolean hasHealthInsurance, int age, String homeCity, String homeState) {
		this.name = name;
		this.gender = gender;
		this.salary = salary;
		this.hasHealthInsurance = hasHealthInsurance;
		this.age = age;
		this.homeCity = homeCity;
		this.homeState = homeState;
	}
	
	String getName() {
		return this.name;
	}
	
	boolean getGender() {
		return this.gender;
	}
	
	double getSalary() {
		return this.salary;
	}
	
	boolean getInsuranceState() {
		return this.hasHealthInsurance;
	}
	
	int getAge() {
		return this.age;
	}
	
	String getHomeCity() {
		return this.homeCity;
	}
	
	String getHomeState() {
		return this.homeState;
	}
	
	void setName(String updatedName) {
		this.name = updatedName;
	}
	
	void setGender(boolean updatedGender) {
		this.gender = updatedGender;
	}
	
	void setSalary(double updatedSalary) {
		this.salary = updatedSalary;
	}
	
	void setInsuranceState(boolean updatedInsuranceState) {
		this.hasHealthInsurance = updatedInsuranceState;
	}
	
	void setAge(int updatedAge) {
		this.age = updatedAge;
	}
	
	void setHomeCity(String updatedHomeCity) {
		this.homeCity = updatedHomeCity;
	}
	
	void setHomeState(String updatedHomeState) {
		this.homeState = updatedHomeState;
	}
	
	public static void main(String[] args) {
		Person p1 = new Person("John", true, 75000, true, 42, "Miami", "Florida");
		System.out.println(p1.name); //example
		Scanner input = new Scanner(System.in); //example
		String newName = input.nextLine(); //example
		p1.setName(newName); //example
		System.out.println(p1.name); //example
		}
	}

