/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


package uschedule;
import java.awt.Desktop;
import java.io.IOException;
import javax.swing.JFrame;
/**
 *
 * @author Claudio
 */
public class USchedule {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Menu start = new Menu();
        start.setTitle("uSchedule");
        start.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        start.setVisible(true);
        String url = "https://accounts.google.com/o/oauth2/auth?scope=https%3A%2F%2Fwww.googleapis.com%2Fauth%2Fcalendar&redirect_uri=urn:ietf:wg:oauth:2.0:oob&response_type=code&client_id=73846723473.apps.googleusercontent.com";
        java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));

    }
}
