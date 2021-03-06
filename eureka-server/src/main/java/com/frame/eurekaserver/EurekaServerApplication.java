package com.frame.eurekaserver;

import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Configuration;

import com.frame.util.PerformanceUtil;

@SpringBootApplication
@EnableEurekaServer
@Configuration
@EnableAutoConfiguration
public class EurekaServerApplication{
	public static Date date;
	private static Logger logger = LoggerFactory.getLogger(EurekaServerApplication.class);
	
	public static void main(String[] args) {
		// initialize a time variable
		date = new Date();
		PerformanceUtil performanceUtil = new PerformanceUtil();
		
		System.out.println("============================================================= Start running eureka =============================================================");
//        System.err.println("请输入 slave1 或者 slave2");
//        Scanner scanner = new Scanner(System.in);
//        String profiles = scanner.nextLine();//让用户输入端口号
		SpringApplication.run(EurekaServerApplication.class, args);
        System.out.println("============================================================= eureka starts =============================================================");
        performanceUtil.Eval("eureka", logger);  
	}

}
