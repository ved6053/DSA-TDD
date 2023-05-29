package interview;

import java.util.Objects;

class Employee {
String name;
 int salary;
 Address permanentAddress;
 Address correspondenceAddress;
public Employee(String name, int salary, Address permanentAddress, Address correspondenceAddress) {
	this.name = name;
	this.salary = salary;
	this.permanentAddress = permanentAddress;
	this.correspondenceAddress = correspondenceAddress;
}

@Override
public boolean equals(Object o) {
	if (this == o) return true;
	if (! (o instanceof Employee)) return false;
	Employee employee = (Employee) o;
	return salary == employee.salary && Objects.equals(name, employee.name) && Objects.equals(permanentAddress, employee.permanentAddress) && Objects.equals(correspondenceAddress, employee.correspondenceAddress);
}

@Override
public int hashCode() {
	return Objects.hash(name, salary, permanentAddress, correspondenceAddress);
}

@Override
public String toString() {
	return "interview.Employee{" +
			       "name='" + name + '\'' +
			       ", salary=" + salary +
			       ", permanentAddress=" + permanentAddress +
			       ", correspondenceAddress=" + correspondenceAddress +
			       '}';
	
	
}

}
 
 class Address {
 
 String city;
	String pinCode;
 public Address(String city, String pinCode) {
	 this.city = city;
	 this.pinCode = pinCode;
 }
 
 @Override
 public String toString() {
	 return "interview.Address{" +
			        "city='" + city + '\'' +
			        ", pinCode='" + pinCode + '\'' +
			        '}';
 }
 }
public class Coforge {

/*
List of interview.Employee , sort employee based on Pincode
String s="new Ar
**/
	public static void  main(String[] args){
	
	}

}
