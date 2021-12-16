package com.assesment.config;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;

@Component
public class SessionConfig {

	public static SessionFactory getsf() {
		Configuration configure = new Configuration().configure();
		SessionFactory sf = configure.buildSessionFactory();
		return sf;
	}
}
