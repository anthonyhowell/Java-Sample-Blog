package template;

import javax.persistence.*;

/**
 * Created by anthonyhowell on 9/5/15.
 */
@Entity
public class Template {

    private Long id;

    private TemplateGroup group;
    
    private String name;
    private String template;

}
