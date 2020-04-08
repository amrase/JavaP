package InterfacePractise;

public interface ITelephone {
    //we don't need public or private we define that in the classes
     void powerOne();
     void dial(int phone);
     void answer();
     boolean callPhone(int phoneNumber);
     boolean isRinging();
}
