package cn.ccxst.zwd.tinyioc.factory;

import cn.ccxst.zwd.tinyioc.BeanDefinition;
import cn.ccxst.zwd.tinyioc.BeanReference;
import cn.ccxst.zwd.tinyioc.PropertyValue;

import java.lang.reflect.Field;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author zwd
 * @date 2018/11/29 10:32
 * @Email stephen.zwd@gmail.com
 */
public abstract class AbstractBeanFactory implements BeanFactory{

    private Map<String,BeanDefinition> beanDefinitionMap = new HashMap<>();

    private final List<String> beanDefinitionNames = new ArrayList<String>();
    public Object getBean(String bearnName) throws Exception {
        BeanDefinition beanDefinition = beanDefinitionMap.get(bearnName);
        if (beanDefinition == null) {
            throw new IllegalArgumentException("No bean named " + bearnName + " is defined");
        }
        Object bean = beanDefinition.getBean();
        if (bean==null) {
            Object bean1 = beanDefinition.getBeanClass().newInstance();
            bean = bean1;
            beanDefinition.setBean(bean1);
            for (PropertyValue propertyValue : beanDefinition.getPropertyValues().getPropertyValues()) {
                Field declaredField = bean1.getClass().getDeclaredField(propertyValue.getName());
                declaredField.setAccessible(true);
                Object value = propertyValue.getValue();
                if (value instanceof BeanReference) {
                    BeanReference beanReference = (BeanReference) value;
                    value=getBean(beanReference.getName());
                }
                declaredField.set(bean1,value);
            }
        }
        return bean;
    }

    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) throws Exception{
        beanDefinitionMap.put(beanName,beanDefinition);
        beanDefinitionNames.add(beanName);
    }

    /**
     * 初始化bean
     * @param beanDefinition
     * @return
     */
    protected abstract Object doCreateBean(BeanDefinition beanDefinition) throws Exception;

    public void preInstantiateSingletons() throws Exception {
        for (Iterator it = this.beanDefinitionNames.iterator(); it.hasNext(); ) {
            String beanName = (String) it.next();
            getBean(beanName);
        }
    }

}
