package version_3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("version_3")
public class SpringConfiguration {
    @Bean// <bean >
    public PlanService planService(){ // this method will play as id also while loading the bean
        return new Plan();
    }

    @Bean
    public GroupPolicy groupPolicy(){
        return new AccidentPolicy();
    }
}
