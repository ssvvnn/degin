package adapter;

/**
 * @author zhuhaifeng
 * @since 2020-12-03
 */

/**
 * 适配器模式
 */
public class Test {
    public static void main(String[] args) {
        Target target = new Adapter(new Source());
        target.say();
    }
}
