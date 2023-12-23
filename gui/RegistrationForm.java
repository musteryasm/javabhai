import java.awt.*;
import javax.swing.*;
public class RegistrationForm extends JFrame {
 JLabel msg;
 JLabel nameLabel, sapIDLabel, genderLabel;
 JTextField nameField, sapIDField;
 JRadioButton genderMale, genderFemale;
 ButtonGroup genderGroup;
 JLabel mailLabel, mobileLabel;
 JTextField mailField, mobileField;
 JLabel pwdLabel;
 JPasswordField pwdField;
 JLabel programLabel, branchLabel;
 JComboBox<String> progList, branchList;
 JButton regButton;
 JTextArea resultArea;
 Container container;
 public RegistrationForm() {
 msg = new JLabel("Register a new Student");
 msg.setFont(new Font("Courier", Font.BOLD, 20));
 nameLabel = new JLabel("Name");
 nameField = new JTextField();
 sapIDLabel = new JLabel("SAP ID");

 sapIDField = new JTextField();
 genderLabel = new JLabel("Gender");
 genderMale = new JRadioButton("Male", true);
 genderFemale = new JRadioButton("Female");
 genderGroup = new ButtonGroup();
 genderGroup.add(genderMale);
 genderGroup.add(genderFemale);
 mailLabel = new JLabel("Mail Id");
 mailField = new JTextField();
 mobileLabel = new JLabel("Mobile No");
 mobileField = new JTextField();
 pwdLabel = new JLabel("Password");
 pwdField = new JPasswordField();
 programLabel = new JLabel("Courses");
 progList = new JComboBox<String>();
 progList.addItem("ME/M Tech");
 progList.addItem("BE/B Tech");
 progList.addItem("Diploma");
 branchLabel = new JLabel("Branch");
 branchList = new JComboBox<String>();
 branchList.addItem("CSE");
 branchList.addItem("EXTC");
 branchList.addItem("IT");
 branchList.addItem("MECH");
 regButton = new JButton("Register");
 resultArea = new JTextArea();
 resultArea.setEditable(false);
 container = getContentPane();
 container.setLayout(null);
 setBounds();
 addComponents();
 regButton.addActionListener(e -> registerStudent());
 }
 public void setBounds() {
 Font font = new Font("Times New Roman", Font.PLAIN, 14);
 msg.setFont(font);

 nameLabel.setFont(font);
 nameField.setFont(font);
 sapIDLabel.setFont(font);
 sapIDField.setFont(font);
 genderLabel.setFont(font);
 genderMale.setFont(font);
 genderFemale.setFont(font);
 mailLabel.setFont(font);
 mailField.setFont(font);
 mobileLabel.setFont(font);
 mobileField.setFont(font);
 pwdLabel.setFont(font);
 pwdField.setFont(font);
 programLabel.setFont(font);
 progList.setFont(font);
 branchLabel.setFont(font);
 branchList.setFont(font);
 regButton.setFont(font);
 msg.setBounds(50, 10, 600, 30);
 nameLabel.setBounds(50, 60, 100, 30);
 nameField.setBounds(130, 60, 200, 30);
 sapIDLabel.setBounds(50, 110, 100, 30);
 sapIDField.setBounds(130, 110, 200, 30);
 genderLabel.setBounds(50, 160, 100, 30);
 genderMale.setBounds(130, 160, 100, 30);
 genderFemale.setBounds(240, 160, 100, 30);
 mailLabel.setBounds(50, 210, 100, 30);
 mailField.setBounds(130, 210, 200, 30);
 pwdLabel.setBounds(50, 260, 100, 30);
 pwdField.setBounds(130, 260, 200, 30);
 mobileLabel.setBounds(50, 310, 100, 30);
 mobileField.setBounds(130, 310, 200, 30);
 programLabel.setBounds(50, 360, 100, 30);
 progList.setBounds(130, 360, 200, 30);
 branchLabel.setBounds(50, 410, 100, 30);
 branchList.setBounds(130, 410, 200, 30);
 regButton.setBounds(130, 460, 200, 30);

 resultArea.setBounds(50, 500, 400, 200);
 }
 public void addComponents() {
 container.add(msg);
 container.add(nameLabel);
 container.add(nameField);
 container.add(sapIDLabel);
 container.add(sapIDField);
 container.add(genderLabel);
 container.add(genderMale);
 container.add(genderFemale);
 container.add(mailLabel);
 container.add(mailField);
 container.add(pwdLabel);
 container.add(pwdField);
 container.add(mobileLabel);
 container.add(mobileField);
 container.add(programLabel);
 container.add(progList);
 container.add(branchLabel);
 container.add(branchList);
 container.add(regButton);
 container.add(resultArea);
 }
 private void registerStudent() {
 String name = nameField.getText();
 String sapID = sapIDField.getText();
 String gender = genderMale.isSelected() ? "Male" : "Female";
 String email = mailField.getText();
 String mobile = mobileField.getText();
 String password = new String(pwdField.getPassword());
 String program = (String) progList.getSelectedItem();
 String branch = (String) branchList.getSelectedItem();
 StringBuilder result = new StringBuilder();
 result.append("Name: ").append(name).append("\n");

 result.append("SAP ID: ").append(sapID).append("\n");
 result.append("Gender: ").append(gender).append("\n");
 result.append("Email: ").append(email).append("\n");
 result.append("Mobile: ").append(mobile).append("\n");
 result.append("Password: ").append(password).append("\n");
 result.append("Program: ").append(program).append("\n");
 result.append("Branch: ").append(branch).append("\n");
 resultArea.setText(result.toString());
 }
 public static void main(String[] args) {
 RegistrationForm frame = new RegistrationForm();
 frame.setTitle("Student Register Form");
 frame.setVisible(true);
 frame.setBounds(500, 100, 500, 800);
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setResizable(false);
 }
}
