import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
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

	@Override
	protected void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) {
		System.out.println("扩展实现 postProcessBeanFactory  方法");
	}
}
