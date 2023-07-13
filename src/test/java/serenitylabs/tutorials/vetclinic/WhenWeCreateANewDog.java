package serenitylabs.tutorials.vetclinic;
import org.junit.Assert;
import org.junit.Test;
import serenitylabs.tutorials.vetclinic.domain.Dog;

import java.time.LocalDate;


public class WhenWeCreateANewDog {

    @Test
    public void a_new_dog_should_have_a_name(){

        LocalDate THE_FOURTH_OF_JULY =LocalDate.of(2023,07,04);
        Dog fido = Dog
                        .called("Fido")
                        .ofBreed("Labrador")
                        .ofColour("black")
                        .bornOn(THE_FOURTH_OF_JULY);

        Assert.assertEquals("Fido",fido.getName());
        Assert.assertEquals("Labrador",fido.getBreed());
        Assert.assertEquals(THE_FOURTH_OF_JULY,fido.getDateOfBirth());


    }

    @Test
    public void a_dog_can_have_an_optional_colour(){

        LocalDate THE_FOURTH_OF_JULY =LocalDate.of(2023,07,04);

        Dog fido = Dog.called("Fido")
                .ofBreed("Labrador")
                .ofColour("black")
                .bornOn(THE_FOURTH_OF_JULY);

        Assert.assertEquals("Fido",fido.getName());
        Assert.assertEquals("Labrador",fido.getBreed());
        Assert.assertEquals(THE_FOURTH_OF_JULY,fido.getDateOfBirth());
        Assert.assertEquals("black",fido.getColour());


    }





}
