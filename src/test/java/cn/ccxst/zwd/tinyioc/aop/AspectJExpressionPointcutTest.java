package cn.ccxst.zwd.tinyioc.aop;

import cn.ccxst.zwd.tinyioc.HelloWorldService;
import cn.ccxst.zwd.tinyioc.HelloWorldServiceImpl;
import cn.ccxst.zwd.tinyioc.context.ApplicationContext;
import cn.ccxst.zwd.tinyioc.context.ClassPathXmlApplicationContext;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author yihua.huang@dianping.com
 */
public class AspectJExpressionPointcutTest {

    @Test
    public void testClassFilter() throws Exception {
        String expression = "execution(* cn.ccxst.zwd.tinyioc.*.*(..))";
        AspectJExpressionPointcut aspectJExpressionPointcut = new AspectJExpressionPointcut();
        aspectJExpressionPointcut.setExpression(expression);
        boolean matches = aspectJExpressionPointcut.getClassFilter().matches(HelloWorldService.class);
        Assert.assertTrue(matches);
    }

    @Test
    public void testMethodInterceptor() throws Exception {
        String expression = "execution(* cn.ccxst.zwd.tinyioc.*.*(..))";
        AspectJExpressionPointcut aspectJExpressionPointcut = new AspectJExpressionPointcut();
        aspectJExpressionPointcut.setExpression(expression);
        boolean matches = aspectJExpressionPointcut.getMethodMatcher().matches(HelloWorldServiceImpl.class.getDeclaredMethod("helloWorld"),HelloWorldServiceImpl.class);
        Assert.assertTrue(matches);

//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("tinyioc.xml");
//        HelloWorldService helloWorldService=(HelloWorldService) applicationContext.getBean("helloWorldService");
//        helloWorldService.helloWorld();
    }
}
