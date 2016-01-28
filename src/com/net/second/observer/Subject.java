package com.net.second.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by daidaijie on 2016/1/28.
 */
public class Subject {

    //一系列的观察者序列
    List<Observer> observers = new ArrayList<>();

    //增加观察者
    public void attach(Observer observer) {
        observers.add(observer);
    }

    //移除观察者
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    //通知
    public void mNotify(){
        for (Observer observer:observers
             ) {
            observer.update();
        }
    }
}
