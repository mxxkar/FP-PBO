# FP-PBO
Ini adalah Final Project PBO


Nama : Sekar Ambar Arum

NRP : 5025211041

PBO-B

Referensi : https://github.com/janbodnar/Java-Breakout-Game



Rencana Final Project : Saya akan membuat game yang saya beri nama BUFALO (Break Ur Fear with Long-board). Dengan alur game sebagai berikut : User menggerakkan papan panjang untuk menjaga bola yang berisi (freedom) agar tetap memantul. Bola tersebut diarahkan untuk menghancurkan kotak-kotak berisi (Fear) yang tersusun di atas papan.  User akan meraih kemenangan apabila seluruh (Fear) telah habis tak bersisa. Sementara itu, user dinyatakan gagal/game over apabila tidak dapat mempertahankan bola di atas papan.

Aspek OOP : 
- Constructor : Breakout

    public Breakout() {
        
        initUI();
    }
    
- Generic : Brick, Paddle, Ball

public class Brick<T> extends Sprite {
    private boolean destroyed;  
    public Brick(int x, int y) {   
        initBrick(x, y);
    }
    
- Encapsulation : Ball
    
    void setXDir(int x) {

        xdir = x;
    }

    void setYDir(int y) {

        ydir = y;
    }

    int getYDir() {

        return ydir;
    }
}
    
- GUI : Board
- Override : Board
- Interface : Board
- Casting : Commons
- Abstract : Sprite
- Inheritance : Board
