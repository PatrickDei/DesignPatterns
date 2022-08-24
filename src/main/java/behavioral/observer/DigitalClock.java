package behavioral.observer;

public class DigitalClock implements Observer {

    private ClockTimer subject;

    public DigitalClock(ClockTimer subject) {
        this.subject = subject;
        this.subject.Attach(this);
    }

    @Override
    public void Update(Subject changedSubject) {
        if (changedSubject.equals(subject)) {
            // perform update
        }
    }
}
