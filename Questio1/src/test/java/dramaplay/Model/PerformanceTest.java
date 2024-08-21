package dramaplays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import dramaplays.Performance;


public class PerformanceTest {

    @Test
    public void test_assign_true() {
        Performance perf = new Performance("play_id", 1000);
        assertEquals(perf.playID, "play_id");
        assertEquals(perf.audience, 1000);
    }

    @Test
    public void test_equailty_class() {
        Performance perf1 = new Performance("play_id1", 1000);
        Performance perf2 = new Performance("play_id2", 2000);
        assertFalse(perf1.playID == perf2.playID);
        assertFalse(perf1.audience == perf2.audience);
    }

    @Test
    public void test_equailty_class2() {
        Performance perf1 = new Performance("play_id", 1000);
        Performance perf2 = new Performance("play_id", 1000);
        assertTrue(perf1.playID == perf2.playID);
        assertTrue(perf1.audience == perf2.audience);
    }

    @Test void test_equailty_class3(){
        Performance perf1 = new Performance("play_id", 1000);
        Performance perf2 = new Performance("play_id", 1001);
        assertTrue(perf1.playID == perf2.playID);
        assertFalse(perf1.audience == perf2.audience);
    }
}