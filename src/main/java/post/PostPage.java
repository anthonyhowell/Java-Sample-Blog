package post;

import javax.persistence.*;

/**
 * A post is comprised with at least one page of copy. If a multi-page
 * write up is desired, then the copy can be split up amungst several
 * pages. As long as the page count is higher than the current page,
 * there should be a link at the bottom of the current page
 * (e.g.: `next page`)
 *
 * Created by anthonyhowell on 8/31/15.
 */
@Entity
public class PostPage {

    private Long id;
    private String body;

    private PostPageStatistics statistics;

}
