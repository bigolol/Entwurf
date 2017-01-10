/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package protosyntaxhl;

import java.util.LinkedList;
import javax.swing.JTextPane;
import javax.swing.text.AbstractDocument;

/**
 *
 * @author scooby
 */
public class SyntaxHL {
    static void applyFilter(JTextPane textPane, LinkedList<TokenColorEnc> tokenColorList) {
       SyntaxHLCompositeFilter filter = new SyntaxHLCompositeFilter(textPane, tokenColorList);
       ((AbstractDocument) textPane.getStyledDocument()).setDocumentFilter(filter);
    }
}
