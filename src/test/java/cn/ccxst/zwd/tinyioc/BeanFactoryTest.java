package cn.ccxst.zwd.tinyioc;

import cn.ccxst.zwd.tinyioc.factory.AutowireCapableBeanFactory;
import cn.ccxst.zwd.tinyioc.factory.BeanFactory;
import cn.ccxst.zwd.tinyioc.io.ResourceLoader;
import cn.ccxst.zwd.tinyioc.xml.XmlBeanDefinitionReader;
import org.junit.Test;

import java.util.Map;

/**
 * @author yihua.huang@dianping.com
 */
public class BeanFactoryTest {

	@Test
	public void test() throws Exception {

		BeanFactory beanFactory = new AutowireCapableBeanFactory();
		//1.配置文件的读取
		XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(new ResourceLoader());
		xmlBeanDefinitionReader.loadBeanDefinitions("tinyioc.xml");

		for (Map.Entry<String,BeanDefinition> beanDefinitionEntry : xmlBeanDefinitionReader.getRegistry().entrySet()) {

			beanFactory.reigisterBeanDefinition(beanDefinitionEntry.getKey(), beanDefinitionEntry.getValue());
		}

        // 4.获取bean
        HelloWorldService helloWorldService = (HelloWorldService) beanFactory.getBean("helloWorldService");
        helloWorldService.helloWorld();


    }
}
