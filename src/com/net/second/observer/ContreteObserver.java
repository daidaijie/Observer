package com.net.second.observer;

/**
 * Created by daidaijie on 2016/1/28.
 */
public class ContreteObserver extends Observer {

    private String name;
    private String observerState;
    private ConcreteSubject subject;


    public ContreteObserver(ConcreteSubject subject, String name) {
        this.subject = subject;
        this.name = name;
    }

    public ConcreteSubject getSubject() {
        return subject;
    }

    public void setSubject(ConcreteSubject subject) {
        this.subject = subject;
    }

    @Override
    public void update() {
        observerState = subject.getSubjectState();
        System.out.println("观察者" + name + "的状态是" + observerState);
    }
}
