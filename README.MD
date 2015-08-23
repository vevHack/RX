# RXJava

1. Observable 和 Subscriber 可以做任何事情,总体来说就是基于事件的，
    比如Observable是数据库，Subscriber是显示查询.
    可以是屏幕上的点击事件和响应点击事件，可以是一个网络请求和显示请求结果

2. Observable 和 Subscriber 是独立于变换过程的
    在这两者之间可以增减任意数量的Map.其实就是可以对Observable对象进行任意的操作，然后再进行对应的事件处理，大量的操作其实就是基于函数式的
