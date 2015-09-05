package post;

import javax.persistence.*;

/**
 * A post is comprised with at least one page of copy. If a multi-page
 * write up is desired, then the copy can be split up amongst several
 * pages. Any variation of pagination control will suffice for page
 * navigation.
 *
 * Created by anthonyhowell on 8/31/15.
 */
@Entity
public class PostPage {

    private Long id;
    private String body;

    private PostPageStatistics statistics;

}
