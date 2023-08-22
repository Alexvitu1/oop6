public class Program {
    public static void main(String[] args) {

        Order order = new Order();
        Scaner sc = new Scaner(order);
        sc.inputFromConsole();
        Save save = new Save(order);
        save.saveToJson();

    }
}
