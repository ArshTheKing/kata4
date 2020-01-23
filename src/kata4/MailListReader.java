package kata4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MailListReader {

    public static List<Mail> read(String fileName){
        List<Mail> list = new ArrayList<>();
        try{
            BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)));
            Iterable<String> mails =new IteratorReader(reader);
            for (String line : mails) {
                if(Mail.isMail(line)) list.add(new Mail(line));
            }
            /*while (true){
                String line = reader.readLine();
                if(line==null) break;
                if(Mail.isMail(line)) list.add(new Mail(line));
            }*/
        } catch (FileNotFoundException ex) {
            System.out.println("ERROR MailListReader::read (FileNotFoundException " + ex.getMessage());
        } catch (IOException ex){
            System.out.println("ERROR MailListReader::read (IOExceptio" + ex.getMessage());
        }
        return list;
    }
}
