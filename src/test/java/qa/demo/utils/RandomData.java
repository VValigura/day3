package qa.demo.utils;

import com.github.javafaker.Faker;

import java.util.Locale;

public class RandomData {
    static Faker faker = new Faker(new Locale("ru"));

    public static String getFirstName(){
        return faker.name().firstName();
    }

    public static String getLastName(){
        return faker.name().lastName();
    }

    public static String getEmail(){
        return new Faker(new Locale("en")).internet().emailAddress();
    }

    public static String getGender(){
        String[] genders = {"Male", "Female", "Other"};
        return genders[(int) (Math.random()*3)];
    }

    public static String getPhone(){
        return faker.phoneNumber().subscriberNumber(10);
    }

    public static String getSubject(){
        String[] genders = {"English", "Maths", "Chemistry"};
        return genders[(int) (Math.random()*3)];
    }

    public static String getHobbies(){
        String[] genders = {"Sports", "Reading", "Music"};
        return genders[(int) (Math.random()*3)];
    }

    public static String getAddress(){
        return new Faker(new Locale("en")).address().fullAddress();
    }






}
