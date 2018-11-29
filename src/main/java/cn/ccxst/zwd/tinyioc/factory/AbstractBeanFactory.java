package cn.ccxst.zwd.tinyioc.factory;

import cn.ccxst.zwd.tinyioc.BeanDefinition;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author zwd
 * @date 2018/11/29 10:32
 * @Email stephen.zwd@gmail.com
 */
public abstract class AbstractBeanFactory implements BeanFactory{

    private Map<String,BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<String, BeanDefinition>();


    public Object getBean(String bearnName) {
        return beanDefinitionMap.get(bearnName).getBean();
    }

    public void reigisterBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        beanDefinition.setBean(doCreateBean(beanDefinition));
        beanDefinitionMap.put(beanName,beanDefinition);
    }

    /**
     * 初始化bean
     * @param beanDefinition
     * @return
     */
    protected abstract Object doCreateBean(BeanDefinition beanDefinition);
}
