package core.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
    	try {
    	ApplicationContext context = new ClassPathXmlApplicationContext("core/spring/configure.xml");
    	System.out.println(context);
    	
    	Employee employee = (Employee) context.getBean("employee");
    	System.out.println(employee);
    	
    	
    	
    	}catch(Exception e)
    	{
    	e.printStackTrace();	
    		
    	}
        
        
    }
}
