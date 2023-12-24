import java.util.LinkedList;
class Buffer {
private LinkedList<Integer> buffer = new LinkedList<>();
private int capacity;
public Buffer(int capacity) {
this.capacity = capacity;
}
public synchronized void produce(int item) throws InterruptedException {
while (buffer.size() == capacity) {
wait();
}
buffer.add(item);
System.out.println("Produced: " + item);
notifyAll();
}
public synchronized int consume() throws InterruptedException {
while (buffer.isEmpty()) {
wait();
}
int item = buffer.removeFirst();
System.out.println("Consumed: " + item);
notifyAll();
return item;
}
}
class Producer extends Thread {
private Buffer buffer;
public Producer(Buffer buffer) {
this.buffer = buffer;
}
public void run() {
try {
for (int i = 1; i <= 5; i++) {
buffer.produce(i);
Thread.sleep(1000);
}
} catch (InterruptedException e) {
Thread.currentThread().interrupt();
}

}
}
class Consumer extends Thread {
private Buffer buffer;
public Consumer(Buffer buffer) {
this.buffer = buffer;
}
public void run() {
try {
for (int i = 0; i < 5; i++) {
int item = buffer.consume();
Thread.sleep(1500); // Simulate consumption time
}
} catch (InterruptedException e) {
Thread.currentThread().interrupt();
}
}
}
public class ProducerConsumer{
public static void main(String[] args) {
Buffer buffer = new Buffer(3);
Producer producer = new Producer(buffer);
Consumer consumer = new Consumer(buffer);
producer.start();
consumer.start();
}
}
