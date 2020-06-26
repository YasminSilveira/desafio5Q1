
 */*/
package desafio5q1;

/**
 *
 * @author yasmi
 */
public class Desafio5Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
     int chico, ze, ano;
        int chico = 150;
        ze = 110;
        ano = 0;

        while (chico >= ze) {
            chico = chico + 2;
            ze = ze + 3;
            ano++;
             System.out.println("Chico:"+chico+" Zé:"+ze +"Ano: "+ano);
        }
        System.out.println("Int - Zé levou " + ano + " anos para ser maior que chico");
     double c, z, a;
        c = 1.50;
        z = 1.10;
        a = 0;
         while (c > z) {
            c = c + 0.02;
            z = z + 0.03;
            a++;
             System.out.println("Chico:"+c+" Zé:"+z +"Ano: "+a);
        }
        System.out.println("Double - Zé levou " + a + " anos para ser maior que chico");
    }


}
