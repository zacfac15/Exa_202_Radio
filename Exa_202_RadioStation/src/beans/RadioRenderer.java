package beans;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class RadioRenderer extends DefaultTableCellRenderer
{

  @Override
  public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column)
  {
    JLabel lb = new JLabel(value.toString());
    lb.setOpaque(true);

    if (value instanceof Radio)
    {
      Radio radio = (Radio) value;
      if (radio.getBand().equals("AM"))
      {
        lb.setBackground(Color.red);
      }
      else if (radio.getBand().equals("FM"))
      {
        lb.setBackground(Color.blue);
      }

      switch (column)
      {
        case 0:
          lb.setText(radio.getSender()); break;
        case 1:
          lb.setText(""+radio.getFrequenz()); break;
        case 2:
          lb.setText(radio.getBand()); break;
      }
    }

    return lb;
  }
}
