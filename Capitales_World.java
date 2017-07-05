import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
// L'Import des class, pour que les objets fonctionnent

public class Capitales_World
{
	
	public static void main (String[]args)
	{
		playAgain();
		methode2();
	}

	static void playAgain(){
		
		Scanner clavier = new Scanner(System.in);
		
		String[][]MTab = new String[11][11];
		//D�claration d'un tableau statique multidimentionnel 
		MTab[0][0]="France";
		MTab[0][1]="Allemagne";
		MTab[0][2]="Guin�e";
		MTab[0][3]="S�n�gal";
		MTab[0][4]="Congo";
		MTab[0][5]="Br�sil";
		MTab[0][6]="Turquie";
		MTab[0][7]="Maroc";
		MTab[0][8]="Djibouti";
		MTab[0][9]="Japon";	
		MTab[0][10]="Angleterre";
		MTab[1][0]="Paris";
		MTab[1][1]="Berlin";
		MTab[1][2]="Conakry";
		MTab[1][3]="Dakar";
		MTab[1][4]="Brazzaville";
		MTab[1][5]="Brasilia";
		MTab[1][6]="Ankara";
		MTab[1][7]="Rabat";
		MTab[1][8]="Djibouti";
		MTab[1][9]="Tokyo";
		MTab[1][10]="Londres";

		ArrayList<Integer> Stock = new ArrayList<>();
		// D�claration d'un tablau dynamique qui stockera les indices
		
		int indice, score=0, nbrDeQuestions=0;
			
		for(int i = 0; i < MTab.length; i++)
		{			
			do 
			{
				Random random = new Random();
				indice = random.nextInt(MTab.length); // Mettre dans indice un nombre al�atoire allant de 0 jusqu'a la longeur de la chaine
			}
			while(Stock.contains(indice)); // Tant qu'il y a dans Stock l'indice g�n�r� al�atoirement, on g�nere un autre indice, et quand le nouvel indice gn�r� n'est pas dans Stock on continue
			
			Stock.add(indice); // S'il n'y a pas dans Stock l'indice g�n�r� al�atoirement, il sera stocker dans Stock
			System.out.println("Quel est la capitale de ce pays : " + MTab[0][indice] + " ?"); //et on affiche cela
			nbrDeQuestions++; //et on incr�mete nbdDeQuestion de 1
	
			String reponse=clavier.nextLine(); // on enregistre ce que l'utilisateur a entr� dans une chaine nomm� reponse
			
			if (reponse.equalsIgnoreCase(MTab[1][indice])) // Si la chaine reponse est �gale a la chaine contenu dans MTab[1][indice]
			{
				System.out.println("Bonne r�ponse ! ");
				score++;
			}
			else
			{
				System.out.println("Mauvaise r�ponse, il fallait r�pondre : " + MTab[1][indice]);
			}
		}
		
		System.out.println("C'est termin� Votre score est : <<" + score + "/" + nbrDeQuestions +">>");
		
		clavier.close();
		
	}
		
	static void methode2()
	{
		Scanner clavier = new Scanner(System.in);
		System.out.println("La partie est termin� voulez-vous recommencer ? ");
		System.out.print("o/n : ");
		
		String yesNo=clavier.nextLine();
		
		if(yesNo.equalsIgnoreCase("oui"))
		{
			playAgain();
		}
		else if (yesNo.equalsIgnoreCase("non"))
		{
			System.out.println("JEUX TERMINE A BIENTOT :-)");
		}
		else
		{
			methode2();
		}
		
		clavier.close();
	}
	
	
	
}