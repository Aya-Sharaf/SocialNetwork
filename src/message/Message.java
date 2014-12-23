package message;

import database.MessageModel;
import java.util.Vector;
import user.IUser;

public abstract class Message {

    public Vector  myIUser;
    public MessageModel mymodel = new MessageModel();

  public void sendMessage(String msgtxt) {
      mymodel.createMessage(msgtxt);
      
  }

  public void addReceiver() {
      
  }

}