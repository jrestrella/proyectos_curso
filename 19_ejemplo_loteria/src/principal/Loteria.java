package principal;

public class Loteria {

	public static void main(String[] args) {
        int [] numeros=new int[6];
        int generados=0;
        //comentario de la version 2
        //generamos numeros aleatorios hasta conseguir 6 diferentes
        while(generados<6){
            int n=(int)(Math.random()*49+1);
            if(!existe(n,generados,numeros)){
                numeros[generados]=n;
                generados++;
            }
        }
        ordenar(numeros);
        mostrar(numeros);
    }
    public static boolean existe(int n, int total, int[] actual){
    	//comentario version 3
    	//comprueba si el numero ya esta en el array
    	
        boolean res=false;
        for(int i=0;i<total;i++){
            if(n==actual[i]){
                res=true;
                break;
            }
        }
        return res;
    }
    public static void ordenar(int[] datos) {
        int aux;
        for(int i=0;i<datos.length;i++){
            for(int k=i+1;k<datos.length;k++){
                if(datos[k]<datos[i]){
                    //intercambio
                    aux=datos[i];
                    datos[i]=datos[k];
                    datos[k]=aux;
                }
            }
        }
    }
    public static void mostrar(int[] datos){
        for(int n:datos){
            System.out.println(n);
        }
    }

}
