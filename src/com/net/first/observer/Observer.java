package com.net.first.observer;

/**
 * Created by daidaijie on 2016/1/26.
 */
public abstract class Observer {

    protected String name;
    protected Subject sub;

    public Observer(String name, Subject sub) {
        this.name = name;
        this.sub = sub;
    }

    public abstract void update();
}


