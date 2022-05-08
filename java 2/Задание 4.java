//Дан двумерный массив A,размером(nxn)(или квадратная матрица).Найти среднее арифметическое положительных элементов параллели главной диагонали,расположенной выше над диагональю.
public class Main {
    public static void main(String args[]) {
        int n=4;
        int[][]array;
        array=new int[n][n];
        for (int i=0; i<n;i++){
            for(int j=0; j<n;j++){
                array[i][j]=(int)(Math.random()*21-10);
                System.out.print(array[i][j]+" ");
            }
           System.out.println(); 
        }
        int c=0;
           for (int i=0; i<n-1;i++){
            for(int j=i+1; j<n;j++){
             if (array[i][j]>=0){
                c++;
             }
            }
           }
            int t=0;
            for (int i=0; i<n-1;i++){
            for(int j=i+1; j<n;j++){
             if (array[i][j]>=0){
              t=t+array[i][j];
             }
            }
        }
        System.out.println(t/c);
    }
}