package cn.ccxst.zwd.tinyioc.factory;

import cn.ccxst.zwd.tinyioc.BeanDefinition;
import cn.ccxst.zwd.tinyioc.BeanReference;
import cn.ccxst.zwd.tinyioc.PropertyValue;

import java.lang.reflect.Field;

/**
 * @author zwd
 * @date 2018/11/29 10:38
 * @Email stephen.zwd@gmail.com
 */
public class AutowireCapableBeanFactory extends AbstractBeanFactory{

    @Override
    protected Object doCreateBean(BeanDefinition beanDefinition) throws Exception {
        Object bean = beanDefinition.getBeanClass().newInstance();

        beanDefinition.setBean(bean);
        for (PropertyValue propertyValue : beanDefinition.getPropertyValues().getPropertyValues()) {
            Field declaredField = bean.getClass().getDeclaredField(propertyValue.getName());
            declaredField.setAccessible(true);
            Object value = propertyValue.getValue();
            if (value instanceof BeanReference) {
                BeanReference beanReference = (BeanReference) value;
                value=getBean(beanReference.getName());
            }
            declaredField.set(bean,value);
        }
        return bean;
    }

//    protected Object createBeanInstance(BeanDefinition beanDefinition) throws Exception {
//        return beanDefinition.getBeanClass().newInstance();
//    }

//    protected void applyPropertyValues(Object bean, BeanDefinition mbd) throws Exception {
//        for (PropertyValue propertyValue : mbd.getPropertyValues().getPropertyValues()) {
//            Field declaredField = bean.getClass().getDeclaredField(propertyValue.getName());
//            declaredField.setAccessible(true);
//            Object value = propertyValue.getValue();
//            if (value instanceof BeanReference) {
//                BeanReference beanReference = (BeanReference) value;
//                value=getBean(beanReference.getName());
//            }
//            declaredField.set(bean,value);
//        }
//    }
}
