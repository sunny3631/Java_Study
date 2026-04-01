import java.util.*;
public class Ch7 {
}
//정수만 다루는 Vector<Integer> 컬렉션 활용
class VectorEx{
    public static void main(String[] args){
        Vector<Integer> v = new Vector<Integer>();
        v.add(5);
        v.add(4);
        v.add(-1);
        v.add(2,100);

        System.out.println("벡터 내의 요소 객체수 : "+ v.size());
        System.out.println(".벡터의 현재 용량 : " + v.capacity());

        for(int i=0; i<v.size(); i++){
            int n = v.get(i);
            System.out.println(n);
        }
        int sum=0;
        for(int i =0; i<v.size(); i++){
            int n = v.elementAt(1);
            sum+=n;
        }
        System.out.println("벡터에 있는 정수 합:" + sum);
    }
}

//Point 클래스만 다루는 Vector<Point> 컬렉션 활용
class Point7{
    private int x,y;
    public Point7(int x, int y){
        this.x = x;
        this.y=y;
    }
    public String toString(){
        return "(" + x + "," + y + ")";
    }
}
class PointVectorEx{
    public static void main(String[]  args){
        Vector<Point7> v = new Vector<Point7>();
        v.add(new Point7(2,3));
        v.add(new Point7(-5, 20));
        v.add(new Point7(30, -8));
        v.remove(1);
        for(int i =0; i<v.size(); i++){
            Point7 p = v.get(i);
            System.out.println(p);
        }
    }
}

//ArrayList에 저장
class ArrayListEx {
    public static void main(String[] args){
        ArrayList<String> a = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<4; i++){
            System.out.print("이름을 입력하세요");
            String s = scanner.next();
            a.add(s);
        }
        for (int i=0; i<a.size(); i++){
            String name = a.get(i);
            System.out.print(name+ " ");
        }

        int longestIndex = 0;
        for(int i=1; i<a.size(); i++){
            if(a.get(longestIndex).length() < a.get(i).length())
                longestIndex = i;
        }
        System.out.println("가장 긴 이름은 :" + a.get(longestIndex));
        scanner.close();
    }
}

//Iterator
class IteratorEx{
    public static void main(String[]  args){
        Vector<Integer> v = new Vector<Integer>();
        v.add(5);
        v.add(4);
        v.add(-1);
        v.add(2, 100);

        Iterator<Integer> it = v.iterator();
        while(it.hasNext()){
            int n = it.next();
            System.out.println(n);
        }
        int sum = 0;
        it = v.iterator();
        while(it.hasNext()){
            int n= it.next();
            sum+=n;
        }
        System.out.println("벡터에 있는 정수 합 :" + sum);
    }
}

//해시맵
class HashMapdicEx{
    public static void main(String[] args){
        HashMap<String, String> dic = new HashMap<String, String>();

        dic.put("baby", "아기");
        dic.put("love", "사랑");
        dic.put("apple", "사과");

        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("찾고 싶은 단어는?");
            String eng = scanner.next();
            if(eng.equals("exit")){
                System.out.println("종료합니다.");
                break;
            }
            String kor = dic.get(eng);
            if(kor == null)
                System.out.println(eng+"는 없는 단어입니다");
            else
                System.out.println(kor);
        }
        scanner.close();
    }
}

//Collections 클래스의 활용
class CollectionEx{
    static void printList(LinkedList<String> l){
        Iterator<String> iterator = l.iterator();
        while(iterator.hasNext()){
            String e = iterator.next();
            String separator;
            if(iterator.hasNext())
                separator = "->";
            else
                separator = "\n";
            System.out.print(e+separator);
        }
    }
    public static void main(String[] args){
        LinkedList<String> myList = new LinkedList<String> ();
        myList.add("트랜스포머");
        myList.add("스타워즈");
        myList.add("매트릭스");
        myList.add(0, "터미네이터");
        myList.add(2,"아바타");

        Collections.sort(myList);
        printList(myList);

        Collections.reverse(myList);
        printList(myList);

        int index = Collections.binarySearch(myList,"아바타") + 1;
        System.out.println("아바타는" + index + "번째 요소입니다");
    }
}