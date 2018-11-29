package cn.ccxst.zwd.tinyioc;

import cn.ccxst.zwd.tinyioc.factory.AutowireCapableBeanFactory;
import cn.ccxst.zwd.tinyioc.factory.BeanFactory;
import org.junit.Test;

/**
 * @author yihua.huang@dianping.com
 */
public class BeanFactoryTest {

	@Test
	public void test() throws Exception {
		// 1.初始化beanfactory
		BeanFactory beanFactory = new AutowireCapableBeanFactory();

		// 2.初始化bean对象
		BeanDefinition beanDefinition = new BeanDefinition();
		beanDefinition.setBeanClassName("cn.ccxst.zwd.tinyioc.HelloWorldService");
		PropertyValues propertyValues = new PropertyValues();
		propertyValues.addPropertyValue(new PropertyValue("text","Hello World !"));
		beanDefinition.setPropertyValues(propertyValues);
		//3.注册bean
		beanFactory.reigisterBeanDefinition("helloWorldService", beanDefinition);
        // 4.获取bean
        HelloWorldService helloWorldService = (HelloWorldService) beanFactory.getBean("helloWorldService");
        helloWorldService.helloWorld();


    }
}
