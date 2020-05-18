public class AsciiCharSequence implements java.lang.CharSequence {
    private byte[] bytes;
    public AsciiCharSequence(byte[] bytebyte) {
        this.bytes = bytebyte;
    }

    @Override
    public int length() {
        return bytes.length;
    }

    @Override
    public char charAt(int index) {
        return (char) bytes[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return new AsciiCharSequence(java.util.Arrays.copyOfRange(bytes, start, end));
    }

    @Override
    public String toString() {
        return new String(this.bytes);
    }


}