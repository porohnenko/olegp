/**
 *
 * @author Oleg
 */
package com;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import java.nio.file.*;
import java.io.*;


@WebService(serviceName = "FileUpload")
public class FileUpload {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getFile")
    public byte[] getFile() {
        byte[] buf = null;
        java.awt.FileDialog fd = null;
        java.awt.Dialog di = null;
        try {
            String s1 = "d:/Study/Git/olegp/Tehnologies of component programming/test.txt";
            Path path = Paths.get(s1);
            buf = Files.readAllBytes(path);
        } catch (Exception ex) {
        }
        return buf;
    }
}
