//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.02 at 05:30:34 PM GMT 
//


package generated;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}no_actors"/>
 *         &lt;element ref="{}podium_actors"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "noActors",
    "podiumActors"
})
@XmlRootElement(name = "stats")
public class Stats {

    @XmlElement(name = "no_actors", required = true)
    protected BigInteger noActors;
    @XmlElement(name = "podium_actors", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String podiumActors;

    /**
     * Gets the value of the noActors property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNoActors() {
        return noActors;
    }

    /**
     * Sets the value of the noActors property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNoActors(BigInteger value) {
        this.noActors = value;
    }

    /**
     * Gets the value of the podiumActors property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPodiumActors() {
        return podiumActors;
    }

    /**
     * Sets the value of the podiumActors property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPodiumActors(String value) {
        this.podiumActors = value;
    }

}