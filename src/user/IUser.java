package user;

import java.util.List;
import java.util.Vector;
import group.IGroup;
import database.UserModel;
import java.util.ArrayList;
import java.util.Scanner;
import message.Message;
import page.IPage;

public abstract class IUser {
    public String checkname;
    public String checkPW;
    

  public List<IGroup> subscribedGroups;

  public List<IPage> likedPages;

   public String Fname;
  public String Mname;
  public String Lname;
  public String Password;
  public int Age;
  public String email;

  public IUser user;

  public Message message;

    public IUser myIUser;
    public IUser Instance;
    /**
   * 
   * @element-type IGroup
   */
  public Vector  memberIn;
    public Vector  myClosedPrivacy;
    public Vector  myPage;
    //public Vector  myPage;
    public Vector  myIPage;
    public ArrayList <IUser>  myFriends;
    //public Vector  myIUser;
    //public Vector  0..*;
    public Vector  myMessage;
    public UserModel myUserModel=new UserModel();

  public abstract void sendFriendRequest();

  public abstract void addFriend();

  public void signUp() {
      System.out.println("Enter your data ...\n" + "First Name: ");
      Scanner input = new Scanner(System.in);
      Fname=input.next();
      System.out.println("Enter your data ...\n" + "Middle Name: ");
      Mname=input.next(); 
      System.out.println("Enter your data ...\n" + "Last Name: ");
      Lname=input.next();
      System.out.println("Email: ");
      email=input.next();
      System.out.println("Enter your data ...\n" + "Password: ");
      Password=input.next();
      System.out.println("Enter your data ...\n" + "Age: ");
      Age=input.nextInt();
      
      myUserModel.CreateUser(this);
      
  }

  public IUser getCurrentActiveUser() {
     myUserModel.getUser(this) ;
  }

  public void login() {
     Scanner input = new Scanner(System.in);
      System.out.println("Email: ");
      email=input.next();
      System.out.println( "Password: ");
      Password=input.next();
      myUserModel.FindUser(this);
      
  }

  public void logout() {
      
  }

  private void IUser() 
  {
      if (Instance==null)
      {
          Instance = new IUser () {

              @Override
              public void sendFriendRequest() {
                  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
              }

              @Override
              public void addFriend() {
                  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
              }
          };
      }
  }

}
