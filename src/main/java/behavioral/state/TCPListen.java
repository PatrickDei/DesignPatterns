package behavioral.state;

public class TCPListen extends TCPState {

    public static TCPState Instance() {
        return null;
    }

    @Override
    public void Send(TCPConnection connection) {
        ChangeState(connection, TCPEstablished.Instance());
    }
}
