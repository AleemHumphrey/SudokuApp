public class PrintUtil {
    public static void printState(Board game) {
        int[] state = game.getState();
        int boardSize = game.getSize();
        int sectorSize = (int) Math.sqrt(boardSize);
        int spacing = (int)(Math.log10(boardSize)+1);

        System.out.print("┏");
        for (int col = 0; col < boardSize; col++) {
            if ((col+1)%boardSize == 0) {
                System.out.println("━".repeat(spacing + 2)  + "┓");
            } else if ((col+1)%sectorSize == 0) {
                System.out.print("━".repeat(spacing + 2)  + "┳");
            } else {
                System.out.print("━".repeat(spacing + 2)  + "┯");
            }
        }
        for (int row = 0; row < boardSize; row++) {
            System.out.print("┃");
            for (int col = 0; col < boardSize; col++) {
                int index = row * boardSize + col;
                System.out.print(" " + (state[index] == 0 ? " ".repeat(spacing) : state[index]) + " ");
                if ((col + 1) % sectorSize == 0) {
                    System.out.print("┃");
                } else {
                    System.out.print("│");
                }
            }
            System.out.println();
            if ((row + 1) % boardSize == 0) {
                System.out.print("┗");
                for (int col = 0; col < boardSize; col++) {
                    if ((col+1)%boardSize == 0) {
                        System.out.println("━".repeat(spacing + 2)  + "┛");
                    } else if ((col+1)%sectorSize == 0) {
                        System.out.print("━".repeat(spacing + 2)  + "┻");
                    } else {
                        System.out.print("━".repeat(spacing + 2)  + "┷");
                    }
                }
            } else if ((row + 1) % sectorSize == 0) {
                System.out.print("┣");
                for (int row_ = 0; row_ < boardSize; row_++) {
                    if ((row_+1)%boardSize == 0) {
                        System.out.println("━".repeat(spacing + 2)  + "┫");
                    } else if ((row_+1)%sectorSize == 0) {
                        System.out.print("━".repeat(spacing + 2)  + "╋");
                    } else {
                        System.out.print("━".repeat(spacing + 2)  + "┿");
                    }
                }
            } else {
                System.out.print("┠");
                for (int row_ = 0; row_ < boardSize; row_++) {
                    if ((row_+1)%boardSize == 0) {
                        System.out.println("─".repeat(spacing + 2)  + "┨");
                    } else if ((row_+1)%sectorSize == 0) {
                        System.out.print("─".repeat(spacing + 2)  + "╂");
                    } else {
                        System.out.print("─".repeat(spacing + 2)  + "┼");
                    }
                }
            }
        }
    }
}
