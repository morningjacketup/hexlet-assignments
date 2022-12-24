package exercise;

import java.util.Map;

// BEGIN
public class SingleTag extends Tag {
    private String tag;
    private Map<String, String> attributes;

    public SingleTag(String tag, Map<String, String> attributes) {
        this.tag = tag;
        this.attributes = attributes;
    }

    @Override
    public String toString() {
        String result = "";
        for (var item : attributes.entrySet()) {
            result += " " + item.getKey() + "=" + "\"" + item.getValue() + "\"";
        }
        return "<" + tag + result + ">";
    }
}
// END
