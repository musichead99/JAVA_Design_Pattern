package dp_17_Observer;

public class IncrementalNumberGenerator extends NumberGenerator {

    private int number;
    private int start;
    private int end;
    private int step;

    public IncrementalNumberGenerator(int start, int end, int step) {
        this.start = start;
        this.end = end;
        this.step = step;
    }
    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void execute() {
        for(int i = start; i < end; i += step) {
            number = i;
            notifyObservers();
        }
    }
    
}
