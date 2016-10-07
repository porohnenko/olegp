/**
 *
 * @author Oleg
 */
package webserviceclient;

import com.FileUpload;
import com.FileUpload_Service;

public class WebServiceClient {

    public static void main(String[] args) {
        FileUpload_Service service
                = new FileUpload_Service();
        System.out.println(service.getFileUploadPort().hello("OLEG GERMAN"));
        try {
            byte[] fromserv
                    = service.getFileUploadPort().getFile();
            if ((fromserv == null) || (fromserv.length <= 0)) {
                System.out.println("File was not sent");
            } else {
                String str = new String(fromserv);
                System.out.println(str);
            }
        } catch (Exception ex) {
            System.out.println("Cannot get file from service:" + ex.getMessage());
        }
    }

}
