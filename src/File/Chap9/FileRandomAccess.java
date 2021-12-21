package File.Chap9;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class FileRandomAccess {
    private static final String FILE_NAME	= "D:\\HocTap\\java\\l03-opps\\src\\File\\Chap9\\file-random-access.txt";

    public static void main(String[] args) {
        RandomAccessFile randomAccessFile;
        try {
            randomAccessFile = new RandomAccessFile(FILE_NAME, "rw");
            randomAccessFile.writeInt(123);
            randomAccessFile.writeBoolean(false);
            randomAccessFile.writeUTF("randomAccessFile");

            randomAccessFile.seek(0);
            myPrint(randomAccessFile.readInt() + "");
            myPrint(randomAccessFile.readBoolean() + "");
            myPrint(randomAccessFile.readUTF());

            randomAccessFile.close();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }

    private static void readFile(){
        try {
            RandomAccessFile randomAccessFile	= new RandomAccessFile(FILE_NAME, "r");


            myPrint(randomAccessFile.readInt() + "");
            myPrint(randomAccessFile.readBoolean() + "");
            myPrint(randomAccessFile.readUTF());

            randomAccessFile.close();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private static void writeFile(){
        try {
            RandomAccessFile randomAccessFile	= new RandomAccessFile(FILE_NAME, "rw");

            randomAccessFile.writeInt(123);
            randomAccessFile.writeBoolean(false);
            randomAccessFile.writeUTF("randomAccessFile");


            randomAccessFile.close();



        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private static void myPrint(String content){
        System.out.println(content);
    }
}
