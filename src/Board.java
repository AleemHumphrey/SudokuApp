/**
 * Basic class to represent the game state.
 */
public class Board {
    private int[][] state;

    // --- Initializer ---
    public Board(int[][] newState) {
        setState(newState);
    }

    // --- Getters ---
    public int[][] getState() {
        return state;
    }

    // --- Setters ---
    public void setState(int[][] state) {
        this.state = state;
    }

}
