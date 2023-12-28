package spring_with_hibernate.Collector;

import java.util.Scanner;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring_with_hibernate.dao.EmployeeDao;
import spring_with_hibernate.dto.BankAccount;
import spring_with_hibernate.dto.Config;
import spring_with_hibernate.dto.Employee;

public class EmployeeMain {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

//Employee employee=context.getBean("employee",Employee.class);
//employee.setName("punith");
//employee.setAddress("blr");
//employee.setPhone(987654321);
//
//BankAccount bankAccount=context.getBean("bankAccount",BankAccount.class);
//bankAccount.setName("icici");
//bankAccount.setIfsc("icici098754");
//bankAccount.setAddress("blr");
//
//employee.setBankAccount(bankAccount);
//EmployeeDao employeeDao=context.getBean("employeeDao",EmployeeDao.class);
//employeeDao.saveEmployee(employee);

		Scanner scanner = new Scanner(System.in);
		Employee employee = context.getBean("employee", Employee.class);
		BankAccount bankAccount = context.getBean("bankAccount", BankAccount.class);
		EmployeeDao employeeDao = context.getBean("employeeDao", EmployeeDao.class);
		boolean flag = true;
		do {
			System.out.println("1.insert  \n  2.update  \n  3.delete  \n  4.fetchbyid  \n  5.fetchAll  \n  6.exit");
			System.out.println("enter the choice");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("enter the employee name");
				String name = scanner.next();
				System.out.println("enter the employee address");
				String address = scanner.next();
				System.out.println("enter the employee phone");
				long phone = scanner.nextLong();
				System.out.println("enter the bank name");
				String name1 = scanner.next();
				System.out.println("enter the bank address");
				String address1 = scanner.next();
				System.out.println("enter the bank ifsc");
				String ifsc = scanner.next();

				employee.setName(name);
				employee.setAddress(address);
				employee.setPhone(phone);
				bankAccount.setName(name1);
				bankAccount.setAddress(address1);
				bankAccount.setIfsc(ifsc);
				employeeDao.saveEmployee(employee);
				break;
			}
			case 2: {
				System.out.println("enter the id ");
				int id = scanner.nextInt();
				System.out.println("enter the name to be updated");
				String name = scanner.next();
				employee.setId(id);
				employee.setName(name);
				employeeDao.updateEmployee(id, name);
				break;
			}
			case 3: {
				System.out.println("enter the id ");
				int id = scanner.nextInt();
				employee.setId(id);
				employeeDao.deleteEmployee(id);
			}
			case 4: {

				System.out.println("enter the id");
				int id = scanner.nextInt();
				employee.setId(id);
				employeeDao.fetchById(id);
			}
				break;
			case 5: {
				employeeDao.fetchAll();
			}
				break;
			case 6: {
				flag = false;
				System.out.println("thank you");
			}
				break;
			default:
				System.out.println("invalid choice");
			}

		} while (flag);
	}
}