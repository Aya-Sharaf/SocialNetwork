package page;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class IPage {

    public ArrayList myIUser;
    /**
   * 
   * @element-type IUser
   */
  public ArrayList  like;

  public void likeAPage() { 
      String Choice = null ; 
      int NumberOfLikes = 0 ;
      for (int i = 0 ; i<100; i ++ ){
          System.out.println("Do you want to like this page ? :) ");
          Scanner input = new Scanner(System.in);
            Choice=input.next();
      
          if("Yes".equals(Choice) || "yes".equals(Choice))
          {
              NumberOfLikes ++ ; 
              System.out.println("You've liked this page successfully ;)");
              System.out.println("Number Of Likes : " + NumberOfLikes);
              
          }
          else if ("No".equals(Choice) || "no".equals(Choice)){
              System.out.println("I hope that you find another page to like :) ");
              break; 
          }
          else { System.out.println("ERRORR , Not an option ");
          break ; 
          }
          
          
  }
      System.out.println(NumberOfLikes); 
      
  }

  
      

}