/*19. Interface Implementation 
• Objective: Use interfaces in Java. 
• Task: Define an interface Playable with a method play(). 
• Instructions: 
o Implement the interface in classes Guitar and Piano. 
o Each class should provide its own implementation of play(). 
o Instantiate the classes and call the method.*/

import java.util.Scanner;
public class InterfaceImplementation
{
    public static void main(String[] args)
    {
        Guitar guitar=new Guitar();
        Piano piano=new Piano();
        guitar.play();
        piano.play();
    }
}

interface Playable
{
    void play();
}

class Guitar implements Playable
{
    public void play()
    {
        System.out.println("Playing the guitar");
    }
}

class Piano implements Playable
{
    public void play()
    {
        System.out.println("Playing the piano");
    }
}

