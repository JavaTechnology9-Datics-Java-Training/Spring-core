package version_3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component("plan") this class we configured as @Bean
public class Plan implements PlanService{
    @Autowired
    private GroupPolicy groupPolicy;

    @Override
    public void selectPlan() {
        groupPolicy.policyType();
    }
}
