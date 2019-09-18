package Assignment2;

/**
 * Submit it on or before 22nd September 2019 , 12:00 pm
 */
public class Assignment2 {
    /*
        This method should return the sum of salaries of employees having salary greater than 5000
        Note: Employee array is passed, not employee
     */
    public static double salaryGreaterThanFiveThousand(Employee[] employees) {
        double sum = 0.0;
        for(Employee i: employees) {
        	if(i.getSalary() > 5000) {
        		sum += i.getSalary();
        	}
        }
        return sum;
    }

    
    /*
        This method should print either "Fizz", "Buzz" or "FizzBuzz"
        "Fizz" - if id of employee is divisible by 3
        "Buzz" - if id of employee is divisible by 5
        "FizzBuzz" - if id of employee is divisible by both 3 and 5
     */
    public static void fizzBuzz(Employee employee) {
        int id = employee.getId();
        if(id % 3 == 0 && id % 5 == 0) {
        	System.out.println("FizzBuzz");
        }else if(id % 3 == 0) {
        	System.out.println("Fizz");
        }else if(id % 5 == 0) {
        	System.out.println("Buzz");
        }
    }

    
    /*
        This method should calculate tax for an employee in dollars
        If salary of employee is less than or equal to 2500, tax should be 10%
        If salary of employee is greater than 2500 but less than or equal to 5000, tax should be 25%
        If salary of employee is greater than 5000, tax should be 35%
    */
    public static double calculateTax(Employee employee) {
        double tax = 0.0;
        if(employee.getSalary() <= 2500) {
        	tax = employee.getSalary() * 0.1;
        }else if(employee.getSalary() <= 5000) {
        	tax = employee.getSalary() * 0.25;
        }else if(employee.getSalary() > 5000) {
        	tax = employee.getSalary() * 0.35;
        }
        return tax;
    }
    
    
    /*
        We are given two employee objects.
        Implement this method to swap salaries of employees
    */
    public void swap(Employee firstEmployee, Employee secondEmployee) {
        double temp = 0.0;
        temp = firstEmployee.getSalary();
        firstEmployee.setSalary(secondEmployee.getSalary());
        secondEmployee.setSalary(temp);
    }

    
    /*
        Return number of employees whose age is greater than 50
        Note: Employee array is passed, not employee
     */
    public int employeesAgeGreaterThan50(Employee[] employees) {
        int num = 0;
        for(Employee i : employees) {
        	if(i.getAge() > 50) {
        		num += 1;
        	}
        }
        return num;
    }

    
    /*
        Implement this method to reverse firstName of employee.
        Ex. Before: employee.getFirstName() -> "John"
        After : employee.getFirstName() -> "nhoJ"
     */
    public void reverseFirstName(Employee employee) {
        StringBuilder firstName = new StringBuilder(employee.getFirstName());
        firstName = firstName.reverse();
        employee.setFirstName(firstName.toString());
    }

    
    /*
        Print "true" if employee's first name contain one or more digits
        Print "false" if employee's first name doesn't contain any digit
        Ex: employee.getFirstName() -> "ha8l" == true
        employee.getFirstName() -> "hail" == false
     */
    public void isContainDigit(Employee employee) {
        String name = employee.getFirstName();
        char[] c = name.toCharArray();
        for(char i : c) {
        	if(i == '1' || i == '2' || i == '3' || i == '4' || i == '5' || i == '6' || i == '7' || i =='8' || i == '9' || i == '0')
        		System.out.println("false");
        	return;
        }
        System.out.println("true");
    }

    
     /*
        Write a method to raise an employee's salary to three times of his/her original salary.
        Eg: original salary was 1000/month. After using this method, the salary is 3000/month.
        DO NOT change the input in this method.
        Try to add a new method in Employee class: public void raiseSalary(double byPercent) 
        Call this new method.
     */
    public void tripleSalary(Employee employee) {
    	employee.raiseSalary(300);
    }
    
    
    //Additional question for extra credit
    /*
        Implement this method to convert String[] to employees array.
        Ex: String[] employees = new String[]{"1,John,24,7500", "2,Hail,28,7899.90"};
        This String array of length 2 contains 2 employees in form of string, where
        id = 1
        firstName=John
        age=24
        salary=7500
        convert each string to employee object.
        Hint: Use String methods. Refer : https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
     */
    public static Employee[] createEmployees(String[] employeesStr) {
        Employee[] employees = new Employee[employeesStr.length];
        for(int i = 0; i < employeesStr.length; i ++) {
        	employees[i] = new Employee();
        	String temp = "";
        	int first = employeesStr[i].indexOf(",");
        	//System.out.println(first);
        	temp = employeesStr[i].substring(0, first);
        	employees[i].setId(Integer.parseInt(temp));
        	int second = employeesStr[i].substring(first + 1).indexOf(",") + first + 1;
        	temp = employeesStr[i].substring(first + 1, second);
        	employees[i].setFirstName(temp);
        	int third = employeesStr[i].substring(second + 1).indexOf(",") + second + 1;
        	temp = employeesStr[i].substring(second + 1, third);
        	employees[i].setAge(Integer.parseInt(temp));
        	temp = employeesStr[i].substring(third + 1);
        	employees[i].setSalary(Double.parseDouble(temp));
        }
        return employees;
    }
    
    public static void main(String[] args) {
    	String[] employees = new String[]{"3,John,24,7500", "2,Hail,28,7899.90"};
    	Employee[] emp = createEmployees(employees);
    	System.out.println(salaryGreaterThanFiveThousand(emp));
    	fizzBuzz(emp[0]);
    	System.out.println(calculateTax(emp[1]));
    	
    }
    
}