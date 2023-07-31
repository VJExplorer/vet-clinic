package serenitylabs.tutorials.vetclinic.domain;

import org.junit.Test;

import java.time.LocalDate;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.junit.Assert.assertThat;

public class WhenVisitingTheClinic {

    @Test
    public void cats_and_dogs_complaints_to_the_assistants(){
        Dog fido = Dog.called("Fido").ofBreed("Labrador").andOfColour("Black");
        Cat felix = Cat.called("Felix").ofBreed("Siamese").andOfColour("White");

        ComplaintRegister complaintRegister = new ComplaintRegister();
        VetAssistant assistant = new VetAssistant(complaintRegister);

        assistant.recordComplaintFor(fido);
        assistant.recordComplaintFor(felix);

        assertThat(complaintRegister.getComplaints(),hasItems("Grrr","Meow"));

    }

    @Test
    public void the_pet_should_know_when_pet_next_vaccination_is_due(){
        Cat felix = Cat.called("Felix").ofBreed("Siamese").andOfColour("White");

        LocalDate today = LocalDate.now();
        LocalDate nextYear =today.plusYears(1);

        felix.wasVaccinatedOn(today);

        assertThat(felix.nextVaccinationDue(),is(equalTo(nextYear)));

    }

    @Test
    public void dog_needs_vaccination_every_six_months(){

        NeedsVaccination fido = Dog.called("Fido").ofBreed("Labrador").andOfColour("Black");
        LocalDate today = LocalDate.now();
        LocalDate sixMonths =today.plusMonths(6);

        fido.wasVaccinatedOn(today);

        assertThat(fido.nextVaccinationDue(),is(equalTo(sixMonths)));
    }
}
