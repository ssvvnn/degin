package bridge;

/**
 * @author zhuhaifeng
 * @since 2020-12-07
 */
public class MiniPhone extends Phone {
    private Brand brand;

    public MiniPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void call() {
        super.call();
        System.out.println("I am a mimi phone");
    }

}
