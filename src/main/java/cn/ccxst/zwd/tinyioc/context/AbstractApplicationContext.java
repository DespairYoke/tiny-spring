package cn.ccxst.zwd.tinyioc.context;

import cn.ccxst.zwd.tinyioc.bean.BeanDefinition;
import cn.ccxst.zwd.tinyioc.bean.factory.AbstractBeanFactory;

/**
 * @author zwd
 * @date 2018/11/30 18:59
 * @Email stephen.zwd@gmail.com
 */
public abstract class  AbstractApplicationContext implements ApplicationContext{

    protected AbstractBeanFactory beanFactory;
    @Override
    public Object getBean(String beanName) throws Exception {
        return beanFactory.getBean(beanName);
    }

    public AbstractApplicationContext(AbstractBeanFactory beanFactory) {
        this.beanFactory = beanFactory;
    }
    @Override
    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) throws Exception {

    }
}
