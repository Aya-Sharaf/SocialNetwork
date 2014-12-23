package group;

import group.GroupPrivacy;
import java.util.ArrayList;
import java.util.Vector;
import user.IUser;

public abstract class IGroup {

  public GroupPrivacy privacy;

    public ArrayList <IUser> AllowedMembers ;
    public GroupPrivacy myGroupPrivacy;
    public Vector  hasA;

  public void addMember(IUser user) {
  }

  public void removeMember() {
  }

  public void setRole(String role) {
  }

  public void setPrivacy() {
  }

}