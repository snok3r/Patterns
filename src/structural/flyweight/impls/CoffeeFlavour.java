package structural.flyweight.impls;

import structural.flyweight.interfaces.Coffee;

/**
 * Flyweight class
 */
class CoffeeFlavour implements Coffee {

    private final String name;

    CoffeeFlavour(String name) {
        this.name = name;
    }

    @Override
    public void drink() {
        System.out.println("Drinking " + name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CoffeeFlavour that = (CoffeeFlavour) o;

        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return name;
    }
}
