package com.banyuan.jicheng.p8;

public class WorkerLeader extends Worker {
    int bonus;

    @Override
    public void makeBonus() {
        System.out.println(this.name+"发奖金");
    }
}
