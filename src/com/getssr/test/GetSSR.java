package com.getssr.test;
//���ʷֲ�:50%��r,48%��sr,2%��ssr
//����50��û�г鵽ssr֮��ÿ�γ鵽ssr�ĸ�������5%
import java.util.Random;
public class GetSSR {
	public static void main(String[] args){
      Random ran=new Random();
      int i;
      for(i=1;i<=50;i++){
          int x=ran.nextInt(100)+1;
          if(x<=50){
              System.out.println("��"+i+"�γ鵽R");
          }else if(x<=98){
              System.out.println("��"+i+"�γ鵽SR");
          }else if(x<=100){
              System.out.println("��"+i+"�γ鵽SSR");
              break;
          }
      }
      int a=2;
      while(i>50) {
      	int x=ran.nextInt(100)+1;
      	System.out.println("��"+i+"�γ鵽��SSR");
      	i++;
      	a=a+5;
      	if(x<=a){
              System.out.println("��"+i+"�γ鵽SSR");
              break;
          }
      }
  }
}

