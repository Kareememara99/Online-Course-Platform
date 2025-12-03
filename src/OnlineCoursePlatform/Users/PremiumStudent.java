package OnlineCoursePlatform.Users;

import java.util.Calendar;

public class PremiumStudent extends Student {
    private String subscriptionTier;
    private Calendar subscriptionExpiryDate;

    public String getSubscriptionTier() {
        return subscriptionTier;
    }

    public void setSubscriptionTier(String subscriptionTier) {
        this.subscriptionTier = subscriptionTier;
    }

    public Calendar getSubscriptionExpiryDate() {
        return subscriptionExpiryDate;
    }

    public void setSubscriptionExpiryDate(Calendar subscriptionExpiryDate) {
        this.subscriptionExpiryDate = subscriptionExpiryDate;
    }

    public PremiumStudent(String name, String email, int studentId, String tier, Calendar expiry){
        super(name,email,studentId);
        this.subscriptionTier = tier;
        this.subscriptionExpiryDate = expiry;
    }

    @Override
    public String getRole(){
        return "PremiumStudent";
    }

    @Override
    public void displayInfo(){
        System.out.println("*PREMIUM*");
        super.displayInfo();
        System.out.println("Subscription Tier: " + subscriptionTier);
        System.out.println("Subscription Expiry Date: " + subscriptionExpiryDate.get(Calendar.YEAR) + " / "
                + (subscriptionExpiryDate.get(Calendar.MONTH) + 1) + " / "
                + subscriptionExpiryDate.get(Calendar.DAY_OF_MONTH));
    }

    public String upgradeTier(String newTier){
        return newTier;
    }

    public boolean isSubscriptionActive(){
        Calendar today = Calendar.getInstance();
        return  today.compareTo(subscriptionExpiryDate) <= 0;
    }


}

