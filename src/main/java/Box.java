public class Box<T> {

    private T t;
   // private Integer i;

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
            //throw new ClassCastException("error");
        }
        return null;
    }
}

//private <U> T convertToT(U value) {
//    // cast a U to a T
//    return (T) value;
//}
