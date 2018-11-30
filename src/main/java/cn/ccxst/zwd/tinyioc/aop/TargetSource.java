package cn.ccxst.zwd.tinyioc.aop;

/**
 * @author zwd
 * @date 2018/11/30 21:33
 * @Email stephen.zwd@gmail.com
 */
public class TargetSource {

    private Class targetClass;

    private Object target;

    public TargetSource(Object target,Class targetClass) {
        this.targetClass = targetClass;
        this.target = target;
    }

    public Class getTargetClass() {
        return targetClass;
    }

    public Object getTarget() {
        return target;
    }
}
