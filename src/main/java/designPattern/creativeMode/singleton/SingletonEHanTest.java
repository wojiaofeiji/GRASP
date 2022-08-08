package main.java.designPattern.creativeMode.singleton;

/**
 * 1.单例模式的饿汉式[可用] (1)私有化该类的构造函数 (2)通过new在本类中创建一个本类对象 (3)定义一个公有的方法，将在该类中所创建的对象返回
 * <p>
 * 优点：从它的实现中我们可以看到，这种方式的实现比较简单，在类加载的时候就完成了实例化，避免了线程的同步问题。
 * <p>
 * 缺点：由于在类加载的时候就实例化了，所以没有达到Lazy Loading(懒加载)的效果，
 * <p>
 * 也就是说可能我没有用到这个实例，但是它也会加载，会造成内存的浪费(但是这个浪费可以忽略，所以这种方式也是推荐使用的)。
 */
public class SingletonEHanTest {

    public static void main(String[] args) {
        SingletonHunger singletonEHan = SingletonHunger.getInstance();
        SingletonHunger2 singletonEHan2 = SingletonHunger2.getInstance();
    }
}

/**
 * 1.单例模式的饿汉式[可用]
 */
class SingletonHunger {

    private static final SingletonHunger singletonEHan = new SingletonHunger();

    public static SingletonHunger getInstance() {
        return singletonEHan;
    }

    private SingletonHunger() {
    }

}

/**
 * 2. 单例模式的饿汉式变换写法[可用] 基本没区别
 */
class SingletonHunger2 {

    private static SingletonHunger2 singletonEHan2;

    static {
        singletonEHan2 = new SingletonHunger2();
    }

    public static SingletonHunger2 getInstance() {
        if (singletonEHan2 == null) {
            singletonEHan2 = new SingletonHunger2();
        }
        return singletonEHan2;
    }

    private SingletonHunger2() {
    }

}