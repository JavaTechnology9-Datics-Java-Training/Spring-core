package core;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class SpringDemo {
    public static void main(String[] args) {
        BeanFactory beanFactory=new XmlBeanFactory(new FileSystemResource("D:\\Eclipse_Workspaces\\CoreJava\\SpringCore\\src\\spring.xml"));
        GreetingService greetingService=(GreetingService) beanFactory.getBean("greetingService");
        greetingService.sayGreeting();
    }
}
