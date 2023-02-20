package questspringaopdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import questspringaopdemo.Model.Employee;
import questspringaopdemo.controller.EmployeeManager;


public class QuestSpringAopDemoApplication {

	public static void main(String[] args) {
		

	    ApplicationContext context = new ClassPathXmlApplicationContext("questspringaopdemo.Beans.xml");
	    EmployeeManager manager = context.getBean(EmployeeManager.class);
	 
	    manager.getEmployeeById(1);
	    manager.createEmployee(new Employee());
	}

}
