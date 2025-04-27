package Files_Manipulation;

import java.io.*;
import java.util.Scanner;

public class Files_IO {
    public static void main(String[] args) {

        // for creating file
//        File myFile = new File("hello.txt"); // creation of file object
//        try{
//            myFile.createNewFile(); // method for creating file
//        }catch (IOException e){
//            System.out.println("Unable to create file : "+e);
//        }

        // for writing into file
//        try {
//            FileWriter myFileWriter = new FileWriter("hello.txt");
//            myFileWriter.write("Writing into file through \nprogrammatically"); // for writing
//            myFileWriter.close(); // for releasing resources
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        // reading from file
//        File myFile = new File("hello.txt");
//        try {
//            Scanner sc = new Scanner(myFile);
//            while (sc.hasNextLine()){ // jab tak line hai file mai tab tak read karega
//                String line = sc.nextLine();
//                System.out.println(line);
//            }
//            sc.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

        //deleting file
        File file = new File("hello.txt");
        if (file.delete()){
            System.out.println("File will be deleted : "+file.getName());
        }else{
            System.out.println("Something went wrong for deleting file.");
        }
    }
}
