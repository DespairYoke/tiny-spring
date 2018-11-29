package cn.ccxst.zwd.tinyioc;

/**
 * @author zwd
 * @date 2018/11/29 09:34
 * @Email stephen.zwd@gmail.com
 */
public class BeanDefinition {

    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }
}
