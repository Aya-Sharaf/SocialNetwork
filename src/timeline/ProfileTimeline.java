package timeline;

import database.PostModel;

public class ProfileTimeline extends Timeline {

     
    /**
     *
     */
    @Override
  public void getPosts() {
       myPostModel.getPost();
  }
  
  

}
