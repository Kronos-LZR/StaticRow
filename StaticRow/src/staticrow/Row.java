package staticrow;

public class Row implements IRow{
    
    private int[] _row;
    private int _start, _end;
    
    public Row(int size){
        _row = new int[size];
    }

    @Override
    public void enqueue(int value) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int dequeue() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int front() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isFull() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
