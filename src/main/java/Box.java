import java.util.Collections;
import java.util.List;

public class Box<T,V extends Number> implements BoxOperations<V>{

    private T t;
    private String name;
    private V largestValue;

    public Box(String name){
        this.name = name;
    }

    public V getLargestValue() {
        return this.largestValue;
    }

    public void setLargestValue(V value1, V value2) {
        if (value1.doubleValue() > value2.doubleValue()) {
            this.largestValue = value1;
        } else {
            this.largestValue = value2;
        }
    }

//    public void setLargestNumberFromList(List<? extends V> list){
//        //setLargestValue(Collections.max(list,null),0);
//        largestValue = Collections.max(list.stream().toList();
//    }

    public void setLargestValueFromList(List<? extends V> numbers) {
        this.largestValue = Collections.max(numbers, null);
    }


    public boolean hasSameName(Box<?, ?> b) {
        if(this.name.equals(b.name)){
            return true;
        }
    return false;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public <T> T castValue(Class<T> clazz, String s){
        try {
            //T newT = (T)s;
//          Double.class.cast(s);
            return clazz.cast(s);
        } catch (ClassCastException e) {
            System.out.println("Inside catch");
            throw new ClassCastException("error");
        }

    }
}

//private <U> T convertToT(U value) {
//    // cast a U to a T
//    return (T) value;
//}
