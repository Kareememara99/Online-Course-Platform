package OnlineCoursePlatform.Courses;

import OnlineCoursePlatform.Users.Instructor;

import java.util.Calendar;

public class recordedCourses extends onlineCourses{
    private int numberOfLessons;
    private double videoHours;
    private Calendar releaseDate;

    public int getNumberOfLessons() {
        return numberOfLessons;
    }

    public void setNumberOfLessons(int numberOfLessons) {
        this.numberOfLessons = numberOfLessons;
    }

    public double getVideoHours() {
        return videoHours;
    }

    public void setVideoHours(double videoHours) {
        this.videoHours = videoHours;
    }

    public Calendar getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Calendar releaseDate) {
        this.releaseDate = releaseDate;
    }

    public recordedCourses(String code, String title, int creditHours, String accessLink, String platform, boolean isLive, int numberOfLessons, double videoHours, Calendar releaseDate){
        super(code,title,creditHours,accessLink,platform,isLive);
        this.numberOfLessons = numberOfLessons;
        this.videoHours = videoHours;
        this.releaseDate = releaseDate;
    }
    @Override
    public String getType(){
        return "Recorded Course";
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Video Hours: " + videoHours);
        System.out.println("Number of Lessons: " + numberOfLessons);
        System.out.println("Release Date: "+ releaseDate.get(Calendar.YEAR)+
                                 " / " +(releaseDate.get(Calendar.MONTH)+1)+
                             " / " +releaseDate.get(Calendar.DAY_OF_MONTH));

    }
    public double  getTotalContentLength(){
        return videoHours;
    }
    public int getLessonsCount(){
        return numberOfLessons;
    }


}
