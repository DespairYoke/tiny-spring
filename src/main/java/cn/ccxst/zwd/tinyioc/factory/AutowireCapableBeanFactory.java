package cn.ccxst.zwd.tinyioc.factory;

import cn.ccxst.zwd.tinyioc.BeanDefinition;

/**
 * @author zwd
 * @date 2018/11/29 10:38
 * @Email stephen.zwd@gmail.com
 */
public class AutowireCapableBeanFactory extends AbstractBeanFactory{

    protected Object doCreateBean(BeanDefinition beanDefinition) {
        try {
            return beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
