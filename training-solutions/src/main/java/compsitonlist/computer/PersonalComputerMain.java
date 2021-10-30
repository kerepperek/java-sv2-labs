package compsitonlist.computer;

public class PersonalComputerMain {

    public static void main(String[] args) {

        Cpu cpu = new Cpu("Intel Core i9", 3.2);
        PersonalComputer personalComputer = new PersonalComputer(cpu);

        personalComputer.addHardware(new Hardware("memória", "Toshiba 4GB"));
        personalComputer.addHardware(new Hardware("videokártya", "Nvidia 4GB"));
        personalComputer.addSoftware(new Software("Microsoft Windows", 10.123324));
        personalComputer.addSoftware(new Software("Microsoft Office", 7.0));

        System.out.println(personalComputer.getCpu());
        System.out.println(personalComputer.getHardwares());
        System.out.println(personalComputer.getSoftwares());

        System.out.println(personalComputer);
    }
}
