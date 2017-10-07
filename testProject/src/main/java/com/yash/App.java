package com.yash;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;

import com.yash.domain.Application;
import com.yash.model.Car;

public class App 
{
    public static void main( String[] args )
    {
    	 String confFile = "spring.xml";
         
    	 ApplicationContext context = new GenericXmlApplicationContext(confFile);
    	 MongoOperations mongoOperation = (MongoOperations)context.getBean("mongoTemplate");
Application dbConfig = (Application) context.getBean("appDetail");
Car car = new Car();
car.setMake("2010");
car.setDescription("desc");
car.setModel("dezire");


// save
mongoOperation.save(car);

System.out.println(dbConfig.toString() );    
    }
}
