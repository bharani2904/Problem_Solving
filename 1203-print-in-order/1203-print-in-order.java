import java.util.concurrent.CountDownLatch;

class Foo {
    private CountDownLatch secondLatch;
    private CountDownLatch thirdLatch;

    public Foo() {
        secondLatch = new CountDownLatch(1);
        thirdLatch = new CountDownLatch(1);
    }

    public void first(Runnable printFirst) throws InterruptedException {
        printFirst.run();
        secondLatch.countDown(); 
    }

    public void second(Runnable printSecond) throws InterruptedException {
        secondLatch.await(); 
        printSecond.run();
        thirdLatch.countDown(); 
    }

    public void third(Runnable printThird) throws InterruptedException {
        thirdLatch.await(); 
        printThird.run();
    }
}
