import java.util.Scanner;

public class Ch4 {
}

// 객체, 클래스 이해
class Circle{
    int radius;
    String name;

    public Circle(){
    }
    public double getArea(){
        return 3.14 * radius * radius;
    }
    public static void main(String[] args){
        Circle pizza;
        pizza = new Circle();
        pizza. radius = 10;
        pizza.name = "자바피자";
        double area = pizza.getArea();
        System.out.println(pizza.name + "면적은" + area);

        Circle donut = new Circle();
        donut.radius= 2;
        donut.name = "자바도넛";
        area = donut.getArea();
        System.out.println(donut.name + "면적은" + area);
    }
}

// 객체, 클래스 이해
class Rectangle{
    int width;
    int height;
    public int getArea(){
        return width * height;
    }
}
class RectApp {
    public static void main(String[] args){
        Rectangle rect = new Rectangle();
        Scanner scanner = new Scanner(System.in);
        System.out.print("너비와 높이를 입력하세요");
        rect.width = scanner.nextInt();
        rect.height = scanner.nextInt();
        System.out.println("사각형의 면적은" + rect.getArea());
        scanner.close();
    }
}

//생성자
class Circles{
    int radius;
    String name;

    public Circles(){
        radius = 1;
        name = " ";
    }
    public Circles(int r, String n){
        radius = r;
        name = n;
    }
    public double getArea(){
        return 3.14 * radius * radius;
    }
    public static void main(String[] args){
        Circles pizza = new Circles(10, "자바피자");
        double area = pizza.getArea();
        System.out.println(pizza.name + "면적은" + area);

        Circles donut = new Circles();
        donut.name = "자바도넛";
        area = donut.getArea();
        System.out.println(donut.name + "면적은" + area);
    }
}

//생성자 선언 및 활용 연습
class Book {
    String title;
    String author;

    public Book(String t){
        title = t;
        author = "작자 미상";
    }
    public Book(String t, String a){
        title = t;
        author = a;
    }
    public static void main(String[] args){
        Book littlePrince = new Book("어린왕자", "생텍쥐페리");
        Book loveStory = new Book ("춘향전");
        System.out.println(littlePrince.title + " " + littlePrince.author);
        System.out.println(loveStory.title + " " +loveStory.author);
    }
}

class Circlee{
    int radius;
    public Circlee(int radius){
        this.radius = radius;
    }
    public double getArea(){
        return 3.14 * radius * radius;
    }
}
class CircleArray{
    public static void main(String[] args){
        Circlee [] c;
        c= new Circlee[5];

        for (int i=0; i<c.length; i++){
            c[i] = new Circlee(i);
        }
        for(int i=0; i<c.length; i++){
            System.out.print((int)(c[i].getArea())+ " ");
        }
    }
}