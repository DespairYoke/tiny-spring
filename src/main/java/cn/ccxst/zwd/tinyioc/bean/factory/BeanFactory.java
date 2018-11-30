package cn.ccxst.zwd.tinyioc.bean.factory;

import cn.ccxst.zwd.tinyioc.bean.BeanDefinition;

/**
 * @author zwd
 * @date 2018/11/29 09:36
 * @Email stephen.zwd@gmail.com
 */
public interface BeanFactory {


    Object getBean(String beanName) throws Exception;

    void registerBeanDefinition(String name, BeanDefinition beanDefinition) throws Exception;

}
