package beans;

public class Radio
{
  private String sender;
  private double frequenz;
  private String band;

  public Radio(String sender, double frequenz, String band)
  {
    this.sender = sender;
    this.frequenz = frequenz;
    this.band = band;
  }

  public String getSender()
  {
    return sender;
  }

  public void setSender(String sender)
  {
    this.sender = sender;
  }

  public double getFrequenz()
  {
    return frequenz;
  }

  public void setFrequenz(double frequenz)
  {
    this.frequenz = frequenz;
  }

  public String getBand()
  {
    return band;
  }

  public void setBand(String band)
  {
    this.band = band;
  }
  
  
}
