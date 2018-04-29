package Kap16Exercise15;

public class Exercise15
{
    /*
     Write a method called notEquals that accepts a second list
     as a parameter, returns true if the two lists are not equal, and
     returns false otherwise. Two lists are considered unequal if they store
     the different values in any random order and do not have the same length.
    */

    public static void main(String[] args)
    {
        LinkedIntListExercise15 list = new LinkedIntListExercise15();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        LinkedIntListExercise15 newList = new LinkedIntListExercise15();
        newList.add(1);
        newList.add(2);
        newList.add(3);
        newList.add(4);
        newList.add(5);

        System.out.println(list.notEquals(newList));
    }
}
