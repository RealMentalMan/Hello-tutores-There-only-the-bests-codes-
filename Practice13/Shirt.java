package Practice13;

public class Shirt {
    private String model, size, type, color;
    public void shirt(String[] info) {
        this.model = info[0];
        this.size = info[3];
        this.type = info[1];
        this.color = info[2];
        toLine();
    }

    public void toLine() {
        String res = "";
        res = new StringBuffer().append("Тип рубахи:  ").append(type).append("\nРазмер- ").append(size).append(" - цвет - ").append(color).append("\nАйди:  ").append(model).toString();
        System.out.println(res);
        System.out.println("\n");
    }
}
