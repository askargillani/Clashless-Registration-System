/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package departmentsystem;

import java.sql.ResultSet;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;


class loginGui extends JFrame implements ActionListener {
    JButton loginButton;
    JTextField idTextField;
    JLabel idLabel;
    JLabel passwordLabel;
    JPasswordField passwordField;
    JCheckBox showPasswordCheckbox;
    JLabel lblNewLabel;
    JLabel iconLabel;
    ControllerClass c;
    
    loginGui(ControllerClass c)
    {
        c.loadTeachers();        
        c.loadCourses();
        c.loadStudents();
        c.loadStudents();
        c.loadRegistrations();
        c.loadBooks();
        c.loadAttendance();
        c.loadEvaluations();
        this.c = c;
        setTitle("Local Flex");
        setSize(500,450);
        getContentPane().setBackground(new Color(41, 54, 63));
        //image
        lblNewLabel = new JLabel(new ImageIcon("C:\\Users\\Askar G\\OneDrive\\Documents\\NetBeansProjects\\DepartmentManagementSystem\\src\\images\\f50.png"));
        lblNewLabel.setBounds(230, 40, 50, 55);
        iconLabel=new JLabel("WE KEEP YOU UPDATED");
        iconLabel.setFont(new Font(Font.MONOSPACED, Font.BOLD,  15));
        iconLabel.setBounds(165,95,210,30);
        iconLabel.setForeground(new Color(255,255,255));
        getContentPane().add(lblNewLabel);
        add(iconLabel);

        //rollNo or username
        idLabel = new JLabel("Roll No or ID");
        idLabel.setBounds(150,150,100,15);
        idLabel.setFont(new Font(Font.SERIF, Font.PLAIN,  15));
        idLabel.setForeground(new Color(255,255,255));

        idTextField= new JTextField();
        idTextField.setBounds(150,170,200,20);
        idTextField.setOpaque(false);
        idTextField.setForeground(new Color(255,255,255));
        idTextField.setCaretColor(Color.white );


        add(idLabel);
        add(idTextField);


        //password
        passwordLabel= new JLabel("Password");
        passwordLabel.setBounds(150,200,100,15);
        passwordLabel.setFont(new Font(Font.SERIF, Font.PLAIN,  15));
        passwordLabel.setForeground(new Color(255,255,255));

        passwordField = new JPasswordField();
        passwordField.setBounds(150,220,200,20);
        passwordField.setOpaque(false);
        passwordField.setForeground(new Color(255,255,255));
        passwordField.setCaretColor(Color.white );
        add(passwordLabel);
        add(passwordField);

        //checkBox
        showPasswordCheckbox = new JCheckBox("show password");
        showPasswordCheckbox.setBounds(150,240,130,30);
        showPasswordCheckbox.setBackground(new Color(41, 54, 63));
        showPasswordCheckbox.setForeground(new Color(255,255,255));
        add(showPasswordCheckbox);

        //button
        loginButton = new JButton("Sign in");
        loginButton.setBounds(190,290,120,30);
        loginButton.setForeground(new Color(255,255,255));
        loginButton.setBackground(new Color(13, 71, 129));
        add(loginButton);
        loginButton.setBackground(new Color(230,126,34));

        loginButton.addActionListener(this);
        showPasswordCheckbox.addActionListener(this);
//C:/Users/Askar G/IdeaProjects/GuiSubmission/src/Ficon.png

        //set icon of frame
        ImageIcon img = new ImageIcon("C:\\Users\\Askar G\\OneDrive\\Documents\\NetBeansProjects\\DepartmentManagementSystem\\src\\images\\f50.png");
        setIconImage(img.getImage());

        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //c.displayCourseRegistrations();
    }
    
//    public static void main(String[] args){new loginGui();}



    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==loginButton)
        {
            String id = idTextField.getText();
            char[] password = passwordField.getPassword();
//            JOptionPane.showMessageDialog(this,"ID: "+ id +" or password " +"incorrect");
            String passkey=String.valueOf(password);
            SQL sql=new SQL();
            ResultSet rs = sql.getStudent(id,passkey);
            
            
            try{
                //rs.next();
                //System.out.println(rs.getString(1));
                if(rs.next()){
                    setVisible(false);
                    Student s = c.getStudent(id);
                    setVisible(false);
                    new StudentUI(c,s).setVisible(true);
                }
                else
                {
                    rs=sql.getTeacher(id, passkey);
                    if(rs.next()){
                        setVisible(false);
                        Teacher t = c.getTeacher(id);
                        new TeacherUI(c,t).setVisible(true);
                    }
                    else{
                        rs=sql.getItAssistant(id, passkey);
                        if(rs.next()){
                            //JOptionPane.showMessageDialog(this,"logged in as IT assistant");
                            setVisible(false);
                            new ITAssistantUI(c).setVisible(true);
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(this,"ID: "+ id +" or password " +"incorrect"); 
                        }
                    }
                     
                }
            }
            catch(Exception ex)
            {
                System.out.println(ex);
            }
        }
        if(e.getSource()==showPasswordCheckbox)
        {
            if (showPasswordCheckbox.isSelected()) {
                passwordField.setEchoChar((char) 0);
            } else {
                passwordField.setEchoChar('*');
            }
        }
    }
}
