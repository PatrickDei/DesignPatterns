package behavioral.observer.modern;

import java.util.ArrayList;
import java.util.List;

interface ObservableUser {
    void subscribe(UserObserver observer);
    void notifyObservers();
}

interface UserObserver {
    void onChange(UserSubject subject);
}

class UserSubject implements ObservableUser {
    private String name;
    private String surname;
    private String username;

    private List<UserObserver> observers;

    public UserSubject(String name, String surname, String username) {
        this.name = name;
        this.surname = surname;
        this.username = username;
    }

    @Override
    public void subscribe(UserObserver observer) {
        if (this.observers == null) {
            this.observers = new ArrayList<>();
        }
        this.observers.add(observer);
        observer.onChange(this);
    }

    @Override
    public void notifyObservers() {
        this.observers.forEach(observer -> observer.onChange(this));
    }

    public void setName(String name) {
        this.name = name;
        this.notifyObservers();
    }

    public void setSurname(String surname) {
        this.surname = surname;
        this.notifyObservers();
    }

    public void setUsername(String username) {
        this.username = username;
        this.notifyObservers();
    }
}

class UserStorageWriter implements UserObserver {
    @Override
    public void onChange(UserSubject subject) {
        System.out.println("Persist changes to standard storage");
    }
}

class UserAuditStorageWriter implements UserObserver {
    @Override
    public void onChange(UserSubject subject) {
        System.out.println("Persist changes to secondary storage");
    }
}

class ObserverTest {
    public static void main(String[] args) {
        UserObserver userStorage = new UserStorageWriter();
        UserObserver userAuditStorage = new UserAuditStorageWriter();

        UserSubject subject = new UserSubject("John", "Doe", "jdoe@mail.com");
        subject.subscribe(userStorage);
        subject.subscribe(userAuditStorage);

        subject.setName("Johnny");
    }
}