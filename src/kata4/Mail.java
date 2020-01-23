package kata4;

public class Mail {

    private final String mail;

    public Mail(String line) {
        this.mail=line;
    }
    
    public String getDomain(){
        return this.mail.substring(this.mail.indexOf('@'));
    }
    static boolean isMail(String line) {
        return line.matches("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$");
    }
}
