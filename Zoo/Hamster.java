public class Hamster extends Animals {
    public Hamster(String name, String skills) {
        super(name, skills);
    }

    @Override
    public void displayCommands() {
        System.out.println("Commands for the hamster:");
        System.out.println(getSkills());
    }

    @Override
    public void teachNewCommand(String command) {
        String updatedSkills = getSkills() + "," + command;
        setSkills(updatedSkills);
    }
}
