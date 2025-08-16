import java.util.Arrays;
import static java.lang.Math.sqrt;

/**
 * Basic class to represent the game state.
 */
public class Board {
    private byte[] state;
    private int size;

    // --- Initializers ---
    public Board(byte[] newState) {
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
    public byte[] getState() {
        return state;
    }
    public int getSize() {
        return size;
    }

    // --- Setters ---
    private void setBlankState(){
        this.state = new byte[size*size];
        Arrays.fill(state, (byte) 0);
    }

    public void setState(byte[] newState) {
        this.state = newState;
    }
    private void setSize(int size) {
        if (0<size && size<128 && sqrt(size)%1==0) {
            this.size = size;
        }
    }

}
