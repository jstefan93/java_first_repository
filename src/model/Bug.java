package model;

public class Bug {

    private String bugDescription;
    private String bugReporterEmail;
    private int bugPriority;
    private boolean isBugOpen;

    public Bug(String bugDescription, String bugReporterEmail, int bugPriority) {
        this.bugDescription = bugDescription;
        this.bugReporterEmail = bugReporterEmail;
        this.bugPriority = bugPriority;
        this.isBugOpen = true;
    }

    public String getBugDescription() {
        return bugDescription;
    }

    public void setBugDescription(String bugDescription) {
        if (bugDescription.length() < 10) {
            System.out.println("bug description must be at least 10 characters long");
        } else {
            this.bugDescription = bugDescription;
        }
    }

    public String getBugReporterEmail() {
        return bugReporterEmail;
    }

    // czy zawiera znak @
    public void setBugReporterEmail(String bugReporterEmail) {
        if (!bugReporterEmail.contains("@")) {
            System.out.println("email address must contain @");
        } else {
            this.bugReporterEmail = bugReporterEmail;
        }
    }

    // czy znajduje się w przedziale 1-5 nie moze byc 0 ani ujemne
    public void setBugPriority(int bugPriority) {
        switch (bugPriority) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                this.bugPriority = bugPriority;
                break;
                default:{
                    System.out.println("Incorrect bug priority range");
                }
        }
    }

    public int getBugPriority() {
        return bugPriority;
    }

    public boolean isBugOpen() {
        return isBugOpen;
    }

    public void setBugOpen(boolean bugOpen) {
        isBugOpen = bugOpen;
    }
    // Metody

    // pokaż wszystkie informacje na temat błędu
    public void getAllBugInfo() {
        System.out.println("model.Bug description: " + bugDescription + " email: " + bugReporterEmail + " bug priority: "
                + bugPriority + " bug status: " + isBugOpen);
    }
    // pokaż osobę zgłaszającą błąd

    public void showEmail() {
        System.out.println("Email: " + bugReporterEmail);
    }
    // pokaż status błędu

    public void showBugStatus() {
        System.out.println("model.Bug status: " + isBugOpen);
    }
}
