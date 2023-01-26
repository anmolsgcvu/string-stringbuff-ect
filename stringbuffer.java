public class stringbuffer {
    long startTime = 0l;
    long endTime = 0l;
    long timeDiff = 0l;

    // Concatenate operation using String
    public void concatTest1(String website) {
        startTime = System.nanoTime();
        website = website + ".com";
        endTime = System.nanoTime();
        timeDiff = endTime - startTime;
        System.out.println("Concat time by String: " + timeDiff);
    }

    // Concatenate operation using StringBuilder
    public void concatTest2(StringBuilder website) {
        startTime = System.nanoTime();
        website.append(".com");
        endTime = System.nanoTime();
        timeDiff = endTime - startTime;
        System.out.println("Concat time by StringBuilder: " + timeDiff);
    }

    // Concatenate operation using StringBuffer
    public void concatTest3(StringBuffer website) {
        startTime = System.nanoTime();
        website.append(".com");
        endTime = System.nanoTime();
        timeDiff = endTime - startTime;
        System.out.println("Concat time by StringBuffer: " + timeDiff);
    }

    public static void main(String[] args) {
        stringbuffer object = new stringbuffer();
        String website1 = "w3spoint";
        object.concatTest1(website1);

        StringBuilder website2 = new StringBuilder("w3spoint");
        object.concatTest2(website2);

        StringBuffer website3 = new StringBuffer("w3spoint");
        object.concatTest3(website3);
        String stringObj = "w3spoint";

        System.out.println("String Object: " + stringObj);

        // String to StringBuffer
        StringBuffer stringBuffer = new StringBuffer(stringObj);
        System.out.println("StringBuffer Object: " + stringBuffer);
        stringBuffer.reverse();
        System.out.println("StringBuffer Object after reverse operation: " + stringBuffer);

        // String to StringBuilder
        StringBuilder stringBuilder = new StringBuilder(stringObj);
        System.out.println("StringBuilder Object: " + stringBuilder);
        stringBuilder.append(".com");
        System.out.println("StringBuilder Object after append operation: " + stringBuilder);

        main.stringBufferToString(stringBuffer);
        main.stringBuilderToString(stringBuilder);
    }

    void stringBufferToString(StringBuffer stringBuffer) {
        String stringObj = stringBuffer.toString();
        System.out.println("Converted String from StringBuffer: " + stringObj);
    }

    void stringBuilderToString(StringBuilder stringBuilder) {
        String stringObj = stringBuilder.toString();
        System.out.println("Converted String from StringBuilder: " + stringObj);
    }

}