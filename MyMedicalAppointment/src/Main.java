import static ui.UiMenu.*;


public class Main {
    public static void main(String[] args) {

        //showMenu();

        Doctor myDoctor = new Doctor("Luke", "XR");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);

        Patient myPatient = new Patient("Alejandra", "ale@mail.com");


    }
}
