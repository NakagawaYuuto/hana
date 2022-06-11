public class Flowers {
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void index(){
        System.out.println("情熱の花は" + name + "です。");
        System.out.println("その理由は" + color + "色だからです。");
    }
}
