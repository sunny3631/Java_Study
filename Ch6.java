import java.util.StringTokenizer;

public class Ch6 {
}
//Object 클래스
class Point3{
    private int x, y;
    public Point3(int x, int y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "Point(" + x + "," + y + ")";
    }
}
class ObjectPropertyEx{
    public static void print(Object obj){
        System.out.println(obj.getClass().getName());
        System.out.println(obj.hashCode());
        System.out.println(obj.toString());
        System.out.println(obj);
    }
    public static void main(String [] args){
        Point3 p = new Point3(2,3);
        print(p);
    }
}

//toString()
class Point4{
    private int x, y;
    public Point4(int x, int y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "Point(" + x + "," + y + ")";
    }
}
class ToStringEx{
    public static void main(String []  args){
        Point4 p = new Point4(2,3);
        System.out.println(p.toString());
        System.out.println(p);
        System.out.println(p+"입니다");
    }
}

//equals
class Point5{
    private int x, y;
    public Point5(int x, int y){
        this.x = x;
        this.y = y;
    }
    public boolean equals(Object obj){
        Point5 p = (Point5)obj;
        if(x==p.x && y ==p.y){
            return true;
        }
        else return false;
    }
}
class EqualsEx {
    public static void main(String[] args){
        Point5 a = new Point5(2,3);
        Point5 b = new Point5(2,3);
        Point5 c = new Point5(3,4);
        if(a==b)
            System.out.println("a is equal to b");
        if(a.equals(c))
            System.out.println("a is equal to c");

    }
}

//Wrapper
class WrapperEx{
    public static void main(String[] args){
        System.out.println(Character.toLowerCase('A'));
        char c1='4', c2 = 'F';
        if(Character.isDigit(c1))
            System.out.println(c1+"는 숫자");
        if(Character.isAlphabetic(c2))
            System.out.println(c2+"는 영문자");
        System.out.println(Integer.parseInt("-123"));
        System.out.println(Integer.toHexString(28));
        System.out.println(Integer.toBinaryString(28));
        System.out.println(Integer.bitCount(28));

        Double d = Double.valueOf(3.14);
        System.out.println(d.toString());
        System.out.println(Double.parseDouble("3.14"));

        boolean b = (4 > 3);
        System.out.println(Boolean.toString(b));
        System.out.println(Boolean.parseBoolean("false"));

    }
}

//박싱과 언박싱
class AutoBoxingUnBoxingEx{
    public static void main(String[] args){
        int n=10;
        Integer intObject = n;
        System.out.println("intObject =" + intObject);

        int m = intObject + 10;
        System.out.println("m= " + m);
    }
}

//String 클래스
class StringEx {
    public static void main(String[] args) {
        String a = new String(" C# ");
        String b = new String(",C++ ");

        System.out.println(a + "의 길이는 " + a.length());
        System.out.println(a.contains("#"));
        a = a.concat(b);
        System.out.println(a);

        a = a.trim();
        System.out.println(a);

        a = a.replace("C#", "Java");
        System.out.println(a);

        String s[] = a.split(",");
        for (int i = 0; i < s.length; i++)
            System.out.println("분리된 문자열" + i + ": " + s[i]);

        a = a.substring(5);
        System.out.println(a);

        char c = a.charAt(2);
        System.out.println(c);
    }
}

//StringBuffer
class StringBufferEx {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("This");

        sb.append(" is pencil");
        System.out.println(sb);

        sb.insert(7, " my");
        System.out.println(sb);

        sb.replace(8, 10, "your");
        System.out.println(sb);

        sb.delete(8, 13);
        System.out.println(sb);

        sb.setLength(4);
        System.out.println(sb);
    }
}

class StringTokenizerEx{
    public static void main(String[] args){
        StringTokenizer st = new StringTokenizer("홍길동/장화/홍련/콩쥐/팥쥐", "/");
        while(st.hasMoreTokens())
            System.out.println(st.nextToken());
    }
}