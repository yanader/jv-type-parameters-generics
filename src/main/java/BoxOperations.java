import java.util.List;

public interface BoxOperations<V extends Number>{

   public void setLargestValue(V value1, V value2);
   public void setLargestValueFromList(List<? extends V> list1);
}
