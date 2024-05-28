public class Bug {

    String bugDescription;
    String bugReporterEmail;
    int bugPriority;
    boolean isBugOpen;

    Bug(String bugDescription, String bugReporterEmail, int bugPriority) {
        this.bugDescription = bugDescription;
        this.bugReporterEmail = bugReporterEmail;
        this.bugPriority = bugPriority;
        this.isBugOpen = true;
    }

    // Metody

    // pokaż wszystkie informacje na temat błędu
    void getAllBugInfo() {
        System.out.println("Bug description: " + bugDescription + " email: " + bugReporterEmail + " bug priority: "
                + bugPriority + " bug status: " + isBugOpen);
    }
    // pokaż osobę zgłaszającą błąd

    void showEmail() {
        System.out.println("Email: " + bugReporterEmail);
    }
    // pokaż status błędu

    void showBugStatus() {
        System.out.println("Bug status: " + isBugOpen);
    }
    // zwróć priorytet błędu

    int getBugPriority() {
        return bugPriority;
    }
}
