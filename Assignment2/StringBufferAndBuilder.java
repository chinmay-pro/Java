package Assignment2;

public class StringBufferAndBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Chinmay");
        sb.append(" kulthe");
        sb.insert(14," 13 Years Old");
        System.out.println(sb);
        StringBuffer in = new StringBuffer("This a Program");
        System.out.println(in.substring(0,3));
        System.out.println(in.lastIndexOf("a"));
        System.out.println(in.indexOf("a"));
        System.out.println(in.replace(0,6,"no"));
    }
}
