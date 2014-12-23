package database;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import post.Post;
import user.IUser;

public class PostModel {

    
  public void createPost(Post P) {
      
      try {
        Class.forName("com.mysql.jdbc.Driver");
           try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/socialnetwork", "root", "")) {
               Statement st = con.createStatement();
               
               String Query = "INSERT INTO Post " +
                       "VALUES(?, ?,?)";
               PreparedStatement pr = con.prepareStatement(Query);
               pr.setString(1,/* Current active user */ );
               pr.setString(2,P.Pprivacy );
               pr.setString(3, P.Content);
               pr.executeUpdate();
               //st.executeUpdate(Query);
                                      
               System.out.println("Post Created");
              
            
           }
        }
        catch (ClassNotFoundException | SQLException e){
        }
      
  }


  public void deletePost() {
      
      try {
        Class.forName("com.mysql.jdbc.Driver");
           try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/socialnetwork", "root", "")) {
               Statement st = con.createStatement();
           
               String Query = "DELETE FROM Post WHERE writer=? ";
               PreparedStatement pr = con.prepareStatement(Query);
              //////// pr.setString(1, current acive user );
              st.executeUpdate(Query);
               System.out.println("Post Deleted");
              
            
           }
        }
        catch (ClassNotFoundException | SQLException e){
        }
  }

  public void getPost() {
         try {
        Class.forName("com.mysql.jdbc.Driver");
           try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/socialnetwork", "root", "")) {
               Statement st = con.createStatement();
               String Query = "Select Content from Post Where Writer = 'Ahmed' ";
               ResultSet rs = st.executeQuery(Query);
               
                   /* System.out.print("Writer" );
                    System.out.print("      Privacy" );
                    System.out.print("      Content" );
                    System.out.println();*/
                    
               while(rs.next()){
                  /*  String auther = rs.getString("Writer");
                    String privacy = rs.getString("Privacy");*/
                    String content = rs.getString("Content");
                   
                 /*   System.out.print(auther);
                    System.out.print("          "+ privacy);*/
                    System.out.print( "         "+content);
                    System.out.println();
                    
                    }
                        
                         }            
                  
        }
        catch (ClassNotFoundException | SQLException e){
        }
  }

  
  
  public void getAllPost() {
         try {
        Class.forName("com.mysql.jdbc.Driver");
           try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/socialnetwork", "root", "")) {
               Statement st = con.createStatement();
               String Query = "Select * from Post  ";
               ResultSet rs = st.executeQuery(Query);
               
                    System.out.print("Writer" );
                   // System.out.print("      Privacy" );
                    System.out.print("      Content" );
                    System.out.println();
                    
               while(rs.next()){
                    String auther = rs.getString("Writer");
                  //  String privacy = rs.getString("Privacy");
                    String content = rs.getString("Content");
                   
                    System.out.print(auther);
                    //System.out.print("          "+ privacy);
                    System.out.print( "         "+content);
                    System.out.println();
                    
                    }
                        
                         }            
                  
        }
        catch (ClassNotFoundException | SQLException e){
        }
  }

  public void updatePost() {
      try {
        Class.forName("com.mysql.jdbc.Driver");
           try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/socialnetwork", "root", "")) {
               Statement st = con.createStatement();
           
               String Query = "UPDATE Post " +
                   "SET Privacy = 'Closed' WHERE Writer in ('Ahmed')";
              st.executeUpdate(Query);
               System.out.println("User Updated");
              
            
           }
        }
        catch (ClassNotFoundException | SQLException e){
        }
  }

}
