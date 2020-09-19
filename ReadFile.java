import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class ReadFile extends JFrame{
    
    private JTextField addressBar;
    private JEditorPane Display;
    
    //constructor
    public ReadFile(){
        super("omume browser")
        
        addressBar = new JTextField("please enter a URL.");
        addressBar.addActionListener(
            new ActionListener(){
                Public void actionPerformed(ActionEvent event){
                    loadpage(event.getActionCommand());
                }

            }
        );
        add(addressBar, BorderLayout.NORTH);
        
        display = new JEDITORPane();
        display.setEditable(false);
        display.addHyperlinkListener(
            new Hyperlinklistener(){
                public void hyperlinkupdate(HyperlinkEvent event)
                    if(event.getType()==HyperlinkEvent.EventType.ACTIVATED){
                        loadpage(event.getURL().toString());
                    }
            }
        );
    }

}
