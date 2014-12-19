package user;

import java.util.List;
import java.util.Vector;
import group.IGroup;
import database.UserModel;
import java.util.Scanner;
import message.Message;
import page.IPage;

public abstract class IUser {

  public List<IGroup> subscribedGroups;

  public List<IPage> likedPages;

  public String name;

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
    //public Vector  myIUser;
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
      System.out.println("Email: ");
      email=input.next();
      myUserModel.CreateUser();
      
  }

  public IUser getCurrentActiveUser() {
      return Instance ;
  }

  public void login() {
      
  }

  public void logout() {
      
  }

  private void IUser() {
  }

}