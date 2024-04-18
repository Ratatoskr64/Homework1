public class Tusk05 {

    public static final int RADIUS = 5;

    public static void main(String[] args) {
        System.out.println("Задание:№5");
        double area = Math.PI * (RADIUS * RADIUS);
        System.out.println("Площадь круга равна " + Math.round(area)); //round(округляет вывод)
        double circumference = Math.PI * 2 * RADIUS;
        System.out.println("Длина окружности равна: " + Math.round(circumference
        ));

    }
}
