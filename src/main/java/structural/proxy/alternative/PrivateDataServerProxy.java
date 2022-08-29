package structural.proxy.alternative;

public class PrivateDataServerProxy implements PrivateDataServer {
    private final PrivateDataServer privateDataServer;

    public PrivateDataServerProxy(PrivateDataServer privateDataServer) {
        this.privateDataServer = privateDataServer;
    }

    @Override
    public String serve() {
        if (isAuthenricated()) {
            return privateDataServer.serve();
        }
        return "Access denied";
    }

    private boolean isAuthenricated() {
        return true;
    }

    public static void main(String[] args) {
        PrivateDataServer privateDataServer = new PrivateDataServerProxy(new PrivateDataServerImpl());
        System.out.println(privateDataServer.serve());
    }
}

interface PrivateDataServer {
    String serve();
}

class PrivateDataServerImpl implements PrivateDataServer {
    @Override
    public String serve() {
        return "This is private data";
    }
}
