package version_3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Spring3Demo {
    public static void main(String[] args) {
        /*ApplicationContext applicationContext=
                new FileSystemXmlApplicationContext("D:\\Eclipse_Workspaces\\CoreJava\\SpringCore\\src\\spring_version_3.xml");
        Plan plan=(Plan) applicationContext.getBean("plan");
        plan.selectPlan();*/
        AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext();
        applicationContext.register(SpringConfiguration.class);
        applicationContext.refresh();
        Plan plan=(Plan) applicationContext.getBean("planService");
        plan.selectPlan();
    }
}
