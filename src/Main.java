public class Main {
    public static void main(String[] args) {
        Student kuzibin = new Student();
        Student seahkalvin = new Student("BSE0001B", "Seah Kalvin", "BoSE24-B");

        kuzibin.setProgramme("Bachelor of Electrical Engineering");
        seahkalvin.setProgramme("Bachelor of Software Engineering");

        kuzibin.introduce();
        seahkalvin.introduce();
    }
}