package serenitylabs.tutorials.vetclinic.domain;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.Assert;

import java.time.LocalDateTime;

public class WhenWeBookAnAppointment {

    private static final LocalDateTime TODAY_AT_2_PM = LocalDateTime.now().withHour(2).withMinute(0);

    @Test
    public void an_appointment_has_a_patient_name_an_owner_and_a_date() {
        Appointment appointment = Appointment.forPetCalled("Fido").ownedBy("Fred").at(TODAY_AT_2_PM);

        assertThat(appointment.getPetName(),is(equalTo("Fido")));
        assertThat(appointment.getOwner(),is(equalTo("Fred")));
        assertThat(appointment.getAppointmentTime(),is(equalTo(TODAY_AT_2_PM)));
    }

    @Test
    public void an_appointment_can_have_an_optional_reason() {
        Appointment appointment = Appointment.forPetCalled("Fido").ownedBy("Fred").because("He is sick").at(TODAY_AT_2_PM);

        Assert.assertEquals(true,appointment.getReason().isPresent());
        Assert.assertEquals("He is sick",appointment.getReason().get());
    }

}
