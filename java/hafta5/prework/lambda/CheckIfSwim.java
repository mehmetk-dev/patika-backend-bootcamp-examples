package hafta5.prework.lambda;

public class CheckIfSwim implements CheckTrait{

    @Override
    public boolean test(Animal animal) {
        return animal.canSwim();
    }
}
