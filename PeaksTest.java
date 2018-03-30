import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PeaksTest {
    @Test
    void solution() {
        //Example Input
        int[] A = {1,2,3,4,3,4,1,2,3,4,6,2};
        assertEquals(3,Peaks.solution(A));

        //Edge case, 1 Element
        int[] B = {5};
        assertEquals(0,Peaks.solution(B));

        //Edge case, All the same height
        int[] C = {0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        assertEquals(0,Peaks.solution(C));

        //Medium input
        int[] D = {1,2,3,4,3,4,1,2,3,4,6,2,1,2,3,4,3,4,1,2,3,4,6,2,1,2,3,4,3,4,1,2,3,4,6,2,1,2,3,4,3,4,1,2,3,4,6,2,1,2,3,4,3,4,1,2,3,4,6,2,1,2,3,4,3,4,1,2,3,4,6,2,1,2,3,4,3,4,1,2,3,4,6,2};
        assertEquals(21,Peaks.solution(D));
    }
}