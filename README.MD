# RXJava

1. Observable 和 Subscriber 可以做任何事情,总体来说就是基于事件的，
    比如Observable是数据库，Subscriber是显示查询.
    可以是屏幕上的点击事件和响应点击事件，可以是一个网络请求和显示请求结果

2. Observable 和 Subscriber 是独立于变换过程的
    在这两者之间可以增减任意数量的Map.其实就是可以对Observable对象进行任意的操作，然后再进行对应的事件处理，大量的操作其实就是基于函数式的

## 创建 Observables

- just() 转换一个对象或者多个对象为Observable
- from() 转换一个Iterable，一个Future或者一个数组为Observable
- repeat() 重复创建一个Observable，返回特别的Item或者有序的item
- repeatWhen() 同上，只是加上一个条件，第二个参数
- create() 通过传入一个函数来创建一个Observable
- defer() 在每次发布之后创建一个新的Observable
- range() 创建一个Observable，返回一个有序整数的范围
- interval()创建一个Observable，返回一个有序整数的范围在给定的时间间隔中
- timer() 创建一个Observable,，返回一个单个item在给定的时间之后
- empty() 创建一个Observable,什么都不返回，直接完成结束
- error() 创建一个Observable，什么都不返回，标记一个错误
- never() 创建一个Observable，什么都不返回
