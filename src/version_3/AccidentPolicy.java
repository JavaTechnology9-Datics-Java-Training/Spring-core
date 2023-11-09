package version_3;

import org.springframework.stereotype.Component;

//@Component this class we configured as @Bean
public class AccidentPolicy implements GroupPolicy{
    @Override
    public void policyType() {
        System.out.println("Accident Policy");
    }
}
