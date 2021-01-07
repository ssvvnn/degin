package bridge;

/**
 * @author zhuhaifeng
 * @since 2020-12-07
 */
public abstract class Phone {
    private Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }


    public void call() {
        brand.call();;
    }
}
