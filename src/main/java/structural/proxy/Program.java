package structural.proxy;

public class Program {
    public void Start() {
        TextDocument textDocument = new TextDocument();

        textDocument.Insert(new ImageProxy("somefilename"));
    }
}
