package interfacedependencyinversion.vaccine;

import java.util.ArrayList;
import java.util.List;

public class SecondVaccine implements Vaccine {

    private List<Person> vaccinationList = new ArrayList<>();

    @Override
    public List<Person> getVaccinationList() {
        return vaccinationList;
    }

    @Override
    public void generateVaccinationList(List<Person> registrated) {
        vaccinationList.addAll(getyoungs(registrated));
        vaccinationList.addAll(getElders(registrated));

    }

    private List<Person> getyoungs(List<Person> registrated) {
        List<Person> result=new ArrayList<>();
        for (Person p : registrated) {
            if (p.getAge() <= 65 && p.getPregnant() == Pregnancy.NO && p.getChronic() == ChronicDisease.NO) {
                result.add(p);
            }
        }
        return result;
    }

    private  List<Person> getElders(List<Person> registrated) {
        List<Person> result=new ArrayList<>();
        for (Person p : registrated) {
            if (p.getAge() > 65 && p.getPregnant() == Pregnancy.NO && p.getChronic() == ChronicDisease.NO) {
                result.add(p);
            }
        }
        return result;
    }
}
