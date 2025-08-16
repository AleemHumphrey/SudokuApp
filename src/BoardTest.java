import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {

    @Test
    void getState() {
        Board board = new Board();
        byte[] expected = new byte[81];
        assertArrayEquals(expected, board.getState());
        for(byte b : board.getState()) {
            assertEquals((byte) 0, b);
        }

    }

    @Test
    void getSize() {
    }

    @Test
    void setState() {
    }
}