package _08kyuu._01_reversed_sequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReversedSequenceTest {

    @Test
    void reverse() {
        ReversedSequence rs = new ReversedSequence();
        assertArrayEquals(new int[]{5,4,3,2,1},rs.reverse(5));
    }
}