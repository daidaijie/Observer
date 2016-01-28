package com.net.first.observer;

/**
 * Created by daidaijie on 2016/1/26.
 */
public abstract class Subject {
    public abstract void attach(Observer observer);

    public abstract void detach(Observer observer);

    public abstract void myNotify();

    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }
}
