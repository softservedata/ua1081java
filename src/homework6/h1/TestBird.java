package homework6.h1;

import java.util.Arrays;

public class TestBird {

    public static void main(String[] args) {
        Bird[] birds = new Bird[]{
                new Penguin("Black and white", 1),
                new Kiwi("Brown", 2),
                new Swallow("Black and white",3),
                new Eagle("Brown", 3)
        };
        for( int i =0; i<birds.length; i++){
            System.out.println(birds[i]);
                birds[i].fly();
            }
        }







    }

