import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JTextField;
import javax.swing.text.JTextComponent;


public class MaxView implements View {

  //Instance variables
  double mode;
  JTextField jtfMode;
  JTextField jtfMode2;
  double minima;
  String name;

  public MaxView() {
    mode = 0;
    jtfMode = new JTextField(5);
    jtfMode2 = new JTextField(5);
    jtfMode2.setEditable(false);    
    jtfMode.setEditable(false);
    name = "Max";
  }


  @Override
  public void update(ArrayList<Double> numbers) {
    mode = MinMaxCalculation.max(BasicStats.getArrayDouble(numbers));    

    //Set text
    jtfMode.setText("" + mode);    

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

	public double getMode() {
		return mode;
	}




}
