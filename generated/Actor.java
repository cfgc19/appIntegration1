//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.06 at 10:51:11 AM GMT 
//

package generated;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}actor_name"/>
 *         &lt;element ref="{}serie" maxOccurs="unbounded"/>
 *         &lt;element ref="{}no_episodes"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "actorName", "serie", "noEpisodes" })
@XmlRootElement(name = "actor")
public class Actor {

	@XmlElement(name = "actor_name", required = true)
	protected String actorName;
	@XmlElement(required = true)
	protected List<String> serie;
	@XmlElement(name = "no_episodes", required = true)
	protected BigInteger noEpisodes;

	/**
	 * Gets the value of the actorName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	
	public Actor(String actorName, List<String> serie, BigInteger noEpisodes) {
		super();
		this.actorName = actorName;
		this.serie = serie;
		this.noEpisodes = noEpisodes;
	}

	public String getActorName() {
		return actorName;
	}

	public void setSerie(List<String> serie) {
		this.serie = serie;
	}

	/**
	 * Sets the value of the actorName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setActorName(String value) {
		this.actorName = value;
	}

	/**
	 * Gets the value of the serie property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the serie property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getSerie().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link String }
	 * 
	 * 
	 */
	public List<String> getSerie() {
		if (serie == null) {
			serie = new ArrayList<String>();
		}
		return this.serie;
	}

	/**
	 * Gets the value of the noEpisodes property.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getNoEpisodes() {
		return noEpisodes;
	}

	/**
	 * Sets the value of the noEpisodes property.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setNoEpisodes(BigInteger value) {
		this.noEpisodes = value;
	}

}
