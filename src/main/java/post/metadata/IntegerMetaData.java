package post.metadata;

import javax.persistence.*;

/**
 * Created by anthonyhowell on 9/5/15.
 */
@DiscriminatorValue("integer")
public class IntegerMetaData extends MetaData {

    @Override
    public Integer getValue() {
        return (Integer) super.getValue();
    }

}
