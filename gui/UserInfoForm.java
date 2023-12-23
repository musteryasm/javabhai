import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class UserInfoForm extends JFrame {
 private JTextField nametxt;
 private JTextField streettxt;
 private JTextField citytxt;
 private JTextField pincodetxt;
 private JTextArea outputtxt;
 private JButton button;
 public UserInfoForm() {
 setLayout(new BorderLayout());
 nametxt = new JTextField();
 streettxt = new JTextField();
 citytxt = new JTextField();
 pincodetxt = new JTextField();
 outputtxt = new JTextArea();
 outputtxt.setFont(new Font("Arial", Font.ITALIC, 32));
 outputtxt.setEditable(false);
 JPanel inputPanel = new JPanel(new GridLayout(4, 2));
 inputPanel.add(new JLabel("Name: "));
 inputPanel.add(nametxt);
 inputPanel.add(new JLabel("Street: "));
 inputPanel.add(streettxt);
 inputPanel.add(new JLabel("City: "));
 inputPanel.add(citytxt);
 inputPanel.add(new JLabel("Pin Code: "));
 inputPanel.add(pincodetxt);
 add(inputPanel, BorderLayout.NORTH);
 JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
 button = new JButton("MyInfo");
 button.setPreferredSize(new Dimension(100, 20));
 button.addActionListener(new ActionListener() {

 public void actionPerformed(ActionEvent e) {
 String name = nametxt.getText();
 String street = streettxt.getText();
 String city = citytxt.getText();
 String pinCode = pincodetxt.getText();
 outputtxt.setText("Name: " + name + "\n" +
 "Street: " + street + "\n" +
 "City: " + city + "\n" +
 "Pin Code: " + pinCode);
 }
 });
 buttonPanel.add(button);
 add(buttonPanel, BorderLayout.CENTER);
 add(outputtxt, BorderLayout.SOUTH);
 
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 setSize(400, 400);
 setLocationRelativeTo(null);
 setTitle("User Info Form");
 setVisible(true);
 }
 public static void main(String[] args) {
 new UserInfoForm();
 }
}
