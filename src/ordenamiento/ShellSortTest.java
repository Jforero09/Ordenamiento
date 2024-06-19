package ordenamiento;

import java.util.Arrays;

public class ShellSortTest {

	 static void ordenarShell(int arreglo[]){
		    int arreglo_size = arreglo.length;
		    int brecha = (arreglo_size/2);
		    while(brecha > 0){
		      for(int recorrido=brecha; recorrido < arreglo_size ; recorrido++){
		        int buffer = arreglo[recorrido];
		        int indice = recorrido;
		        while(indice >= brecha && arreglo[indice-brecha] > buffer){
		          arreglo[indice] = arreglo[indice-brecha];
		          indice -= brecha;
		        }
		        arreglo[indice] = buffer;
		      }
		      brecha = brecha/2;
		    }
		  }

		  public static void main(String[] args) {
		    int datos[]= new int[]{8,5,3,9,1,4,7};
		    int datos2[]= new int[]{10,5,3,9,1,20,7};
		    int datos3[]= new int[]{10,5,3,9,1,20,7};
		    int datos4[]= new int[]{10,5,3,9,1,20,7};
		    int datos5[]= new int[]{10,5,3,9,1,20,7};
		    int datos6[]= new int[]{10,5,3,9,1,20,7};
		    int datos7[]= new int[]{10,5,3,9,1,20,7};
		    int datos8[]= new int[]{10,5,3,9,1,20,7};
		    int datos9[]= new int[]{10,5,3,9,1,20,7};
		    int datos10[]= new int[]{10,5,3,9,1,20,7};
		    int datos11[]= new int[]{10,5,3,9,1,20,7};
		    int datos12[]= new int[]{10,5,3,9,1,20,7};
		    int datos13[]= new int[]{10,5,3,9,1,20,7};
		    int datos14[]= new int[]{10,5,3,9,1,20,7};
		    int datos15[]= new int[]{10,5,3,9,1,20,7};
		    int datos16[]= new int[]{10,5,3,9,1,20,7};
		    int datos17[]= new int[]{10,5,3,9,1,20,7};
		    int datos18[]= new int[]{10,5,3,9,1,20,7};
		    int datos19[]= new int[]{10,5,3,9,1,20,7};
		    int datos20[]= new int[]{10,5,3,9,1,20,7};
		    int datos21[]= new int[]{10,5,3,9,1,20,7};
		    int datos22[]= new int[]{8,5,3,9,1,4,7};
		    int datos23[]= new int[]{10,5,3,9,1,20,7};
		    int datos24[]= new int[]{10,5,3,9,1,20,7};
		    int datos25[]= new int[]{10,5,3,9,1,20,7};
		    int datos26[]= new int[]{10,5,3,9,1,20,7};
		    int datos27[]= new int[]{10,5,3,9,1,20,7};
		    int datos28[]= new int[]{10,5,3,9,1,20,7};
		    int datos29[]= new int[]{10,5,3,9,1,20,7};
		    int datos30[]= new int[]{10,5,3,9,1,20,7};
		    int datos31[]= new int[]{10,5,3,9,1,20,7};
		    int datos32[]= new int[]{10,5,3,9,1,20,7};
		    int datos33[]= new int[]{10,5,3,9,1,20,7};
		    int datos34[]= new int[]{10,5,3,9,1,20,7};
		    int datos35[]= new int[]{10,5,3,9,1,20,7};
		    int datos36[]= new int[]{10,5,3,9,1,20,7};
		    int datos37[]= new int[]{10,5,3,9,1,20,7};
		    int datos38[]= new int[]{10,5,3,9,1,20,7};
		    int datos39[]= new int[]{10,5,3,9,1,20,7};
		    int datos40[]= new int[]{10,5,3,9,1,20,7};
		    int datos41[]= new int[]{10,5,3,9,1,20,7};
		    int datos42[]= new int[]{10,5,3,9,1,20,7};
		    int datos43[]= new int[]{10,5,3,9,1,20,7};
		    int datos44[]= new int[]{10,5,3,9,1,20,7};
		    int datos45[]= new int[]{10,5,3,9,1,20,7};
		    int datos46[]= new int[]{10,5,3,9,1,20,7};
		    int datos47[]= new int[]{10,5,3,9,1,20,7};
		    int datos48[]= new int[]{10,5,3,9,1,20,7};
		    int datos49[]= new int[]{10,5,3,9,1,20,7};
		    int datos50[]= new int[]{10,5,3,9,1,20,7};
		    int datos51[]= new int[]{8,5,3,9,1,4,7};
		    int datos52[]= new int[]{10,5,3,9,1,20,7};
		    int datos53[]= new int[]{10,5,3,9,1,20,7};
		    int datos54[]= new int[]{10,5,3,9,1,20,7};
		    int datos55[]= new int[]{10,5,3,9,1,20,7};
		    int datos56[]= new int[]{10,5,3,9,1,20,7};
		    int datos57[]= new int[]{10,5,3,9,1,20,7};
		    int datos58[]= new int[]{10,5,3,9,1,20,7};
		    int datos59[]= new int[]{10,5,3,9,1,20,7};
		    int datos60[]= new int[]{10,5,3,9,1,20,7};
		    int datos61[]= new int[]{10,5,3,9,1,20,7};
		    int datos62[]= new int[]{10,5,3,9,1,20,7};
		    int datos63[]= new int[]{10,5,3,9,1,20,7};
		    int datos64[]= new int[]{10,5,3,9,1,20,7};
		    int datos65[]= new int[]{10,5,3,9,1,20,7};
		    int datos66[]= new int[]{10,5,3,9,1,20,7};
		    int datos67[]= new int[]{10,5,3,9,1,20,7};
		    int datos68[]= new int[]{10,5,3,9,1,20,7};
		    int datos69[]= new int[]{10,5,3,9,1,20,7};
		    int datos70[]= new int[]{10,5,3,9,1,20,7};
		    int datos71[]= new int[]{10,5,3,9,1,20,7};
		    int datos72[]= new int[]{8,5,3,9,1,4,7};
		    int datos73[]= new int[]{10,5,3,9,1,20,7};
		    int datos74[]= new int[]{10,5,3,9,1,20,7};
		    int datos75[]= new int[]{10,5,3,9,1,20,7};
		    int datos76[]= new int[]{10,5,3,9,1,20,7};
		    int datos77[]= new int[]{10,5,3,9,1,20,7};
		    int datos78[]= new int[]{10,5,3,9,1,20,7};
		    int datos79[]= new int[]{10,5,3,9,1,20,7};
		    int datos80[]= new int[]{10,5,3,9,1,20,7};
		    int datos81[]= new int[]{10,5,3,9,1,20,7};
		    int datos82[]= new int[]{10,5,3,9,1,20,7};
		    int datos83[]= new int[]{10,5,3,9,1,20,7};
		    int datos84[]= new int[]{10,5,3,9,1,20,7};
		    int datos85[]= new int[]{10,5,3,9,1,20,7};
		    int datos86[]= new int[]{10,5,3,9,1,20,7};
		    int datos87[]= new int[]{10,5,3,9,1,20,7};
		    int datos88[]= new int[]{10,5,3,9,1,20,7};
		    int datos89[]= new int[]{10,5,3,9,1,20,7};
		    int datos90[]= new int[]{10,5,3,9,1,20,7};
		    int datos91[]= new int[]{10,5,3,9,1,20,7};
		    int datos92[]= new int[]{10,5,3,9,1,20,7};
		    int datos93[]= new int[]{10,5,3,9,1,20,7};
		    int datos94[]= new int[]{10,5,3,9,1,20,7};
		    int datos95[]= new int[]{10,5,3,9,1,20,7};
		    int datos96[]= new int[]{10,5,3,9,1,20,7};
		    int datos97[]= new int[]{10,5,3,9,1,20,7};
		    int datos98[]= new int[]{10,5,3,9,1,20,7};
		    int datos99[]= new int[]{10,5,3,9,1,20,7};
		    int datos100[]= new int[]{10,5,3,9,1,20,7};
		    
		    System.out.println("Arreglo original: "+Arrays.toString(datos)+Arrays.toString(datos2));
		ordenarShell(datos);
		ordenarShell(datos2);
		System.out.println("Arreglo ordenado: "+Arrays.toString(datos)+Arrays.toString(datos2));
		     
		  }  
	
	
	
	
	
	
	
	
}
