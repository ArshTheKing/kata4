package kata4;

import java.util.List;

public class MailHistogramBuilder {

    static Histogram build(List<Mail> mailList) {
        Histogram res = new Histogram();
        for (Mail mail : mailList) {
            res.increment(mail.getDomain());
        }
        return res;
    }
    
}
