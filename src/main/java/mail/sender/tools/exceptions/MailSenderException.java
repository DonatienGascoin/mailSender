package mail.sender.tools.exceptions;

import mail.sender.tools.enums.Error_Code;


public class MailSenderException extends Exception {

    private Error_Code code;

    public MailSenderException(Error_Code e){
        this.code = e;
    }

    public Error_Code getCode(){
        return code;
    }


}
