package publication;

import post.*;

import java.util.*;

/**
 * Created by anthonyhowell on 9/1/15.
 */
public class LocalPublication extends Publication {

    private String miniTitle;
    private String miniTeaser;

    // HTML <meta name="keywords" content="{KEYWORDS}" />
    private Set<String> keywords;

    private PostTemplate template;

}
