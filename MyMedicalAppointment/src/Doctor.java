public class Doctor {
    static int id = 0;      //Auto Increment. al ser Static el valor prevalece
    String name;
    String speciality;

    Doctor(){
        System.out.println("Building the object 'Doctor'");
        id++;
    }
    Doctor(String name){
        System.out.println("The assigned doctor is:" + name);
        id++;
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
}
