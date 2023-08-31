import java.util.*;

public class hxw {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); //สร้าง Scanner
        System.out.print("Enter height:");
        int h =  sc.nextInt(); //รับค่า h
        System.out.print("Enter width:");
        int w =  sc.nextInt(); //รับค่า w

        //สร้างอาเรย์ 2 มิติ ขนาด h*w
        int num[][] = new int[h][w];
        int i,j = 0; //loop counter
        
        for(i = 0 ; i < h ; i++)
        {   
            int pos = 1;
            for(j = 0 ; j < w ; j++)
            {
                num[i][j] = pos;
                pos++;
            }
        }

        //แสดงผล num
        for(i = 0 ; i < h ; i++)
        {
            for(j = 0 ; j < w ; j++)
            {
                System.out.print(num[i][j]+" ");
            }
            System.out.println("");
        }
        
        sc.close();

    }
}
