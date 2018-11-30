package cn.ccxst.zwd.tinyioc.aop;

import org.aopalliance.intercept.MethodInterceptor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author zwd
 * @date 2018/11/30 21:39
 * @Email stephen.zwd@gmail.com
 */
public class JdkDynamicAopProxy implements AopProxy, InvocationHandler{

    private AdvisedSupport advised;

    public JdkDynamicAopProxy(AdvisedSupport advisedSupport) {
        this.advised = advisedSupport;
    }

    public Object getProxy() {
        Object proxy = Proxy.newProxyInstance(getClass().getClassLoader(), new Class[]{advised.getTargetSource().getTargetClass()}, this);
        return proxy;
    }

    public Object invoke(final Object proxy, Method method, Object[] args) throws Throwable {
        MethodInterceptor methodInterceptor = advised.getMethodInterceptor();
        return methodInterceptor.invoke(new ReflectiveMethodInvocation(advised.getTargetSource().getTarget(),method,args));
    }
}
