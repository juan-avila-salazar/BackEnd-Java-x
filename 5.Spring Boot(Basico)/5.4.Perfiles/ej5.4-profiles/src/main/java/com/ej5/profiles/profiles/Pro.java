package com.ej5.profiles.profiles;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

@org.springframework.context.annotation.Profile("PRO")
@PropertySource("classpath:pro.properties")
@Service
public class Pro implements Profile {
    @Value("${environment}")
    String environment;

    @Value("${bd.url}")
    String bdURL;

    @Override
    public void readProperties() {
        System.out.println(environment);
        System.out.println(bdURL);
    }
}
