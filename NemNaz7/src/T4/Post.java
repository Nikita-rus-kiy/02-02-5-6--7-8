package T4;

import java.util.ArrayList;
import java.util.Arrays;

public class Post {
    private String title;
    private String content;
    private String[] tags;
    private ArrayList<PostComment> comments;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public void setComments(ArrayList<PostComment> comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        int contentLength = content == null ? 0 : content.length();

        return "Post{" +
                "title='" + title + '\'' +
                ", content.length='" + contentLength + '\'' +
                ", tags=" + Arrays.toString(tags) +
                ", comments=" + comments +
                '}';
    }
}
