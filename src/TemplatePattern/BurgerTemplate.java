package TemplatePattern;

abstract class BurgerTemplate {

    final void makeBurger() {
        cookMeat();
        prepBuns();
        if(wantsToastedBuns())
            toastBuns();
        addSauce();
    }

    abstract void cookMeat();

    void prepBuns() {
        System.out.println("Preparing buns..");
    };

    void toastBuns() {
        System.out.println("Toasting buns..");
    }

    boolean wantsToastedBuns() {
        return true;
    }

    abstract void addSauce();
}

class ChickenBurger extends BurgerTemplate {
    @Override
    void cookMeat() {
        System.out.println("Cooking chicken..");
    }

    @Override
    void addSauce() {
        System.out.println("Adding mayo..");
    }

    @Override
    boolean wantsToastedBuns() {
        return false;
    }
}

class BeefBurger extends BurgerTemplate {
    @Override
    void cookMeat() {
        System.out.println("Cooking beef..");
    }

    @Override
    void addSauce() {
        System.out.println("Adding tomato sauce..");
    }
}

class Test {
    public static void main(String[] args) {
        ChickenBurger chickenBurger = new ChickenBurger();
        chickenBurger.makeBurger();
        System.out.println("---------------------");
        BeefBurger beefBurger = new BeefBurger();
        beefBurger.makeBurger();
    }
}