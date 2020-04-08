package InterfacePractise;

public class DeskPhone implements ITelephone {

    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;

    }

    @Override
    public void powerOne() {
        System.out.println("No action taken,desk phone does not have a phone button");
    }

    @Override
    public void dial(int phone) {
        System.out.println("Now ringing "+ phone + "on deskphone");
    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answering the desk phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber){
            isRinging = true;
            System.out.println("Ring ring");
        }else{
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
