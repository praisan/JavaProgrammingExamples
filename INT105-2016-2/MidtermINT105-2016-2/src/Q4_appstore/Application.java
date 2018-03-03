package Q4_appstore;

public class Application extends Item{    
    
    public Application(String appName, String category, double price) {
        super(appName,category,price);
    }

    @Override
    public String getType() {
        return "App";
    }
}
