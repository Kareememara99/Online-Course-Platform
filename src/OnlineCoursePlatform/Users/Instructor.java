package OnlineCoursePlatform.Users;

import OnlineCoursePlatform.Courses.Course;

import java.util.*;

public class Instructor extends User{
    private int instructorId;
    private List<Course> coursesTaught = new ArrayList<>();

    public int getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(int instructorId) {
        this.instructorId = instructorId;
    }

    public List<Course> getCoursesTaught() {
        return coursesTaught;
    }

    public void setCoursesTaught(List<Course> coursesTaught) {
        this.coursesTaught = coursesTaught;
    }

    public Instructor(String name, String email, int id) {
        super(name, email);
        this.instructorId = id;
    }

    @Override
    public String getRole(){
        return "Instructor";
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Instructor ID: " + instructorId);
        System.out.println("No. of Courses taught: " + getCoursesCount());
    }

    public int getCoursesCount(){
        return coursesTaught.size();
    }
    public void addCourse(Course c){
        coursesTaught.add(c);

    }

}
