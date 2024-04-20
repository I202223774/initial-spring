import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pe.cibertec.application.model.DocenteEntity;
import pe.cibertec.application.service.DocenteService;

public class InitialSpringApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        DocenteEntity docenteEntity = (DocenteEntity) context.getBean("docE");
        System.out.println(docenteEntity);
        DocenteService docenteService = new DocenteService();
    }
}
