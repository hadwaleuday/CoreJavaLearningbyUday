package oops_13th_Jan_2024.abstraction.interfaces.realtimeexampleelsewewillwantrefund;

public class Car implements Break,Engine{
    void start(){
        System.out.println("Starting the Car");
        breaks();
        startEngine();
    }

    @Override
    public void breaks() {
        System.out.println("break is working fine");
    }

    @Override
    public void startEngine() {
        System.out.println("Started Enginer");
    }
}
