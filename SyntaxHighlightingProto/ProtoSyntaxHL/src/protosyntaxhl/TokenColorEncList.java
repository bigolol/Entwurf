/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package protosyntaxhl;

import java.awt.Color;
import java.util.Arrays;
import static java.util.Collections.list;
import java.util.LinkedList;

/**
 *
 * @author Nikolai
 */
public final class TokenColorEncList {
   
    private static TokenColorEnc variable = new TokenColorEnc(new LinkedList<String> (Arrays.asList("[a-z]+[a-zA-Z]*")), Color.RED);
    private static TokenColorEnc typeList = new TokenColorEnc(new LinkedList<String> (Arrays.asList("int|char|short|void|long|short")), Color.BLUE);
    private static TokenColorEnc stringQuotation = new TokenColorEnc(new LinkedList<String> (Arrays.asList("\"([^\"^\\\\]|\\\\(.))*\"")), Color.GREEN);
    private final static LinkedList<TokenColorEnc> list = new LinkedList<TokenColorEnc>(Arrays.asList(variable, typeList, stringQuotation));
    
    
    private TokenColorEncList(){}
    public static LinkedList<TokenColorEnc> getList() {
        return list;
    }
}