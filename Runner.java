
/**
 * 
 * @author lindj
 *
 */
public class Runner {
	
	/*
	 * 0 = front blue
	 * 1 = right red
	 * 2 = back  green
	 * 3 = left  orange
	 * 4 = up    yellow
	 * 5 = down  white
	 */
	
   public static void main(String[] args) {

      Model model = new Model();

      Frame view = new Frame();

      Controller controller = new Controller(model, view);

   }
}
