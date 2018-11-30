package cn.ccxst.zwd.tinyioc.aop;

import org.aopalliance.intercept.MethodInvocation;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

/**
 * @author zwd
 * @date 2018/11/30 21:35
 * @Email stephen.zwd@gmail.com
 */
public class ReflectiveMethodInvocation implements MethodInvocation{

    private Object target;

    private Method method;

    private Object[] args;

    public ReflectiveMethodInvocation(Object target, Method method, Object[] args) {
        this.target = target;
        this.method = method;
        this.args = args;
    }

    public Method getMethod() {
        return method;
    }

    public Object[] getArguments() {
        return new Object[0];
    }

    public Object proceed() throws Throwable {
        return method.invoke(target,args);
    }

    public Object getThis() {
        return target;
    }

    public AccessibleObject getStaticPart() {
        return method;
    }
}
