package group;

import database.GroupModel;
import group.GroupPrivacy;
import java.util.Scanner;
import java.util.Vector;
import user.IUser;

public abstract class IGroup {
    public String groupName;
    public String groupprivacy;
    public GroupPrivacy privacy;

    //public Vector  0..*;
    public GroupPrivacy myGroupPrivacy;
    public Vector  hasA;
    
    public GroupModel myGroupModel = new GroupModel ();

    public void createGroup() {
      System.out.println("Enter your group information ...\n" + "Name: ");
      Scanner input = new Scanner(System.in);
      groupName=input.next();
      System.out.println("Privacy: ");
      groupprivacy=input.next();
      setPrivacy();
     
      
  }
    
  public void addMember(IUser user) {
  }

    /**
     *
     * @param user
     */
    public void removeMember(IUser user) {
  }

  public void setRole(String role) {
  }

  public void setPrivacy() {
  }

   

}
