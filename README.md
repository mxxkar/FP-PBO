# FP-PBO
Ini adalah Final Project PBO


Nama : Sekar Ambar Arum

NRP : 5025211041

PBO-B

Referensi : https://github.com/janbodnar/Java-Breakout-Game

![BUFALO 13_12_2022 17_29_51](https://user-images.githubusercontent.com/90591077/207294165-3b6f95a0-649c-48bb-9ca6-b79552e863f5.png)



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

        public class Board extends JPanel {

            private Timer timer;
            private String message = "Try harder!";
            private Ball ball;
            private Paddle paddle;
            private Brick[] bricks;
            private boolean inGame = true;

- Override : Board

            public void paintComponent(Graphics g) {
                super.paintComponent(g);

                var g2d = (Graphics2D) g;

                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                        RenderingHints.VALUE_ANTIALIAS_ON);

                g2d.setRenderingHint(RenderingHints.KEY_RENDERING,
                        RenderingHints.VALUE_RENDER_QUALITY);

                if (inGame) {

                    drawObjects(g2d);
                } else {

                    gameFinished(g2d);
                }

                Toolkit.getDefaultToolkit().sync();
            }

- Interface : Board

            private class GameCycle implements ActionListener {

                // @Override
                public void actionPerformed(ActionEvent e) {

                    doGameCycle();
                }
            }

- Casting : Commons

            double myWidth = 300;
            int WIDTH = (int)myWidth;

- Abstract : Sprite

        abstract class Sprite {

            int x;
            int y;
            int imageWidth;
            int imageHeight;
            Image image;

- Inheritance : Board

            private class TAdapter extends KeyAdapter {

                // @Override
                public void keyReleased(KeyEvent e) {

                    paddle.keyReleased(e);
                }

                // @Override
                public void keyPressed(KeyEvent e) {

                    paddle.keyPressed(e);
                }
            }
