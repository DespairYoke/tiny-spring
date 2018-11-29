package cn.ccxst.zwd.tinyioc;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author zwd
 * @date 2018/11/29 09:36
 * @Email stephen.zwd@gmail.com
 */
public class BeanFactory {

    private Map<String,BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<String, BeanDefinition>();

    public void reigisterBeanDefinition(String name, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(name,beanDefinition);
    }

    public Object getBean(String name) {
        return beanDefinitionMap.get(name).getBean();
    }
}
