package visitor;

public interface IVisitor {
    Object visit(IShape shape,String method);
}
