import java.util.Random;
public class javoscripto {
	public static void main(String[] args) {
		   int v[][] = new int [3][3];
		       int i, j;
		       int maior=0;
		       int menor=0;
		       Random in = new Random();
		           for (i=0; i<3; i++){
		              for (j=0; j<3; j++) {
		               v[i][j] = in.nextInt()%50;
		              }
		           }
		       for (i=0; i<3; i++){
		           System.out.println();
		           for (j=0; j<3; j++){
		               System.out.print("[ "+v[i][j]+" ]");
		               if (v[i][j]>maior) {
		            	   maior = v[i][j];
		           }
		              if (v[i][j]<menor)
		            	  menor = v[i][j];
	      
		       }
		           
		   }  
		      System.out.println(" ");
		      System.out.println(" ");
		      System.out.println("o numero maior é: " +maior);
		      System.out.println("o numero menor é: " +menor);
		}
}
