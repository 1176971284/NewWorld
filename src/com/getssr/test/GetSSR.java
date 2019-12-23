package com.getssr.test;
//概率分布:50%的r,48%的sr,2%的ssr
//连续50次没有抽到ssr之后每次抽到ssr的概率提升5%
import java.util.Random;
public class GetSSR {
	public static void main(String[] args){
      Random ran=new Random();
      int i;
      for(i=1;i<=50;i++){
          int x=ran.nextInt(100)+1;
          if(x<=50){
              System.out.println("第"+i+"次抽到R");
          }else if(x<=98){
              System.out.println("第"+i+"次抽到SR");
          }else if(x<=100){
              System.out.println("第"+i+"次抽到SSR");
              break;
          }
      }
      int a=2;
      while(i>50) {
      	int x=ran.nextInt(100)+1;
      	System.out.println("第"+i+"次抽到非SSR");
      	i++;
      	a=a+5;
      	if(x<=a){
              System.out.println("第"+i+"次抽到SSR");
              break;
          }
      }
  }
}

