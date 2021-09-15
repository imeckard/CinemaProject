import java.util.*;

class AsciiCharSequence implements CharSequence {

    byte[] array;

    public AsciiCharSequence(byte[] array) {
        this.array = array;
    }


    @Override
    public int length() {
        int len = 0;
        for (byte b : this.array) {
            len++;
        }
        return len;
    }

    @Override
    public char charAt(int i) {
        return (char) (array[i] & 0xFF);
    }

    @Override
    public CharSequence subSequence(int i, int i1) {
        byte[] subArray = new byte[i1 - i];
        for (int k = 0; k < i1 - i; k++) {
            subArray[k] = this.array[k + i];
        }
        return new AsciiCharSequence(subArray);
    }

    public String toString() {
        StringBuilder str = new StringBuilder("");
        for (byte b : this.array) {
            str.append((char) (b & 0xFF));
        }
        return str.toString();
    }
}