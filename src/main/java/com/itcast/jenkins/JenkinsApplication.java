package com.itcast.jenkins;


import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class JenkinsApplication {

    public static void main(String[] args) {
        SpringApplication.run(JenkinsApplication.class);
    }
}
