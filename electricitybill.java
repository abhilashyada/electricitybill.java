import java.util.Scanner;

class main {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int units = input.nextInt();
        float cost = 0;
        
        if (units<50) 
        {
            cost = (units*2);
        } 
        else if(units<150) 
        {
            cost = (2 * 50) + (3 *(units - 50));
        }
        else if (units<250) {
            cost = (2 * 50) + (3*100) + (5*(units - 150));
        }
        else if (units>=250) 
        {
            cost = (2 * 50) + (3 * 100) + (5 *100) + (8 * (units - 250));
        }
        float surcharge = (float)(0.2 * cost);
        System.out.println(cost+surcharge);
        input.close();
    }
}