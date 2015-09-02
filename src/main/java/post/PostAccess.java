package post;

import user.*;

import java.util.*;

/**
 * Created by anthonyhowell on 8/31/15.
 *
 * Restrict access to a post by any one or
 * combination of these fields.
 */
public class PostAccess {

    // Restrict by password
    private String password;

    // Restrict by access/view count
    private Long accessAllowance;
    private Long accessCount;

    // Restrict by role
    private Set<Role> requiredRoles;

}
