import java.util.Arrays;
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
        setSize(9);
        setBlankState();
    }

    // --- Getters ---
    public int[] getState() {
        return state;
    }
    public int getSize() {
        return size;
    }

    // --- Setters ---
    private void setBlankState(){
        this.state = new int[size*size];
        Arrays.fill(state, 0);
    }

    public void setState(int[] newState) {
        this.state = newState;
        setSize((int) sqrt(newState.length));
    }
    private void setSize(int size) {
        if (0<size && size<128 && sqrt(size)%1==0) {
            this.size = size;
        }
    }

}
