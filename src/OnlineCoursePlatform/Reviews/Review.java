package OnlineCoursePlatform.Reviews;

import OnlineCoursePlatform.Users.User;

public class Review {
    public  enum reviewType{Good,Medium,Bad}
    private reviewType type;
    private User reviewer;

    public void setType(reviewType type) {
        this.type = type;
    }

    public void setReviewer(User reviewer) {
        this.reviewer = reviewer;
    }

    public Review(reviewType type, User user){
        this.type = type;
        this.reviewer = user;
    }
    public reviewType getType() {
        return type;
    }
    public User getReviewer() {
        return reviewer;
    }

}
