import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int dayHrs[]=new int[7];
        int weekhr=0;
        for(int iterator=0;iterator<7;iterator++)
        {
            dayHrs[iterator]=scanner.nextInt();
            if(iterator>0 && iterator<6)
            {
                weekhr+=dayHrs[iterator];
            }
        }
        int extra=0;
        int sal=0;
        int dayCharge[]=new int[7];
        for(int iterator=0;iterator<7;iterator++)
        {
            if(iterator==0)
            {
                dayCharge[iterator]=dayHrs[iterator]*150;
            }
            else if(iterator==6)
            {
                dayCharge[iterator]=dayHrs[iterator]*125;
            }
            else
            {
                if(dayHrs[iterator]>8)
                {
                    extra=dayHrs[iterator]-8;
                    sal=extra*115;
                    dayCharge[iterator]=sal+800;
                }
                else
                {
                    dayCharge[iterator]=dayHrs[iterator]*100;
                }
            }

        }
        int weekextra=0;
        if(weekhr>40)
        {
            int extrapay=(weekhr-40)*125;
            weekextra=(40*100)+extrapay;
        }
        int Salary=0;
        for(int iterator=0;iterator<7;iterator++)
        {
            Salary+=dayCharge[iterator];
        }
        System.out.println(Salary+weekextra);




    }
}