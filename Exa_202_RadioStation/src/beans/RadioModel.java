package beans;

import java.util.LinkedList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class RadioModel extends AbstractTableModel
{

  private List<Radio> list = new LinkedList<>();
  private String[] colnames =
  {
    "Sender", "Frequenz", "Band"
  };

  public void updateNumCols(int numCols)
  {
    colnames = new String[numCols];

    colnames[0] = "Sender";
    colnames[1] = "Frequenz";

    if (numCols == 3)
    {
      colnames[2] = "Band";
    }

    fireTableStructureChanged();
  }
  
  public void add(Radio radio)
  {
    list.add(radio);
    this.fireTableRowsInserted(list.size()-1, list.size()-1);
  }

  @Override
  public int getRowCount()
  {
    return list.size();
  }

  @Override
  public int getColumnCount()
  {
    return colnames.length;
  }

  @Override
  public Object getValueAt(int rowIndex, int columnIndex)
  {
    return list.get(rowIndex);
  }

  @Override
  public String getColumnName(int i)
  {
    return colnames[i];
  }

}
