package user;

public class NormalUser extends IUser {

  public void checkCurrentFriendsCount() {
  }

    @Override
    public void sendFriendRequest() {
        System.out.println ("Send friend request to who ?");
        
    
    }

    @Override
    public void addFriend() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}