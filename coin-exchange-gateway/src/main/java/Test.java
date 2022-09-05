import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * @author : Alvin
 * @date : 2022/09/04 12:32
 * @desc :
 */
public class Test {

  public static void main(String[] args) {
    int length = 32;
    boolean upper = true, lower = true, number = true, symbol = true;
    List<String> list = new ArrayList<>();
    if (upper){
      for (char i = 'A'; i <= 'Z'; i++) {
        list.add(String.valueOf(i));
      }
    }
    if (lower) {
      for (char i = 'a'; i <= 'z'; i++) {
        list.add(String.valueOf(i));
      }
    }
    if (number) {
      for (char i = '0'; i <= '9'; i++) {
        list.add(String.valueOf(i));
      }
    }
    if (symbol) {
      list.addAll(Arrays.asList("~", "!", "@", "#", "$", "%", "^", "&", "*"));
    }
    Random random = new Random();
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < length; i++) {
      int r = random.nextInt(list.size());
      sb.append(list.get(r));
    }
    System.out.println(sb.toString());
  }
}
