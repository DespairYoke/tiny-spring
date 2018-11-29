package cn.ccxst.zwd.tinyioc;

import cn.ccxst.zwd.tinyioc.factory.AutowireCapableBeanFactory;
import cn.ccxst.zwd.tinyioc.factory.BeanFactory;
import org.junit.Test;

/**
 * @author yihua.huang@dianping.com
 */
public class BeanFactoryTest {

	@Test
	public void test() {
		// 1.初始化beanfactory
		BeanFactory beanFactory = new AutowireCapableBeanFactory();

		// 2.注入bean
		BeanDefinition beanDefinition = new BeanDefinition();
		beanDefinition.setBeanClassName("cn.ccxst.zwd.tinyioc.HelloWorldService");
		beanFactory.reigisterBeanDefinition("helloWorldService", beanDefinition);

        // 3.获取bean
        HelloWorldService helloWorldService = (HelloWorldService) beanFactory.getBean("helloWorldService");
        helloWorldService.helloWorld();


    }
}
