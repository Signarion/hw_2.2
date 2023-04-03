public class main {
    public static void main(String[] args) {
        int initAcc = 100;
        int depositAmount = 10099;

        int bonus = depositAmount >= 1000 ? depositAmount / 100 : 0;

        System.out.println("Итоговый счёт " + (initAcc+depositAmount));
        System.out.println("Бонусных рублей " + bonus);
    }
}
