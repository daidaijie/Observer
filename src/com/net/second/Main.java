package com.net.second;

import com.net.second.observer.ConcreteSubject;
import com.net.second.observer.ContreteObserver;

/**
 * Created by daidaijie on 2016/1/28.
 */
public class Main {
    public static void main(String[] args) {

        ConcreteSubject s = new ConcreteSubject();

        s.attach(new ContreteObserver(s,"X"));
        s.attach(new ContreteObserver(s,"Y"));
        s.attach(new ContreteObserver(s,"Z"));

        s.setSubjectState("ABC");
        s.mNotify();


    }
}
