import java.awt.event.*;  
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Start {
    public static void main(String[] args) {
       
        JFrame frame = new JFrame("Text reverse app by xvvcs");

        final JTextField textField = new JTextField();
        textField.setBounds(125,30, 150,30);

        final JLabel label = new JLabel();
        label.setBounds(125,50,150,30);

        JButton reverseButton = new JButton("Reverse the text");
        reverseButton.setBounds(125,100, 150, 30);
        reverseButton.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent event){
                StringReverse reverse = new StringReverse(textField.getText());
                label.setText("Reversed text: "+ reverse.toString()); 
            }
        });
        frame.add(reverseButton);
        frame.add(textField);
        frame.add(label);
        frame.setSize(400,200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           
            
            
            

        

       
    }
}
