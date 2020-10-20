import java.util.Scanner;

public class pinganNqueue {
    private static boolean[] colused;
    private static boolean[] diagonal45;
    private static boolean[] diagonal13;
    private static int n;
    public static int res = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ns = sc.nextInt();
        colused = new boolean[n];
        diagonal13 = new boolean[2*n-1];
        diagonal45 = new boolean[2*n-1];
        n = ns;
        resolution(0);
        System.out.println(res);

    }

    public static void resolution(int row){
        if(row == n){
            res++;
            return;
        }
        for(int col = 0;col<n;col++){
            int diagonals45idx = row+col;
            int diagonals33idx = n-1-(row-col);
            if(colused[col]||diagonal45[diagonals45idx]||diagonal13[diagonals33idx]){
                continue;
            }
            colused[col] = diagonal13[diagonals33idx] = diagonal45[diagonals45idx] = true;
            resolution(row+1);
            colused[col] = diagonal13[diagonals33idx] = diagonal45[diagonals45idx] = false;

        }

    }

}
