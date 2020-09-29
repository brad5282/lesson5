
package face;

import java.awt.Color;
import java.awt.Graphics;

public class Face {
    private int xPos, yPos, diameter;
    private Graphics pen;
    private Color faceColor = (Color.red);
    private Color eyeColor = (Color.yellow);
    int newx, newy, newd;
    boolean issad;
    
    public Face(Graphics pen, int x, int y){
        xPos = x;
        yPos = y;
        this.pen = pen;
        issad = false;
        diameter = 100;
        
    }
    public void erase(){
        pen.setColor(Color.white);
        pen.fillRect(xPos-10, yPos-10, diameter+20, diameter+20);
    }
    
    public void togglemood(){
        issad = !issad;
    }
    
    public void resize(Graphics pen, int newd){
        diameter = newd;
        draw();
                
    }
    
    public void move(Graphics pen, int newx, int newy){
             xPos = newx;
             yPos = newy;
             draw();
    }
    
    public void setColor(Color c){
        faceColor = c;
    }
    
    
        

    
    public void draw(){
        drawHead();
        drawEyes();
        if(issad){
            drawHappy();
        }
        else{
            drawSad();
        }
    }
    
    // private helper methods
    private void drawHead(){
        pen.setColor(faceColor);
        pen.fillOval(xPos,yPos,diameter,diameter);  
    }
    private void drawEyes(){
        pen.setColor(eyeColor);
        pen.fillOval(xPos+(int)(.2*diameter), yPos+(int)(.2*diameter),(int)(diameter*.25),(int)(diameter*.25));
        pen.fillOval(xPos+(int)(.55*diameter) ,yPos+(int)(.2*diameter),(int)(.2*diameter),(int)(.25*diameter));
    }
    
    
    private void drawHappy(){
        int mx, my;
        mx = xPos + (int)(.3*diameter);
        my = yPos + (int)(.8*diameter);
        pen.setColor(Color.black);
        pen.drawLine(mx,my,mx + (int)(.4*diameter), my);
        
        pen.drawLine(mx,my,mx-(int)(.1*diameter), my -(int)(.13*diameter));
        pen.drawLine(mx+(int)(.4*diameter), my, mx+(int)(.45*diameter), my-(int)(.13*diameter));
    }
    
    private void drawSad(){
        int mx, my;
        mx = xPos + (int)(.3*diameter);
        my = yPos + (int)(.8*diameter);
        pen.setColor(Color.black);
        pen.drawLine(mx,my,mx + (int)(.4*diameter), my);
        
        pen.drawLine(mx,my,mx-(int)(.1*diameter), my +(int)(.13*diameter));
        pen.drawLine(mx+(int)(.4*diameter), my, mx+(int)(.45*diameter), my+(int)(.13*diameter));
    }
    
}
