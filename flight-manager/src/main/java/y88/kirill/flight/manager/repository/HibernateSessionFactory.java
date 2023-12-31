package y88.kirill.flight.manager.repository;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Component()
public class HibernateSessionFactory {

    private SessionFactory factory;

    @PostConstruct
    public void initFactory(){
        factory = new Configuration()
                .configure("configs/hibernate.cfg.xml")
                .buildSessionFactory();
    }

    @PreDestroy
    public void closeFactory(){
        factory.close();
    }

    public SessionFactory getFactory() {
        return factory;
    }
}
