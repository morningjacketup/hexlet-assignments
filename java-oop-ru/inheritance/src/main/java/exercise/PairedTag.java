package exercise;

import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class PairedTag extends Tag {
    private String tag;
    private Map<String, String> attributes;
    private String text;
    private List<Tag> children;

    public PairedTag(String tag, Map<String, String> attributes, String text, List<Tag> children) {
        this.tag = tag;
        this.attributes = attributes;
        this.text = text;
        this.children = children;
    }

    @Override
    public String toString() {
        String result = "";
        String childrensResult = "";
        for (var item : attributes.entrySet()) {
            result += " " + item.getKey() + "=\"" + item.getValue() + "\"";
        }
        for (var item : children) {
            childrensResult += item.toString();
        }
        return "<" + tag + result + ">" + text + childrensResult + "</" + tag + ">";
    }
}
// END
