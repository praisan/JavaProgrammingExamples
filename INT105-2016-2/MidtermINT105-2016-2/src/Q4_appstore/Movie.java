package Q4_appstore;

public class Movie extends Item{

    public Movie(String appName, String category, double price) {
        super(appName, category, price);
    }
    
    @Override
    public String getType() {
        return "Movie";
    }
    
}
