package cn.ccxst.zwd.tinyioc.aop;

/**
 * @author zwd
 * @date 2018/12/3 19:59
 * @Email stephen.zwd@gmail.com
 */
public interface Pointcut {
    ClassFilter getClassFilter();

    MethodMatcher getMethodMatcher();
}
