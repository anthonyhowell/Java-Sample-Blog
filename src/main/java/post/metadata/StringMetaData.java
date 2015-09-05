package post.metadata;

import javax.persistence.*;

/**
 * Created by anthonyhowell on 9/5/15.
 */
@DiscriminatorValue("string")
public class StringMetaData extends MetaData {

    @Override
    public String getValue() {
        return (String) super.getValue();
    }

}
