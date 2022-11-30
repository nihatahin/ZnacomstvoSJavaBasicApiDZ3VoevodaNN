package task4;

import java.util.ArrayList;
import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> base = getBase();
        System.out.println("Input data base.");
        printBase(base);

        Scanner scanner = new Scanner(System.in);


        base = enterNewCategory(base, scanner);
        base = enterNewBook(base, scanner);
        
        scanner.close();
        
        
        System.out.println("\n\nOutput data base.");
        printBase(base);
    }
    
    public static ArrayList<ArrayList<String>> getBase() {
        ArrayList<ArrayList<String> > out = new  ArrayList<ArrayList<String> >();

        ArrayList<String> fantastic = new ArrayList<>();
        fantastic.add("science fiction");
        fantastic.add("A. Huxley \"Island\"");
        fantastic.add("I. Azimov \"I, Robot\"");
        fantastic.add("H. Wells \"Time Machine\"");
        fantastic.add("I. Yefremov \"Bull's hour\"");
        fantastic.add("A. Weir \"The Martian\"");
        
        out.add(fantastic);


        ArrayList<String> fantasy = new ArrayList<>();
        fantasy.add("fantasy");
        fantasy.add("J. Tolkien \"The Lord of the Rings\"");
        fantasy.add("J. Rowling \"Harry Potter and the Philosopher's Stone\"");
        fantasy.add("G. Martin \"A Song of Ice and Fire\"");

        out.add(fantasy);

        ArrayList<String> classic = new ArrayList<>();
        classic.add("classic");
        classic.add("J. Goethe \"Faust\"");
        classic.add("V. Hugo \"The Misarables\"");
        classic.add("W. Shakespeare \"The Tragedy of Coriolanus\"");
        classic.add("A. Pushkin \"Dubrovsky\"");


        out.add(classic);

        return out;
    }

    public static void printBase(ArrayList<ArrayList<String>> arList) {
        for (int i = 0; i < arList.size(); ++i)
            System.out.println(arList.get(i).toString());
    }

    public static  ArrayList<ArrayList<String>> enterNewCategory(ArrayList<ArrayList<String>> arList, Scanner iScanner) {
        System.out.println("\nEnter category name: ");
        ArrayList<String> curCat = new ArrayList<>();
        String catName = iScanner.nextLine();
        for (int i = 0; i < arList.size(); ++i)
            if (arList.get(i).get(0).equals(catName))
            {
                System.out.println("Such category has already been registrated in base.");
                return arList;
            }

        
        curCat.add(catName);
        arList.add(curCat);
        return arList;
    }

    public static  ArrayList<ArrayList<String>> enterNewBook(ArrayList<ArrayList<String>> arList, Scanner iScanner) {
        System.out.println("\nEnter category name for new book: ");
        String category = iScanner.nextLine();
        int  catIndex = -1;
        for (int i = 0; i < arList.size(); ++i)
        {
            if (arList.get(i).get(0).equals(category))
            {
                catIndex = i;
                System.out.println("Enter book name: ");
                String bookName = iScanner.nextLine();
                for (int j = 1; j < arList.get(i).size(); ++j)
                    if (arList.get(i).get(j).equals(bookName))
                    {
                        System.out.println("Such book has already been registrated in base.");
                        return arList;
                    }
                arList.get(i).add(bookName);
                break;
            }
        }
        if (catIndex < 0)
            System.out.println("Invalid category name.");

        return arList;

    }


}
