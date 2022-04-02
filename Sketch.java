import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * This code produces a patterned image
   * @Author: JohnDuarte23
   */
  public void settings() {
	  // put your size call here
    size(1200, 600);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(45, 150, 207);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */  
  public void draw() {

    draw_section_outlines();
    draw_section1();
    draw_section2();
    draw_section3();
    draw_section4();
	  
    draw_section5();
    draw_section6();
    draw_section7();
    draw_section8();
    
  }


  /**
   * Draw the outlines for all sections
   */
  public void draw_section_outlines(){
    stroke(0);
    noFill();

    // draw bottom row boxes
    rect(0,300, 300, 300);
    rect(300, 300, 300, 300);
    rect(600, 300, 300, 300);
    rect(900, 300, 300, 300);

    // draw top row boxes
    rect(0,0, 300, 300);
    rect(300, 0, 300, 300);
    rect(600, 0, 300, 300);
    rect(900, 0, 300, 300);
  }
  
  /**
   * Draws the bottom left section
   */
  
  public void draw_section1(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 30; intRow ++){
      for(int intColumn = 0; intColumn < 30; intColumn ++){
        intX = intRow * 10;  //Instead of zero, calculate the proper intX location using 'intRow'
        intY = 300 + intColumn * 10; //Instead of zero, calculate the proper intY location using 'intColumn'

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);

      }
    }
  }
  
  /**
   * Use the modulus operator and an if statement to select the color
   * Don't loop from 30 to 60 to shift everything over, just add 300 to x.
   */

   // Draws section 2
  public void draw_section2(){
    int intX = 0;
    int intY = 0;

    for(int intRow2 = 0; intRow2 < 30; intRow2 ++){
      for(int intColumn2 = 0; intColumn2 < 30; intColumn2 ++){
        intX = 300 + intRow2 * 10;  
        intY = 300 + intColumn2 * 10; 

          if(intRow2 % 2 == 0){
            fill(255);
            noStroke();
            rect(intX, intY, 5, 5);
          }
          else{
            fill(0);
            noStroke();
            rect(intX, intY, 5, 5);
          }  
      }
    }
  }

  /**
   * Use the modulus operator and an if/else statement to select the color.
   * Don't use multiple 'if' statements.
   */

   // Draws section 3
  public void draw_section3(){
    int intX = 0;
    int intY = 0;

    for(int intRow3 = 0; intRow3 < 30; intRow3 ++){
      for(int intColumn3 = 0; intColumn3 < 30; intColumn3 ++){
        intX = 600 + intRow3 * 10;  
        intY = 300 + intColumn3 * 10; 

          if(intColumn3 % 2 == 0){
            fill(255);
            noStroke();
            rect(intX, intY, 5, 5);
          }
          else{
            fill(0);
            noStroke();
            rect(intX, intY, 5, 5);
          }  
      }
    }
  }

  /**
   * Use the modulus operator and just one 'if' statement to select the color.
   */
  
   // Draws section 4
  public void draw_section4(){
    int intX = 0;
    int intY = 0;

    for(int intRow4 = 0; intRow4 < 30; intRow4 ++){
      for(int intColumn4 = 0; intColumn4 < 30; intColumn4 ++){
        intX = 900 + intRow4 * 10;  
        intY = 300 + intColumn4 * 10; 

          if((intColumn4 % 2 == 0) && (intRow4 % 2 ==0)){
            fill(255);
            noStroke();
            rect(intX, intY, 5, 5);
          }
          else{
            fill(0);
            noStroke();
            rect(intX, intY, 5, 5);
          }  
      }
    }
  }

  /**
   * Do NOT use 'if' statements to complete 5-8. Manipulate the loops instead
   */

   // Draws section 5
  public void draw_section5(){
    int intX = 0;
    int intY = 0;
    int intCounter = 30;

    for(int intColumn5 = 0; intColumn5 < 30; intColumn5 ++){
      for(int intRow5 = 30; intRow5 > intCounter; intRow5 --){
          intX = intRow5 * 10;  
          intY = intColumn5 * 10; 

          fill(255);
          noStroke();
          rect(intX, intY, 5, 5);
          
      }
      intCounter --;
    }
  }

  // Draws section 6
  public void draw_section6(){
    int intX = 0;
    int intY = 0;
    int intCounter = 30;

    for(int intColumn6 = 30; intColumn6 > 0; intColumn6 --){
      for(int intRow6 = 0; intRow6 < intCounter; intRow6 ++){
          intX = 300 + intRow6 * 10;  
          intY = intColumn6 * 10; 

          fill(255);
          noStroke();
          rect(intX, intY, 5, 5);
          
      }
      intCounter --;
    }
  }

  // Draws section 7
  public void draw_section7(){
    int intX = 0;
    int intY = 0;
    int intCounter = 30;

    for(int intRow7 = 0; intRow7 < 30; intRow7 ++){
      for(int intColumn7 = 0; intColumn7 < intCounter; intColumn7 ++){
          intX = 600 + intRow7 * 10;  
          intY = intColumn7 * 10; 

          fill(255);
          noStroke();
          rect(intX, intY, 5, 5);
      }
      intCounter --;
    }
  }
  
  // Draws section 8
  public void draw_section8(){
    int intX = 0;
    int intY = 0;
    int intCounter = 0;

    for(int intRow8 = 0; intRow8 < 30; intRow8 ++){
      for(int intColumn8 = 0; intColumn8 < intCounter; intColumn8 ++){
          intX = 900 + intRow8 * 10;  
          intY = intColumn8 * 10; 

          fill(255);
          noStroke();
          rect(intX, intY, 5, 5);
        
      }

      intCounter ++;
      
    }
  }
}
