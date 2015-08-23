package demo;

import rx.Observable;
import rx.Subscriber;

/**
 * Created by Zen on 2015/8/23.
 */
public class Operators {
    public static void main(String[] args) {
//        Observable.just("Hello World").map(String::hashCode).map(s -> Integer.toString(s)).subscribe(System.out::println);
//        Integer[] numbers = {0, 1, 2, 3, 4, 5};
//        Observable.from(numbers).subscribe(
//                (incomingNumber) -> System.out.println("incomingNumber" + incomingNumber),
//                (error) -> System.out.println("something went wrong" + error.getMessage()),
//                () -> System.out.println("This observable is finished")
//        );

//        create();
        helloWorld("Mathew", "Zen");
    }


    public static void create() {
        Observable.OnSubscribe<String> subscribeFunction = (s) -> {
            Subscriber subscriber = (Subscriber) s;
            for (int ii = 0; ii < 10; ii++) {
                if (!subscriber.isUnsubscribed()) {
                    subscriber.onNext("push value" + ii);
                }
            }
            if (!subscriber.isUnsubscribed()) {
                subscriber.onCompleted();
            }
        };
        Observable createObservable = Observable.create(subscribeFunction);
        createObservable.subscribe(
                (incomingValue) -> System.out.println("" + incomingValue),
                (error) -> System.out.println("something went wrong" + ((Throwable) error).getMessage()),
                () -> System.out.println("this observable is finished")
        );
    }

    public static void helloWorld(String... names) {
        Observable.from(names).subscribe(s -> System.out.println("hello:" + s));
    }

}
