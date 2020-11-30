import java.util.*;

public class Exercise11_13 {

    public static void main(String[] args) {

      ArrayList<Integer> list = new ArrayList<>();
      Scanner keyboard = new Scanner(System.in);
      int i = 0;
      System.out.print("Enter ten integers: ");

      while(list.size() != 10){
      list.add(keyboard.nextInt());
    }

      removeDuplicate(list);

}

    public static void removeDuplicate(ArrayList<Integer> list) {

      ArrayList<Integer> newList = new ArrayList<>();

      for(int i = 0; i < list.size(); i++) {
        if(!newList.contains(list.get(i))) {
          newList.add(list.get(i));
        }
      }


        System.out.print("The distinct intergers are ");
        for(int j = 0; j < newList.size(); j++) {
          System.out.print(newList.get(j)+ " ");
        }
}
}
