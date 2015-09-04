package shortcode;

import post.*;

import java.util.*;

/**
 * Created by anthonyhowell on 9/2/15.
 */
public class ShortCodeBodyParser implements PostBodyParser {


    private final static String TAG_OPEN = "[";
    private final static String TAG_CLOSE = "]";


    private Set<ShortCode> shortCodes;

    public void shortCodeBodyParser() {

    }

    /**
     * TODO Stub > Implementation
     * @param content
     * @return
     */
    @Override
    public String parse(String content) {

        // If there isn't at least one short code opening
        // tag, then there is no reason to continue.
        if (content.indexOf(TAG_OPEN) == -1) {
            return content;
        }

        // If there are no short codes registered,
        // there is no reason to continue.
        if (shortCodes.size() == 0) {
            return content;
        }

        // Why am i doing this now...? o.O

        return null;
    }

    /**
     * Determines if the passed content contains the specified ShortCode
     *
     * TODO Stub > Implementation
     * @param content
     * @return
     */
    private boolean hasShortCode(String content, ShortCode shortCode) {
        return false;
    }

    /**
     * Retrieve the ShortCode regular expression for searching
     *
     * The regular expression contains 6 different sub matches to help with parsing:
     *
     *  [1] - An extra `[` to allow for escaping ShortCodes with double `[[]]`
     *  [2] - The ShortCode name
     *  [3] - The ShortCode argument list
     *  [4] - The self closing `/`
     *  [5] - The content of a ShortCode when it wraps some element
     *  [6] - An extra `]` for escaping ShortCodes with double `[[]]`
     *
     * TODO Stub > Implementation
     * @return
     */
    private String getShortCodeRegex() {
        return null;
    }

    /**
     * TODO Stub > Implementation
     * @param content
     * @return
     */
    private String unescapeInvalidShortCodes(String content) {
        return content;
    }

    /**
     * Retrieve all of the attributes from the ShortCode text.
     *
     * TODO Stub > Implementation
     * @param text
     * @return
     */
    private HashMap<String, String> parseShortCodeAttributes(String text) {
        return null;
    }

    /**
     * Remove all ShortCode tags from the given content.
     *
     * TODO Stub > Implementation
     * @param content
     * @return
     */
    private String stripShortCodes(String content) {
        return content;
    }

}
