package exercise;

// BEGIN
public class ReversedSequence implements CharSequence {

    String text;

    public ReversedSequence(String text) {
        StringBuilder sb = new StringBuilder(text);
        this.text = String.valueOf(sb.reverse());
    }

    @Override
    public int length() {
        return text.length();
    }

    @Override
    public char charAt(int i) {
        return text.charAt(i);
    }

    @Override
    public CharSequence subSequence(int i, int i1) {
        return text.subSequence(i, i1);
    }

    @Override
    public String toString() {
        return text;
    }
}
// END
