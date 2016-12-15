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
public class SymbolicVar { 
    public enum SymbVarTypes {
        VOTER,
        CANDIDATE,
        SEAT
    }
    public SymbVarTypes type;
    public String name;

    SymbolicVar(SymbVarTypes type, String name) {
        this.type = type;
        this.name = name;
    }
   
}
