package solid.videostorekata.dirty;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private final String name;
    private final List<Rental> rentals = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public String getName() {
        return name;
    }

    public String statement() {
        //total price
        double totalAmount = 0;
        //number of renter points
        int frequentRenterPoints = 0;
        //in result the invoice is probably built
        //at this line is generated the first line of the invoice
        StringBuilder result = new StringBuilder("Rental Record for " + getName() + "\n");

        //check each rental in the rentals list
        for (Rental rental : rentals) {
            //price of current rental
            double thisAmount = 0;

            //depending on the price code of the film, I do something
            switch (rental.getMovie().getPriceCode()) {
                //if the price code is REGULAR, i.e. 0
                case Movie.REGULAR -> {
                    //current rental price is 2
                    thisAmount += 2;
                    //if the rented  days are more than 2
                    if (rental.getDaysRented() > 2)
                        //add something to the price based on the formula
                        thisAmount += (rental.getDaysRented() - 2) * 1.5;
                }
                //if the price code is NEW_RELEASE
                case Movie.NEW_RELEASE ->
                    //price is calculated based on the formula
                        thisAmount += rental.getDaysRented() * 3;
                //if the price code is CHILDREN
                case Movie.CHILDREN -> {
                    //the start price is 1.5
                    thisAmount += 1.5;
                    //if you exceed more than 3 rental days
                    if (rental.getDaysRented() > 3)
                        //you add to the price based on the formula
                        thisAmount += (rental.getDaysRented() - 3) * 1.5;
                }
            }

            //any rental brings you a renter points from the start
            frequentRenterPoints++;

            //if the price code is NEW_RELEASE and you have rented for more than one day
            if (rental.getMovie().getPriceCode() == Movie.NEW_RELEASE && rental.getDaysRented() > 1) {
                //you get an extra renter point
                frequentRenterPoints++;
            }

            //the movie title and the current rental price are added to the string result (invoice)
            result.append("\t").append(rental.getMovie().getTitle()).append("\t").append(thisAmount).append("\n");
            //the current rental price is added to the total price
            totalAmount += thisAmount;
        }

        //add footer to the invoice
        result.append("You owed ").append(totalAmount).append("\n");
        result.append("You earned ").append(frequentRenterPoints).append(" frequent renter points\n");

        return result.toString();
    }
}