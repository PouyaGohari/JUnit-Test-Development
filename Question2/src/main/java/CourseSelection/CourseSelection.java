package CourseSelection;

import java.util.List;

class Course { 
    int id; 
    List<Integer> pre; 
} 
 
class Record { 
    int termId; 
    int courseId; 
    double grade; 
    boolean isMehman; 
} 

public class CourseSelection{
    public static boolean hasPassedPre(List<Record> rec, Course course) { 
        for (int i = 0; i < course.pre.size(); i++) { 
            boolean prePassed = false; 
            for (int j = 0; j < rec.size(); j++) { 
                if (rec.get(j).courseId != course.pre.get(i)) 
                    continue; 
                if (rec.get(j).grade >= 10 && (!rec.get(j).isMehman || rec.get(j).grade >= 12)) { 
                    prePassed = true; 
                    break; 
                } 
            } if (!prePassed) 
                return false; 
        } 
        return true; 
    }
}