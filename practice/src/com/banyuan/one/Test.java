package com.banyuan.one;

public class Test {
    public static void main(String[] args) {
        Company company = new Company();
        Employee hourWorker1 = new HourWorker();
        company.employees[0] = hourWorker1;

        System.out.println(company.employees[0].getName());

//        hourWorker1.getsal();
//        hourWorker1.getname();
    }
}
