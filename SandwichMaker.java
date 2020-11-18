public class SandwichMaker {
    public static void main(String[] args) {
        Sandwich customer1Sandwich = new MixedSandwich();
        customer1Sandwich.makeSandwich();
        Sandwich customer2Sandwich = new VegetarianSandwich();
        customer2Sandwich.makeSandwich();
    }
}