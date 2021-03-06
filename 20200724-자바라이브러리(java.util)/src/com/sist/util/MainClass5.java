package com.sist.util;

import java.util.*;

public class MainClass5 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("년도입력:");
		int year=scan.nextInt();
		
		System.out.println("월입력:");
		int month=scan.nextInt();
		
		String[] strWeek= {"일","월","화","수","목","금","토"};
		
		Calendar cal=Calendar.getInstance();
		cal.set(Calendar.YEAR,year);
		cal.set(Calendar.MONTH,month-1);
		cal.set(Calendar.DATE,1);
		
		// 요일 구하기
		int week=cal.get(Calendar.DAY_OF_WEEK)-1;
		
		// 마지막 날짜 구하기
		int lastday=cal.getActualMaximum(Calendar.DATE);
		
		// 출력
		 System.out.println("요일:"+strWeek[week]);
		//System.out.println("마지막날짜:"+lastday);
		
		System.out.println(year+"년도"+month+"월");
		
		for(int i=0;i<7;i++)
		{
			System.out.print(strWeek[i]+"\t");
		}
		System.out.println();
		
		for(int i=1;i<=lastday;i++)
		{
			if(i==1)
			{
				for(int j=0;j<week;j++)
				{
					System.out.print("\t");
				}
			}
			System.out.printf("%2d\t",i);
			week++;
			if(week>6)
			{
				week=0;
				System.out.println();
			}
		}
		

	}

}
