public class DiscountsOnShirts {
    public static void main(String[] args) {
        int shirtPrice = 1350;
          System.out.println("Цена рубашки: " + shirtPrice + (" Рублей"));

        int selectedShirts = 8;
          System.out.println("Рубашек выбрано: " + selectedShirts + (" Штук"));

        int discountFrom = 10;
          System.out.println("За сколько рубашек идет скидка: " + discountFrom + (" Штук"));

        long add = discountFrom - selectedShirts;
          System.out.println("Столько рубашек нужно докупить для получения скидки: " + add + (" Штук"));

        long price = selectedShirts * shirtPrice;
          System.out.println("Цена выбранных рубашек без скидки: " + price + (" Рублей"));

        long priceAll = discountFrom * shirtPrice;
          System.out.println("Цена за количество рубашек, от которого количества идет скидка: " + priceAll + (" Рублей"));

        double discount = 0.38;
          System.out.println("Процент скидки при покупке 10 рубашек: " + discount + (" Процентов"));

        double discountedPriceOfAllShirts = priceAll * discount;
          System.out.println("Процент скидки от всех рубашек " + discountedPriceOfAllShirts + (" Рублей"));

        double discountedPriceOfOneShirt = shirtPrice - (shirtPrice * discount);
          System.out.println("Цена одной рубашки со скидкой " + discountedPriceOfOneShirt + (" Рублей"));

        double saved = (priceAll - (discountedPriceOfOneShirt * discountFrom));
          System.out.println("Сумма сэкономленных денег " + saved);

        double freebie = saved / shirtPrice;
          System.out.println("Количество рубашек за сэкономленные деньги " + freebie + (" Штук"));
    }
}
