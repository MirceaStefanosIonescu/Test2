
 
package ionescu_stefanosv2_individual_parta;

import java.text.ParseException;
import java.util.ArrayList;


public class CourseInfomation {
    
    private Course course;
    private ArrayList<Student> students;
    private ArrayList<Trainer> trainer;
    private ArrayList<Assignment> assignment;

     public CourseInfomation(){
     }
    
    public CourseInfomation(Course course, ArrayList<Student> students, ArrayList<Trainer> trainer, ArrayList<Assignment> assignment) {
        this.course = course;
        this.students = students;
        this.trainer = trainer;
        this.assignment = assignment;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Trainer> getTrainer() {
        return trainer;
    }

    public void setTrainer(ArrayList<Trainer> trainer) {
        this.trainer = trainer;
    }

    public ArrayList<Assignment> getAssignment() {
        return assignment;
    }

    public void setAssignment(ArrayList<Assignment> assignment) {
        this.assignment = assignment;
    }

}
   /*
        for (CourseInfomation courseInfo : courseInfoList) {
            courseInfo.getCourse().getTitle();
            for (Student student : courseInfo.getStudents()) {
                student.getFirstName();
            }

        }
         */

/*
 public static void printStudentsPerCourse(ArrayList<CourseInfomation> courseInfoList) {

        for (CourseInfomation course : courseInfoList) {
            System.out.println();
            System.out.println("The Course with Name, Stream and Type: " + course.getCourse().getTitle()
                    + " " + course.getCourse().getStream()
                    + " " + course.getCourse().getType() + "\nWith Start And End Date: "
                    + DateUtilities.convertDateToString(course.getCourse().getStartasDate()) + " "
                    + DateUtilities.convertDateToString(course.getCourse().getEndDate()));
            for (Student student : course.getStudents()) {
                System.out.println("Has student with First And Last Name" + student.getFirstName()
                        + " " + student.getLastName() + "\nBirthDay and Tuitions Fees: "
                        + DateUtilities.convertDateToString(student.getDateOfBirth())
                        + " " + student.getTuitionFees());

            }
        }
    }



}
*/