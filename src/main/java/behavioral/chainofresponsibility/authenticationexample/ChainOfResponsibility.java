package behavioral.chainofresponsibility.authenticationexample;

import java.util.Set;

interface AuthenticationHandler {
    void handle(String username);
    void setNext(AuthenticationHandler next);
}

class ValidUsernameHandler implements AuthenticationHandler {
    private AuthenticationHandler nextHandler;

    @Override
    public void handle(String username) {
        if (username == null) {
            System.out.println("Invalid username");
            return;
        }
        this.nextHandler.handle(username);
    }

    @Override
    public void setNext(AuthenticationHandler next) {
        this.nextHandler = next;
    }
}

class UsernameExistsHandler implements AuthenticationHandler {
    private static final Set<String> REGISTERED_USERNAMES = Set.of("user@mail.com");

    private AuthenticationHandler nextHandler;

    @Override
    public void handle(String username) {
        if (REGISTERED_USERNAMES.contains(username)) {
            System.out.println("Username verified: Now delegate to business code handler");
            return;
        }
        System.out.println("Username is not registered");
    }

    @Override
    public void setNext(AuthenticationHandler next) {
        this.nextHandler = next;
    }
}

class ChainOfResponsibilityTest {
    public static void main(String[] args) {
        AuthenticationHandler handler1 = new ValidUsernameHandler();
        AuthenticationHandler handler2 = new UsernameExistsHandler();
        handler1.setNext(handler2);

        handler1.handle(null);
        handler1.handle("nonexistant@mail.com");
        handler1.handle("user@mail.com");
    }
}