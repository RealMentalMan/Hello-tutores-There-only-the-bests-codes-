package Practice_22;

public class Hard {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller control = new Controller(model, view);
    }
}