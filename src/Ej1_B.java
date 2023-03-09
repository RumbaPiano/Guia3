public class Ej1_B {
    public static void main(String[] args) {
        int num[]=new int[3];
        num[0]=25;
        num[1]=7;
        num[2]=5;
        String orden="asc";
        int aux;
        for(int j=1;j<num.length;j++) {
            if (orden.equals("asc")) {
                for (int i = 0; i < num.length - 1; i++) {
                    if (num[i] > num[i + 1]) {
                        aux = num[i + 1];
                        num[i + 1] = num[i];
                        num[i] = aux;
                    }
                }
            } else if (orden.equals("desc")) {
                for (int i = 0; i < num.length - 1; i++) {
                    if (num[i] < num[i + 1]) {
                        aux = num[i + 1];
                        num[i + 1] = num[i];
                        num[i] = aux;
                    }
                }
            }
        }
        for(int i=0; i < num.length;i++) {
            System.out.println(num[i]);
        }

    }
}

