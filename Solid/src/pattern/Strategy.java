package pattern;




public class Strategy {
//    The strategy design pattern is a behavioral design pattern. It is a tried and tested way of code design that can be used in scenarios where we need to pick up a specific approach (algorithm) from a pool of available related approaches during runtime to achieve something.


    //FIRST WE HAVE TO FOLLOW A STRATEGY DESIGN PATTERN IS TO DELCEARE THE POLICY OR STRATEGY
    //SO WE CREATE SOCIALACTIONS INTERFACE

   // Now we have four different sharing algorithms to choose from and it is time we created a way to make the selection process at runtime easier for our app by creating a layer of abstraction and exposing a consistent and predictable method to share URLs.

    //THEN WE HAVE CREATE CONTEXT CLOASS , BECAUSE WE HAVE MULTIPLE ALGO
  //  TO CHOOSE AND IT IS TIME WE CREATE A WAY TO MAKE THE SLECTION Process
    //AT RUNTIME EASIER FOR OIUR APP CREATEING A LAYER OF ABSTRACTION

    public static void main(String[] args) {
        try {

            shareURLOnSocialMedia("https://myawesomelink.dev", new FacebookAdapter());


            shareURLOnSocialMedia("https://myawesomelink.dev", new WhatsappAdapter());


            shareURLOnSocialMedia("https://myawesomelink.dev", new LinkedInAdapter());


            shareURLOnSocialMedia("https://myawesomelink.dev", null);

        } catch (Exception e) {
            System.out.println("Error caught in main: " + e.getMessage());
        }
    }

    private static void shareURLOnSocialMedia(String url,SocialActions strategy) throws Exception{

        SocialActivityContext socialActivityContext=new SocialActivityContext(strategy);

        socialActivityContext.share(url);

    }
}
