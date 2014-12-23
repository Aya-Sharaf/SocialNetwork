package message;

import java.util.Scanner;
import user.IUser;

public class ChatMessage extends Message {

  public IUser receiver= new IUser() {

      @Override
      public void sendFriendRequest() {
          throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      }

      @Override
      public void addFriend() {
          throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      }
  };

    /**
     *
     */
    @Override
  public void addReceiver() {
      System.out.println("Send msg to who ?");
      Scanner input = new Scanner(System.in);
      receiver.name=input.next();
      String txt;
      System.out.println("Enter the msg body");
      txt=input.next();
        sendMessage(txt);
  }

}