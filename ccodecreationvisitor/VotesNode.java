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
public class VotesNode implements Expression {
    
    private int number;
    private SymbolicVar voter;
    
    public VotesNode(int number, SymbolicVar voter) {
        this.number = number;
        this.voter = voter;
    }
    
    @Override
    public String GetCode() {
        return "VOTES" + number + "[" + voter.name + "]";
    }
    
}
