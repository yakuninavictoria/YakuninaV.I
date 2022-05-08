//Дан массив b(n).Переписать в массив c(n) отрицательные элементы массива b(n).(со сжатием.,без пустых элементов внутри)
//Затем упорядочить методом <<выбора и перестановки>> по возрастанию новый массив.
public class main {
    public static void main(String args[]) {
      int [] b = {1,2,-5,-8,-3,4};
      int[] c;
      int n=0;
      for (int a:b){
          if (a<0){
              n++;
          }
      }
      c= new int [n];
      n=0;
     for (int a:b){
          if (a<0){
              c[n]=a;
              n++;
          }
      }
      for (int i=0;i<c.length-1;i++){
          for (int j=i+1;j<c.length;j++){
              if (c[i]>c[j]){
                  int t=c[i];
                  c[i]=c[j];
                  c[j]=t;
              }
          }
      }
     for (int a:c){
         System.out.println(a);
     }
 }
}