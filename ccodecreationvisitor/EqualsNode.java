/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccodecreationvisitor;

/**
 *
 * @author Holger-Desktop
 */
public class EqualsNode implements BooleanExpNode {
    private Expression lhs;
    private Expression rhs;
    
    public EqualsNode(Expression lhs, Expression rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    @Override
    public void getVisited(BooleanNodeVisitor vis) {
        vis.visitEqualsNode(lhs.GetCode(), rhs.GetCode());
    }
    
    
}
