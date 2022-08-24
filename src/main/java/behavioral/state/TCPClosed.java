package behavioral.state;

public class TCPClosed extends TCPState {
    public static TCPState Instance() {
        return null;
    }

    @Override
    public void ActiveOpen(TCPConnection connection) {
        // do stuff
        ChangeState(connection, TCPEstablished.Instance());
    }

    @Override
    public void PassiveOpen(TCPConnection connection) {
        ChangeState(connection, TCPListen.Instance());
    }
}
