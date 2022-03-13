package constraint;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.IOException;
import java.util.Properties;

public class MassageConstraint {

  public MassageConstraint() {
    Properties properties = new Properties();

    String strpass = "/workspaces/javaSE8_x86/dosh/src/main/java/dosh.properties";

    try {
      InputStream iStream = new FileInputStream(strpass);
      properties.load(iStream);
    } catch(IOException e) {
      e.printStackTrace();
    }
  }  
}
