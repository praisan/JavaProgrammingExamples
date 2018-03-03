package G4.Lecture06;

public class Cat implements ColorAble {

    private String name;
    private String color;

    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
    }
    

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void fillColor(String color) {
        this.color=color;
    }

}
