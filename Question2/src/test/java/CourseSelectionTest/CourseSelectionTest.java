package CourseSelection;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import CourseSelection.CourseSelection;

import java.util.*;

public class CourseSelectionTest{

    @Test
    public void test_has_pas_pre_emty_rec() {
        Course course = new Course();
        course.pre = new ArrayList<> ();
        List<Record> records = new ArrayList<>();
        assertTrue(CourseSelection.hasPassedPre(records, course));
    }

    @Test 
    public void test_has_pas_pre_emty_course() {
        Course course = new Course();
        course.pre = new ArrayList<> ();
        List<Record> records = new ArrayList<> ();
        Record record = new Record();
        record.termId = 1;
        record.courseId = 101;
        record.grade = 11;
        record.isMehman = false;
        records.add(record);
        assertTrue(CourseSelection.hasPassedPre(records, course));
    }

    @Test 
    public void test_has_pas_pre_low_grade() {
        Course course = new Course();
        course.id = 243;
        course.pre = new ArrayList<>();
        course.pre.add(123); 
        List<Record> records = new ArrayList<Record>();
        Record record = new Record();
        record.termId = 1;
        record.courseId = 243;
        record.grade = 8;
        record.isMehman = false;
        records.add(record);
        assertFalse(CourseSelection.hasPassedPre(records, course));
    }

    @Test
    public void test_has_pas_pre_high_grade() {
        Course course = new Course();
        course.id = 243;
        course.pre = new ArrayList<>();
        course.pre.add(123); 
        List<Record> records = new ArrayList<Record>();
        Record record = new Record();
        record.termId = 1;
        record.courseId = 123;
        record.grade = 18;
        record.isMehman = false;
        records.add(record);
        assertTrue(CourseSelection.hasPassedPre(records, course));
    }

    @Test
    public void test_has_pas_pre_mid_grade() {
        Course course = new Course();
        course.pre = new ArrayList<>();
        course.id = 243;
        course.pre.add(123); 
        List<Record> records = new ArrayList<Record>();
        Record record = new Record();
        record.termId = 1;
        record.courseId = 123;
        record.grade = 10;
        record.isMehman = false;
        records.add(record);
        assertTrue(CourseSelection.hasPassedPre(records, course));
    }

    @Test
    public void test_has_pas_pre_isMehman_low_grade() {
        Course course = new Course();
        course.id = 243;
        course.pre = new ArrayList<>();
        course.pre.add(123); 
        List<Record> records = new ArrayList<Record>();
        Record record = new Record();
        record.termId = 1;
        record.courseId = 123;
        record.grade = 11;
        record.isMehman = true;
        records.add(record);
        assertFalse(CourseSelection.hasPassedPre(records, course)); 
    }

    @Test
    public void test_has_pas_pre_isMehman_high_grade() {
        Course course = new Course();
        course.pre = new ArrayList<>();
        course.id = 243;
        course.pre.add(123); 
        List<Record> records = new ArrayList<Record>();
        Record record = new Record();
        record.termId = 1;
        record.courseId = 123;
        record.grade = 12;
        record.isMehman = true;
        records.add(record);
        assertTrue(CourseSelection.hasPassedPre(records, course)); 
    }

    @Test
    public void test_has_pas_pre_empty_rec_has_course() {
        Course course = new Course();
        course.pre = new ArrayList<> ();
        course.id = 243;
        course.pre.add(123);
        List<Record> records = new ArrayList<> ();
        assertFalse(CourseSelection.hasPassedPre(records, course));
    }

    @Test
    public void test_has_pas_pre_complex() {
        Course course = new Course();
        course.id = 243;
        course.pre = new ArrayList<> ();
        for(int i = 0; i < 3; i += 1) {
            course.pre.add(i);
        }
        List<Record> records = new ArrayList<> ();
        for(int i = 0; i < 3; i += 1){
            Record record = new Record();
            record.termId = 1;
            record.courseId = i;
            record.isMehman = false;
            record.grade = i + 8;
            records.add(record);
        }
        assertFalse(CourseSelection.hasPassedPre(records, course));
    }
}