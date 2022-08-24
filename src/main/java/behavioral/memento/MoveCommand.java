package behavioral.memento;

/**
 * see Command pattern
 */
public class MoveCommand {

    private Point delta;
    private Graphic target;
    private ConstraintSolverMemento state;

    public MoveCommand(Graphic target, Point delta) {
        this.delta = delta;
        this.target = target;
    }

    public void Execute() {
        ConstraintSolver solver = ConstraintSolver.Instance();
        state = solver.CreateMemento();

        // do the operation f.e. target.Move(delta)
        solver.Solve();
    }

    public void Unexecute() {
        ConstraintSolver solver = ConstraintSolver.Instance();
        // do the operation f.e. target.Move(-delta)
        solver.SetMemento(state);
        // restore state
        solver.Solve();
    }

}
