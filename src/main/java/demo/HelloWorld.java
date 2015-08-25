package demo;


import rx.Observable;

import java.util.Random;

/**
 * Created by Zen on 2015/8/23.
 */
public class HelloWorld {
    public static void main(String[] args) {
//        Observable.just("Hello World").subscribe(System.out::println);
        cache();
    }
    public static void cache(){
        Random random = new Random();

        Observable<Integer> observable = Observable.range(1, 100).map(random::nextInt).cache();
        observable.subscribe(System.out::println);
        System.out.println("cache..................");
        observable.subscribe(System.out::println);

    }
}
