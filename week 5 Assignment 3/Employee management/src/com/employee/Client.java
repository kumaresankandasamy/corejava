package com.employee;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class Client {
private static final int Employee = 0;
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Employee employee1 = new Employee(1,"ram",30000,"Developer");
	Employee employee2 = new Employee(2,"raj",30000,"Admin");
	Employee employee3 = new Employee(3,"ragu",30000,"HR");
	Employee employee4 = new Employee(4,"balu",30000,"Developer");
	Employee employee5 = new Employee(5,"vijay",30000,"Testing");
	Employee employee6 = new Employee(6,"ajith",30000,"DevOps");
	Employee employee7 = new Employee(7,"sundar",30000,"Technical Support");
	Employee employee8 = new Employee(8,"sri",30000,"Manager");
	Employee employee9 = new Employee(9,"ganesh",30000,"Developer");
	Employee employee10 = new Employee(10,"raghuram",30000,"Admin");
    
    List<Employee> employees = new ArrayList<>();
    employees.addAll(employee1,employee2,employee3,employee4,employee5,employee6,employee7,employee8,employee9,employee10);

    System.out.println("1 => Filter the employees having age less than the given input value.\n"+
                       "2 => Filter all the employees having age more than given input value.\n"+
                       "3 => Filter all the employees having salary more than the given value and belong to the given department.\n"+
                       "4 => Print the name of the employees whose salary is greater than the input value and belong to the given department");
    int option = sc.nextInt();
    switch(option){
    	case 1:
    	System.out.println("employee age :");
    	int age = sc.nextInt();
    	System.out.println(filterEmployees(employees,isAgeLessThan(age)));
    	break;
    	case 2:
    	System.out.println("employee age :");
    	int age1 = sc.nextInt();
    	System.out.println(filterEmployees(employees,isAgeMoreThan(age1)));
    	break;
    	case 3:
    	System.out.println("employees salary :");
    	double salary = sc.nextDouble();
    	System.out.println("Enter the department :");
    	String dep = sc.next();
    	System.out.println(filterEmployees(employees,isSalaryMoreThanHigh(salary,dep)));
    	break;
    	case 4:
    	System.out.println("Enter salary");
    	double salary1 = sc.nextDouble();
    	System.out.println("Enter Employee department");
    	String dep1 = sc.next();
    	List<String> emp = (List<String>) employees.stream().filter(isSalaryMoreThanHigh(salary,dep1)).map(emp -> emp.getName().toString().collectors<String>List());
    	System.out.println("emp");
    	break;
    	default:
    	System.out.println("Please choice any value");
    }
}
private static Predicate<Employee> isAgeMoreThan(Integer age) {
	// TODO Auto-generated method stub
	return emp ->emp.getAge() > age;
}
private static List<Employee> filterEmployees(List<Employee>employees,Predicate<Employee>predicate){
	return employees.stream().filter(predicate).collect(Collection<Employee>.toList());
}

public static Predicate<Employee> isAgeLessThan(Integer age){
	return emp -> emp.getAge() < age;
}
public static Predicate<Employee> isSalaryMoreThanHigh(double salary,String dep){
	return emp -> emp.getSalary() > salary && emp.getDepartment().equalsIgnoreCase(dep);
}
public static Predicate<Employee> nameofEmployee(double salary,String dep){
   return emp -> emp.getSalary() >salary && emp.getDepartment().equalsIgnoreCase(dep);

}
}
