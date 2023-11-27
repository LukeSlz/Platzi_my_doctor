import static ui.UiMenu.*;


public class Main {
    public static void main(String[] args) {

        Doctor myDoctor = new Doctor();
        myDoctor.name = "Alejandro Rodriguez";
        myDoctor.showName();
        myDoctor.speciality = "Dermatology";
        myDoctor.showSpec();
        myDoctor.showId();

        Doctor myDoctorLuke = new Doctor("Luke");
        myDoctorLuke.showId();

        showMenu();
    }
}
