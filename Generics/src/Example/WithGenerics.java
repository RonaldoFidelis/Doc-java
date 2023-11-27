package Example;

import java.util.ArrayList;

public class WithGenerics<T> {
  private final ArrayList<T> box = new ArrayList<>();
  public void setBox(T thing) {
    box.add(thing);
  }

  public ArrayList<T> getBox(){
    return box;
  }
}
