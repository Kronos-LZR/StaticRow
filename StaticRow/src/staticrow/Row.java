package staticrow;

public class Row implements IRow{
    
    private int[] _row;
    private int _start = -1, _end = -1;
    
    public Row(int size){
        this._row = new int[size];
        this._start = 0;
        this._end = 0;
    }

    @Override
    public void enqueue(int value) {
        this._row[_start] = value;
        this._end++;
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
        return this._end;
    }
    
}
