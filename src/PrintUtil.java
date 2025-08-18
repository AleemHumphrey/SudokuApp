import static java.lang.String.valueOf;

public class PrintUtil {
    public static void printFancyState(Board game) {
        int[] state = game.getState();
        int size = game.getSize();
        int sector = (int) Math.sqrt(size);
        int spacing = decimalLength(size);

        System.out.print("┏");
        for (int col = 1; col <= size; col++) {
            if (col % size == 0) {
                System.out.print("━".repeat(spacing + 2) + "┓\n");
            } else if (col % sector == 0) {
                System.out.print("━".repeat(spacing + 2) + "┳");
            } else {
                System.out.print("━".repeat(spacing + 2) + "┯");
            }
        }
        for (int row = 0; row < size; row++) {
            System.out.print("┃");
            for (int col = 0; col < size; col++) {
//                int cell = state[row * size + col];
//                String cellString = cell == 0 ? " ".repeat(spacing) : leftPad(cell, spacing);
//                System.out.printf(" %s ", cellString);
                System.out.printf(" %s ", ((state[row * size + col])) == 0 ? " ".repeat(spacing) : leftPad((state[row * size + col]), spacing));
                if ((col + 1) % sector == 0) {
                    System.out.print("┃");
                } else {
                    System.out.print("│");
                }
            }
            System.out.println();
            if ((row + 1) % size == 0) {
                System.out.print("┗");
                for (int col = 0; col < size; col++) {
                    if ((col + 1) % size == 0) {
                        System.out.print("━".repeat(spacing + 2) + "┛");
                        System.out.println();
                    } else if ((col + 1) % sector == 0) {
                        System.out.print("━".repeat(spacing + 2) + "┻");
                    } else {
                        System.out.print("━".repeat(spacing + 2) + "┷");
                    }
                }
            } else if ((row + 1) % sector == 0) {
                System.out.print("┣");
                for (int row_ = 0; row_ < size; row_++) {
                    if ((row_ + 1) % size == 0) {
                        System.out.print("━".repeat(spacing + 2) + "┫");
                        System.out.println();
                    } else if ((row_ + 1) % sector == 0) {
                        System.out.print("━".repeat(spacing + 2) + "╋");
                    } else {
                        System.out.print("━".repeat(spacing + 2) + "┿");
                    }
                }
            } else {
                System.out.print("┠");
                for (int row_ = 0; row_ < size; row_++) {
                    if ((row_ + 1) % size == 0) {
                        System.out.print("─".repeat(spacing + 2) + "┨");
                        System.out.println();
                    } else if ((row_ + 1) % sector == 0) {
                        System.out.print("─".repeat(spacing + 2) + "╂");
                    } else {
                        System.out.print("─".repeat(spacing + 2) + "┼");
                    }
                }
            }
        }
    }

    public static void printState(Board game) {
        int[] state = game.getState();
        int size = game.getSize();
        int spacing = decimalLength(size);
        for (int cell = 0; cell < state.length; cell++) {
//            int number = state[cell];
//            String numberString = valueOf(number);
//            String cellState = leftPad(numberString, spacing);
//            System.out.print(cellState);
            System.out.print(leftPad(valueOf(state[cell]), spacing) + " ");
            if (cell % size == 8) {
                System.out.println();
            }
        }
    }

    public static String leftPad(String original, int size) {
        String pad = " ";
        int pads = size - original.length();
        if (pads <= 0) {
            return original;
        } else if (pads == 1) {
            return pad.concat(original);
        } else {
            return pad.repeat(pads).concat(original);
        }
    }

    public static String leftPad(int original, int size) {
        String pad = " ";
        int pads = size - decimalLength(original);
        String string = valueOf(original);
        if (pads <= 0) {
            return string;
        } else if (pads == 1) {
            return pad.concat(string);
        } else {
            return pad.repeat(pads).concat(string);
        }
    }

    public static int decimalLength(int x) {
        return (int) (Math.log10(x) + 1);
    }
}
