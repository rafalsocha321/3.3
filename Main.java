import java.util.Random;
class Main {
  public static void main(String[] args) {

    Random random = new Random();
    int b=random.nextInt(100)-50;
 

    int[][] tablica= new int[10][10];

    for(int i=0; i<10; i++){
      for(int a=0; a<10; a++){
      tablica[a][i] = random.nextInt(100)-50;
    }
    }

    for(int i=0; i<10; i++){
      for(int a=0; a<10; a++){
      System.out.print(tablica[a][i] + " ");
        
    }
      System.out.println("");
    }
    
  }
}