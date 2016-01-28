package com.net.first.observer;

/**
 * Created by daidaijie on 2016/1/27.
 */
public class StockObserver extends Observer{

    public StockObserver(String name, Subject sub) {
        super(name, sub);
    }

    @Override
    public void update() {
        System.out.println(sub.getSubjectState()+" "+name+"继续工作");
    }
}
