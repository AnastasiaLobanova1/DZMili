public class Main {
    public static void main(String[] args) {

        int price = 13676;
        int bonusMili = 20;

        if (price < bonusMili) {
            int bonus = 0;
        } else {int bonus = price / bonusMili;
        }

        System.out.println("Количество бонусных миль:" + (price / bonusMili));

    }
}