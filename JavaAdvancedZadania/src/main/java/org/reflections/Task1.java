package org.reflections;

public class Task1 {

    private int pole1;
    private double pole2;
    private String pole3;
    private Object myObject;

    public Task1() {
    }

    public Task1(int pole1, double pole2, String pole3, Object myObject) {
        this.pole1 = pole1;
        this.pole2 = pole2;
        this.pole3 = pole3;
        this.myObject = myObject;
    }

    public String addStrings(String str1, String str2) {
        return str1 + str2;
    }

    public double addNumbers() {
        return pole1 + pole2;
    }

    @SuperMethod(run = true)
    public void running() {
        System.out.println("Running ...");
    }

    @SuperMethod(run = false)
    public void notRunning() {
        System.out.println("Not running...");
    }


}
