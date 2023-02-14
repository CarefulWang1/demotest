package com.wuwei.demotest.ConfigurationProperteis;

import lombok.Data;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

//@ConfigurationProperties(prefix = "user")
@Component
@Data
@Validated
public class UserProperties {

    private Integer userId;

    private  String username;
    private String  pwd;

}
