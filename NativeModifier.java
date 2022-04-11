package ss6adope;

public class NativeModifier {
    native void nativeMethod();
    static {
        System.loadLibrary("NativeMethodDefinition");
    }

    public static void main(String[] args) {
        NativeModifier objNative = new NativeModifier();
        objNative.nativeMethod();
    }
}
