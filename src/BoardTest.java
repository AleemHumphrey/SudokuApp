import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BoardTest {

    @Test
    void getState() {
        Board board = new Board(9);
        for (int b : board.getState()) {
            assertEquals(0, b);
        }
        assertEquals(81, board.getState().length);

    }
}