package pattern;

public class FacebookAdapter implements SocialActions{
     public void share(String content){
         System.out.println("sharing on facebook"+content);
     }
}
