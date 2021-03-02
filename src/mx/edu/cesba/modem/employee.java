/*
 * nombre: ana rubi delgado ramirez
* matricula: 2012044
 */
package mx.edu.cesba.modem;

/**
 *
 * @author ana
 */
public class employee {

    private int id;  // un dato private: es un dato encapsulado
    private String firstname;
    private String lastname;
    private int age;
    private String email;
    private int phonenumber;
    private double salary;
    private String hiredate;
    
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public void setfirstname(String firstname){
        this.firstname = firstname;
    }
    public String getfirstname(){
        return firstname;
    }
     public void setlastname(String lastname){
        this.lastname = lastname;
    }
    public String getlastname(){
        return lastname;
    }
     public void setage(int age){
        this.age = age;
    }
    public int getage(){
        return age;
    }
     public void setemail(String email){
        this.email = email;
    }
    public String getemail(){
        return email;
    }
    public void setphonenumber(int phonenumber){
        this.phonenumber = phonenumber;
    }
    public int getphonenumber(){
        return phonenumber;
    }
     public void setsalary(double salary){
        this.salary = salary;
    }
    public double getsalary(){
        return salary;
    }
     public void sethiredate(String hiredate){
        this.hiredate = hiredate;
    }
    public String gethiredate(){
        return hiredate;
    }
    
    
    
    
    

    
    
    



    public void getdetails() {//metodo
     System.out.println("id:" + id);
     System.out.println("firstname:" + firstname);
     System.out.println("lastname:" + lastname);
     System.out.println("age:" + age);
    System.out.println("email:" + email);
     System.out.println("phonenumber:" + phonenumber);
     System.out.println("salary:" + salary);
     System.out.println("hiredate:" + hiredate);
     }
        
    }
        

    

