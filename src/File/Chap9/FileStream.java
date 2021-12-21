package File.Chap9;

import java.io.*;

public class FileStream {
    private static final String FILE_NAME	= "D:\\HocTap\\java\\l03-opps\\src\\File\\Chap9\\file-stream.txt";


    public static void main(String[] args) {

//		writeFile("FileStream 123");
//
//		myPrint(readFile());

//		String pathFileA 	= "C:\\java-training\\file_text.txt";
//		String pathFileB	= "C:\\java-training\\file_text2.abc";
//		copyFile(pathFileA, pathFileB);

        writeFileWithBuffer("writeFileWithBuffer");
        myPrint(readFileWithBuffer());
    }

    private static String readFileWithBuffer(){
        StringBuffer stringBuffer = new StringBuffer();
        try {
            FileInputStream fileInputStream 			= new FileInputStream(FILE_NAME);
            BufferedInputStream bufferedInputStream		= new BufferedInputStream(fileInputStream);

            int i	= 0;
            while((i=bufferedInputStream.read())!=-1){
                stringBuffer.append((char)i);
            }

            bufferedInputStream.close();
            fileInputStream.close();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return stringBuffer.toString();
    }

    private static void writeFileWithBuffer(String data){
        try {
            FileOutputStream fileOutputStream 			= new FileOutputStream(FILE_NAME, false);
            BufferedOutputStream bufferedOutputStream	= new BufferedOutputStream(fileOutputStream);


            bufferedOutputStream.write(data.getBytes());
            bufferedOutputStream.flush();

            bufferedOutputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private static void copyFile(String pathFileA, String pathFileB){
        try {
            FileInputStream fileInputStream 	= new FileInputStream(pathFileA);
            FileOutputStream fileOutputStream	= new FileOutputStream(pathFileB);

            int i = 0;
            while((i = fileInputStream.read()) != -1){
                fileOutputStream.write((byte)i);
            }

            fileOutputStream.close();
            fileInputStream.close();



        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private static String readFile(){
        StringBuffer stringBuffer = new StringBuffer();
        try {
            FileInputStream fileInputStream = new FileInputStream(FILE_NAME);

            int i	= 0;
            while((i=fileInputStream.read())!=-1){
                stringBuffer.append((char)i);
            }

            fileInputStream.close();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return stringBuffer.toString();
    }

    private static void writeFile(String data){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(FILE_NAME, false);
            fileOutputStream.write(data.getBytes());
            fileOutputStream.close();
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
