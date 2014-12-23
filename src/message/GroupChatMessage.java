package message;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import user.IUser;

public class GroupChatMessage extends Message {

  public ArrayList<IUser> allUsers;

  public String title;

  @Override
  public void addReceiver() {
      System.out.println("Send msg to who ?");
      Scanner input = new Scanner(System.in);
      for (int i = 0; i < allUsers.size(); i++) {
             allUsers.get(i).name=input.next(); 
          }
      System.out.println("Enter the msg title");
      title=input.next();
      String txt;
      System.out.println("Enter the msg body");
      txt=input.next();
        sendMessage(txt);
  }

}