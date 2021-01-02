package com.exhlim.springdependencyinjection;

import com.exhlim.springdependencyinjection.controllers.ConstructorInjectedController;
import com.exhlim.springdependencyinjection.controllers.MyController;
import com.exhlim.springdependencyinjection.controllers.PropertyInjectedController;
import com.exhlim.springdependencyinjection.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDependencyInjectionApplication {

	public static void main(String[] args) {
		/** This line returns back an application context **/
		ApplicationContext ctx = SpringApplication.run(SpringDependencyInjectionApplication.class, args);

		/** From that context, get an instance of this bean (this controller)
		 * Casting is required cause ctx will return an object type
		 * By Default spring creates bean with the naming convention starting with lower case
		 *
		 * When spring runs, those that are being annotated as beans will be created into the context
		 * **/
		MyController myController = (MyController) ctx.getBean("myController");

		/** Here we are asking the context for the controller and calling its method **/
		String greeting = myController.sayHello();

    System.out.println(greeting);

    System.out.print("------ Property based controller ---->  ");

    PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");

    System.out.println(propertyInjectedController.getGreeting());

		System.out.print("------ Setter based controller ---->");

		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");

    System.out.println(setterInjectedController.getGreeting());

		System.out.print("------ Constructor based controller ---->");

		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");

    System.out.println(constructorInjectedController.getGreeting());
	}

}
