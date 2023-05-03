package Email;

import java.util.Date;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Letty Morales
 */
public class PropiedadesCorreo {
    
 public static void enviarConGMail(String destinatario, String asunto, String cuerpo,final String usuario, final String clave) {
    // Esto es lo que va delante de @gmail.com en tu cuenta de correo. Es el remitente también.
    

    Properties props = System.getProperties();
    props.put("mail.smtp.host", "smtp.gmail.com");  //El servidor SMTP de Google
    props.put("mail.smtp.user", usuario);
    props.put("mail.smtp.clave",clave);    //La clave de la cuenta
    props.put("mail.smtp.auth", "true");    //Usar autenticación mediante usuario y clave
    props.put("mail.smtp.starttls.enable", "true"); //Para conectar de manera segura al servidor SMTP
    props.put("mail.smtp.port", "587"); //El puerto SMTP seguro de Google

    Session session = Session.getDefaultInstance(props);
    MimeMessage message = new MimeMessage(session);

    try {
        message.setFrom(new InternetAddress(usuario));
        InternetAddress[] direcciones = {new InternetAddress(destinatario)};
        message.setRecipients(Message.RecipientType.TO, direcciones);   //Se podrían añadir varios de la misma manera
        message.setSubject(asunto);
        message.setText(cuerpo);
        Transport transport = session.getTransport("smtp");
        transport.connect("smtp.gmail.com", usuario, clave);
        transport.sendMessage(message, message.getAllRecipients());
        transport.close();
    }
    catch (MessagingException me) {
        me.printStackTrace();   //Si se produce un error
    }
}
    
}