public class Main {
    public static void main(String[] args) {
        // Задаем изначальные значения переменных
        var productPrice = 7990.0;
        var goal = 200000.0;
        var tax = 0.13;
// Рассчитываем количество экземпляров, которые нужно продать
        var toSale = goal / (productPrice * (1.0 - tax));
        System.out.println(toSale);
    }
}