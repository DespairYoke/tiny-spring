package cn.ccxst.zwd.tinyioc.aop;

/**
 * @author zwd
 * @date 2018/12/3 19:49
 * @Email stephen.zwd@gmail.com
 */
public interface ClassFilter {

    boolean matches(Class TargetClass);
}
