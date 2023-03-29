import java.util.Random;
class Main {
  public static void main(String[] args) {
     Random r = new Random();
    int[][] tab= new int[10][10];
    int[] tab1=new int[10];
    int[] tab2=new int[10];
    
     for(int i=0;i<10;i++)
        {
           for(int j=0;j<10;j++){
           tab[i][j]=r.nextInt(100)-49;
          tab1[i]+=tab[i][j];
           }
           
        }
    for(int i=0;i<10;i++){
      for(int j=0;j<10;j++){
        System.out.print(tab[i][j]+"\t");
        
        tab2[i]+=tab[j][i];
      }
      System.out.println();
      
    }
    for(int i=0;i<10;i++){
       System.out.println("Suma = " + i +  "\n wiersz =" + tab1[i]);
       System.out.println();
      
    }
     for(int i=0;i<10;i++){
       System.out.println("Suma = " + i + "\n kolumna =" + tab2[i]);
        System.out.println();
     }
    
    
    
  }
}