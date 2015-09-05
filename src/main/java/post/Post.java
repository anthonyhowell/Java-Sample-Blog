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

    private Set<PostPage> pages;

    private Set<Asset> relatedAssets;

    private Author author;

    private Set<Category> categories;
    private Set<Tag> tags;

    private PostStatus status;
    private PostStatistics statistics;

}