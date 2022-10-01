package solid.videostorekata.refactoredv1;

public class Rental {
    private final Movie movie;
    private final int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public double getPrice() {
        double thisAmount = 0;

        //based on the price code I do something
        switch (movie.getPriceCode()) {
            //if the price code is REGULAR, i.e. 0
            case Movie.REGULAR -> {
                //current rental price is 2
                thisAmount += 2;
                //if the days of rental exceed 2
                if (daysRented > 2)
                    //add to the price based on the formula
                    thisAmount += (daysRented - 2) * 1.5;
            }
            //if the price code is NEW_RELEASE
            case Movie.NEW_RELEASE ->
                //price is calculated based on the formula
                    thisAmount += daysRented * 3;
            //if the price code is CHILDREN
            case Movie.CHILDREN -> {
                //price starts at 1.5
                thisAmount += 1.5;
                //if the rented days are exceeded with 3
                if (daysRented > 3)
                    //you add to the price based on the formula
                    thisAmount += (daysRented - 3) * 1.5;
            }
        }
        return thisAmount;
    }

    public int getFrequentRenterPoints() {
        int frequentRenterPoints = 1;

        //if the price code is NEW_RELEASE and you have rented for more than one day
        if (isNewRelease() && daysRented > 1) {
            //you get 1 more renter point
            frequentRenterPoints++;
        }
        return frequentRenterPoints;
    }

    private boolean isNewRelease() {
        return movie.getPriceCode() == Movie.NEW_RELEASE;
    }
}