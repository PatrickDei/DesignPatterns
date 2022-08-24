package behavioral.observer;

public class ClockTimer extends Subject {
    public int GetHour(){
        return 0;
    }
    public int GetMinute(){
        return 0;
    }
    public int GetSecond(){
        return 0;
    }

    public void Tick() {
        // update the time state
        // ...
        Notify();
    }
}
