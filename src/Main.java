public class Main {
    public static void main(String[] args) {
        Board game = new Board(9);
        PrintUtil.printState(game);
        PrintUtil.printFancyState(game);
    }
}
