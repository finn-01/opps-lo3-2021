package File.Chap9;

import java.io.*;

public class FileText {
    //Tu cau hinh
    private static final String FILE_NAME	= "D:\\HocTap\\java\\l03-opps\\src\\File\\Chap9\\file.txt";


    public static void main(String[] args) {
//		writeFile("-FileText-");
//		myPrint(readFile());
        writeLineFile();
        myPrint(readLine());
    }

    private static String readLine(){
        StringBuffer stringBuffer	= new StringBuffer();

        FileReader fileReader;
        try {
            fileReader = new FileReader(FILE_NAME);
            BufferedReader bufferedReader	= new BufferedReader(fileReader);
            String line	= null;

            while((line = bufferedReader.readLine())!=null){
                stringBuffer.append(line).append(System.getProperty("line.separator"));
            }

            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        return stringBuffer.toString();
    }

    private static String readFile(){
        StringBuffer stringBuffer = new StringBuffer();

        FileReader fileReader;
        try {
            fileReader = new FileReader(FILE_NAME);
            int i = 0;
            while((i = fileReader.read()) != -1){
                stringBuffer.append((char)i);
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        return stringBuffer.toString();
    }

    private static void writeLineFile(){
        FileWriter fileWriter;
        PrintWriter printWriter;


        try {
            fileWriter = new FileWriter(FILE_NAME, false);
            printWriter= new PrintWriter(fileWriter);

            // java
            // is
            // easy!

            printWriter.println("Java");
            printWriter.println("is");
            printWriter.print("easy");
            printWriter.println("!");

            printWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    private static void writeFile(String data){
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter(FILE_NAME, true);
            fileWriter.write(data);
            fileWriter.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    private static void myPrint(String content){
        System.out.println(content);
    }
}
