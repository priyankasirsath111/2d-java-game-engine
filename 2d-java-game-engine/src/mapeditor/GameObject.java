/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mapeditor;

import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

/**
 *
 * @author Philipp
 */
public class GameObject {

    public char objectChar;
    public Image image;
    public String name;

    public GameObject(String name, char objectChar){
        this.name = name;
        try{
            image = ImageIO.read(new File(name + ".png"));
        }
        catch(Exception e){
        }
        this.objectChar = objectChar;
    }

    public GameObject(String name, int objectChar){
        this.name = name;
        try{
            image = ImageIO.read(new File(name + ".png"));
        }
        catch(Exception e){
        }
        this.objectChar = (char)objectChar;
    }

    public void setName(String name){
        this.name = name;
        try{
            image = ImageIO.read(new File(name + ".png"));
        }
        catch(Exception e){
        }
    }

    public void setChar(char objectChar){
        this.objectChar = objectChar;
    }

    public void setChar(int objectChar){
        this.objectChar = (char)objectChar;
    }

    public Tiles getTile(){
        return new Tiles(image);
    }

    @Override
    public String toString(){
        return name + " = " + (int)objectChar;
    }

}