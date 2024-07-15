package Interface;

public interface Bank {
    float rateOfInterest();
}

class SBI implements Bank{
    @Override
    public float rateOfInterest() {
            return 7.5f;
    }
}
class PNB implements Bank{
    @Override
    public float rateOfInterest() {
        return 7.88f;
    }
}