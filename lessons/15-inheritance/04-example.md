Давайте рассмотрим пример программы. В которой используется наследование классов, чтобы прочувствовать все услышанное на практике. 

Сначала опишем предметную область. Наша программа будет работать с геометрическими фигурами, поэтому нам понадобятся классы для представления фигур. 

Базовым для всех фигур будет класс Shape. В нем мы объявим общие для всех фигур свойства и методы, такие как цвет ( поле color ) и возможность вычислить площадь ( метод getArea() )
```
public class Shape {
    private final String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return Double.NaN;
    }
}
```
Поскольку конкретный тип фигуры и ее координаты на данном уровне неизвестны, то метод вычисления площади просто заглушка, возвращающий NaN.

Менять цвет фигуры, после создания не предполагается, поэтому поле color объявлено финальным (имеет модификатор final).

Опишем три конкретных типа фигур.

Circle это круг, он задается своим центром (поле center), и радиусом (поле radius).
```
public class Circle extends Shape {
    private final Point center;
    private final double radius;

    public Circle(Point center, double radius, String color) {
        super(color);
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return String.format("Circle {center: %s, radius: %.2f, color: %s}", center, radius, getColor());
    }
}
```
Центр задается точкой, для этого заведен еще один класс Point с двумя координатами x, y;
```
public class Point {
    private final double x;
    private final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return String.format("{x: %.2f, y: %.2f}", x, y);
    }
}
```
У класса Shape есть только один конструктор, принимающий параметр color, поэтому в конструкторе класса Circle нам нужно явно вызвать этот конструктор, передав туда значение цвета.

У класса Circle переопределен метод вычисления значения площади. И метод toString(), чтобы можно было вывести объект на консоль и увидеть его содержимое, а не имя класса с ничего не говорящим значением hashCode-ом.

Второй тип фигуры, квадрат (класс Square). Он задается одной из своих вершин (поле corner) и длинной стороны (поле size).
```
public class Square extends Shape {
    private final Point corner;
    private final double size;

    public Square(Point corner, double size, String color) {
        super(color);
        this.corner = corner;
        this.size = size;
    }

    @Override
    public String toString() {
        return String.format("Square {corner: %s, size: %.2f, color: %s}", corner, size, getColor());
    }
}
```
Так же переопределен метод вычисления площади и toString().

И третий тип, треугольник (класс Triangle). Задается тремя своими вершинами.
```
public class Triangle extends Shape {
    private final Point a;
    private final Point b;
    private final Point c;

    public Triangle(Point a, Point b, Point c, String color) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        double dxAC = a.getX() - c.getY();
        double dyBC = b.getY() - c.getY();
        double dxBC = b.getX() - c.getX();
        double dyAC = a.getY() - c.getY();
        return Math.abs(dxAC * dyBC - dxBC * dyAC) / 2;
    }

    @Override
    public String toString() {
        return String.format("Triangle {a: %s, b: %s, c: %s}", a, b, c, getColor());
    }
}
```
И так же мы переопределяем метод вычисления площади и метод toString().

Теперь сделаем с этим что-нибудь полезное. 
```
public static void main(String[] args) {
    Point p1 = new Point(1, 1);
    Point p2 = new Point(2, 1);
    Point p3 = new Point(1.5, 2);

    Circle c = new Circle(p1, 1, "green");
    Square s = new Square(p1, 1, "blue");
    Triangle t = new Triangle(p1, p2, p3, "red");

    Shape shape = s;
    Object object = s;
    Square square = (Square)object;

    Shape[] shapes = new Shape[]{c, s, t};

    Shape maxShape = findShapeWithMaxArea(shapes);
    System.out.printf("max area %.2f at %s \n", maxShape.getArea(), maxShape);

    private static void printArrayElements(Object[] objects) {//...}

    private static Shape findShapeWithMaxArea(Shape[] arr) {//...}
}
```
В методе main(), главного класса программы, создадим по одному экземпляру каждой из фигур, при помощи оператора new, вызывающего конструктор.
```
Shape shape = s;
Object object = s;
```
Имея на руках экземпляр конкретной фигуры, мы можем его присвоить переменной базового класса Shape или например Object. Такое присваивание всегда возможно и не требует оператора приведения типа. При этом, объект находящийся по ссылке никак не меняется, он продолжает оставаться экземпляром класса Square. Просто мы начинаем смотреть на него через ссылку более общего типа. Через эту ссылку нельзя вызывать ничего специфичного для класса Square, но можно вызывать все, что объявлено на уровне класса Shape, и что по определению наследования так же доступно во всех подклассах этого класса. 
```
Square square = (Square)object;
```
Приведение типа в обратную сторону от базового класса к классу наследника возможно только явно, при помощи оператора приведения типа. Причем если мы угадали с типом объекта, т.е. указали класс не являющийся классом наследником, то произойдет ошибка во время исполнения программы.

```
Shape[] shapes = new Shape[]{c, s, t};
printArrayElements(shapes);
```
Соберем все наши фигуры в массив и расспечатаем содержимое массива. 
```
private static void printArrayElements(Object[] objects) {
    for (int i = 0; i < objects.length; i++) {
        System.out.println(i + ": " + objects[i]);
    }
}
```
Для печати массива есть небольшой утилитный метод принимающий массив объектов. Почему объектов, а не фигур? Потому что, данный метод не несет никакой специфики геометрических фигур и у переданных объектов здесь вызывается только метод toString(). Благодаря такому обобщению этим методом можно будет потом воспользоваться для печати любых других объектов. 

А еще мы можем взять и найти фигуру с максимальной прощадью, для этого есть метод findShapeWithMaxArea().
```
private static Shape findShapeWithMaxArea(Shape[] arr) {
    Shape maxShape = null;
    double maxArea = Double.NEGATIVE_INFINITY;
    for (Shape shape: arr) {
        double area = shape.getArea();
        if (area > maxArea) {
            maxShape = shape;
            maxArea = area;
        }
    }

    return maxShape;
}
```
Он в цикле обходит массив и запоминает элемент с максимальной площадью, который в конце и возвращает. Здесь используется метод getArea(), объявленный в классе Shape и переопределенный в каждом из подклассов. 

Запустим нашу программу и посмотрим что получится.
```
0: Circle {center: {x: 1.00, y: 1.00}, radius: 1.00, color: green}
1: Square {corner: {x: 1.00, y: 1.00}, size: 1.00, color: blue}
2: Triangle {a: {x: 1.00, y: 1.00}, b: {x: 2.00, y: 1.00}, c: {x: 1.50, y: 2.00}}
Shape with max area: Circle {center: {x: 1.00, y: 1.00}, radius: 1.00, color: green} 
```

Этот пример иллюстрирует важную вещь. Имея базовый класс для некоторого набора родственных классов, мы можем писать обобщенный код оперирующий этим базовым классом. Коду будет неважно, какие конкретно экземпляры будут ему переданны. Он будем вызывать ту версию метода который будет соответствовать объекту находящемуся в данных момент по ссылке. Это свойство назыается полиморфизм (способность блоком кода обрабатывать данные разных типов).

Хотя наш код оперирует переменными типа Shape, но по факту вызывается та версия метода getArea(), которая определена в конкретном подклассе, в зависимости от того, на какой объект указыает наша переменная типа Shape.


