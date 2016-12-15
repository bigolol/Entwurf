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
public class CCodeCreationVisitor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SymbolicVar voter = new SymbolicVar(SymbolicVar.SymbVarTypes.VOTER, "v");
        SymbolicVar candidate = new SymbolicVar(SymbolicVar.SymbVarTypes.CANDIDATE, "c");
        VotesNode votesNode = new VotesNode(0, voter);
        SymbVarNode symbVarCandidateNode = new SymbVarNode(candidate);
        EqualsNode equalsNode = new EqualsNode(votesNode, symbVarCandidateNode);
        ThereExistsNode existsNode = new ThereExistsNode(candidate, equalsNode);
        ForEachNode forNode = new ForEachNode(voter, existsNode);
        
        BooleanExpSyntaxTree tree = new BooleanExpSyntaxTree(forNode);
        System.out.print(tree.getCode());
    }
    
}
