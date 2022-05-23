
package statisticker;


public class IAlerter {

  /**
   * @param emailAlerter
   * @param ledAlerter
   */

  public EmailAlert emailAlert;
  public LEDAlert ledAlert;

  public IAlerter(EmailAlert emailAlerter, LEDAlert ledAlerter) {
    // TODO Auto-generated constructor stub
    this.emailAlert = emailAlerter;
    this.ledAlert = ledAlerter;
  }

  
}
