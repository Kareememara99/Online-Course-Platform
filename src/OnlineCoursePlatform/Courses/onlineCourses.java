package OnlineCoursePlatform.Courses;

public class onlineCourses extends Course {
    private String accessLink;
    private String platform;
    private boolean isLive;

    public String getAccessLink() {
        return accessLink;
    }

    public void setAccessLink(String accessLink) {
        this.accessLink = accessLink;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public boolean isLive() {
        return isLive;
    }

    public void setLive(boolean live) {
        isLive = live;
    }

    public onlineCourses(String code, String title, int creditHours, String accessLink, String platform, boolean isLive) {
        super(code, title, creditHours);
        this.accessLink = accessLink;
        this.platform = platform;
        this.isLive = isLive;
    }

    @Override
    public String getType(){
        return "Online Course";
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Access Link: " + accessLink);
        System.out.println("Platform: " + platform);
        System.out.println("Live Status: " + isLive);
    }
    public String getPlatformName() {
        return platform;
    }
    public void setPlatformName(String platform) {
        this.platform = platform;
    }
    public String generateAccessLink(){
        return accessLink;
    }



}
