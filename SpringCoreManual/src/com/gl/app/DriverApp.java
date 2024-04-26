package com.gl.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.gl.config.MyConfiguration;
import com.gl.model.Car;
import com.gl.model.Engine;
import com.gl.model.Gear;
import com.gl.model.Player;
import com.gl.model.Student;

@Component
public class DriverApp {

	public static void main(String[] args) {
		
		Engine e1 = new Engine(101, "Honda Petrol", 12, 1500);
//		Engine e2 = new Engine(102, "Honda Diesel", 12, 1500);
//		
//		Gear g1 = new Gear(201, "Prime Auto", "Automatic");
//		
//		Car c1 = new Car(301, "Q3", "Audi", 1000, e2, g1);
		
		ClassPathXmlApplicationContext beanFactory = new ClassPathXmlApplicationContext("resources/application-context.xml");
		System.out.println("hi");
		//ApplicationContext beanFactory = new AnnotationConfigApplicationContext(MyConfiguration.class);
//		Engine eng = beanFactory.getBean("e2", Engine.class); 
//		System.out.println(eng);
//		
//		Gear gear = (Gear)beanFactory.getBean("g1");
//		System.out.println(gear);
		
		Car myCar = beanFactory.getBean("c1", Car.class);
		System.out.println(myCar);
		
		Player myPlayer1 = (Player)beanFactory.getBean("p1"); 
		System.out.println(myPlayer1);
		
		Player myPlayer2 = (Player)beanFactory.getBean("p1");
		System.out.println(myPlayer2);
		
		System.out.println(myPlayer1 == myPlayer2);
		
		AbstractApplicationContext abs = (AbstractApplicationContext) beanFactory;
		abs.registerShutdownHook();
		
//		Student s1 = (Student)beanFactory.getBean(Student.class);
//		System.out.println(s1);

	}

}
