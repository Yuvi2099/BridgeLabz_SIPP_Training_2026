interface MealPlan {
    void details();
}

class VegetarianMeal implements MealPlan {
    public void details() {
        System.out.println("Vegetarian Meal");
    }
}

class VeganMeal implements MealPlan {
    public void details() {
        System.out.println("Vegan Meal");
    }
}

class KetoMeal implements MealPlan {
    public void details() {
        System.out.println("Keto Meal");
    }
}

class HighProteinMeal implements MealPlan {
    public void details() {
        System.out.println("High Protein Meal");
    }
}

class Meal<T extends MealPlan> {

    T plan;

    Meal(T plan) {
        this.plan = plan;
    }

    public T getPlan() {
        return plan;
    }
}

public class MealPlannerSystem {

    public static <T extends MealPlan> void generateMeal(T meal) {
        System.out.println("Meal Generated:");
        meal.details();
    }

    public static void main(String[] args) {

        Meal<VegetarianMeal> meal =
                new Meal<>(new VegetarianMeal());

        generateMeal(meal.getPlan());
    }
}