package statisticker;

public class IAlerter {

  public LEDAlert ledAlert;
  public EmailAlert emailAlert;

  public IAlerter(EmailAlert emailAlert, LEDAlert ledAlert) {
    this.emailAlert = emailAlert;
    this.ledAlert = ledAlert;
  }
}
