public class Main {
    public static void main(String[] args) {

        System.out.println(DataVerification.checkData("login_123","123sds","123sds"));
        System.out.println(DataVerification.checkData("login_123","123sds","123"));
        System.out.println(DataVerification.checkData("login_123!","123sds","123sds"));
        System.out.println(DataVerification.checkData("login_123","123sd--s","123sds"));
        System.out.println(DataVerification.checkData("loginLongerThen20____","123sds","123sds"));
        System.out.println(DataVerification.checkData("login_123","passwordLongerThen19","passwordLongerThen19"));
    }
}