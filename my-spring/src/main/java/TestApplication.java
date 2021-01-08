import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 源码阅读
 */
public class TestApplication {
	public static void main(String[] args) {
		 //进入 ClassPathXmlApplicationContext
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
		Person person = (Person) applicationContext.getBean("person");
		System.out.println(person.toString());
	}
}
