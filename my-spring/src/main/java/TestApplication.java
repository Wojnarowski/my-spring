import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 源码阅读
 */
public class TestApplication {
	public static void main(String[] args) {
		 //进入 ClassPathXmlApplicationContext
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("XXX.xml");
		Object object = applicationContext.getBean("a");
		System.out.println("name = " + object);
	}
}
