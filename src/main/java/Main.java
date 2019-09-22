public class Main {
    public static void main(String[] args) {
        Burger firstBurger = new Burger();
        firstBurger.id = 1;
        firstBurger.name = "Чизбургер";
        firstBurger.avatarUrl = "https://s82079.cdn.ngenix.net/9VW3RQfY33AnJi7Yu38nKiHc.png?dw=230";
        firstBurger.price = 69;
        firstBurger.canBeOrdered = false;
        System.out.println(firstBurger.name);
        System.out.println(firstBurger.price);

        Burger secondBurger = new Burger();
        secondBurger.id = 2;
        secondBurger.name = "Шефбургер Де Люкс";
        secondBurger.avatarUrl = "https://s82079.cdn.ngenix.net/SCeZWBR7JEc83mEiNKDeFEeD.png?dw=230";
        secondBurger.price = 144;
        secondBurger.canBeOrdered = true;
        System.out.println(secondBurger.name);
        System.out.println(secondBurger.price);

    }
}
