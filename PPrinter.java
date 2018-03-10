
/**
 * Write a description of class PPrinter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PPrinter extends Visitor
{
    public void visitAdd(Add n)
    {
        // Print lhs, +, rhs
        (
        lhs.accept(this);
        +
        rhs.accept(this);
        )
    }
}
