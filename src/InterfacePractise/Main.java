package InterfacePractise;

public class Main {
    public static void main(String[] args) {

        ITelephone timsPhone;
        timsPhone = new DeskPhone(123456);
        timsPhone.powerOne();
        timsPhone.callPhone(12314545);
        timsPhone.answer();

        timsPhone = new MobilePhone(1234);
        timsPhone.powerOne();
        timsPhone.callPhone(123455);
        timsPhone.answer();

    }

}
