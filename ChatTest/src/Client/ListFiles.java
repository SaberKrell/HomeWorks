package Client;

import javax.imageio.IIOException;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class  ListFiles{


    static File dir = new File("C:\\Новая папка\\data");
    static File path = new File("C:\\Новая папка");
    //создание файла если его нет
    public static void createFile(){
        try {
            if (dir.exists() == false){
                dir.createNewFile();
                System.out.println("Создайем файл");
            } else {
                System.out.println("Файл уже есть");
            }
        } catch (IOException e) {

            System.out.println(e);
        }
    }
    public static void isFileExist(){
        if ( dir.exists() ){
            String[] files = path.list();
            System.out.println(files.length + "Файлов найдено...");
            for (int i = 0; i < files.length; i++) {
                System.out.println(files[i]);
            }
        } else {
            System.out.println("Каталог не найден");
        }
    }
    public static String readFromFile(){
        try {
            FileReader file = new FileReader("C:\\Новая папка\\data");
            BufferedReader buffer = new BufferedReader( file );
            String line = "";
            while ((line = buffer.readLine())!= null){
                return String.valueOf(file);
            }
            buffer.close();
        } catch ( IIOException e){
            System.out.println(e);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
    public static void streamRead(){
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(isr);
        String input = "";
        try{
            input = buffer.readLine();
            buffer.close();
        } catch (IIOException e){
            System.out.println(e);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void fileSave(String input){
        try {
            LocalDateTime date = LocalDateTime.now();
            String hour = String.valueOf(date.getHour());
            String minutes = String.valueOf(date.getMinute());
            DateTimeFormatter tf = DateTimeFormatter.ofPattern("h:m a");
            FileWriter write = new FileWriter("C:\\Новая папка\\data",true);
            BufferedWriter buff = new BufferedWriter(write);
            buff.append(input + date.format(tf));
            buff.newLine();
            buff.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}