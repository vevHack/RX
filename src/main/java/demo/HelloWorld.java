package demo;


import rx.Observable;

/**
 * Created by Zen on 2015/8/23.
 */
public class HelloWorld {
    public static void main(String[] args) {
        Observable.just("Hello World").subscribe(s -> System.out.println(s));
    }
}
