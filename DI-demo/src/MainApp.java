import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// System.out.println("Hello");
		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("configSpringDI.xml");
		
		Engine engine= context.getBean("myEngine", Engine.class); //new EngineZyhul();//new EngineLanos();
		Car lanos = new Lanos(engine);
		lanos.go();

	}

}
