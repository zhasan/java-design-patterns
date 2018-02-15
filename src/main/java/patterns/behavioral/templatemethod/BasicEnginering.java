package patterns.behavioral.templatemethod;

abstract class BasicEnginering {
    void Papers() {
        Math();
        SoftSkills();
        SpecialPaper();
    }

    private void Math() {
        System.out.println("Mathematics");

    }

    public abstract void SpecialPaper();

    private void SoftSkills() {
        System.out.println("SoftSkills");

    }
}
