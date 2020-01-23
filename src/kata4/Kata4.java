package kata4;

import java.util.List;

public class Kata4{

    public static void main(String[] args) {
        String fileName = new String("email.txt");
        List<Mail> mailList = MailListReader.read(fileName);
        Histogram histogram = MailHistogramBuilder.build(mailList);
        HistogramDisplay histogramDisplay = new HistogramDisplay(histogram, "Emails", "Algo", "algo2");
        histogramDisplay.execute();
    }
    
}
