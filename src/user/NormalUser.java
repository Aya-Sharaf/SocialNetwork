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
        myFriends.add(user);
        System.out.println ("Friend added");
        }

}