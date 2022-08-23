package structural.facade;

public class ProgramNodeBuilder {

    public ProgramNode NewVariable(String variableName) {
        return new ProgramNode();
    }

    public ProgramNode NewAssignment(ProgramNode expression, ProgramNode variable) {
        return new ProgramNode();
    }

    class ProgramNode{}
}
