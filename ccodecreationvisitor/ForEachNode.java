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
public class ForEachNode implements BooleanExpNode {
    private SymbolicVar var;
    private BooleanExpNode rhs;
    
    public ForEachNode(SymbolicVar var, BooleanExpNode rhs) {
        this.var = var;
        this.rhs = rhs;
    }

    @Override
    public void getVisited(BooleanNodeVisitor vis) {
        vis.visitForEachNode(var);
        rhs.getVisited(vis);
        vis.finishForEachNode();
    }
}
