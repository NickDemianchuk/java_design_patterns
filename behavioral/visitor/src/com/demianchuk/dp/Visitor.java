package com.demianchuk.dp;

public interface Visitor {
    void visit(Rectangle r);
    void visit(Circle c);
    void visit(Triangle t);
}
