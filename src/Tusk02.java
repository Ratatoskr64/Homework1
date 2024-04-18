public class Tusk02 {
    public static void main(String[] args) {
        System.out.println("Задание:№2");
        int n = 865;
        int x = n / 100; //этим мы узнаем "8" сотен
        int y = n % 10; // "5"
        int z = n / 10; // 86
        int zS = z % 10; // 6
        int result = x + y + zS;
        System.out.println(result);
    }
}
