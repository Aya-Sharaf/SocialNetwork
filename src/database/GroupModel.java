package group;

import user.IUser;
import java.util.Map;
import database.GroupModel;
import java.util.ArrayList;
import java.util.Scanner;
import user.NormalUser;

public class Group extends IGroup {

  public String title;
  public String addedMember;
  public String removedMember;
  public String coverPicture;
   ArrayList <IUser> List = new ArrayList <IUser> ();
  

  //public Map<IUser,Role> users;
  
    /**
     *
     * @param user
     */
    @Override
  public void addMember(IUser user) {
      System.out.println("Enter the name of user that you want to add");
      Scanner input = new Scanner(System.in);
      addedMember = input.next();
      if (addedMember == user.Fname  ) {
          System.out.println("Incorrect name!");
          
      } 
      else {
          List.add(user);
          System.out.println("User "+ user.Fname +" added to the group" );
      }
      
  }
  


    /**
     *
     */
    @Override
  public void removeMember(IUser user) {
      System.out.println("Enter the name of user that you want to remove");
      Scanner input = new Scanner(System.in);
      removedMember = input.next();
      if (removedMember == user.Fname  ) {
          System.out.println("Incorrect name!");
          
      } 
      else {
          List.remove(user);
          System.out.println("User "+ user.Fname +" removed from the group" );
      }
  }

  public void setRole() {
  }
  
    /**
     *
     */
    @Override
  public void setPrivacy() {
      if (null != groupprivacy) {
          switch (groupprivacy) {
              case "Public":
              case "public":
                  myGroupPrivacy = new PublicPrivacy();
                  myGroupModel.CreateGroup(this);
                  System.out.println("Group Created");
                  break;
              case "Closed":
              case "closed":
                  myGroupPrivacy = new ClosedPrivacy();
                  myGroupModel.CreateGroup(this);
                  System.out.println("Group Created");
                  break;
              default:
                  System.out.println("Undefined privacy state");
                  go: {
                      System.out.println("Privacy: ");
                      Scanner input = new Scanner(System.in);
                      groupprivacy=input.next();
                      setPrivacy();
                  
              }
                  
                  break;
          }
      }
  }

}
