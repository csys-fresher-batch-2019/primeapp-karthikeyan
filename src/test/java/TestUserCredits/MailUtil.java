package TestUserCredits;

import java.io.IOException;

import com.sendgrid.Method;
import com.sendgrid.Request;
import com.sendgrid.Response;
import com.sendgrid.SendGrid;
import com.sendgrid.helpers.mail.Mail;
import com.sendgrid.helpers.mail.objects.Content;
import com.sendgrid.helpers.mail.objects.Email;
 
public class MailUtil {
 
    static String apiKey = "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";
    public static void main(Email from,String subject,Email to,String bodyContent) {
    	 
            Content content = new Content("text/plain", bodyContent);
            Mail mail = new Mail(from,subject,to,content);
 
            SendGrid sg = new SendGrid(apiKey);
            Request request = new Request();
            try {
              request.setMethod(Method.POST);
              request.setEndpoint("mail/send");
              request.setBody(mail.build());
              Response response = sg.api(request);
              System.out.println(response.getStatusCode());
              System.out.println(response.getBody());
              System.out.println(response.getHeaders());
            } catch (IOException ex) {
              System.out.println(ex);
            }
          }
	
 
    }