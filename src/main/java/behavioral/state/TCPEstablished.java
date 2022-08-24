package behavioral.state;

public class TCPEstablished extends TCPState {

    public static TCPState Instance() {
        return null;
    }

    @Override
    public void Transmit(TCPConnection connection, TCPOctetStream tcpOctetStream) {
        connection.ProcessOctet(tcpOctetStream);
    }

    @Override
    public void Close(TCPConnection connection) {
        // do stuff
        ChangeState(connection, TCPListen.Instance());
    }
}
