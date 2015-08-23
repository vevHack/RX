package demo;

import rx.Observable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zen on 2015/8/24.
 */
public class Observable1 {
    /*Creating an Observable from an Existing Data Structure*/
    public static void main(String[] args) {
        Observable<Object> o = Observable.just("1", "2", "3");
        o.subscribe(s -> System.out.println(s));
        List<Integer> lists = new ArrayList<>();
        lists.add(1111);
        lists.add(2222);
        lists.add(3333);
        lists.add(4444);
        Observable.from(lists).subscribe(s -> System.out.println(s));
    }

    /*通过create方法来创建一个Observable对象*/
//    同步例子
    public static Observable customObservableBlocking() {

        return Observable.create(aSubscriber -> {
            for (int i = 0; i < 50; i++) {
                if (aSubscriber.isUnsubscribed()) {
                    aSubscriber.onNext("value" + i);
                }
            }
            //发送完所有值之后，完成
            if (aSubscriber.isUnsubscribed()) {
                aSubscriber.onCompleted();
            }
        });
    }
}
