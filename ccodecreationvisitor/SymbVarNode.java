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
public class SymbVarNode implements Expression {
    private SymbolicVar var;

    public SymbVarNode(SymbolicVar var) {
        this.var = var;
    }
    
    @Override
    public String GetCode() {
        return var.name;
    }

    
}
