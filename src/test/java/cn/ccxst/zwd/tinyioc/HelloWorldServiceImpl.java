package cn.ccxst.zwd.tinyioc;

/**
 * @author zwd
 * @date 2018/11/30 21:58
 * @Email stephen.zwd@gmail.com
 */
public class HelloWorldServiceImpl implements HelloWorldService{

    private String text;

    private OutputService outputService;

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public void helloWorld() {
        outputService.output(text);
    }

    public void setOutputService(OutputService outputService) {
        this.outputService = outputService;
    }
}
