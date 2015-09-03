package publication;

import asset.*;
import org.joda.time.*;
import post.*;

import javax.persistence.*;

/**
 * Created by anthonyhowell on 9/1/15.
 */
@Entity
@MappedSuperclass
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING)
public class Publication {

    private Long id;

    private String title;
    private String teaser;

    private String url;
    private DateTime date;

    private Post post;
    private VisualAsset featuredAsset;
    



}
