package post.metadata;

import javax.persistence.*;

/**
 * Created by anthonyhowell on 9/5/15.
 */
@DiscriminatorValue("boolean")
public class BooleanMetaData extends MetaData {

    @Override
    public Boolean getValue() {
        return (Boolean) super.getValue();
    }
}
