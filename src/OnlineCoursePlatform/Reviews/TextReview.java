package OnlineCoursePlatform.Reviews;

import OnlineCoursePlatform.Users.User;

public class TextReview extends Review {
    private String comments;

    public void setComments(String comments) {
        this.comments = comments;
    }

    public TextReview(reviewType type, User user, String comments) {
        super(type, user);
        this.comments = comments;
    }
    public String getComments() {
        return comments;
    }
}
