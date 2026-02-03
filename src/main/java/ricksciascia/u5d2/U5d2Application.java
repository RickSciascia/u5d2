package ricksciascia.u5d2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ricksciascia.u5d2.entities.MenuLista;
import ricksciascia.u5d2.runners.Runner;

@SpringBootApplication
public class U5d2Application {

	public static void main(String[] args) {
		SpringApplication.run(U5d2Application.class, args);
//        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5d2Application.class);
//        MenuLista menu = ctx.getBean(MenuLista.class);
//        System.out.println(menu);
	}

}
