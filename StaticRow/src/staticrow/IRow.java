package staticrow;

public interface IRow {
    void enqueue(int value);
    int dequeue();
    int front();
    boolean isEmpty();
    boolean isFull();
    int size();
}
