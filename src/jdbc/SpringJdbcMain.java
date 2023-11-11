package jdbc;

import jdbc.model.Person;
import jdbc.service.PersonService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class SpringJdbcMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext=
                new FileSystemXmlApplicationContext("D:\\Eclipse_Workspaces\\CoreJava\\SpringCore\\src\\spring_jdbc.xml");
        PersonService personService=(PersonService) applicationContext.getBean("personService");
        Person person=new Person();
        person.setId(123);
        person.setName("Spring-Jdbc");
        person.setAddress("JDBC-Spring");
        person.setEmail("jdbc@spring.com");
        personService.savePerson(person);

    }
}
