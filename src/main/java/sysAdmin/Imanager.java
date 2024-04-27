package sysAdmin;

public interface Imanager {
    void listingVehiles();
    Car findCar(String name);
    void PriceRangeListingCars(double lowestAmount,double highest);
    void discountedCars();
    void setDiscounts();
}
