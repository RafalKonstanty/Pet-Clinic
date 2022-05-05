package pl.konstanty.model;

import java.util.Set;

public class Vet extends Person{
    //Specialities associate with Vet
    private Set<Speciality> specialities;

    public Set<Speciality> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<Speciality> specialities) {
        this.specialities = specialities;
    }

}
