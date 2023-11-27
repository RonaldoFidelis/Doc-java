package Example;

import java.util.ArrayList;

public class WithoutGenerics {
  private final ArrayList<String> box = new ArrayList<>();
  public void setBox(String thing) {
    box.add(thing);
  }

  public ArrayList<String> getBox(){
    return box;
  }
}
