package adapter;

/**
 * @author zhuhaifeng
 * @since 2020-12-03
 */
public class Adapter implements Target {
    private Source source;

    public Adapter(Source source) {
        this.source = source;
    }

    public void say() {
        source.say();
    }
}
