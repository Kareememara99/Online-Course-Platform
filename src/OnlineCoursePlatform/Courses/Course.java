package OnlineCoursePlatform.Courses;

import OnlineCoursePlatform.Users.Instructor;

public class Course {
    private String courseCode;
    private String courseTitle;
    private String courseDescription;
    private int creditHours;
    private Instructor instructor;

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public Course(String code, String title, int creditHours ) {
        this.courseCode = code;
        this.courseTitle = title;
        this.creditHours = creditHours;
    }
    public void displayInfo(){
        System.out.println("COURSE INFO:");
        System.out.println("Course Code: " + courseCode);
        System.out.println("Course Title: " + courseTitle);
        System.out.println("Course Description: " + courseDescription);
        System.out.println("Credit Hours: " + creditHours);
        System.out.println("Instructor: " + instructor);
    }
    public String getType(){
        return "General Course";
    }
    public void assignInstructor(Instructor instructor){
        this.instructor = instructor;
    }
    public String getSummary(){
        return "Course Title: " + courseTitle + "\n Instructor: " + instructor + "\n Credit Hours: " + creditHours;
    }

}
