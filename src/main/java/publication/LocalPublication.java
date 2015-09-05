package publication;

import template.*;

import javax.persistence.*;
import java.util.*;

/**
 * Created by anthonyhowell on 9/1/15.
 */
@DiscriminatorValue("local")
public class LocalPublication extends Publication {

    private String miniTitle;
    private String miniTeaser;

    // HTML <meta name="keywords" content="{KEYWORDS}" />
    private Set<String> keywords;

    private Template template;

}
