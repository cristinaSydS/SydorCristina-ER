import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DebugRockPaperScissorsTest {

    @Test
    void pedraGuanyaTisores(){
        assertEquals(1, DebugRockPaperScissors.guanya("pedra", "tisores"));
    }

    @Test
    void tisoresEmpataTisores(){
        assertEquals(0, DebugRockPaperScissors.guanya("tisores", "tisores"));
    }
}