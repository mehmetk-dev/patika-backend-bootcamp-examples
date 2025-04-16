package Hafta5.Prework.Lambdas;

public class CheckIfSwim implements CheckTrait{

    @Override
    public boolean test(Animal animal) {
        return animal.canSwim();
    }
}
