package cn.ccxst.zwd.tinyioc.io;

import java.net.URL;

public class ResourceLoader {

    public Resource getResource(String location) {
        URL  resource = this.getClass().getClassLoader().getResource(location);
        return new UrlResource(resource);
    }
}
