package org.example;// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
int row = 5;
        for(int i =1;i<=row;i++){
            for(int j=1;j<=i;j++){
                if(j==i){

                    for( int k=1;k<j;k++){
                        System.out.print( " ");
                    }
                    for(int z=row;z>0;z--){
                        System.out.print(z+ " ");
                    }
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}