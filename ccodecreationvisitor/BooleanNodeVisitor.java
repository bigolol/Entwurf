/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccodecreationvisitor;

import java.util.ArrayList;

/**
 *
 * @author Holger-Desktop
 */
class BooleanNodeVisitor {
    private StringBuilder code;
    private ArrayList<SymbolicVar> varsInScope;
    private int scope;
    
    public void readyForVisiting() {
        code = new StringBuilder();
        varsInScope = new ArrayList<>();
        scope = 0;
    }
    
    public String getCode() {
        return this.code.toString();
    }
  
    void visitForEachNode(SymbolicVar var) {
        String tabs = "";
        for(int i = 0; i < scope; ++i) tabs += "\t";
        varsInScope.add(var);
        String max = var.type == SymbolicVar.SymbVarTypes.CANDIDATE ? "C" : "V";
        String forcode = tabs + "for(int VARNAME = 0; VARNAME < MAX; VARNAME++) {\n";
        forcode = forcode.replaceAll("VARNAME", var.name);
        forcode = forcode.replaceAll("MAX", max);
        code.append(forcode);
        scope++;
    }
    
    void finishForEachNode() {
         scope--;
        String tabs = "";
        for(int i = 0; i < scope; ++i) tabs += "\t";
        code.append(tabs + "}\n");       
    }

    void visitThereExistsNode(SymbolicVar var) {
        String tabs = "";
        for(int i = 0; i < scope; ++i) tabs += "\t";
        varsInScope.add(var);
        String max = var.type == SymbolicVar.SymbVarTypes.CANDIDATE ? "C" : "V";
        String forcode = tabs + "for(int VARNAME = 0; VARNAME < MAX; VARNAME++) {\n";
        forcode = forcode.replaceAll("VARNAME", var.name).replaceAll("MAX", max);
        code.append(forcode);
        scope++;
    }

    void finishThereExistsNode() {
        scope--;
        String tabs = "";
        for(int i = 0; i < scope; ++i) tabs += "\t";
        code.append(tabs + "}\n");
        
    }

    void visitEqualsNode(String lhs, String rhs) {
        String tabs = "";
        for(int i = 0; i < scope; ++i) tabs += "\t";
        this.code.append(tabs + lhs + " == " + rhs + ";\n");
    }

    
    
        
    
}
