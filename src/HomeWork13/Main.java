package HomeWork13;

public class Main {
     public static void main(String[] args) {
     Class class1 = new Class(5,"word", 1,2,4,5,8);
         System.out.println("Number: "+class1.getNumber());
         System.out.println("Word: "+class1.getWord());
         System.out.println("Array number one: "+class1.getArray()[0]);
         System.out.println("Array number two: "+class1.getArray()[1]);
         System.out.println("Array number three: "+class1.getArray()[2]);
         System.out.println("Array number for: "+class1.getArray()[3]);
         System.out.println("Array number five: "+class1.getArray()[4]);
    }
}
