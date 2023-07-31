package serenitylabs.tutorials.vetclinic.domain;

import java.time.LocalDate;

public interface NeedsVaccination {
    void wasVaccinatedOn(LocalDate vaccinatedDate);

    LocalDate nextVaccinationDue();
}
