package core;


import com.spring.*;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class SpringDemo {
    public static void main(String[] args) throws PerformanceException {
        ApplicationContext applicationContext=
                new FileSystemXmlApplicationContext("D:\\Eclipse_Workspaces\\CoreJava\\SpringCore\\src\\spring.xml");
        /*BeanFactory beanFactory=new XmlBeanFactory(new FileSystemResource("D:\\Eclipse_Workspaces\\CoreJava\\SpringCore\\src\\spring.xml"));
        GreetingService greetingService=(GreetingService) beanFactory.getBean("greetingService");
        greetingService.sayGreeting();*/
        /*ApplicationContext applicationContext=
                new FileSystemXmlApplicationContext("D:\\Eclipse_Workspaces\\CoreJava\\SpringCore\\src\\spring.xml");
        OneManBand oneManBand=(OneManBand) applicationContext.getBean("band");
        oneManBand.perform();*/
        /*MapTagExample mapTagExample=(MapTagExample) applicationContext.getBean("mapTagExample");
        mapTagExample.perform();*/
        /*PropertiesTagExample propertiesTagExample=(PropertiesTagExample) applicationContext.getBean("propertiesTagExample");
        propertiesTagExample.perform();*/
         InstrumentList instrumentList=(InstrumentList) applicationContext.getBean("instrumentList");
         instrumentList.perform();
         instrumentList.getEmail();
        /*System.out.println(instrumentList);
        InstrumentList instrumentList2=(InstrumentList) applicationContext.getBean("instrumentList");
        instrumentList2.perform();
        System.out.println(instrumentList2);
        InstrumentList instrumentList3=(InstrumentList) applicationContext.getBean("instrumentList");
        instrumentList3.perform();
        System.out.println(instrumentList3);
        InstrumentList instrumentList4=(InstrumentList) applicationContext.getBean("instrumentList");
        instrumentList4.perform();
        System.out.println(instrumentList4);
        System.exit(2);*/


    }
}
