import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JTextField;
import javax.swing.text.JTextComponent;


public class MinView implements View {

  //Instance variables
//   double mode;
  JTextField jtfMode;
//   JTextField jtfMode2;
  double minima;
  String name;

  public MinView() {
    minima = 0;
    jtfMode = new JTextField(5);
    jtfMode.setEditable(false);
    name = "Min";
  }


  @Override
  public void update(ArrayList<Double> numbers) {    
    minima = MinMaxCalculation.min(BasicStats.getArrayDouble(numbers));

    //Set text
    jtfMode.setText("" + minima);

  }

  @Override
  public void reset() {
    jtfMode.setText("");    
  }

  @Override
  public JTextComponent show() {
    return jtfMode;
  }

  @Override
  public String getName() {
		return name;
	}

	public double getMinima() {
		return minima;
	}




}
