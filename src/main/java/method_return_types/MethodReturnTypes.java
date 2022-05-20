package method_return_types;

public class MethodReturnTypes {

    public static void main(String[] args) {
        System.out.println(returnsString());
        System.out.println(returnsInt());
        System.out.println(returnsBoolean());
    }

    public static String returnsString() {
        return "String of text";
    }

    public static int returnsInt() {
        return 5;
    }

    public static boolean returnsBoolean() {
        return false;
    }


}
