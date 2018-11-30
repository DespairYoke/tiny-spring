package cn.ccxst.zwd.tinyioc;

/**
 * @author yihua.huang@dianping.com
 */
public class HelloWorldService {

    private String text;

    private OutputService outputService;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void helloWorld(){
        outputService.output(text);
    }

    public void setOutputService(OutputService outputService) {
        this.outputService = outputService;
    }
}
