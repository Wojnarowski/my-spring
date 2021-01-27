import com.guozz.factoryBean.MyFactoryBean;
import com.guozz.selfEditor.Customer;
import com.guozz.selftag.User;

/**
 * 源码阅读测试类
 */
public class TestApplication {
	public static void main(String[] args) throws Exception {
		 //进入 ClassPathXmlApplicationContext
		//ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
		//MyClasspathXmlApplicationContext applicationContext = new MyClasspathXmlApplicationContext("bean.xml");
//		Person person = (Person) applicationContext.getBean("person");
//		System.out.println(person.toString());
		//User user = (User)applicationContext.getBean("guozhizhong");

		//System.out.println(user.toString());

		MyClasspathXmlApplicationContext applicationContext = new MyClasspathXmlApplicationContext("factoryBean.xml");
		//Customer customer = applicationContext.getBean(Customer.class);
		//System.out.println(customer.toString());
		MyFactoryBean myFactoryBean = (MyFactoryBean) applicationContext.getBean("&myFactoryBean");
		System.out.println(myFactoryBean.getObject().toString());

		User user = (User) applicationContext.getBean("myFactoryBean");
		System.out.println(user.toString());

		User user2 = (User) applicationContext.getBean("myFactoryBean");
		System.out.println(user2.toString());

	}
}
