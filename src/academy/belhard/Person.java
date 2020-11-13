package academy.belhard;

public class Person {
    private String firstName;
    private String lastName;
    private Address address;

    public Person (String firstName, String lastName, Address address) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.address=address;
        try {
            if (firstName==null || lastName==null) {
                throw new NullFieldException("Одно из полей равно null");
            }
        }catch (NullFieldException e){
            e.printStackTrace();

        }
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Address getAddress() {
        return address;
    }


    @Override
    public String toString() {

        return "Person {Имя: "+ firstName+", Фамилия: "+ lastName + ", Адрес: " + address + "}";
    }

}
