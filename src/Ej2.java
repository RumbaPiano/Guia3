public class Ej2 {
    public static void main(String[] args){
        String str1="hola zack";
        String abcd="abcdefghijklmnopqrstuvwxyz ";
        char letras[]=new char[str1.length()];
        int desp=10;
        int aux;
        //Codificación
        for(int i=0;i<str1.length();i++){
            for(int j=0;j<abcd.length();j++){
                if((str1.charAt(i)==abcd.charAt(j))&&(j+desp<abcd.length())){
                    letras[i]=abcd.charAt(j+desp);
                    j=abcd.length();
                }else if((str1.charAt(i)==abcd.charAt(j))&&(j+desp>=abcd.length())){
                    aux=j+desp-abcd.length();
                    letras[i]=abcd.charAt(aux);
                    j=abcd.length();
                }
            }
        }
        String str2=String.valueOf(letras);
        System.out.println(str2);
        //Decodificación
        for(int i=0;i<str2.length();i++){
            for(int j=abcd.length()-1;j>=0;j--){
                if((str2.charAt(i)==abcd.charAt(j))&&(j-desp>=0)){
                    letras[i]=abcd.charAt(j-desp);
                    j=-1;
                }else if((str2.charAt(i)==abcd.charAt(j))&&(j-desp<0)){
                    aux=j-desp+abcd.length();
                    letras[i]=abcd.charAt(aux);
                    j=-1;
                }
            }
        }
        String str3=String.valueOf(letras);
        System.out.println(str3);
        //System.out.println(str1.equals(str3));//Verifico que se decodifico correctamente
    }
}
