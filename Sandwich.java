public abstract class Sandwich {
    final void makeSandwich() {
        cutBread(); // always will be cut
        if (customerWantsMeat()) {
            addMeat();
        }
        if (customerWantsCheese()) {
            addCheese();
        }
        if (customerWantsVegetables()) {
            addVegetables();
        }


        packTheSandwich(); // always will be packed
    }

        public void cutBread() {
            System.out.println("Cutting the bread");
    }



    abstract void addMeat();
    abstract void addCheese();
    abstract void addVegetables();

    boolean customerWantsMeat(){return true;}
    boolean customerWantsCheese(){return true;}
    boolean customerWantsVegetables(){return true;}

    public void packTheSandwich(){
        System.out.println("Pack the sandwich");
    }

}