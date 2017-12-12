package OOP_Lab3;

public class TestWhilelLoop {
    public static void main(String[] args) {
// while
      int i = 1;
      while (i<=10){
          System.out.print(i+ " ");
          i++;
      }//while

 // while
        int n = 1;
        while (n<=50){
            System.out.print(n+" ");
            if (n%10==0)
                System.out.print("Hello");
            n++;
        }//while

 //     do-while
        System.out.print(" \n ");
        int j=1;
        do {
            System.out.print(j + "  ");
            j++;
        }while (j<=10);


  //     do-while
        System.out.print(" \n ");
        int a=1;
        do {
            System.out.print(a + "  ");
            if (a%2 !=0)
                System.out.print("Hello");
            a++;
        }while (a<=10);





    }//main


}//class
