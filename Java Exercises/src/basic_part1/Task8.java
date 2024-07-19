package basic_part1;

/*
 8. Напишите программу на Java для отображения следующего шаблона.
  Образец шаблона:
     J    a   v     v  a
   J   a a   v   v  a a
J  J  aaaaa   V V  aaaaa
 JJ  a     a   V  a     a
*/

public class Task8 {
    public static void main(String[] args) {
        String[][] pattern = {
                {" ", " ", " ", "J", " ", " ", " ", " ", "a", " ", " ", " ", "v", " ", " ", " ", " ", " ", "v", " ", " ", " ", "a"},
                {" ", " ", " ", "J", " ", " ", "a", " ", "a", " ", " ", "v", " ", "v", " ", "a", " ", "a"},
                {"J", " ", " ", "J", " ", "a", "a", "a", "a", "a", " ", " ", "V", " ", "V", " ", "a", "a", "a", "a", "a"},
                {" ", "J", "J", " ", "a", " ", " ", " ", " ", "a", " ", " ", " ", "V", " ", "a", " ", " ", " ", " ", "a"}
        };
        for (String[] strings : pattern) {
            for (String string : strings) {
                System.out.print(string);
            }
            System.out.println();
        }
    }
}


