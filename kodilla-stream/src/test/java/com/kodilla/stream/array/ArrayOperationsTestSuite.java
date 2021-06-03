package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage(){
     ArrayOperationsClass arrayOperationsClass=new ArrayOperationsClass();
        int [] tabInt = new int[20];
        tabInt[0]=1;
        tabInt[1]=1;
        tabInt[2]=1;
        tabInt[3]=1;
        tabInt[4]=1;
        tabInt[5]=1;
        tabInt[6]=1;
        tabInt[7]=1;
        tabInt[8]=1;
        tabInt[9]=1;
        tabInt[10]=1;
        tabInt[11]=1;
        tabInt[12]=1;
        tabInt[13]=1;
        tabInt[14]=1;
        tabInt[15]=1;
        tabInt[16]=1;
        tabInt[17]=1;
        tabInt[18]=1;
        tabInt[19]=1;
        double results= arrayOperationsClass.getAverage(tabInt);
        assertEquals(1,results);
    }
}
