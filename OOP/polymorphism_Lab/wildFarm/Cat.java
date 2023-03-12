package polymorphism_Lab.wildFarm;

import java.text.DecimalFormat;

public class Cat extends Felime {

    private String breed;

    public Cat(String animalName, String animalType, Double animalWeight, String livingRegion, String breed) {
        super(animalName, animalType, animalWeight, livingRegion);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww");

    }

    @Override
    public void eat(Food food) {
        foodEaten += food.getQuantity();

    }
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");

        return String.format("%s[%s, %s, %s, %s, %d]", animalType, animalName,breed, df.format(getAnimalWeight()), livingRegion, foodEaten);

    }
}
