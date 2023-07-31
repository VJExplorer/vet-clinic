package serenitylabs.tutorials.vetclinic.domain;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class WhenCollectingAnimals {
    @Test
    public void a_list_animals_can_contain_cats_and_dogs(){
        Dog fido = Dog.called("Fido").ofBreed("Labrador").andOfColour("Black");
        Cat felix = Cat.called("Felix").ofBreed("Siamese").andOfColour("White");

        List<Animal> animals = new ArrayList<>();
        animals.add(fido);
        animals.add(felix);

        assertThat(animals,hasItems(fido,felix));

    }

    @Test
    public void dog_complaints_by_growling(){
        Dog fido = Dog.called("Fido").ofBreed("Labrador").andOfColour("Black","White");
        assertThat(fido.complaint(),is(equalTo("Grrr")));

    }

    @Test
    public void cat_complaints_by_meowing(){
        Cat felix = Cat.called("Felix").ofBreed("Siamese").andOfColour("White");
        assertThat(felix.complaint(),is(equalTo("Meow")));

    }
}
