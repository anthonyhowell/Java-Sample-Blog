package post;

/**
 * Created by anthonyhowell on 8/31/15.
 */
public enum PostStatus {

    PUBLISHED("post.status.published"),

    PENDING("post.status.pending"),

    DRAFT("post.status.draft"),

    AUTO_DRAFT("post.status.auto_draft"),

    FUTURE("post.status.future"),

    PRIVATE("post.status.private"),

    TRASH("post.status.trash");

    private String translationKey;

    PostStatus(String translationKey) {
        this.translationKey = translationKey;
    }

    public String getTranslationKey() {
        return translationKey;
    }

}
