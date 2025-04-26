package pattern;

public class SocialActivityContext {
    private SocialActions socialactionsStrategy;

    public SocialActivityContext(SocialActions socialactionsStrategy){
        this.socialactionsStrategy=socialactionsStrategy;

    }


    public void share(String content) throws Exception{
       if(socialactionsStrategy==null){
           throw new Exception("socialactionsStrategy is null");
       }
        socialactionsStrategy.share(content);
    }
}
