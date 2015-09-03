package post;

import asset.*;
import category.*;
import tag.*;
import user.*;

import javax.persistence.*;
import java.util.*;

/**
 * Created by anthonyhowell on 8/31/15.
 */
@Entity
public class Post {

    private Long id;
    private Long version;

    private String body;

    private Set<Asset> relatedAssets;

    private Author author;

    private Set<Category> categories;
    private Set<Tag> tags;

    private PostStatus status;
    private PostStatistics statistics;


    // Some blog and news sites prefer to split content of a single post
    // across multiple pages. Based on this setting, there `could` be
    // auto-generated meta-content for `page-1`, `page-2`, etc. that
    // would serve as multiple bodies. I dunno about this yet...
    private int numberOfPages;

}