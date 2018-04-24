package floydovalgoritmus;

import java.util.Scanner;

/**
 *
 * @author Fidek
 */
public class FloydovAlgoritmus {
    private int[][] maticaVzdialenosti;
    private int[][] maticaCesty;
    private int pocetVrcholov;
    private Scanner skener;
    private Scanner skener2;

    public FloydovAlgoritmus() {
        this.pocetVrcholov = pocetVrcholov;
        skener = new Scanner(System.in);
        skener2 = new Scanner(System.in);
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FloydovAlgoritmus floyd = new FloydovAlgoritmus();
        floyd.zisteniePocturcholov();
        floyd.naplnMaticu();
        floyd.vypisPredAlgoritmom();
        floyd.algoritmus();
        floyd.vypisPoAlgoritme();
    }

    public void zisteniePocturcholov() {
        System.out.println("Zadajte pocet vrcholov :");
        pocetVrcholov = skener.nextInt();
    }

    public void naplnMaticu() {
        maticaVzdialenosti = new int[pocetVrcholov][pocetVrcholov];
        maticaCesty = new int[pocetVrcholov][pocetVrcholov];

        System.out.println("Zadajte maticu vzdialenosti");
        for (int i = 0; i < maticaVzdialenosti.length; i++) {
            System.out.println("Zadajte " + (i+1) + " riadok matice");
            for (int j = 0; j < maticaVzdialenosti[i].length; j++) {
                maticaVzdialenosti[i][j] = skener.nextInt();
            }
        }
        System.out.println("Zadajte maticu cesty");
        for (int i = 0; i < maticaCesty.length; i++) {
            System.out.println("Zadajte " + (i+1) + " riadok matice");
            for (int j = 0; j < maticaCesty[i].length; j++) {
                maticaCesty[i][j] = skener2.nextInt();
            }
        }
    }
    public void vypisPredAlgoritmom() {
        System.out.println();
        System.out.println("ZADANIE :");
        System.out.println("...........................");
        System.out.println("Matica vzdialenosti pred algoritme: ");
        for (int i = 0; i < maticaVzdialenosti.length; i++) {
            for (int j = 0; j < maticaVzdialenosti.length; j++) {
                System.out.print(" " + maticaVzdialenosti[i][j]);
            }
            System.out.println();
        }
        System.out.println("............................");
        System.out.println("Matica ciest pred algoritme: ");
        for (int i = 0; i < maticaCesty.length; i++) {
            for (int j = 0; j < maticaCesty.length; j++) {
                System.out.print(" " + maticaCesty[i][j]);
            }
            System.out.println();
        }
    }

    public void algoritmus() {
        for (int k = 0; k < maticaVzdialenosti.length; k++) {
            for (int i = 0; i < maticaVzdialenosti.length; i++) {
                for (int j = 0; j < maticaVzdialenosti.length; j++) {
                    if (maticaVzdialenosti[i][j] > maticaVzdialenosti[i][k] + maticaVzdialenosti[k][j]) {
                        maticaVzdialenosti[i][j] = maticaVzdialenosti[i][k] + maticaVzdialenosti[k][j];
                        maticaCesty[i][j] = maticaCesty[k][j];
                    }
                }
            }
        }
    }

    public void vypisPoAlgoritme() {
        System.out.println();
        System.out.println("VYSLEDOK :");
        System.out.println("...........................");
        System.out.println("Matica vzdialenosti po algoritme: ");
        for (int i = 0; i < maticaVzdialenosti.length; i++) {
            for (int j = 0; j < maticaVzdialenosti.length; j++) {
                System.out.print(" " + maticaVzdialenosti[i][j]);
            }
            System.out.println();
        }
        System.out.println("............................");
        System.out.println("Matica ciest po algoritme: ");
        for (int i = 0; i < maticaCesty.length; i++) {
            for (int j = 0; j < maticaCesty.length; j++) {
                System.out.print(" " + maticaCesty[i][j]);
            }
            System.out.println();
        }
    }
}
