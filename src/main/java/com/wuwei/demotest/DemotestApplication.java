package com.wuwei.demotest;

import com.wuwei.demotest.ConfigurationProperteis.UserProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemotestApplication {



    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(DemotestApplication.class, args);

        UserProperties user = run.getBean("userProperties", UserProperties.class);
        System.out.println(user);
        System.out.println("git  add  后 又进行了修改");
        System.out.println("git  commit  后 又进行了修改");

    }

}
