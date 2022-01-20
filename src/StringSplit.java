
public class StringSplit {
    public static void main(String[] args) {

        String str = "Welcome-to-Runoob";
        System.out.println("- 分隔符返回值 :");
        for (String retval : str.split("-")) {
            System.out.println(retval);
        }

        System.out.println();
        System.out.println("- 分隔符设置分割份数返回值 :");
        for (String retval : str.split("-", 2)) {
            System.out.println(retval);
        }

        System.out.println();
        /**  空格可以直接用 " " or "\\s" */
        String str2 = "Welcome to Runoob";
        System.out.println(" 空格分隔符返回值 :");
        for (String retval : str2.split(" ")) {
            System.out.println(retval);
        }
        for (String retval : str2.split("\\s")) {
            System.out.println(retval);
        }

        System.out.println();
        /** "." 不能直接用，需要用 "\\." ! */
        String str3 = "www.runoob.com";
        System.out.println("转义字符返回值 :");
        for (String retval : str3.split("\\.", 3)) {
            System.out.println(retval);
        }

        System.out.println();
        String str4 = new String("acount=? and uu =? or n=?");
        System.out.println("多个分隔符返回值 :");
        for (String retval : str4.split("and|or")) {
            System.out.println(retval);
        }

        System.out.println();
        /**  "," 可以直接用 "," or "\\," */
        String str5 = "Welcome,to,Runoob";
        System.out.println(", 分隔符返回值 :");
        for (String retval : str5.split(",")) {
            System.out.println(retval);
        }
    }
}
