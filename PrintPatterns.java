package Patterns;

public class PrintPatterns {
    public static void main(String[] args) {

        pattern(5);
    }
    static void pattern(int n){
        for(int row=1; row<=2*n; row++){
            int totalColInRows = row>n ? 2*n-row : row;

            for(int s=0;s<n-totalColInRows; s++){
                System.out.print(" ");
            }
            for(int col=1; col<=totalColInRows; col++){
                System.out.print((col*2)-1);
            }
            for(int col=2; col<=totalColInRows; col++){
                int letter=65;
                System.out.print((char)(letter+col-2));
            }
            System.out.println();
        }
    }
}
