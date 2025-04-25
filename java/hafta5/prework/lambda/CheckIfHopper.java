package hafta5.prework.lambda;

public class CheckIfHopper implements CheckTrait{
    @Override
    public boolean test(Animal animal) {
        return animal.canHop();
    }
}
