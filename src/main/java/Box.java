public class Box<T> {

    private T t;
   // private Integer i;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public <T> T castValue(String s){
        try {
            T newT = (T)s;
            return newT;
        } catch (ClassCastException e) {
            throw new ClassCastException("error");
        }
    }
}

//private <U> T convertToT(U value) {
//    // cast a U to a T
//    return (T) value;
//}
