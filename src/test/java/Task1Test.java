import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class Task1Test {

    @Before
    public void setDriver() {
        System.out.println("Starting new test called: ");
    }

    @After
    public void tearDown() {
        System.out.println("Test finished");
    }

    @Test
    public void nullExceptionTest(){
        System.out.println("nullExceptionTest");
        CreateEvenArrayList evenArrayList = new CreateEvenArrayList();
        System.out.println(evenArrayList.arrayList.size());
        System.out.println(evenArrayList.arrayList.isEmpty());

        Assert.assertEquals(0, evenArrayList.arrayList.size());
        Assert.assertTrue(evenArrayList.arrayList.isEmpty());

    }

    @Test
    public void oddListCreationTest(){
        System.out.println("oddListCreationTest");
        CreateEvenArrayList evenArrayList = new CreateEvenArrayList();
        evenArrayList.arrayList.add(0, 1);
        evenArrayList.arrayList.add(1, 2);
        evenArrayList.arrayList.add(2, 3);
        evenArrayList.arrayList.add(3, 4);

        System.out.println("First list is: " + evenArrayList.arrayList);

        System.out.println(evenArrayList.evenArrayList());

        ArrayList<Integer> evenList = evenArrayList.evenArrayList();

        Assert.assertTrue(evenList.get(0)==2);
        Assert.assertTrue(evenList.get(1)==4);
        Assert.assertTrue(evenList.size()==2);
    }
}