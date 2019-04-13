package cn.edu.nwpu.ms_srm_platformserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MsSrmPlatformserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsSrmPlatformserverApplication.class, args);
    }

}
