package JavaQa.DynamicArray;
import java.util.Arrays;
public class DynamicArray {
    private int size = 0;
    private int capacity = 10;
    private int[] masiv = new int[capacity];
    private int multiplier = 2;
    DynamicArray() {
    }
    DynamicArray(int a) {
        capacity = a;
        masiv = new int[capacity];
    }
    int getLength() {
        return size;
    }

    int getCapacity() {
        return capacity;
    }

    int getIndex(int value) {
        for (int i = 0; i < size + 1; i++) {
            if (masiv[i] == value)
                return i;
        }
        return -1;
    }
    void add(int value) {
        createNewArrayIfNeeded();
        masiv[size] = value;
        size++;
    }
    void add(int index, int value) {
        createNewArrayIfNeeded();
//        if(masiv[index]==0){
//        masiv[index]=value;
//        size++;
//    }
//        else
//        {
        for (int i = size - 1; i >= index; i--) {
            masiv[i + 1] = masiv[i];
        }
        masiv[index] = value;
        size++;
    }
    //    sarqum e nor masiv, hin masivi elementner@ lcnuma mej@ u sarqum no chapani masiv
    private void createNewArrayIfNeeded() {
        if (size == capacity) {
            capacity = capacity * multiplier;
            int[] newmasiv = new int[capacity];
            for (int i = 0; i < size; i++) {
                newmasiv[i] = masiv[i];
            }
            masiv = newmasiv;
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(masiv);
    }

    public void change(DynamicArray dymArr) {
        this.masiv = dymArr.masiv;
//        this.size = dymArr.size;
//        this.capacity = dymArr.capacity; ?????????
    }

//    private void createNewArray(int capacity) {
//        this.capacity = capacity;
//        int[] newmasiv = new int[this.capacity];
//        for (int i = 0; i <= size; i++) {
//            newmasiv[i] = masiv[i];
//        }
//        masiv = newmasiv;
//    }
    private void createNewArrayIfNeeded(int capacity) {
        if (this.capacity < capacity) {
            this.capacity = (capacity * multiplier);
            int[] newmasiv = new int[this.capacity];

            for (int i = 0; i < masiv.length; i++) {
                newmasiv[i] = masiv[i];

            }
            masiv = newmasiv;
        }
    }

    public DynamicArray add(DynamicArray dymArr) {
        createNewArrayIfNeeded(dymArr.capacity + this.capacity);
        for (int i = 0; i < dymArr.getLength(); i++) {
            if (this.masiv[size] == 0) {
                this.masiv[size] = dymArr.masiv[i];
            } else {
                this.masiv[size + 1] = dymArr.masiv[i];
            }
            size++;
        }
        return this;
    }

    public void add(int index, DynamicArray dymArr) {
        createNewArrayIfNeeded((index + dymArr.capacity));
        int i = index;
        for (int j = 0; j < dymArr.capacity; j++) {
            this.masiv[i] = dymArr.masiv[j];
            i++;
        }
    }
    public void addArr(int[] newMasiv) {
        createNewArrayIfNeeded(newMasiv.length);
        for (int i = 0; i < newMasiv.length; i++) {
            this.masiv[i] = newMasiv[i];
            size++;
        }
    }

    boolean contains(DynamicArray arr) {
        boolean contains = false;

        for (int i = 0; i < arr.capacity; i++) {
            contains = false;
            for (int j = 0; j < this.capacity; j++) {
                if (arr.masiv[i] == this.masiv[j]) {
                    contains = true;
                    break;
                }
            }
            if (!contains) {
                return false;
            }
        }
        return contains;
    }

    public void addArr(int index, int[] newMasiv) {
        if (this.size > newMasiv.length) {
            for (int i = 0; i < newMasiv.length; i++) {
                this.masiv[index] = newMasiv[i];
                index++;
            }
        }
    }


    public int valueOf(int index) throws ArrayIndexOutOfBoundsException {
        if (index > size) {
            throw new ArrayIndexOutOfBoundsException("Array does not contains index");
        } else if (index < 0) {
            throw new ArrayIndexOutOfBoundsException("Index cant be less 0");
        } else {
            return masiv[index];
        }
    }

    public int indexOf(int value) {
        for (int i = 0; i < this.size; i++) {
            if (this.masiv[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(int value) {
        for (int j = this.size - 1; j >= 0; j--) {
                if (masiv[j] == value) {
                    return j;
            }
        }
        return -1;
    }

    public DynamicArray removeByValue(int value) {
        removeByIndex(indexOf(value));
        return this;
    }

    public DynamicArray removeByIndex(int index){
        for (int i = 0; i < this.size; i++) {
            if (i == size-1){
                masiv[i] = 0;
                break;
            }
            if (i >= index) {
                masiv[i] = masiv[i+1];
//                masiv[i+1] = 0;
            }
        }
        this.size--;
        return this;
    }


//    public void add(int[] newMasiv) {
//        for (int i = 0; i < newMasiv.length; i++) {
//            this.add(newMasiv[i]);
//        }
//    }
}
