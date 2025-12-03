package OnlineCoursePlatform.Users;

import OnlineCoursePlatform.Courses.Course;

import java.util.*;

public class Student extends User{
private int studentID;
private List<Course> enrolledCourses = new ArrayList<>();

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void setEnrolledCourses(List<Course> enrolledCourses) {
        this.enrolledCourses = enrolledCourses;
    }

    public Student(String name, String email, int studentID){
    super(name,email);
    this.studentID = studentID;
}

    @Override
public String getRole() {
    return "Student";
}
    @Override
public void displayInfo(){
    super.displayInfo();
    System.out.println("Student ID: "+ studentID);
    System.out.println("Enrolled Courses: " + getEnrolledCoursesCount());
}

public void enrollInCourse(Course c){
    enrolledCourses.add(c);
}

public int getEnrolledCoursesCount(){
    return enrolledCourses.size();
}
}

