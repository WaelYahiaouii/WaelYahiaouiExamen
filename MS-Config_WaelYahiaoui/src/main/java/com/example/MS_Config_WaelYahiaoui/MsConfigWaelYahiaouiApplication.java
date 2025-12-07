package com.example.MS_Config_WaelYahiaoui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MsConfigWaelYahiaouiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsConfigWaelYahiaouiApplication.class, args);
	}

}
