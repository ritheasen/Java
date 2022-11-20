package serialization;

public class Address {
    String streetName;
    String cityName;
    Long postalCode;

    public Address(String streetName, String cityName, Long postalCode) {
        this.streetName = streetName;
        this.cityName = cityName;
        this.postalCode = postalCode;
    }
}
