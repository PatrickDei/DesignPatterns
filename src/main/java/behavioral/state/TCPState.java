package behavioral.state;

public abstract class TCPState {

    public void Transmit(TCPConnection connection, TCPOctetStream tcpOctetStream) {}
    public void ActiveOpen(TCPConnection connection) {}
    public void PassiveOpen(TCPConnection connection) {}
    public void Close(TCPConnection connection) {}
    public void Synchronize(TCPConnection connection) {}
    public void Acknowledge(TCPConnection connection) {}
    public void Send(TCPConnection connection) {}

    protected void ChangeState(TCPConnection connection, TCPState state) {
        connection.ChangeState(state);
    }
}
