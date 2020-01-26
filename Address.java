package com.jetbrains;

public class Address {
   private String street;
   private String nr_house;
   private String nr_flat;
   private String post_code;
   private String post_office;
   public Address(String street, String nr_house, String nr_flat, String post_code, String post_office){
        this.street = street;
        this.nr_house = nr_house;
        this.nr_flat = nr_flat;
        this.post_code = post_code;
        this.post_office = post_office;
   }

   public String getStreet()
   {
       return this.street;
   }

    public String getNr_house() {
        return this.nr_house;
    }

    public String getNr_flat() {
        return this.nr_flat;
    }

    public String getPost_code() {
        return this.post_code;
    }

    public String getPost_office() {
        return this.post_office;
    }
}
