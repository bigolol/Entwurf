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
public class ThereExistsNode implements BooleanExpNode {
    private SymbolicVar var;
    private BooleanExpNode rhs;
    
    public ThereExistsNode(SymbolicVar var, BooleanExpNode rhs) {
        this.var = var;
        this.rhs = rhs;
    }

    @Override
    public void getVisited(BooleanNodeVisitor vis) {
        vis.visitThereExistsNode(var);
        rhs.getVisited(vis);
        vis.finishThereExistsNode();
    }
}
