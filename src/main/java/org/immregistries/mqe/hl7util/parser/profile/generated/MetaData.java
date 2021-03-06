//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.06 at 03:25:36 PM EDT 
//


package org.immregistries.mqe.hl7util.parser.profile.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for metaData complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="metaData">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="OrgName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Topics" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Date" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "metaData", propOrder = {
    "value"
})
public class MetaData {

  @XmlValue
  protected String value;
  @XmlAttribute(name = "Name")
  protected String name;
  @XmlAttribute(name = "OrgName")
  protected String orgName;
  @XmlAttribute(name = "Status")
  protected String status;
  @XmlAttribute(name = "Topics")
  protected String topics;
  @XmlAttribute(name = "Version")
  protected String version;
  @XmlAttribute(name = "Date")
  protected String date;

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
   * Gets the value of the name property.
   *
   * @return possible object is {@link String }
   */
  public String getName() {
    return name;
  }

  /**
   * Sets the value of the name property.
   *
   * @param value allowed object is {@link String }
   */
  public void setName(String value) {
    this.name = value;
  }

  /**
   * Gets the value of the orgName property.
   *
   * @return possible object is {@link String }
   */
  public String getOrgName() {
    return orgName;
  }

  /**
   * Sets the value of the orgName property.
   *
   * @param value allowed object is {@link String }
   */
  public void setOrgName(String value) {
    this.orgName = value;
  }

  /**
   * Gets the value of the status property.
   *
   * @return possible object is {@link String }
   */
  public String getStatus() {
    return status;
  }

  /**
   * Sets the value of the status property.
   *
   * @param value allowed object is {@link String }
   */
  public void setStatus(String value) {
    this.status = value;
  }

  /**
   * Gets the value of the topics property.
   *
   * @return possible object is {@link String }
   */
  public String getTopics() {
    return topics;
  }

  /**
   * Sets the value of the topics property.
   *
   * @param value allowed object is {@link String }
   */
  public void setTopics(String value) {
    this.topics = value;
  }

  /**
   * Gets the value of the version property.
   *
   * @return possible object is {@link String }
   */
  public String getVersion() {
    return version;
  }

  /**
   * Sets the value of the version property.
   *
   * @param value allowed object is {@link String }
   */
  public void setVersion(String value) {
    this.version = value;
  }

  /**
   * Gets the value of the date property.
   *
   * @return possible object is {@link String }
   */
  public String getDate() {
    return date;
  }

  /**
   * Sets the value of the date property.
   *
   * @param value allowed object is {@link String }
   */
  public void setDate(String value) {
    this.date = value;
  }

}
