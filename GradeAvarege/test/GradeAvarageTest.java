/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import gradeAverage.GradeAverage;
/**
 *
 * @author Aman Br
 */
public class GradeAvarageTest {
    private GradeAverage Null;
    
    public GradeAvarageTest() {
    }
    GradeAverage gr;
    @Before
    public void setUp() {
      gr=new GradeAverage();
  
    }
     @Test 
  public void SumTest(){
      int [] arraygrade= new int[6]; 
      arraygrade[0]=80;
      arraygrade[1]=90;
      arraygrade[2]=70;
      arraygrade[3]=85;
      arraygrade[4]=80;
      arraygrade[5]=84;
         assertEquals(489,gr.sum(arraygrade,6));
  }
  @Test
  public void AverageTest(){
      int [] avarageGrade = new int[6];
      avarageGrade[0]=80;
      avarageGrade[1]=90;
      avarageGrade[2]=60;
      avarageGrade[3]=65;
      avarageGrade[4]=80;
      avarageGrade[5]=84;
      assertEquals(76.5,gr.average(avarageGrade, 6),0.00);
  }
  @Test
  public void LetterGradeTest(){
      assertEquals("A+", gr.letterGrade(98));
  } 
    @After
    public void tearDown() {
        gr= Null;
    }

    
}
