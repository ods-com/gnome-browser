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
                    if(event.getEventType()==HyperlinkEvent.EventType.ACTIVATED){
                        loadpage(event.getURL().toString());
                    }
            }
        );
        add(new JScrollPane(display), BorderLayout.CENTER);
        setSize(500,300);
        setVisable(true);
    }

    //load page to display on the screen
    private void loadpage(String userText){
        try{
            display.setPage(userText);
            addressBar.setText(userText);
        }catch(Exception e){
            System.out.println("404 page not found");
        }
    }
    
}
