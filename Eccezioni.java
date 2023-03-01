package marzo;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Eccezioni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner x = new Scanner(System.in);
		Scanner y = new Scanner(System.in);

		//le eccezioni sono degli oggetti che descrive una situazione anomala o un errore
		
		//TRY e CATCH
		//nel TRY vine scritto il codice in modo normalmente
		//CATCH: se risulta esserci un errore, il blocco catch lo "prende" e non fà terminare il programma, possono esserci più di 1 CATCH
		//nel CATCH ci devono essere tutte le possibilità di errore che potrebbero avvenire nel TRY
		//FINALLY: 	se nel TRY non ci sono errori allora verranno eseguite le instruzioni dentro al FINALLY
		
		//variabile string per la riesecuzione dell'esercizio
		try{
			
			String ripeti = null;
					
			//ciclo do while dell'esercizio intero
			do {
				
				System.out.print("quale esercizio vuoi fare? ");
				try {
					
					switch(x.nextInt()) {
					
						//posizione array inesistente
						case 1:
							
							int vett[] = null;
							try {
								vett[0] = 3;
							//in questo caso ArrayIndexOutOfBoundsException indica l'inserimento in una locazione dell'array non esistente
							}catch(NullPointerException e) {
								
								System.out.println("posizione non esistente, " + e.getMessage());
							}finally {
								
								//chiedo all'utente se vuole rieseguire l'esercizio
								System.out.print("vuoi rifare? ");
								ripeti = y.nextLine();
							}
							break;
						
						//lunghezza di una stringa a null
						case 2:
							
							try {
								String s=null;
								int l = s.length();
							}catch(NullPointerException e) {
								
								System.out.println("la stringa non ha lunghezza, " + e.getMessage());
							}finally {
								
								//chiedo all'utente se vuole rieseguire l'esercizio
								System.out.print("vuoi rifare? ");
								ripeti = y.nextLine();					
							}
							break;
						
						//divisione con 0 o inserimento di una lettera la posto di un int
						case 3:
							
							try {
								System.out.print("inserisci il dividendo, deve essere un numero da 0 a 3: ");
								int num1 = x.nextInt();
								int num2 = (int) (Math.random()*3);
								System.out.println("risultato: " + num1/num2);
								
							}catch(ArithmeticException e) {
								
								System.out.println("divisione per 0 non possibile, " + e.getMessage());
							}catch(InputMismatchException f) {
								
								System.out.println("hai inserito un valore non numerico interno, " + f.getMessage());
							}finally {
								
								//chiedo all'utente se vuole rieseguire l'esercizio
								System.out.print("vuoi rifare? ");
								ripeti = y.nextLine();
							}
							
							break;
						
						//posizione array ineistente
						case 4:
							
							try {
								int array[] = new int[5];
								System.out.println("array con 5 locazioni");
								System.out.print("a quale posizione vuoi inserire il numero? ");
								int pos = x.nextInt();
								System.out.print("inserisci il numero: ");
								int num = x.nextInt();
								
								array[pos] = num;
								
							}catch(ArrayIndexOutOfBoundsException e) {
								
								System.out.println("posizione non esistente, " + e.getMessage());
							}catch(InputMismatchException f) {
								
								System.out.println("hai inserito un valore non numerico interno, " + f.getMessage());
							}finally {
								
								//chiedo all'utente se vuole rieseguire l'esercizio
								System.out.print("vuoi rifare? ");
								ripeti = y.nextLine();
							}	
					}
				}catch(InputMismatchException e){
					
					System.out.println("hai inserito un valore non numerico interno, " + e.getMessage());
					System.out.print("reinserisci: ");
					ripeti = y.nextLine();
				}
			}while(ripeti.equals("si"));
			
		}catch(NullPointerException e) {
			
			System.out.println("programma terminato, " + e.getMessage());
		}
	}
}
