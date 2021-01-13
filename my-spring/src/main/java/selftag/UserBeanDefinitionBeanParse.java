package selftag;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

public class UserBeanDefinitionBeanParse extends AbstractSingleBeanDefinitionParser {

	/**
	 * 返回属性值所对应的对象
	 * @param element the {@code Element} that is being parsed
	 * @return
	 */
	@Override
	protected Class<?> getBeanClass(Element element) {
		return User.class;
	}

	/**
	 *
	 * @param element the XML element being parsed
	 * @param builder used to define the {@code BeanDefinition}
	 */
	@Override
	protected void doParse(Element element, BeanDefinitionBuilder builder) {
		//super.doParse(element, builder);
		//获取标签的具体属性值
		String userName =element.getAttribute("userName");
		String email =element.getAttribute("email");
		String password =element.getAttribute("password");

		if(StringUtils.hasText(userName)){
			builder.addPropertyValue("userName",userName);
		}

		if(StringUtils.hasText(email)){
			builder.addPropertyValue("email",email);
		}

		if(StringUtils.hasText(password)){
			builder.addPropertyValue("password",password);
		}

	}
}
