import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {

    @Test
    void getState() {
        Board board = new Board();
        int[] expected = new int[81];
        assertArrayEquals(expected, board.getState());
        for(int b : board.getState()) {
            assertEquals(0, b);
        }

    }

    @Test
    void getSize() {
    }

    @Test
    void setState() {
    }
}