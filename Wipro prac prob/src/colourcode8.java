
public class colourcode8 {
public static void main(String[] args) {
	String s = args[0];
	char color =s.charAt(0);
	
    
     
    switch(color){
          case 'R': 
              System.out.println("R->Red");
              break;
          case 'B': 
              System.out.println("B->Blue");
              break;
          case 'G': 
              System.out.println("G->Green");
              break;
          case 'O': 
              System.out.println("O->Orange");
              break;
          case 'Y': 
              System.out.println("Y->Yellow");
              break;
          case 'W': 
              System.out.println("White");
              break;
                          
          default:
              System.out.println("Invalid Code");
              break;                  
    }
}
}
