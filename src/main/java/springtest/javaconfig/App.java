package springtest.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import springtest.javaconfig.beans.ChickenSandwich;
import springtest.javaconfig.beans.Sandwich;
import springtest.javaconfig.configuration.AppConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
       
       for(String name :context.getBeanDefinitionNames())
    	   System.out.println(name);
       
   Sandwich chickenSandwich = context.getBean(ChickenSandwich.class);
   System.out.println(chickenSandwich.getName());
    }
}
