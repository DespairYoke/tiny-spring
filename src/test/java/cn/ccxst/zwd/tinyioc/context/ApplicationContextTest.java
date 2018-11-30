package cn.ccxst.zwd.tinyioc.context;

import cn.ccxst.zwd.tinyioc.HelloWorldService;
import org.junit.Test;

/**
 * @author zwd
 * @date 2018/11/30 21:08
 * @Email stephen.zwd@gmail.com
 */
public class ApplicationContextTest {

    @Test
    public void test() throws Exception{
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("tinyioc.xml");
        HelloWorldService helloWorldService = (HelloWorldService)applicationContext.getBean("helloWorldService");
        helloWorldService.helloWorld();
    }
}
