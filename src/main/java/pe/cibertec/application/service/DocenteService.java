package pe.cibertec.application.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pe.cibertec.application.model.DocenteEntity;

public class DocenteService {
    public DocenteService() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        DocenteEntity docenteEntity = (DocenteEntity) context.getBean("docE");
        System.out.println((docenteEntity) + " DocenteService");
    }

}
