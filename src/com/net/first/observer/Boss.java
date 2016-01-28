package com.net.first.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by daidaijie on 2016/1/27.
 */
public class Boss extends Subject {


    //同事列表
    private List<Observer> observerList = new ArrayList<>();

    private String action;


    //增加
    @Override
    public void attach(Observer observer) {
        observerList.add(observer);
    }

    //删除
    @Override
    public void detach(Observer observer) {
        observerList.remove(observer);
    }

    //通知
    @Override
    public void myNotify() {
        for (Observer obServer:observerList
             ) {
            obServer.update();

        }
    }

    private String subjectState;

    @Override
    public String getSubjectState() {
        return subjectState;
    }

    @Override
    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }
}
