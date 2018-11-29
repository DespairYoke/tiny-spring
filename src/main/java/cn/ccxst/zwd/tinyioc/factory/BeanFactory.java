package cn.ccxst.zwd.tinyioc.factory;

import cn.ccxst.zwd.tinyioc.BeanDefinition;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author zwd
 * @date 2018/11/29 09:36
 * @Email stephen.zwd@gmail.com
 */
public interface BeanFactory {


    void reigisterBeanDefinition(String beanName, BeanDefinition beanDefinition);

    Object getBean(String beanName);
}
