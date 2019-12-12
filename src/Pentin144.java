import java.util.Scanner;
public class Pentin144 {
    public static void main(String args[]) {
        int i=0, p=0, s=0, e=0, c=0, r=0, et=0;
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()){
            int n = in.nextInt();
            if (n==1) i=n;
            else if (n==2) p=n;
            else if (n==3) s=n;
            else if (n==4) e=n;
            else if (n==5) c=n;
            else if (n==6 & i==1 & p==2 & s==3 & e==4 & c==5) {
                et++;
                System.out.println("РљРѕР»РёС‡РµСЃС‚РІРѕ С„СЂР°РіРјРµРЅС‚РѕРІ РІ РїРѕСЃР»РµРґРѕРІР°С‚РµР»СЊРЅРѕСЃС‚Рё =" + et);
                i=0;
                p=0;
                s=0;
                e=0;
                c=0;
            }
            else if (n!=1 || n!=2 || n!=3 || n!=4 || n!=5 || n!=6) {
                i=0;
                p=0;
                s=0;
                e=0;
                c=0;
            }
            System.out.println("Количество входящих в последовательность фрагмента 1,2,3,4,5,6: " + et);

        }
        System.out.println("Количество входящих в последовательность фрагмента 1,2,3,4,5,6: " + et);
    }
}