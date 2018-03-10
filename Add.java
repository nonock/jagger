
/**
 * Write a description of class Add here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Add extends Exp
{
    public Exp lhs;
    public Exp rhs;
    
    public void accept(Visitor v)
    {
        v.visitAdd(this);
    }
}
