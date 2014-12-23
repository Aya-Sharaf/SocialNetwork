package timeline;

import database.PostModel;

public class PublicTimeline extends Timeline {

 
  public void getPosts() {
      myPostModel.getAllPost();
  }

  public void getPublicGroups() {
  }

}
