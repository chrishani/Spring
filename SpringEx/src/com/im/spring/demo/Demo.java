package com.im.spring.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.im.spring.draw.Circle;
import com.im.spring.draw.Point;
import com.im.spring.draw.Shape;

public class Demo {
	public static void main(String args[]) {
		ApplicationContext bf = new ClassPathXmlApplicationContext("spring.xml");
		
		if(bf.containsBean("working-shape")) {
			Shape shape = (Shape)bf.getBean("working-shape");
			double area = shape.getArea();
			System.out.println("Area = "+area);
		}else {
			System.out.println("Working Shape Not Found");
		}
		
		String[] names = bf.getAliases("rectangle");
		for(String string : names) {
			System.out.println("Other Names For Rectangle = "+string);
		}
		
		Class type = bf.getType("working-shape");
		System.out.println("Working Shape is "+type.getName());
		
		Circle c = (Circle) bf.getBean("working-shape");
		Point p1 = c.getCenter();
		
		System.out.println("P1 x = "p1.getX()+" y="+p1.getY());
		
		
	}
}
