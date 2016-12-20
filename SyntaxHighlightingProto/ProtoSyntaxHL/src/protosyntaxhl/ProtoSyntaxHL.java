/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package protosyntaxhl;

import java.awt.Color;
import java.awt.Font;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.regex.Pattern;
import javax.swing.text.AbstractDocument;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import javax.swing.text.StyledDocument;

/**
 *
 * @author Nikolai
 */
public class ProtoSyntaxHL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws BadLocationException {
       NewJFrame jFrame = new NewJFrame();    

       // create new composite filter with textPane
       SyntaxHLCompositeFilter filter = new SyntaxHLCompositeFilter(jFrame.getTextPane(), TokenColorEncList.getList());
       // apply filter to jFrame's StyledDocument
       ((AbstractDocument) jFrame.getStyledDocument()).setDocumentFilter(filter);
       
       jFrame.setVisible(true);
    }
    
}
