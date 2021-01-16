import com.guozz.selfEditor.Customer;

/**
 * 源码阅读测试类
 */
public class TestApplication {
	public static void main(String[] args) {
		 //进入 ClassPathXmlApplicationContext
		//ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
		//MyClasspathXmlApplicationContext applicationContext = new MyClasspathXmlApplicationContext("bean.xml");
//		Person person = (Person) applicationContext.getBean("person");
//		System.out.println(person.toString());
		//User user = (User)applicationContext.getBean("guozhizhong");

		//System.out.println(user.toString());

		MyClasspathXmlApplicationContext applicationContext = new MyClasspathXmlApplicationContext("selfEditor.xml");
		Customer customer = applicationContext.getBean(Customer.class);
		System.out.println(customer.toString());
	}
}
