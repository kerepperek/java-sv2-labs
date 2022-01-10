package interfacedependencyinversion.vaccine;

import java.util.ArrayList;
import java.util.List;

public class FirstVaccine implements Vaccine {

    private List<Person> vaccinationList = new ArrayList<>();

    @Override
    public List<Person> getVaccinationList() {
        return vaccinationList;
    }

    @Override
    public void generateVaccinationList(List<Person> registrated) {
        vaccinationList.addAll(getPregnants(registrated));
        vaccinationList.addAll(getElders(registrated));
        vaccinationList.addAll(getOthers(registrated));

    }

    private List<Person> getPregnants(List<Person> registrated) {
        List<Person> result=new ArrayList<>();
        for (Person p : registrated) {
            if (p.getPregnant() == Pregnancy.YES) {
                result.add(p);
            }
        }
        return result;
    }

    private List<Person> getElders(List<Person> registrated) {
        List<Person> result=new ArrayList<>();
        for (Person p : registrated) {
            if (p.getAge() > 65 && p.getPregnant() == Pregnancy.NO) {
                result.add(p);
            }
        }
        return result;
    }

    private List<Person> getOthers(List<Person> registrated) {
        List<Person> result=new ArrayList<>();
        for (Person p : registrated) {
            if (p.getAge() <= 65 && p.getPregnant() == Pregnancy.NO) {
                result.add(p);
            }
        }
        return result;
    }
}
