/**
 * @Description 替换空格:
 *              将一个字符串中的空格替换成 "%20"
 *              例如:
 *              Input:"A B"
 *              Output:"A%20B"
 * @Date  2020/6/4
 * @Author unicorn
 **/
public class Ex001 {
    static String example="A B ";
    public static void main(String[] args) {
        StringBuffer exBuffer=new StringBuffer(example);
        int p1 = exBuffer.length()-1;
        for (int i=p1;i>-1;i--){
            if (exBuffer.charAt(i)==' '){
                //在exBuffer后面添加两个空格
                exBuffer.append("  ");
            }
        }
        int p2 = exBuffer.length()-1;
        while(p1<p2 && p1>0){
            char c = exBuffer.charAt(p1--);
            if(c == ' '){
                exBuffer.setCharAt(p2--,'0');
                exBuffer.setCharAt(p2--,'2');
                exBuffer.setCharAt(p2--,'%');
            }else {
                exBuffer.setCharAt(p2--, c);
            }
        }
        System.out.println(exBuffer.toString());
    }
}
