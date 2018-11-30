package cn.ccxst.zwd.tinyioc.context;

import cn.ccxst.zwd.tinyioc.BeanDefinition;
import cn.ccxst.zwd.tinyioc.factory.AbstractBeanFactory;
import cn.ccxst.zwd.tinyioc.factory.AutowireCapableBeanFactory;
import cn.ccxst.zwd.tinyioc.io.ResourceLoader;
import cn.ccxst.zwd.tinyioc.xml.XmlBeanDefinitionReader;

import java.util.Map;

/**
 * @author zwd
 * @date 2018/11/30 21:04
 * @Email stephen.zwd@gmail.com
 */
public class ClassPathXmlApplicationContext extends AbstractApplicationContext{

    private String configLocation;

    public ClassPathXmlApplicationContext(String configLocation) throws Exception{
        this(configLocation,new AutowireCapableBeanFactory());
    }
    public ClassPathXmlApplicationContext(String configLocation, AbstractBeanFactory beanFactory) throws Exception{
        super(beanFactory);
        this.configLocation = configLocation;
        refresh();
    }

    public void refresh() throws Exception {
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(new ResourceLoader());
        xmlBeanDefinitionReader.loadBeanDefinitions(configLocation);
        for (Map.Entry<String, BeanDefinition> beanDefinitionEntry: xmlBeanDefinitionReader.getRegistry().entrySet()) {
            beanFactory.registerBeanDefinition(beanDefinitionEntry.getKey(),beanDefinitionEntry.getValue());
        }
    }
}
