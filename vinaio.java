import java.util.Scanner;

public class Main
{
  public static void main (String[] args)
  {
    int scelta;
    double barbera = 1.5;
    int lugana = 2;
    int merlot = 1;
    double iva = 0.21;
    int bottiglione;
    double capacita = 1.5;
    float costolitro = 1;

    Scanner keyBoard = new Scanner (System.in);
      System.out.println ("Inserisci il numero di bottiglioni");
      bottiglione = keyBoard.nextInt ();
      System.out.println ("Hai acquistato " + bottiglione + "bottiglione/i");

      System.out.println
      ("Quale tipo di vino vuoi acquistare? 1 barbera, 2 lugana, 3 merlot");
      scelta = keyBoard.nextInt ();
    if (scelta == 1)
      {

	double litriAcquistati = bottiglione * capacita;
	  System.out.println ("Hai acquistato " + litriAcquistati + "litri");

	double prezzoTotale = barbera * litriAcquistati;
	  System.out.println ("Hai speso " + prezzoTotale + "$");

	double prezzoIva = prezzoTotale * iva;
	  System.out.println ("Prezzo di cui iva " + prezzoIva + "$");

	double prezzoTotaleConIva = prezzoTotale + prezzoIva;
	  System.out.println ("Prezzo totale con iva " + prezzoTotaleConIva +
			      "$");


      }
    else if (scelta == 2)
      {
	double litriAcquistati = bottiglione * capacita;
	System.out.println ("Hai acquistato " + litriAcquistati + "litri");

	double prezzoTotale = lugana * litriAcquistati;
	System.out.println ("Hai speso " + prezzoTotale + "$");

	double prezzoIva = prezzoTotale * iva;
	System.out.println ("Prezzo di cui iva " + prezzoIva + "$");

	double prezzoTotaleConIva = prezzoTotale + prezzoIva;
	System.out.println ("Prezzo totale con iva " + prezzoTotaleConIva +
			    "$");

      }
    else if (scelta == 3)
      {
	double litriAcquistati = bottiglione * capacita;
	System.out.println ("Hai acquistato " + litriAcquistati + "litri");

	double prezzoTotale = merlot * litriAcquistati;
	System.out.println ("Hai speso " + prezzoTotale + "$");

	double prezzoIva = prezzoTotale * iva;
	System.out.println ("Prezzo di cui iva " + prezzoIva + "$");

	double prezzoTotaleConIva = prezzoTotale + prezzoIva;
	System.out.println ("Prezzo totale con iva " + prezzoTotaleConIva +
			    "$");

      }
    else
      {
	System.out.println ("Scelta non valida");
      }

  }
}

