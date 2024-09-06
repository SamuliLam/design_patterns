package singleton;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Logger {
    private static Logger instance;
    private PrintWriter writer;
    private String fileName;

    private Logger(){
        this.fileName = "log.txt";
        try{
            this.writer = new PrintWriter(fileName);
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

    public static Logger getInstance(){
        if(Logger.instance == null){
            instance = new Logger();
        }
        return instance;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
        if (this.writer != null){
            this.writer.close();
        }
        try{
            this.writer = new PrintWriter(fileName);
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

    public void write(String log){
        this.writer.println(log);
    }

    public void close(){
        this.writer.close();
    }

}
