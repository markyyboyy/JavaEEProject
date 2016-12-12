/**
 * @author Mark Freeman
 * This class was used for testing, just to see if I could get a bean working with XHTML. It has no role in the final system.
 */
package Controllers;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "helloWorld", eager = true)
public class HelloWorld {
   public HelloWorld() {
      System.out.println("HelloWorld started!");
   }
	
   public String getMessage() {
      return "Hello World!";
   }
}