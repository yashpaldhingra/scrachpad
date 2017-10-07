package com.yash;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.domain.Application;

public class App 
{
    public static void main( String[] args )
    {
    	 String confFile = "spring.xml";
         
    	 ConfigurableApplicationContext context 
         = new ClassPathXmlApplicationContext(confFile);
Application dbConfig = (Application) context.getBean("appDetail");
System.out.println(dbConfig.toString());
context.close();
     
    }
}
