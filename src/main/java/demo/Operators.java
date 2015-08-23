package demo;

import rx.Observable;

/**
 * Created by Zen on 2015/8/23.
 */
public class Operators {
    public static void main(String[] args) {
        Observable.just("Hello World").map(String::hashCode).map(s -> Integer.toString(s)).subscribe(System.out::println);
    }
}
