
public class CharIntASCII {
    public static void main(String[] args) {
        // char in Java is 2 bytes
        // int in Java is 4 bytes
        // cast int to char, we need to explicitly cast using brackets
        int z = 112;
        System.out.println((char) z);
        char x = 58; // 把ascii码为58的对应字符(:)赋值给x <=> char x = ':';
        System.out.println(x);
        char y = '#'; // 把字符'#'赋值给y
        System.out.println(y);

        // char 与 char 相加
        // 得到的结果是两个字符对应的ascii码的值相加后对应ascii码的值
        System.out.println(x + y);
        StringBuilder sb = new StringBuilder();
        sb.append(x + y);
        // 得到的结果是两个字符对应的ascii码的值相加后对应ascii码的值
        System.out.println(sb);
        // 将结果 cast 成 char 才可以得到对应的字符
        System.out.println((char) (x + y));
        sb.setLength(0);
        sb.append((char) (x + y));
        // 得到的结果是两个字符对应的ascii码的值相加后对应ascii码的值
        System.out.println(sb);
        sb.setLength(0);
        sb.append(x).append(y);
        System.out.println(sb);

        // char 与 int 相加
        // 得到的结果是char对应ascii码的值与int值相加后对应ascii码的值
        System.out.println(x + 1);
        // 将结果 cast 成 char 才可以得到对应的字符
        System.out.println((char) (x + 1));
    }
}
