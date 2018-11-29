package cn.ccxst.zwd.tinyioc;

/**
 * @author zwd
 * @date 2018/11/29 09:34
 * @Email stephen.zwd@gmail.com
 */
public class BeanDefinition {

    private Object bean;


    private Class beanClass;

    private String beanClassName;

    private PropertyValues propertyValues;

    public Object getBean() {
        return bean;
    }

    public void setBean(Object bean) {
        this.bean = bean;
    }

    public Class getBeanClass() {
        return beanClass;
    }


    public String getBeanClassName() {
        return beanClassName;
    }

    public void setBeanClassName(String beanClassName) {
        try {
            this.beanClass = Class.forName(beanClassName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        this.beanClassName = beanClassName;

    }

    public PropertyValues getPropertyValues() {
        return propertyValues;
    }

    public void setPropertyValues(PropertyValues propertyValues) {
        this.propertyValues = propertyValues;
    }
}
