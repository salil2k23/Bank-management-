
package bankmanagement1;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import com.toedter.calendar.JDateChooser;
import java.util.*;

public class Signupone extends JFrame implements ActionListener{
    
    long random;
    JTextField nameTextField,FNAMETextField,emailTextField,dobTextField,addressTextField,pincodeTextField,cityTextField,stateTextField;
    JRadioButton male,female,other,married,unmarried;
     JDateChooser datechooser;
     JButton next;
    
            
    Signupone() {
        setLayout(null);
        Random ran =  new Random();
         random = Math.abs((ran.nextLong() %9000L)+1000L );
         JLabel text = new JLabel("APPLICATION FORM NO " + random);
        text.setBounds(140,20,600,40);
        text.setFont(new Font("Raleway",Font.BOLD,38));
        
        add(text);
        JLabel persnalDetails = new JLabel("PAGE 1 : PERSNAL DETAILS");
         persnalDetails.setBounds(290,80,400,30);
         persnalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        
        add( persnalDetails);
        
        JLabel name= new JLabel("NAME:");
         name.setBounds(100,140,100,30);
         name.setFont(new Font("Raleway",Font.BOLD,20));
         
        
        add( name);
         nameTextField = new  JTextField ();
        nameTextField.setFont(new Font("Raleway",Font.BOLD,14));
       nameTextField.setBounds(300,140,400,30);
        add(nameTextField );
       
        JLabel FNAME = new JLabel("FATHER NAME:");
         FNAME.setBounds(100,190,200,30);
         FNAME.setFont(new Font("Raleway",Font.BOLD,20));
        
        add( FNAME);
         FNAMETextField = new  JTextField ();
        FNAMETextField.setFont(new Font("Raleway",Font.BOLD,14));
      FNAMETextField.setBounds(300,190,400,30);
        add( FNAMETextField ); 
        
        JLabel dob = new JLabel("DATE OF BIRTH:");
         dob.setBounds(100,240,300,30);
         dob.setFont(new Font("Raleway",Font.BOLD,20));
        
        add( dob);
        datechooser = new JDateChooser();
        datechooser.setBounds(300,240,200,30);
        add( datechooser);
          
        
        JLabel gender = new JLabel("GENDER:");
         gender.setBounds(100,290,300,30);
         gender.setFont(new Font("Raleway",Font.BOLD,20));
        
        add( gender);
        male = new JRadioButton("MALE");
        male.setBounds(300,290,60,30);
        male.setBackground(Color.white);
        add(male);
        female = new JRadioButton("FEMALE");
        female.setBounds(450,290,120,30);
        female.setBackground(Color.white);
        add(female);
        other = new JRadioButton("OTHER");
        other.setBounds(600,290,180,30);
        other.setBackground(Color.white);
        add(other);
        ButtonGroup gendergroup = new    ButtonGroup ();
        gendergroup.add(male);
        gendergroup.add(female);
        gendergroup.add(other);
        
        
        JLabel email = new JLabel("EMAIL ADDRESS:");
         email.setBounds(100,340,400,30);
         email.setFont(new Font("Raleway",Font.BOLD,20));
        
        add( email);
        emailTextField = new  JTextField ();
        emailTextField.setFont(new Font("Raleway",Font.BOLD,14));
        emailTextField.setBounds(300,340,400,30);
        add( emailTextField ); 
        JLabel marital = new JLabel("MARITAL STATUS:");
         marital.setBounds(100,390,500,30);
         marital.setFont(new Font("Raleway",Font.BOLD,20));
        
        add( marital);
        
       married = new JRadioButton("MARRIED");
        married.setBounds(300,390,100,30);
        married.setBackground(Color.white);
        add(married);
        
        unmarried = new JRadioButton("UNMARRIED");
        unmarried.setBounds(450,390,100,30);
        unmarried.setBackground(Color.white);
        add(unmarried);
         ButtonGroup maritalgroup = new    ButtonGroup ();
        maritalgroup.add(married);
        maritalgroup.add(unmarried);
        JLabel address= new JLabel("ADDRESS:");
         address.setBounds(100,440,600,30);
         address.setFont(new Font("Raleway",Font.BOLD,20));
        
        add( address);
         addressTextField = new  JTextField ();
        addressTextField.setFont(new Font("Raleway",Font.BOLD,14));
     addressTextField.setBounds(300,440,400,30);
        add(addressTextField ); 
         JLabel city= new JLabel("CITY:");
         city.setBounds(100,490,700,30);
         city.setFont(new Font("Raleway",Font.BOLD,20));
        
        add( city);
         cityTextField = new  JTextField ();
        cityTextField.setFont(new Font("Raleway",Font.BOLD,14));
    cityTextField.setBounds(300,490,400,30);
        add(cityTextField ); 
         JLabel state= new JLabel("STATE:");
         state.setBounds(100,540,800,30);
         state.setFont(new Font("Raleway",Font.BOLD,20));
        
        add( state);
          stateTextField = new  JTextField ();
        stateTextField.setFont(new Font("Raleway",Font.BOLD,14));
        stateTextField.setBounds(300,540,400,30);
        add(stateTextField ); 
         JLabel pincode= new JLabel("PINCODE:");
         pincode.setBounds(100,590,900,30);
         pincode.setFont(new Font("Raleway",Font.BOLD,20));
        
        add( pincode);
        pincodeTextField = new  JTextField ();
        pincodeTextField.setFont(new Font("Raleway",Font.BOLD,14));
        pincodeTextField.setBounds(300,590,400,30);
        add(pincodeTextField ); 
        
         next = new  JButton("NEXT");
        next.setBounds(620,660,80,30);
        next.setBackground(Color.red);
        next.addActionListener(this);
        
        add(next);
        
        
        
          getContentPane().setBackground(Color.white);
        setSize (850,800);
        setVisible(true);
        setLocation(350,10);
    
}
    public void  actionPerformed (ActionEvent ae){
        String formno = "" + random;// long
        String name = nameTextField.getText();// set text
        String FNAME = FNAMETextField.getText();
        String dob   = ((JTextField)datechooser.getDateEditor().getUiComponent()).getText();
       String gender = null;
       if (male.isSelected()){
           gender = "MALE";
       }else if (female.isSelected()){
           gender = "FEMALE";
       }else if (other.isSelected()){
           gender = "OTHER";
       }
       String email = emailTextField.getText();
       String Marital  = null;
        if (married.isSelected()){
           Marital = "MARRIED";
       }else if (unmarried.isSelected()){
           Marital = "UNMARRIED";
       }
        String address= addressTextField.getText();
        String city = cityTextField.getText();
        String state = stateTextField.getText();
        String pincode = pincodeTextField.getText();
        
         try {
             if (name.equals("")){
                JOptionPane.showMessageDialog(null , "name is required");
             }else  {
                 conn c = new conn();
                 String query = "insert  into signup values('"+formno+"',  '"+ name +"',  '"+city+"',  '"+state+"', '"+FNAME+"',  '"+pincode+"', '"+Marital+"', '"+gender+"', '"+address+"', '"+dob+"' ,'"+email+"')";
                 c.s.executeUpdate(query);
                 setVisible(false);
                 new SignupTwo(formno). setVisible(true);
             }
          
         
        }  catch (Exception e){
            System.out.println (e);
            
        }
    
        
    }

   
    public static void main(String args[]) {
       new Signupone().setVisible(true);
    }
}
