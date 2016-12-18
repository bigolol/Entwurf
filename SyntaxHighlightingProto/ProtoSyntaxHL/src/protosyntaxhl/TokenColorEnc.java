/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package protosyntaxhl;

import java.awt.Color;
import java.awt.List;
import java.util.LinkedList;
import javax.swing.text.AttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;

/**
 *
 * @author Nikolai
 */
public class TokenColorEnc {
    private LinkedList<String> tokenList;
    private final AttributeSet attributeSet;

    
    public TokenColorEnc(LinkedList<String> tokenList, Color color) {
        StyleContext styleContext = StyleContext.getDefaultStyleContext();
        this.tokenList = tokenList;
        this.attributeSet = styleContext.addAttribute(styleContext.getEmptySet(), StyleConstants.Foreground, color);
    }
            
    public AttributeSet getAttributeSet() {
        return this.attributeSet;
    }
    
    public LinkedList<String> getTokens() {
        return this.tokenList;
    }
}
