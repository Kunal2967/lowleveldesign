package pattern;

public class LinkedInAdapter implements SocialActions{
    @Override
    public void share(String content) {
        System.out.println("sharing on linkedin"+content);
    }
}
