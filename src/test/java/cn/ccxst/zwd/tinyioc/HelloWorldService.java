package cn.ccxst.zwd.tinyioc;

/**
 * @author yihua.huang@dianping.com
 */
public class HelloWorldService {

    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void helloWorld(){
        System.out.println(text);
    }
}
