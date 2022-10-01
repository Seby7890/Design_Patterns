package solid.videostorekata.refactoredv3;

public class ChildrenMovie extends Movie {
    public ChildrenMovie(String title) {
        super(title);
    }

    @Override
    public double getPrice(int daysRented) {
        double price = 1.5;
        //if the rented days exceed 3
        if (daysRented > 3) {
            //add to the price based on the formula
            price += (daysRented - 3) * 1.5;
        }
        return price;
    }

    @Override
    public int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}