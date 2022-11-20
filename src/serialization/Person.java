package serialization;

import java.io.Serializable;

public class  Person implements Serializable {

    int id;
    String name;
    Address address;

    Person(int id, String name, Address address){
        this.id = id;
        this.name = name;
        this.address.streetName = address.streetName;
        this.address.cityName = address.cityName;
        this.address.postalCode = address.postalCode;
    }


}
