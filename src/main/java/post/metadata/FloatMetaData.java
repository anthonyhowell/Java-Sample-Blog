package post.metadata;

import javax.persistence.*;

/**
 * Created by anthonyhowell on 9/5/15.
 */
@DiscriminatorValue("float")
public class FloatMetaData extends MetaData {

    @Override
    public Float getValue() {
        return (Float) super.getValue();
    }

}
