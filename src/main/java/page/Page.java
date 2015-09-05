package page;

import template.*;

import javax.persistence.*;

/**
 * Created by anthonyhowell on 9/5/15.
 */
@Entity
public class Page {

    private Long id;
    private String name;
    private String description;
    private String content;
    private Template template;

}
