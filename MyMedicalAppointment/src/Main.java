import static ui.UiMenu.*;


public class Main {
    public static void main(String[] args) {

        //showMenu();

        Doctor myDoctor = new Doctor("Luke", "XR");


        Patient myPatient = new Patient("Alejandra", "ale@mail.com");
        myPatient.setPhoneNumber("12345678");
        System.out.println(myPatient.getPhoneNumber());

    }
}
