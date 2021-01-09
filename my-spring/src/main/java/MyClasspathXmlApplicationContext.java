import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyClasspathXmlApplicationContext extends ClassPathXmlApplicationContext {

	public MyClasspathXmlApplicationContext(String ... locations) {
		super(locations);
	}

	@Override
	protected void initPropertySources() {
		System.out.println("扩展 initProperties");
		getEnvironment().setRequiredProperties("username");
	}
}
