package models;


public class Customers {
    private String name;
    private int dateOfBirth;
    private String address;
    private String image;

    public Customers() {
    }

    public Customers(String name, int dateOfBirth, String address, String image) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.image = image;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
