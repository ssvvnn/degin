package bridge;

/**
 * @author zhuhaifeng
 * @since 2020-12-07
 */
public class Test {
    public static void main(String[] args) {
        Phone phone = new MiniPhone(new Ant());
        phone.call();
        Phone phone1 = new MiniPhone(new Apple());
        phone1.call();
    }
}
