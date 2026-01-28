public class App {
    public static void main(String[] args) throws Exception {

        double income = 20000;
        double taxRate = (income >= 40000) ? 0.25 : 0.15;
        System.out.println(taxRate);

        int grade = 69;
        String passOrFail = (grade > 70) ? "PASS" : "FAIL" ;
        System.out.println(passOrFail);


    }
}
