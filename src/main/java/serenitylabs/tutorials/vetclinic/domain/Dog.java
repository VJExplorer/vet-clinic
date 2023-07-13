package serenitylabs.tutorials.vetclinic.domain;
import java.time.LocalDate;

public class Dog {

    private final String name;
    private final String breed;
    private  final LocalDate dateOfBirth;
    private  final String colour;
    private final String favouriteFood;

    private final String favouriteToy;

    private Dog(String name,String breed ,LocalDate dateOfBirth,String colour,String favouriteFood, String favouriteToy) {
        this.name = name;
        this.breed = breed;
        this.dateOfBirth = dateOfBirth;
        this.colour = colour;
        this.favouriteFood = favouriteFood;
        this.favouriteToy = favouriteToy;
    }



    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getColour() {
        return colour;
    }

    public static DogBreeder called(String name) {
        return new DogBreeder(name);
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }

    public String getFavouriteToy() {
        return favouriteToy;
    }


    public interface  WithBreed{
        WithColour ofBreed(String breed);

    }

    public interface WithColour{
        DogBreeder ofColour(String colour);
    }
    public static class DogBreeder implements WithBreed, WithColour{
        private String name;
        private String breed;
        private String colour;
        private String favouriteFood;

        private  String favouriteToy;

        public DogBreeder(String name) {
            this.name =name;

        }
        public WithColour ofBreed(String breed) {
            this.breed =breed;
            return this;
        }

        public Dog bornOn(LocalDate dateOfBirth){
            return new Dog(name,breed,dateOfBirth,colour,favouriteFood,favouriteToy);
        }

        public DogBreeder ofColour(String colour) {
            this.colour = colour;
            return this;
        }

        public DogBreeder favouriteFood(String favouriteFood) {
            this.favouriteFood = favouriteFood;
            return this;
        }

        public DogBreeder favouriteToy(String favouriteToy) {
            this.favouriteToy = favouriteToy;
            return this;
        }

    }
}
