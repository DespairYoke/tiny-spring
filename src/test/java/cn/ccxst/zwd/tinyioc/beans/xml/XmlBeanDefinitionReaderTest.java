package cn.ccxst.zwd.tinyioc.beans.xml;

import cn.ccxst.zwd.tinyioc.bean.BeanDefinition;
import cn.ccxst.zwd.tinyioc.bean.io.ResourceLoader;
import cn.ccxst.zwd.tinyioc.bean.xml.XmlBeanDefinitionReader;
import org.junit.Assert;
import org.junit.Test;

import java.util.Map;


/**
 * @author yihua.huang@dianping.com
 */
public class XmlBeanDefinitionReaderTest {

	@Test
	public void test() throws Exception {
		XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(new ResourceLoader());
		xmlBeanDefinitionReader.loadBeanDefinitions("tinyioc.xml");
		Map<String, BeanDefinition> registry = xmlBeanDefinitionReader.getRegistry();
		Assert.assertTrue(registry.size() > 0);
	}
}
