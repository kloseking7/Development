package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.glassbox.webinvoice.client.model.AuthenticationResult;
import com.glassbox.webinvoice.client.service.CompanyService;
import com.glassbox.webinvoice.client.service.LoginService;
import com.glassbox.webinvoice.shared.entity.Staff;
import com.glassbox.webinvoice.shared.entity.State;

public class WebinvoiceTest {

	private LoginService loginService;
	private CompanyService companyService;
	@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		companyService = (CompanyService) context.getBean("companyService");
		loginService = (LoginService) context.getBean("login");
		System.out.println("testing");
		AuthenticationResult result = null;
		
		long cID = companyService.newCompany("webinvoice", 1234+"", "alex");
		try {
			for(int i=0;i<5;i++)
			companyService.addStaff("kevin", "asds", "123@", State.NEW, 1234, "city", cID, -1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		result = loginService.authenticateUser("asdasd", "asdasd");
		print(result.isAuthenticated());
		result = loginService.authenticateUser("123456@", "asdasd");
		print(result.isAuthenticated());
		result = loginService.authenticateUser("123@", "3SMeYpi6");
		print(result.isAuthenticated());
	}

	private void addPerson() {

	}

	private void print(Object msg) {
		System.out.println(msg);
	}
}
