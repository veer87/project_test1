package HibUtils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateUtils {
	private static SessionFactory sf;
	static{
		Configuration cfg=new Configuration().configure();
		ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(cfg.getProperties()).buildServiceRegistry();
		sf=cfg.buildSessionFactory(reg);
	}
	public static SessionFactory getSf(){
		return sf;
	}
}
