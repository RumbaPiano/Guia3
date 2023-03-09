public class Ej1_C {
    public static void main(String[] args) {
        int numeros[] = {14,28,33,45,2,5,8,20};
        int sumatoria=0;
        int X=15;
        for(int i = 0;i < numeros.length;i++){
            if(numeros[i]>=X){
                sumatoria=sumatoria+numeros[i];
            }
            //System.out.println(sumatoria);
        }
        System.out.println(sumatoria);
    }
}
