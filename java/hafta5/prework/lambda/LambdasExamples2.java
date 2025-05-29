package hafta5.prework.lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdasExamples2 {

    public static void main(String[] args) {

        var animals = new ArrayList<Animal>();

        animals.add(new Animal("bird", true, false));
        animals.add(new Animal("Cat", true, false));
        animals.add(new Animal("Fish", false, true));
        animals.add(new Animal("Dog", false, false));

        print(animals, new CheckIfHopper());
        print(animals, new CheckIfSwim());

        //
        print(animals, a -> a.canHop());
        print(animals, a -> {
            return a.canSwim();
        });
        print(animals, (a) -> !a.canHop() && !a.canSwim());

    }

    private static void print(List<Animal> animalList, CheckTrait checker) {

        for (Animal animal : animalList) {
            if (checker.test(animal)) {
                System.out.println(animal + " ");

            }
        }
        System.out.println();
    }

    Student student = new Student() {
        @Override
        public void work() {

        }
    };

    Student student1 = () -> System.out.println("MErhaba world");
}

