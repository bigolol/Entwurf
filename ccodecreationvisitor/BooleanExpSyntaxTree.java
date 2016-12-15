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
public class BooleanExpSyntaxTree {
    private BooleanExpNode root;
    private BooleanNodeVisitor vis = new BooleanNodeVisitor();
    
    public BooleanExpSyntaxTree(BooleanExpNode root) {
        this.root = root;
    }
    
    public String getCode() {
        vis.readyForVisiting();
        root.getVisited(vis);
        return vis.getCode();
    }
}
