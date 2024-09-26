package src.main.java.patterns;


interface ISocialMediaStrategy{
    void connectTo(String name);
}

class SocialMediaContext{
    ISocialMediaStrategy iSocialMediaStrategy;

    SocialMediaContext(ISocialMediaStrategy iSocialMediaStrategy){
        this.iSocialMediaStrategy = iSocialMediaStrategy;
    }

    public void connect(String name){
        iSocialMediaStrategy.connectTo(name);
    }
}
class FacebookStrategy implements ISocialMediaStrategy{

    @Override
    public void connectTo(String name) {
        System.out.println("We are connected via Facebook by : "+name);
    }
}
public class StrategyPatternTest {
    public static void main(String[] args) {

        ISocialMediaStrategy iSocialMediaStrategy = new FacebookStrategy();
        SocialMediaContext socialMediaContext = new SocialMediaContext(iSocialMediaStrategy);
        socialMediaContext.connect("Gopal");
    }
}
