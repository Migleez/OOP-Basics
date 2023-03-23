
public class ShapeApplication {


    public static void main(String[] args){

        //Square square = new Square(5, 8);
        Square[] objSquares = {new Square(5,8), new Square(-3,4), new Square(3.5, 6.2)};


  /*      for ( int i = 0; i < objSquares.length; ++i ) {
            System.out.println(objSquares[i].getLenght());
        }
       // System.out.println(objSquares[0].getLenght());

       //   objSquares[0].getLenght();*/


        for ( Square s : objSquares ) {
   //         System.out.println(s.getLenght());
            s.getLenght();
     //       System.out.println(s.getWidth());
            s.getWidth();
            s.calculateSquare();
        }


 //       objSquares[0].calculateSquare();

    }
}


