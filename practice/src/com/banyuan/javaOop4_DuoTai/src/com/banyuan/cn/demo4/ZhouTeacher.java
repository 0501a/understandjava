package com.banyuan.javaOop4_DuoTai.src.com.banyuan.cn.demo4;

public class ZhouTeacher extends  Teach implements Play {
    @Override
    public void teach(String  projectName) {  //如果是实现方式不一样  重写写一个子类
        System.out.println(super.getTeacherName()+"在教"+projectName);
    }

    @Override
    public void driver() {

    }

    @Override
    public void eat() {

    }


    //  在不改变父类代码的情况去给子类添加额外的功能
    public  void  show(){
        System.out.println("E兵....");
    }





}
