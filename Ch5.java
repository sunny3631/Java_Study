public class Ch5 {
}

//상속 예시
class Point {
    private int x, y;
    public void set(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void showPoint(){
        System.out.println("(" + x + "," + y + ")" );
    }
}
class ColorPoint extends Point {
    private String color;
    public void setColor(String color){
        this.color = color;
    }
    public void showColorPoint() {
        System.out.print(color);
        showPoint();
    }
}
class ColorPointEx {
    public static void main(String[] args){
        Point p = new Point();
        p.set(1,2);
        p.showPoint();

        ColorPoint cp = new ColorPoint();
        cp.set(3,4);
        cp.setColor("red");
        cp.showColorPoint();
    }
}

//super()활용
class Point2{
    private int x, y;
    public Point2() {
        this.x = this.y = 0;
    }
    public Point2(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void showPoint() {
        System.out.println("("+ x + "," + y + ")");
    }
}
class ColorPoint2 extends Point2 {
    private String color;
    public ColorPoint2(int x, int y, String color){
        super(x, y);
        this.color = color;
    }
    public void showColorPoint() {
        System.out.print(color);
        showPoint();
    }
}
class SuperEx{
    public static void main(String[] args){
        ColorPoint2 cp = new ColorPoint2(5, 6, "blue");
        cp.showColorPoint();
    }
}

//instanceof
class Person{}
class Student extends Person{}
class Researcher extends Person { }
class Professor extends Researcher{ }
class InstanceOfEx{
    static void print(Person p){
        if(p instanceof Person){
            System.out.print("Person");
        }
        if(p instanceof Student){
            System.out.print("Student");
        }
        if(p instanceof Researcher){
            System.out.print("Researcher");
        }
        if(p instanceof Professor){
            System.out.print("Professor");
        }
        System.out.println();
    }
    public static void main(String[] args){
        System.out.print("new Student() ->\t"); print(new Student());
        System.out.print("new Researcher() ->\t"); print(new Researcher());
        System.out.print("new Professor() ->\t"); print(new Professor());
    }
}

//메소드 오버라이딩 다형성 실현
class Shape {
    public Shape next;

    public Shape() { next = null; }

    public void draw() {
        System.out.println("Shape");
    }
}

class Line extends Shape {
    public void draw() { // 메소드 오버라이딩
        System.out.println("Line");
    }
}

class Rect extends Shape {
    public void draw() { // 메소드 오버라이딩
        System.out.println("Rect");
    }
}

class Circle3 extends Shape {
    public void draw() { // 메소드 오버라이딩
        System.out.println("Circle");
    }
}

class MethodOverridingEx {
    static void paint(Shape p) {
        p.draw(); // p가 가리키는 객체 내에 오버라이딩된 draw() 호출. 동적 바인딩
    }

    public static void main(String[] args) {
        Line line = new Line();

        // 다음 호출들은 모두 paint() 메소드 내에서 Shape에 대한 레퍼런스 p로 업캐스팅됨
        paint(line); // Line에 오버라이딩한 draw() 실행, "Line" 출력
        paint(new Shape()); // Shape의 draw() 실행, "Shape" 출력
        paint(new Line()); // Line에 오버라이딩한 draw() 실행, "Line" 출력
        paint(new Rect()); // Rect에 오버라이딩한 draw() 실행, "Rect" 출력
        paint(new Circle3());
    }
}

//메소드 오버라이딩
class Weapon{
    protected int fire(){
        return 1;
    }
}
class Cannon extends Weapon{
    @Override
    protected int fire(){
        return 10;
    }
}
class Overriding{
    public static void main(String[] args){
        Weapon weapon;
        weapon = new Weapon();
        System.out.println("기본 무기의 살상 능력은" + weapon.fire());

        weapon =  new Cannon();
        System.out.println("대포 살상 능력은" + weapon.fire());
    }
}

//인터페이스
interface PhoneInterface {
    final int TIMEOUT = 10000;
    void sendCall();
    void receiveCall();
    default void printLogo() {
        System.out.println("*** Phone ***");
    }
}
class SamsungPhone implements PhoneInterface {
    @Override
    public void sendCall() {
        System.out.println("띠리리링");
    }

    @Override
    public void receiveCall() {
        System.out.println("전화가 왔습니다.");
    }

    public void flash() {
        System.out.println("전화기에 불이 켜졌습니다.");
    }
}
class InterfaceEx{
    public static void main(String[] args){
        SamsungPhone phone = new SamsungPhone();
        phone.printLogo();
        phone.sendCall();
        phone.receiveCall();
        phone.flash();
    }
}