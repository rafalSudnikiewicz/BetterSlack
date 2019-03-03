package sandbox.lambdas;

public class CarSelectionDemo {
    public static void main(String[] args) {
        CarSelectionView view = new CarSelectionView();
        int userPrice=25000;
        int mindate=1990;
        int maxDate= 2005;
        view.applyFilter(car -> car.getPrice()<=userPrice && car.getProducedIn()>=mindate && car.getProducedIn()<=maxDate);

    }
}
