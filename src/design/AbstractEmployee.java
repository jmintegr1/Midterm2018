package design;



public abstract class AbstractEmployee implements Employee {

    public final String founderName = "Abdul Kudoz";
    static String address = "250 Vesey Street, New York NY";

    public void describeCompany() {
        System.out.println("The man with the vison Mr. " + founderName + " founded the company located at " + address + ".");
    }
    public abstract void describeCompany(String Mission);
}