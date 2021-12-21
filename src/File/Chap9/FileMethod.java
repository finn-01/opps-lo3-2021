package File.Chap9;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileMethod {
    private static final String FILE_NAME	= "D:\\HocTap\\java\\l03-opps\\src\\File\\Chap9\\file-method.txt";


    public static void main(String[] args) {
        File fileObj	= new File(FILE_NAME);

        if(fileObj.exists()){
            myPrint("getAbsolutePath: " + fileObj.getAbsolutePath());
            //fileObj.getAbsolutePath();
            myPrint("getParent: " + fileObj.getParent());
            myPrint("canRead: " + fileObj.canRead());
            myPrint("canWrite: " + fileObj.canWrite());
            myPrint("length: " + fileObj.length());

            Date dateObj	= new Date(fileObj.lastModified());
            myPrint("lastModified: " + dateObj);

            myPrint("isDirectory: " + fileObj.isDirectory());
            myPrint("isFile: " + fileObj.isFile());

            if(fileObj.delete()) myPrint("Delete Successfull");

            myPrint("-------------------------------");
            File[] listFiles	= fileObj.listFiles();
            myPrint(listFiles.length + "");
            for(int i = 0; i < listFiles.length; i++){
                File fileTmp	= listFiles[i];

                if(fileTmp.isDirectory()){
                    myPrint("Folder: " + fileTmp.getName());
                }else if(fileTmp.isFile()){
                    myPrint("File: " + fileTmp.getName());
                }
            }

        }else{
            try {
                fileObj.createNewFile();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    private static void myPrint(String content){
        System.out.println(content);
    }
}
