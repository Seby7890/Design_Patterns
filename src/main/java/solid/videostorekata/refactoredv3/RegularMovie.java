package solid.videostorekata.refactoredv3;

public class RegularMovie extends Movie {
    public RegularMovie(String title) {
        super(title);
    }

    @Override
    public double getPrice(int daysRented) {
        double price = 2;
        //if the rented days exceed 2
        if (daysRented > 2) {
            //add to the price based on the formula
            price += (daysRented - 2) * 1.5;
        }
        return price;
    }

    @Override
    public int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}