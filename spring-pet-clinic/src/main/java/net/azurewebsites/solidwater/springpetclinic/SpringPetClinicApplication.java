package net.azurewebsites.solidwater.springpetclinic;

import net.azurewebsites.solidwater.springpetclinic.controller.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringPetClinicApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringPetClinicApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");
		System.out.println(myController.sayHello());
	}

}
