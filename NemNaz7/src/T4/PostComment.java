package T4;

import java.util.Arrays;

public class PostComment {
    private String text;
    private String[] whoLiked;

    public void setText(String text) {
        this.text = text;
    }

    public void setWhoLiked(String[] whoLiked) {
        this.whoLiked = whoLiked;
    }

    @Override
    public String toString() {
        return "PostComment{" +
                "text='" + text + '\'' +
                ", whoLiked=" + Arrays.toString(whoLiked) +
                '}';
    }
}