package suanfa._剑指Offer.替换空格;

/**
 * @Author Li
 * @Date 20.7.8 23:14
 * @Version 1.0
 */


public class solution {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("We Are Ha  p py");
        solution s = new solution();
        System.out.println(s.replaceSpace(sb));
    }
    public String replaceSpace(StringBuffer str) {
        if(str==null||str.length()==0){
            return str.toString();
        }

        int p1 = str.length()-1;
        for (int i = 0; i <= p1; i++) {
            if (str.charAt(i)==' '){
                str.append("  ");
            }
        }
        int p2 = str.length()-1;
        while (p1 >= 0 && p1 < p2) {
            char c = str.charAt(p1--);
            if (c==' '){
                str.setCharAt(p2--, '0');
                str.setCharAt(p2--, '2');
                str.setCharAt(p2--, '%');
            }else{
                str.setCharAt(p2--, c);
            }
        }

        return str.toString();



    }
}
