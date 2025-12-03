package OnlineCoursePlatform;


/*
   NAME: KAREEM MOHAMED EMARA
   ID:   2304032
*/

import OnlineCoursePlatform.Courses.Course;
import OnlineCoursePlatform.Courses.offlineCourses;
import OnlineCoursePlatform.Courses.onlineCourses;
import OnlineCoursePlatform.Courses.recordedCourses;
import OnlineCoursePlatform.Users.Instructor;
import OnlineCoursePlatform.Users.PremiumStudent;
import OnlineCoursePlatform.Users.Professor;
import OnlineCoursePlatform.Users.Student;

import java.util.Calendar;

public class Testing {
    public static void main(String[] args) {

        Professor p1 = new Professor("Magdi","Magdi1@gmail.com",230,"Computer");
        Professor p2 = new Professor("Mohamed","Mohamed12@yahoo.com",330,"Electrical");
        Professor p3 = new Professor("Kareem","Kemo33@gmail.com",113,"Communications");

        p1.assignResearchArea("Nano technology");
        p2.assignResearchArea("Electric Batteries For Cars");
        p3.assignResearchArea("Networks and Radio Waves");

        Student s1 = new Student("Hesham","Hesham223@anu.com",2304011);
        Student s2 = new Student("Mazen","Mazon89@Gmail.com",2304889);
        Student s3 = new PremiumStudent("Kareem","Kareem99@ANU.com",2305066,"Platinum", Calendar.getInstance());

        Course c1 = new onlineCourses("EMP220","ELectronic Circuits ",3,"https:\\zoom.123","Zoom",true);
        Course c2 = new onlineCourses("CCE310","Programming 2",3,"https:\\Droos.122","Droos",false);
        Course c3 = new offlineCourses("ECE450","Embedded Systems",3,"L4","Electric","SUNDAY 11:00 PM");
        Course c4 = new recordedCourses("ECE110","Physics 2",3,"https:\\Udemy112","Udemy",false,4,2.30,Calendar.getInstance());

        c1.assignInstructor(p1);
        c2.assignInstructor(p2);
        c3.assignInstructor(p3);
        c4.assignInstructor(p1);

        p1.addCourse(c1);
        p1.addCourse(c4);
        p2.addCourse(c2);
        p3.addCourse(c3);

        s1.enrollInCourse(c1);
        s1.enrollInCourse(c2);
        s1.enrollInCourse(c3);
        s2.enrollInCourse(c2);
        s2.enrollInCourse(c3);
        s3.enrollInCourse(c4);

        System.out.println("\n----------------------------------------");
        System.out.println(" Welcome To My Online Course Platform ");
        System.out.println("----------------------------------------");


        Professor[] professors = {p1, p2,p3};
        Course[] courses = {c1, c2, c3, c4};
        Student[] students = {s1, s2, s3};

        int profNum = 1;
        System.out.println("        PROFESSORS INFORMATION         ");

        for (Professor prof : professors) {

            System.out.println("----------------------------------------\n# PROFESSOR "+ profNum );
            profNum++;
            prof.displayInfo();
            System.out.println("-----------------");
            System.out.println("This Professor Teaches Students: ");

            boolean teachStudents = false;

            for (Student student : students) {
                for(Course course : student.getEnrolledCourses()) {
                    if (course.getInstructor()==prof) {
                        System.out.println(" - " + student.getName());
                        teachStudents = true;
                        break;
                    }
                }
            }
            if (!teachStudents) {
                System.out.println("No Students taught under this Professor");
            }

        }

        int studentNum = 1;
    System.out.println("-----------------------------------\n       STUDENTS INFORMATION");
        for (Student student : students) {
            System.out.println("-----------------------------------\n #Student "+studentNum);
            student.displayInfo();
            System.out.println("-----------------");
            System.out.println("This Student Is Taught By :");
            studentNum++;

            boolean teachByInstructors = false;
                for(Course course : student.getEnrolledCourses()) {
                    for (Professor prof:professors) {
                        if (course.getInstructor() == prof) {
                            System.out.println(" - prof: " + course.getInstructor().getName());
                            teachByInstructors = true;
                            break;
                        }
                    }
                }

            if(!teachByInstructors) {
                System.out.println("No Instructors Taught This Student");
            }

        }

        System.out.println("---------------------------------");
        System.out.println("THANK YOU FOR USING OUR PLATFORM");
        System.out.println("---------------------------------");

    }
}