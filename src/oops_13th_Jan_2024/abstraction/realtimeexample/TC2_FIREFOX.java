package oops_13th_Jan_2024.abstraction.realtimeexample;

public class TC2_FIREFOX extends BaseClass{
    @Override
    String openBrowser() {
        System.out.println("STARTING FIREFOX");
        return null;

    }

    @Override
    String closeBrowser() {
        System.out.println("CLOSING FIREFOX");
        return null;
    }
}
