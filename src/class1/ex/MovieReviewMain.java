package class1.ex;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview review1 = new MovieReview();
        review1.title = "Inception";
        review1.review = "Life is infinite loop";

        MovieReview review2 = new MovieReview();
        review2.title = "About Time";
        review2.review = "Life Time Movie";

        MovieReview[] reviews = {review1, review2};
        for (MovieReview review : reviews) {
            System.out.println("영화 제목:" + review.title + ", 리뷰:" + review.review);
        }
    }
}
