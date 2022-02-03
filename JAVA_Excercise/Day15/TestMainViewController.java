package UIController;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ServiceEx.EmployeeServiceDao;

public class TestMainViewController {
	public static void main(String[] args) {
		//starts the spring ioc container -aplicationcontext.
		
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		//how to get object from the container
		//<beans id="empService , class="ServiceEx.EmployeeServiceDao"	
		EmployeeServiceDao service=(EmployeeServiceDao)context.getBean("empService");
		service.save();
		//closing the context
		ClassPathXmlApplicationContext cpx=(ClassPathXmlApplicationContext)(context);
		cpx.close();
	}

}
