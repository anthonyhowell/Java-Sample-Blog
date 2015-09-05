package post.metadata;

import java.util.*;

/**
 * Created by anthonyhowell on 9/5/15.
 */
public class EnumMetaData extends MetaData {

    private Set<MetaData> options;

    public EnumMetaData() {
    }

    public EnumMetaData(Set<MetaData> options) {
        this.options = options;
    }

    public void setSelectedOption(MetaData value) {
        setValue(value);
    }

    public boolean addOption(MetaData option) {
        return options.add(option);
    }

    public void addOptions(Set<MetaData> options) {
        for (MetaData option : options) {
            addOption(option);
        }
    }

    public boolean removeOption(MetaData option) {
        return options.remove(option);
    }

}
