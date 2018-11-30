package cn.ccxst.zwd.tinyioc.beans.io;

import cn.ccxst.zwd.tinyioc.bean.io.Resource;
import cn.ccxst.zwd.tinyioc.bean.io.ResourceLoader;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author yihua.huang@dianping.com
 */
public class ResourceLoaderTest {

	@Test
	public void test() throws IOException {
		ResourceLoader resourceLoader = new ResourceLoader();
        Resource resource = resourceLoader.getResource("tinyioc.xml");
        InputStream inputStream = resource.getInputStream();
        Assert.assertNotNull(inputStream);
    }
}
