public class Main {
    public static void main (String[] args) {
        long ticketPrice = 50; // Стоимость билета
        int percent = 5; // Процент бонуса
        long totalBonus = ticketPrice * percent / 100; // Получаемый бонус с покупки
        System.out.println(totalBonus);
    }
}
