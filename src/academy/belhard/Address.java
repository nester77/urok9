package academy.belhard;

class Address {
    private String city;
    private String street;
    private int numberOfHouse;

    public Address (String city, String street, int numberOfHouse) {
        this.city=city;
        this.street=street;
        this.numberOfHouse=numberOfHouse;
       try {
           if (city == null || street == null || numberOfHouse==0) {
               throw new NullFieldException("Одно из полей равно null");
           }
       }catch (NullFieldException e){
           e.printStackTrace();
       }
    }

    public void setCity(String city) {
        this.city=city;
    }

    public void setStreet(String street){
        this.street=street;
    }

    public void setNumberOfHouse(int numberOfHouse){
        this.numberOfHouse=numberOfHouse;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getNumberOfHouse() {
        return numberOfHouse;
    }

    @Override
    public String toString() {

        return "Город: "+ city+", Улица: "+ street + ", Номер дома: "+numberOfHouse;
    }


}