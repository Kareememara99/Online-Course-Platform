package OnlineCoursePlatform.Courses;

public class offlineCourses extends Course {
   private String roomNumber;
   private String building;
   private String  schedule; // (day/time) ex: " Sunday 3 PM "

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public offlineCourses(String code, String title, int creditHours, String roomNumber, String building, String schedule) {
       super(code, title, creditHours);
       this.roomNumber = roomNumber;
       this.building = building;
       this.schedule = schedule;
   }
    @Override
   public String getType(){
       return "Offline Course";
   }
    @Override
   public void displayInfo(){
       super.displayInfo();
       System.out.println("Room Number: " + roomNumber);
       System.out.println("Building: " + building);
       System.out.println("Schedule: " + schedule);
   }
   public void updateLocation(String roomNumber,String building){
       this.roomNumber = roomNumber;
       this.building = building;
   }
   public void updateSchedule(String newSchedule){
       this.schedule = newSchedule;
   }
}