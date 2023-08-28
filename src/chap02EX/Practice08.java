package chap02EX;

import java.util.Scanner;

public class Practice08 {
    static class YMD {
        int y;
        int m;
        int d;

        static int[][] days = {
                {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
                {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
        };

        static int leapYear(int year) {
            return (year%4==0 && year%100!=0 || year%400==0)? 1 : 0;
        }

        YMD(int y, int m,int d) {
            this.y = y;
            this.m = m;
            this.d = d;
        }

        YMD after(int n) {
            YMD temp = new YMD(this.y, this.m, this.d);

            if(n<1)
                before(-n);

            temp.d += n;

            while(temp.d > days[leapYear(temp.y)][temp.m-1]) {
                temp.d -= days[leapYear(temp.y)][temp.m-1];
                temp.m++;
                if(temp.m > 12){
                    temp.y++;
                    temp.m = 1;
                }
            }

            return temp;
        }

        YMD before(int n) {
            YMD temp = new YMD(this.y, this.m, this.d);
            if(n<1)
                after(-n);

            temp.d -= n;

            while(temp.d < 1) {
                temp.d+=days[leapYear(temp.y)][temp.m-1];
                temp.m--;
                if (temp.m < 1) {
                    temp.y--;
                    temp.m = 12;
                }
            }

            return temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("年を入力：　");int y = sc.nextInt();
        System.out.print("月を入力：　");int m = sc.nextInt();
        System.out.print("日を入力：　");int d = sc.nextInt();
        YMD ymd = new YMD(y,m,d);

        System.out.print("日付を入力：　");
        int num = sc.nextInt();

        YMD after = ymd.after(num);
        System.out.printf("%4d年%4d月%5d日",after.y,after.m,after.d);

        YMD before = ymd.before(num);
        System.out.printf("\n%4d年%4d月%5d日",before.y,before.m,before.d);

    }
}
