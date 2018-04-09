//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.06 at 03:25:36 PM EDT 
//


package org.immregistries.dqa.hl7util.parser.profile.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for dynamicDef complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="dynamicDef">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="AccAck" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AppAck" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="MsgAckMode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dynamicDef", propOrder = {
    "value"
})
public class DynamicDef {

  @XmlValue
  protected String value;
  @XmlAttribute(name = "AccAck")
  protected String accAck;
  @XmlAttribute(name = "AppAck")
  protected String appAck;
  @XmlAttribute(name = "MsgAckMode")
  protected String msgAckMode;

  /**
   * Gets the value of the value property.
   *
   * @return possible object is {@link String }
   */
  public String getValue() {
    return value;
  }

  /**
   * Sets the value of the value property.
   *
   * @param value allowed object is {@link String }
   */
  public void setValue(String value) {
    this.value = value;
  }

  /**
   * Gets the value of the accAck property.
   *
   * @return possible object is {@link String }
   */
  public String getAccAck() {
    return accAck;
  }

  /**
   * Sets the value of the accAck property.
   *
   * @param value allowed object is {@link String }
   */
  public void setAccAck(String value) {
    this.accAck = value;
  }

  /**
   * Gets the value of the appAck property.
   *
   * @return possible object is {@link String }
   */
  public String getAppAck() {
    return appAck;
  }

  /**
   * Sets the value of the appAck property.
   *
   * @param value allowed object is {@link String }
   */
  public void setAppAck(String value) {
    this.appAck = value;
  }

  /**
   * Gets the value of the msgAckMode property.
   *
   * @return possible object is {@link String }
   */
  public String getMsgAckMode() {
    return msgAckMode;
  }

  /**
   * Sets the value of the msgAckMode property.
   *
   * @param value allowed object is {@link String }
   */
  public void setMsgAckMode(String value) {
    this.msgAckMode = value;
  }

}
