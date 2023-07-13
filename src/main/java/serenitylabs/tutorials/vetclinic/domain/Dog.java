package serenitylabs.tutorials.vetclinic.domain;
import java.time.LocalDate;

public class Dog {

    private final String name;
    private final String breed;
    private  final LocalDate dateOfBirth;
    private  final String colour;

    public Dog(String name,String breed ,LocalDate dateOfBirth,String colour) {
        this.name = name;
        this.breed = breed;
        this.dateOfBirth = dateOfBirth;
        this.colour = colour;
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

    interface  WithBreed{
        WithColour ofBreed(String breed);

    }

    interface WithColour{
        DogBreeder ofColour(String colour);
    }
    public static class DogBreeder implements WithBreed , WithColour{
        private String name;
        private String breed;
        private String colour;

        public DogBreeder(String name) {
            this.name =name;

        }
        public WithColour ofBreed(String breed) {
            this.breed =breed;
            return this;
        }

        public Dog bornOn(LocalDate dateOfBirth){
            return new Dog(name,breed,dateOfBirth,colour);
        }

        public DogBreeder ofColour(String colour) {
            this.colour = colour;
            return this;
        }
    }
}
