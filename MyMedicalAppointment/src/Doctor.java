import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;

public class Doctor {
    static int id = 0;      //Auto Increment. al ser Static el valor prevalece
    private String name;
    private String email;
    private String speciality;

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Doctor.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    //2 constructors, one without parameters, one with 2.
    Doctor(){
        System.out.println("Building the object 'Doctor'");
        id++;
    }
    Doctor(String name, String speciality){
        System.out.println("The assigned doctor is:" + name);
        id++;
        this.name = name;
        this.speciality = speciality;
    }
    //behaviour
    public void showName(){
        System.out.println(name);
    }
    public void showId(){
        System.out.println("Doctor's ID: " + id);
    }
    public void showSpec(){
        System.out.println(speciality);
    }

    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void addAvailableAppointment(Date date, String time) {
        availableAppointments.add(new AvailableAppointment(date, time));
    }
    public ArrayList<AvailableAppointment> getAvailableAppointments() {
        return availableAppointments;
    }

    public static class AvailableAppointment {
        private int id;
        private Date date;
        private String time;
        //AvailableAppointment

        public AvailableAppointment(Date date, String time) {
            //Nested class
            this.date = date;
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }
}
