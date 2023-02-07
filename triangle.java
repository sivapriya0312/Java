class Triangle {

  public static void main(String[] args) {

    int row=5;

    for(int i=1;i<=row;i++){

    for(int j=row;j>i;j--){

        System.out.print(" ");

        }

        for(int k=1;k<=i;k++){

        if((i==4 && k==2) || (i==4 && k==3)){

             System.out.print("  ");

            }

            else if(i==3 && k==2){

            System.out.print("  ");

            }

            else{

         System.out.print(k+" ");

         }

        }

        System.out.println();

    }

    

  }

}