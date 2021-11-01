public class PatientQueue
{


    //Internal Classes

    public class Patient {

        public String name;
        public int priority;

        public Patient(String name, int priority) {
            this.name = name;
            this.priority = priority;
        }

        public String toString() {
            return name + " (" + priority + ")";
        }
    }

    public class Heap<E>{

        private static final int DEFAULT_CAPACITY = 5;
        private E[] heap;
        private int size;

        public Heap() {
            heap = (E[])new Object[DEFAULT_CAPACITY];
            size = 0;
        }

        private int parent(int i){
            return i/2;
        }

        private int left(int i){
            return 2*i;
        }

        private int right(int i){
            return 2*i + 1;
        }

        // does 'a' have higher priority than 'b' ?
        private boolean compare(E a, E b){
            return ((Comparable<E>)a).compareTo(b) < 0;

        }

        private void bubbleUp(int i) {

        }

        private void bubbleDown(int i) {

        }

        public void add(E e) {
            if (size == heap.length-1)
                return;

            size++;
            heap[size] = e;
            bubbleUp(size);
        }

        public E remove(){
            if (isEmpty())
                return null;

            E e = heap[1];
            heap[1] = heap[size];
            size--;
            bubbleDown(1);
            return e;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public int size() {
            return size;
        }

        public String toString() {
            String s = "{";

            for (int i = 1; i <= size; i++)
                s += (i == 1 ? "" : ", ") + heap[i];

            return s + "}";
        }

    }
}
