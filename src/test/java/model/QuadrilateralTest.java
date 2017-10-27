package model;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuadrilateralTest {

    private Quadrilateral quadrilateral;



    @Before
    public void setUp() throws Exception {
        quadrilateral = new Quadrilateral(1,2,3,4);

    }


    @Test
    public void getPerimeter() throws Exception {

        assertTrue(quadrilateral.getPerimeter() == 10);
    }

    @Test (expected = Exception.class)
    public void getArea() throws Exception {
        quadrilateral.getArea();

    }

    @Test
    public void getInfo() throws Exception {
        Assert.assertEquals("четырёхугольник со сторонами 1.0, 2.0, 3.0, 4.0", quadrilateral.getInfo());
    }

}