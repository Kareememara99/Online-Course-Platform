package OnlineCoursePlatform.Reviews;

import OnlineCoursePlatform.Users.User;

public class Rating extends Review {
    private int rating;

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Rating(reviewType type, User user, int rating) {
        super(type, user);
        this.rating = rating;
    }
    public int getRating() {
        return rating;
    }
}
