import processing.core.PApplet;

/**
   * This program will generate an image of a house in a random position & of a random size
   * @author: JohnDuarte23
*/
public class Sketch extends PApplet {
	
  public void settings() {
	// size call
    size(400, 400);
  }

  // Sets background colour
  public void setup() {

    boolean blnBlue = (fltSquareX > 200);
    boolean blnRed = (fltSquareY > 200);
  
    if (blnBlue && !blnRed){
      background(0, 0, 255);
    }
    else if (!blnBlue && blnRed){
      background(255, 0, 0);
    }
    else{
      background (0, 255, 0);
        
    // command that shows the time
    fill(0, 0, 0);
    textSize(height/20);
    text(month() + "/" + day() + "/" + year() + " " + hour() + ":" + minute() + ":" + second(), (width/40), (float) (height / 1.01));
    }
  }
  
  // Setting variables for the drawing
  float fltSquareX = random(100, width - 100);
  float fltSquareY = random(100, height - 100);
  float fltSquareSize = random(25,125);
  float fltWindowSize = (fltSquareSize / 4);
  float fltSquareDistance1 = fltSquareSize / 4;
  float fltSquareDistance2 = fltSquareSize / 4;

  boolean blnIsBlue = (fltSquareX > 200);
  boolean blnIsRed = (fltSquareY > 200);  

  // Commands used to make my drawing
  public void draw() {

    // Body of the house
    fill(255, 255, 255);
    rectMode(CENTER);
    rect(fltSquareX, fltSquareY, fltSquareSize, fltSquareSize);

    // Windows of the house
    fill(120, 246, 252);
    rectMode(CENTER);
    rect(fltSquareX + fltSquareDistance1, fltSquareY - fltSquareDistance1, fltWindowSize, fltWindowSize);

    fill(120, 246, 252);
    rectMode(CENTER);
    rect(fltSquareX - fltSquareDistance2, fltSquareY - fltSquareDistance2, fltWindowSize, fltWindowSize);

    // Door of the house
    fill(101, 67, 53);
    rectMode(CENTER);
    rect(fltSquareX, fltSquareY + (fltSquareSize / 4), fltSquareSize / 4, fltSquareSize / 2);

    // Roof of the house
    fill(50, 59, 60);
    triangle(fltSquareX - (fltSquareSize / 2), fltSquareY - (fltSquareSize/ 2), fltSquareX + (fltSquareSize / 2), fltSquareY - (fltSquareSize / 2), fltSquareX, fltSquareY - fltSquareSize);

  }
}