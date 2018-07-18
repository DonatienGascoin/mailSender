package mail.sender.tools.enums;

public enum Error_Code {

    GMAIL_SERVICE_UNAVAILABLE("Impossible to reach gmail service");

    String label;

    Error_Code(String label){
        this.label = label;
    }

    public String getLabel(){
        return label;
    }
}
