/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cesba.mein;


import javax.swing.JOptionPane;
import mx.edu.cesba.modem.employee;


public class hr_main {
    public static void main(String[] args) {
     employee el = new employee ();
     employee e2 = new employee ();
     el.setId(1);
     el.setfirstname(JOptionPane.showInputDialog("ingrese nombre"));
     el.setlastname(JOptionPane.showInputDialog("ingrese apellido"));
     el.setage(Integer.parseInt(JOptionPane.showInputDialog("ingrese la edad")));
     el.setemail(JOptionPane.showInputDialog("ingrese el correo"));
     el.setphonenumber(Integer.parseInt(JOptionPane.showInputDialog("ingrese la numero telefonico")));
     el.setsalary(Double.parseDouble(JOptionPane.showInputDialog("ingrese salario")));
     el.sethiredate(JOptionPane.showInputDialog("ingrese fecha de contratacion"));
     el.getdetails();
     
     System.out.println("------------------");
      e2.id = 2;
     e2.firstname = JOptionPane.showInputDialog("ingrese nombre");
     e2.lastname = JOptionPane.showInputDialog("ingrese apellido");
     e2.age = Integer.parseInt(JOptionPane.showInputDialog("ingrese la edad"));
     e2.email = JOptionPane.showInputDialog("ingrese el correo");
     e2.phonenumber = Integer.parseInt(JOptionPane.showInputDialog("ingrese la numero telefonico"));
     e2.salary = Double.parseDouble(JOptionPane.showInputDialog("ingrese salario"));
     e2.hiredate = JOptionPane.showInputDialog("ingrese fecha de contratacion");
     
     e2.getdetails();
     
             
        
     
             
             
             
             
             
             
        
    }
            
    
}
