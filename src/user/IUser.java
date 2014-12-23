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

  public String name;
  public String password;
  public int age;
  public String username;

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
      System.out.println("Enter your data ...\n" + "Name: ");
      Scanner input = new Scanner(System.in);
      name=input.next();
      System.out.println("Username: ");
      username=input.next();
      System.out.println("Password: ");
      password=input.next();
      myUserModel.CreateUser();
      
  }

  public IUser getCurrentActiveUser() {
      return Instance ;
  }

  public void login() {
      System.out.println("Enter your data ...\n" + "Username: ");
      Scanner input = new Scanner(System.in);
      checkname=input.next();
      System.out.println("Password ");
      checkPW=input.next();
      if (checkname.equals(name) && checkPW.equals(password))
      {
          System.out.println ("Log in DONE :))) ");
      }
      else System.out.println("Wrong Username or password !!");
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