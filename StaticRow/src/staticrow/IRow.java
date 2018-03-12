/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticrow;

/**
 *
 * @author lazar
 */
public interface IRow {
    void enqueue(int value);
    int dequeue();
    int front();
    boolean isEmpty();
    boolean isFull();
    int size();
}
