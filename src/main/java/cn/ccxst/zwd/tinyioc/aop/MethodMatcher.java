package cn.ccxst.zwd.tinyioc.aop;

import java.lang.reflect.Method;

/**
 * @author zwd
 * @date 2018/12/3 20:10
 * @Email stephen.zwd@gmail.com
 */
public interface MethodMatcher {
    boolean matches(Method method, Class targetClass);
}
