package blockchain;

import java.lang.reflect.Array;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import jdk.nashorn.internal.ir.Block;

public class bloque {

    public String shasear256(String base) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(base.getBytes("UTF-8"));
            StringBuffer hexString = new StringBuffer();

            for (int i = 0; i < hash.length; i++) {
                String hex = Integer.toHexString(0xff & hash[i]);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }

            return hexString.toString();
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public String hashear(String bloq, String id, String text, String phash) {

        Random rnd = new Random();
        int pow = 123;
        int numero = 0;
        String so = "";
        String hi = "";
        String kk = "000";
        String PreviousHash = "";

        do {
            hi = bloq + id + text + pow + phash;

            pow++;
            so = shasear256(hi);

            if (!so.startsWith("000")) {
                // System.out.println("--->"+so); 
                // System.out.println("minando--->"+pow); 
                pow++;
            } else {
                return "HASH: " + so;
            }
        } while (!so.startsWith("000"));
        return so;
    }

    public String idear(String a) {
        int num = Integer.parseInt(a);
        num = (int) (Math.random() * 1000) + 1;
        String nume = Integer.toString(num);

        return nume;

    }

    public String bloquizar(String a) {
        int b = Integer.parseInt(a);
        b++;
        String c = String.valueOf(b);
        return c;

    }

    public void listiar(String a) {
        ArrayList<String> cadena = new ArrayList<String>();
        
        cadena.add(a);
        
        System.out.println(cadena);
//        for (String item : cadena) {
//            System.out.println(item);
//            
//        }
//         Iterator it = cadena.iterator();
//         while (it.hasNext()) {
//             System.out.println(it.next());

    }
    
    
    
    public void Realizar(){
         
        Scanner teclado = new Scanner(System.in);
        bloque bloq = new bloque();
        String[] texto = new String[5];
       
        StringBuffer texc = new StringBuffer();
        String ce = "";
        String opc = " ";
        String id = "0";
        String hahsprev = "0000000000000000000000000000000000000";
        String nume = "";
        
        
        int num = 0;

        System.out.println(">/: ");
        opc = teclado.next();

        do {

            if (opc.equals("send")) {
                String bloque = bloq.bloquizar(id);
                String identi = bloq.idear(id);
                System.out.println("Bloque :" + bloque);
                System.out.println("ID bloque : " + identi);
                teclado.nextLine();
                for (int i = 0; i < texto.length; i++)
                {
                    System.out.println("Introduzca Texto " + i + " : ");
                    texto[i] = teclado.nextLine();
                    texc = texc.append(texto[i]);
                    bloq.listiar(texto[i]);
                 
                }

                String textc = texc.toString();
                
                String Cadena_Hasheada = bloq.hashear(bloque, identi, textc, hahsprev);
                String cadena = bloque + " " + identi + " " + " " + hahsprev + "" + Cadena_Hasheada;//cadena de datos guardada  
                System.out.println(Cadena_Hasheada);
                // System.out.println(cadena);
                
                
                ce = cadena;
                bloq.listiar(ce);
                

                opc = teclado.next();

            }

            num++;
            nume = Integer.toString(num);
            id = nume;
            
           // bloq.blok(bloq.listiar(ce));
            
        } while (!opc.equals("salir"));
        
        

    }
    }

