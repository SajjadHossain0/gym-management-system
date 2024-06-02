package com.ThirdSpaceGymManagementSystem;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import com.tsg.Entities.G_Member;
import com.tsg.Repository.G_Repository;

@SpringBootApplication
@ComponentScan(basePackages = "com.tsg")
/*
 I added this annotation because it was showing whitelebel error
 */
@EnableJpaRepositories(basePackages = "com.tsg.Repository")
@EntityScan(basePackages = "com.tsg.Entities")

public class ThirdSpaceGymManagementSystemApplication{

	public static void main(String[] args) {
		
		SpringApplication.run(ThirdSpaceGymManagementSystemApplication.class, args);

	
	}
	
	
	

	

}
