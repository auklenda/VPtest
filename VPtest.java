/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vptest;

import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author AlfAuklend
 */
public class VPtest {
  
    public static void testpath(String fullpath){
       //String fullpath = "/rest";
       //ArrayList al = tokenize(fullpath,"/");
        ArrayList al = new ArrayList();
	int i0 = 0;
        for ( StringTokenizer st = new StringTokenizer(fullpath,"/"); st.hasMoreTokens();) {
            al.add(i0++,(String)st.nextToken()); 
        }       
       int ln = al.size();
       String lastPath=null;
       if ((ln > 0)){
          lastPath = (String)al.get(ln-1);
       }
       if ((lastPath != null) && lastPath.equals("rest"))
           System.out.println(fullpath + " with lastpath " + lastPath + " will invoke the BP");
       else 
           System.out.println(fullpath + " with lastpath " + lastPath + " will *NOT*invoke the BP");
   }
    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        VPtest.testpath(args[0]);
    }
    
}
