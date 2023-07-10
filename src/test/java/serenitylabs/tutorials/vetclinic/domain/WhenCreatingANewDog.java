package serenitylabs.tutorials.vetclinic.domain;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDateTime;

public class WhenCreatingANewDog {

    @Test
    public void it_should_have_a_name() throws Exception{

        LocalDateTime birthday = LocalDateTime.now();
        Dog fido =Dog
                    .called("Fido")
                    .ofBreed("Poodle")
                    .bornOn(birthday);

        //Dog fido =new Dog("Fido","Poodle",birthday);
        Assert.assertEquals("Fido",fido.getName());
        Assert.assertEquals("Poodle",fido.getBreed());
        Assert.assertEquals(birthday,fido.getDateofBirth());
    }

    @Test
    public void it_should_have_optional_favorite_food(){

        LocalDateTime birthday = LocalDateTime.now();
        Dog fido =new Dog("Fido","Poodle",birthday,"pizza");
        Assert.assertEquals("pizza",fido.getFavouriteFood());
    }
}
