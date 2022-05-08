//Определить матрицу(Двумерный массив) и ее заполнить случайными значениями.
//Посторить вектор B, который возвращает-значение элемента матрицы,не равное заданному значению.
public class Main {
    public static void main(String args[]) {
        int n=5;
        int[][]array;
        array=new int[n][n];
        for (int i=0; i<array.length;i++){
            for(int j=0; j<array.length;j++){
                array[i][j]=(int)(Math.random()*10);
                System.out.print(array[i][j]+" ");
            }
           System.out.println(); 
        }
     int B=0;
     int x=4;
     for (int i=0; i<array.length;i++){
            for(int j=0; j<array.length;j++){
              if (array[i][j]!=x){
                 B=array[i][j];
                  System.out.print(B+ " ");
              }
            }
             System.out.println();
     }
    }
}