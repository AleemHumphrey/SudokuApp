import java.util.Arrays;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 * Basic class to represent the game state.
 */
public class Board {
    private int[] state;
    private int size;

    // --- Initializers ---
    public Board(int[] newState) {
        setState(newState);
    }

    public Board(int size) {
        setSize(size);
        setBlankState();
    }

    public Board() {
        new Board(9);
    }

    // --- Getters ---
    public int[] getState() {
        return state;
    }

    public void setState(int[] newState) {
        this.state = newState;
        setSize((int) sqrt(newState.length));
    }

    public int getSize() {
        return size;
    }

    private void setSize(int size) {
        if (0 >= size) {
            throw new IllegalArgumentException("Size must be a positive number");
        }
        if (pow(sqrt(size), 2) != size) {
            throw new IllegalArgumentException("Size must be a perfect square");
        }
        this.size = size;
    }

    // --- Setters ---
    private void setBlankState() {
        this.state = new int[size * size];
        Arrays.fill(state, 0);
    }
    public void setCellValue(int index, int value) {
        if (value <= 0 || value > size) {
            throw new IllegalArgumentException("Value must be a number 1 through" + size);
        }
        if (index < 0 || index >= size*size) {
            throw new IllegalArgumentException("Index out of bounds" + (size - 1));
        }
        state[index] = value;
    }
}
