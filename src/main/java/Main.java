public class Main {
    public static void main(String[] args) {
        Burger firstBurger = new Burger();
        firstBurger.id = 1;
        firstBurger.name = "Чизбургер";
        firstBurger.avatarUrl = "https://s82079.cdn.ngenix.net/9VW3RQfY33AnJi7Yu38nKiHc.png?dw=230";
        firstBurger.price = 69;
        firstBurger.canBeOrdered = false;
        firstBurger.weight = 167;
        firstBurger.description = "Пряный горчичный соус, кетчуп, сочные стрипсы в оригинальной панировке, лук, сыр Чеддер, огурцы на пшеничной булочке с кукурузной посыпкой.";
        firstBurger.kiloCalories = 237;
        firstBurger.protein = 13.2;
        firstBurger.fat = 8.6;
        firstBurger.carbohydrate = 26.6;
        System.out.println(firstBurger.name);
        System.out.println(firstBurger.price);

        Burger secondBurger = new Burger();
        secondBurger.id = 2;
        secondBurger.name = "Шефбургер Де Люкс";
        secondBurger.avatarUrl = "https://s82079.cdn.ngenix.net/SCeZWBR7JEc83mEiNKDeFEeD.png?dw=230";
        secondBurger.price = 144;
        secondBurger.canBeOrdered = true;
        secondBurger.weight = 239;
        secondBurger.description = "Бургер от шефа теперь Де Люкс! Сочное филе в оригинальной панировке, томаты, салат айсберг, соус Цезарь, аппетитная булочка, нежный сыр и бекон!";
        secondBurger.kiloCalories = 242;
        secondBurger.protein = 13.2;
        secondBurger.fat = 12.1;
        secondBurger.carbohydrate = 20.3;
        System.out.println(secondBurger.name);
        System.out.println(secondBurger.price);

    }
}
