package com.nanos.nanosjms;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NanosJmsApplication {

	public static void main(String[] args) throws Exception {

		// to understand an embedded active mq server is created , usually it will be external
//		ActiveMQServer server = ActiveMQServers.newActiveMQServer(new ConfigurationImpl()
//				.setPersistenceEnabled(false)
//				.setJournalDirectory("target/data/journal")
//				.setSecurityEnabled(false)
//				.addAcceptorConfiguration("invm", "vm://0"));
//
//		server.start();

		SpringApplication.run(NanosJmsApplication.class, args);
	}

}
