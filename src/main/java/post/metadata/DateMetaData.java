package post.metadata;

import javax.persistence.*;
import java.util.*;

/**
 * Created by anthonyhowell on 9/5/15.
 */
@DiscriminatorValue("date")
public class DateMetaData extends MetaData {

    @Override
    public Date getValue() {
        return (Date) super.getValue();
    }

}
