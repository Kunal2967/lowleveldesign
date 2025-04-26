package pattern;

public class WhatsappAdapter implements SocialActions{
@Override
    public void share(String content) {
        System.out.println("sharing on whatsapp"+content);
    }
}
