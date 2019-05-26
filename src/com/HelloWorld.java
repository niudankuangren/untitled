package com;

import com.sun.deploy.net.proxy.AutoProxyScript;

import java.util.ArrayList;

public class HelloWorld {



    private static final  Customer cust=new Customer();    //prsf
    public static final int NUM=1;                         //psf  psfi psfs

    public static void main(String[] args) {
        System.out.println();                       //sout
        System.out.println("args = [" + args + "]");//soutp
        System.out.println("HelloWorld.main");      //soutm
        int num1=10;
        System.out.println("num1 = " + num1);         //soutv

        int[] a={1,2,3};
        for (int i = 0; i <a.length; i++) {           //fori
            System.out.println(a[i]);
        }

        for (int i : a) {                           //iter

        }

        for (int i = 0; i < a.length; i++) {        //itar
            int i1 = a[i];

        }

        ArrayList list =new ArrayList( );
        list.add(1);

        for (Object o : list) {                         //list.for

        }

        for (int i = 0; i < list.size(); i++) {         //list.fori

        }

        for (int i = list.size() - 1; i >= 0; i--) {

        }

        if (list == null) {                             //ifn

        }

        if (list != null) {                             //inn

        }


        if (list != null) {                              //xxx.nn

        }

        if (list == null) {                             //xxx.null

        }






    }

    /**
     *
     *
     */
     private int i1 =11;

      /**
       *
       *
      */
      private String str="1";


}
