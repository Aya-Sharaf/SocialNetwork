package database;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import user.IUser;

public class UserModel {

    public IUser myIUser;

  public void CreateUser(IUser u) {
      try {
        Class.forName("com.mysql.jdbc.Driver");
           try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/socialnetwork", "root", "")) {
               Statement st = con.createStatement();
           
               String Query = "INSERT INTO User " +
                       "VALUES(? , ? , ? , ? , ? , ?)";
               PreparedStatement pr = con.prepareStatement(Query);
               pr.setString(1, u.Fname);
               pr.setString(2, u.Mname);
               pr.setString(3, u.Lname);
               pr.setString(4, u.email);
               pr.setString(5, u.Password);
               pr.setInt(6, u.Age);
               
               pr.executeUpdate();
               System.out.println("User Created");
              
            
           }
        }
        catch (ClassNotFoundException | SQLException e){
        }
      
  }

  public void DeleteUser() {
      try {
        Class.forName("com.mysql.jdbc.Driver");
           try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/socialnetwork", "root", "")) {
               Statement st = con.createStatement();
           
               String Query = "DELETE FROM User WHERE FirstNAme=? ";
               PreparedStatement pr = con.prepareStatement(Query);
               pr.setString(1, u.Fname);
               pr.executeQuery();
              // st.executeUpdate(Query);
               System.out.println("User Deleted");
              
           }
        }
        catch (ClassNotFoundException | SQLException e){
        }
      
  }

  public void getUser(IUser u) 
  {
          try {
        Class.forName("com.mysql.jdbc.Driver");
           try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/socialnetwork", "root", "")) {
               Statement st = con.createStatement();
               String Query = "Select * from User where Email = ?";
               PreparedStatement pr = con.prepareStatement(Query);
               pr.setString(1, u.email);
               //pr.executeQuery();
               ResultSet rs = pr.executeQuery();
               
                    System.out.print("FirstName" );
                    System.out.print("      MiddleName" );
                    System.out.print("      LastName" );
                    System.out.print("      Email" );
                    
                    System.out.println();
                    
               while(rs.next()){
                    String first = rs.getString("FirstName");
                    String middle = rs.getString("MiddleName");
                    String last = rs.getString("LastName");
                    String email = rs.getString("Email");
                    
                    
                    System.out.print(first);
                    System.out.print("          "+ middle);
                    System.out.print( "         "+last);
                    System.out.print( "         "+email);
                    System.out.println();
                          }               
      }            
         
          
        }
        catch (ClassNotFoundException | SQLException e){
        }
  }

  /*public void updateUser() {
      try {
        Class.forName("com.mysql.jdbc.Driver");
           try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/socialnetwork", "root", "")) {
               Statement st = con.createStatement();
           
               String Query = "UPDATE User " +
                   "SET FirstNAme = 'Ahmed' WHERE Age in (10)";
              st.executeUpdate(Query);
               System.out.println("User Updated");
              
            
           }
        }
        catch (ClassNotFoundException | SQLException e){
        }
  }*/

  
  public void FindUser (IUser u){
       try {
        Class.forName("com.mysql.jdbc.Driver");
           try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/socialnetwork", "root", "")) {
               Statement st = con.createStatement();
               String Query = "Select email,Password  from User where email=? AND Password=?  ";
               PreparedStatement pr = con.prepareStatement(Query); 
               pr.setString(1, u.email);
               pr.setString(2,u.Password);
               ResultSet rs = pr.executeQuery();               
                    
               while(rs.next()){
                    String email = rs.getString("email");
                    String Pass = rs.getString("Password");
                    
                    if (email != u.email && Pass != u.Password  ){
                       System.out.println("You are logged in");
                    }
                    else {
                        System.out.println("Incorrect Email or password");
                    }
               }
    }            
       
        }
        catch (ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
      
     
  }
}
