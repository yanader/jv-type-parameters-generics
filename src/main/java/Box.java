public class Box<T> {

    private T t;
   // private Integer i;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public void castValue(String s){
    try {
        T output= (T)s;
    } catch (ClassCastException e) {
        throw e ;
        }

    }
}
