package behavioral.state;

public abstract class TCPConnection {

    private TCPState state;

    public TCPConnection() {
        this.state = TCPClosed.Instance();
    }

    void ActiveOpen(){
        this.state.ActiveOpen(this);
    }
    void PassiveOpen(){
        this.state.PassiveOpen(this);
    }
    void Close(){
        this.state.Close(this);
    }
    void Send(){
        this.state.Send(this);
    }
    void Acknowledge(){
        this.state.Acknowledge(this);
    }
    void Synchronize(){
        this.state.Synchronize(this);
    }
    
    void ProcessOctet(TCPOctetStream tcpOctetStream){

    }

    // TODO hide this from class interface
    void ChangeState(TCPState tcpState) {
        this.state = tcpState;
    }
}
