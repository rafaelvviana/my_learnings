package br.com.mylearnings.monitoramentospringbootadmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@Configuration
@EnableAutoConfiguration
@EnableAdminServer
public class MonitoramentoSpringbootAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(MonitoramentoSpringbootAdminApplication.class, args);
	}

}
