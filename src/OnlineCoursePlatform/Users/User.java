package OnlineCoursePlatform.Users;

import java.util.Calendar;

public class User {
private String name;
private String email;
private Calendar dateCreated;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Calendar getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Calendar dateCreated) {
        this.dateCreated = dateCreated;
    }

    public User(String name, String email) {
this.name = name;
this.email = email;
dateCreated = Calendar.getInstance();
}

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Date Created: " + dateCreated.get(Calendar.YEAR)+
                                          " / "+(dateCreated.get(Calendar.MONTH)+1) +
                                          " / "+(dateCreated.get(Calendar.DAY_OF_MONTH)));
    }


    public String getRole(){
    return "User";
    }

    public void updatedEmail(String newEmail){
        this.email = newEmail;
    }
    public int getAccountAge() {
        Calendar today = Calendar.getInstance();
        long diffMillis = today.getTimeInMillis() - dateCreated.getTimeInMillis();
        long diffDays = diffMillis / (1000 * 60 * 60 * 24);

        return (int) diffDays;
    }

}
