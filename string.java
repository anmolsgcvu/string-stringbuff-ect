public class string {
    public static void main(String[] args) {
        String mystr = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char result = mystr.charAt(0);
        System.out.println(result);
        int resul = mystr.codePointAt(0);
        System.out.println(resul);
        String myStr1 = "HELLO";
        String myStr2 = "hello";
        System.out.println(myStr1.compareToIgnoreCase(myStr2));
        String firstName = "John ";
        String lastName = "Doe";
        System.out.println(firstName.concat(lastName));
        String myStr = "Hello";
        System.out.println(myStr.contains("Hel")); // true
        System.out.println(myStr.contains("e")); // true
        System.out.println(myStr.contains("Hi")); // false
        String mytr = "Hello planet earth, you are a great planet.";
        System.out.println(mytr.indexOf("planet"));
        System.out.println(mytr.lastIndexOf("planet"));
        String mStr = "Hello";
        System.out.println(mStr.replace('l', 'p'));
        String txt = "Hello World";
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());
    }
}
