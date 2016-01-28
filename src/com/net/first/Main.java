package com.net.first;

import com.net.first.observer.Boss;
import com.net.first.observer.StockObserver;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Boss boss = new Boss();

        StockObserver tongshi1 = new StockObserver("sb1",boss);

        StockObserver tongshi2 = new StockObserver("sb2",boss);

        boss.attach(tongshi1);
        boss.attach(tongshi2);

        boss.detach(tongshi1);

        boss.setSubjectState("回来了");

        boss.myNotify();    


    }
}
