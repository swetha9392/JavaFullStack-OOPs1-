import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class CsavReader {
    public static void main(String[] args) {
        String filepath="student.csv";
        try(BufferedReader reader=new BufferedReader(new FileReader(filepath))){
            String line;
            reader.readLine();
            while( (line=reader.readLine())!=null){
                String[] data=line.split(",");
               /*  System.out.println("ID:"+data[0]);
                 System.out.println("Name:"+data[1]);
                  System.out.println("Major:"+data[2]);
                   System.out.println();
               // System.out.println(line);*/
               System.out.printf("%-10s%-10s%-10s%n",data[0],data[1],data[2]);
            }

        }
        catch(IOException e){
            System.out.println("Error reading file : "+e.getMessage());
        }
        
        }
    }

