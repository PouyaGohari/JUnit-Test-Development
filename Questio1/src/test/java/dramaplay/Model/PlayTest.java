package dramaplays;

import dramaplays.Play;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

public class PlayTest {
    @Test
    public void test_correction_test() {
        String name = "pouya";
        String type = "male";
        Play play = new Play(name, type);
        assertTrue((play.name == name) && (play.type == type));
    }
    @Test 
    public void test_equailty() {
        Play p1 = new Play("name1", "type1");
        Play p2 = new Play("name2", "type2");
        assertFalse(p1.name == p2.name);
        assertFalse(p1.type == p2.type);
    }
    @Test 
    public void test_equailty2() {
        Play p1 = new Play("name", "type");
        Play p2 = new Play("name", "type");
        assertTrue(p1.name == p2.name);
        assertTrue(p1.type == p2.type);
    }
}