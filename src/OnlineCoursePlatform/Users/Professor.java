package OnlineCoursePlatform.Users;

public class Professor extends Instructor {
    private String department;
    private String researchArea;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getResearchArea() {
        return researchArea;
    }

    public void setResearchArea(String researchArea) {
        this.researchArea = researchArea;
    }

    public Professor(String name, String email, int id, String department) {
        super(name,email,id);
        this.department = department;
    }

    @Override
    public String getRole(){
        return "Professor";
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Department: " + department);
        System.out.println("Research Area: " + researchArea);
    }

    public void assignResearchArea(String area){
        this.researchArea = area;
    }

}
