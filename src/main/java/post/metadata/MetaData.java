package post.metadata;

import javax.persistence.*;

/**
 * Created by anthonyhowell on 9/5/15.
 */
@Entity
@MappedSuperclass
@DiscriminatorColumn(
        name="type",
        discriminatorType=DiscriminatorType.STRING
)
public abstract class MetaData<T> {

    protected MetaDataGroup group;
    protected String key;
    protected String label;
    protected T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

}
