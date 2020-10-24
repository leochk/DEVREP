package generator.website;

import java.util.Iterator;
import org.eclipse.emf.common.util.EList;
import turtle.*;

public class SimpleToHTML
{
  protected static String nl;
  public static synchronized SimpleToHTML create(String lineSeparator)
  {
    nl = lineSeparator;
    SimpleToHTML result = new SimpleToHTML();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = " ";
  protected final String TEXT_2 = NL + "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">" + NL + "<html>" + NL + "<head><title> Stage Description </title>" + NL + "" + NL + "<meta name=\"language\" content=\"en\">" + NL + "<meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\">" + NL + "" + NL + "</head>" + NL + "<body>" + NL + "<h1> List of Stage's Choreographies</h2>";
  protected final String TEXT_3 = NL + "\t\t  ";
  protected final String TEXT_4 = NL + "     \t\t\t<element>Action Num ";
  protected final String TEXT_5 = " : ";
  protected final String TEXT_6 = "</element>";
  protected final String TEXT_7 = NL + "</body>" + NL + "</html>";
  protected final String TEXT_8 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
     Stage stage = (Stage) argument; 
    stringBuffer.append(TEXT_2);
    EList<Choreography> listChoreography = stage.getChoreographies();
     for (Iterator i = listChoreography.iterator(); i.hasNext(); ) { 
    stringBuffer.append(TEXT_3);
    int cpt = 0; 
     for (Iterator j = ((Choreography) i.next()).getActions().iterator(); j.hasNext(); ) { 
     Action a = (Action) j.next(); cpt++;
    stringBuffer.append(TEXT_4);
    stringBuffer.append(cpt);
    stringBuffer.append(TEXT_5);
    stringBuffer.append(a.getClass().getSimpleName());
    stringBuffer.append(TEXT_6);
     } 
     } 
    stringBuffer.append(TEXT_7);
    stringBuffer.append(TEXT_8);
    return stringBuffer.toString();
  }
}
