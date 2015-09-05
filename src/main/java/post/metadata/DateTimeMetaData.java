package post.metadata;

import org.joda.time.*;

import javax.persistence.*;

/**
 * Created by anthonyhowell on 9/5/15.
 */
@DiscriminatorValue("datetime")
public class DateTimeMetaData extends MetaData {

    @Override
    public DateTime getValue() {
        return (DateTime) super.getValue();
    }

}
