package cn.ccxst.zwd.tinyioc.aop;

import org.aopalliance.intercept.MethodInterceptor;

/**
 * @author zwd
 * @date 2018/11/30 21:32
 * @Email stephen.zwd@gmail.com
 */
public class AdvisedSupport {

    private TargetSource targetSource;

    private MethodInterceptor methodInterceptor;

    public TargetSource getTargetSource() {
        return targetSource;
    }

    public void setTargetSource(TargetSource targetSource) {
        this.targetSource = targetSource;
    }

    public MethodInterceptor getMethodInterceptor() {
        return methodInterceptor;
    }

    public void setMethodInterceptor(MethodInterceptor methodInterceptor) {
        this.methodInterceptor = methodInterceptor;
    }
}
