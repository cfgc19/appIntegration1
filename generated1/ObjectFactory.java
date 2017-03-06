//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.06 at 10:52:22 AM GMT 
//


package generated1;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Date_QNAME = new QName("", "date");
    private final static QName _NumberOfEpisodes_QNAME = new QName("", "number_of_episodes");
    private final static QName _FirstEpisode_QNAME = new QName("", "first_episode");
    private final static QName _Description_QNAME = new QName("", "description");
    private final static QName _Source_QNAME = new QName("", "source");
    private final static QName _Title_QNAME = new QName("", "title");
    private final static QName _Type_QNAME = new QName("", "type");
    private final static QName _Network_QNAME = new QName("", "network");
    private final static QName _Number_QNAME = new QName("", "number");
    private final static QName _Character_QNAME = new QName("", "character");
    private final static QName _SerieName_QNAME = new QName("", "serie_name");
    private final static QName _Genre_QNAME = new QName("", "genre");
    private final static QName _Season_QNAME = new QName("", "season");
    private final static QName _NumberOfSeasons_QNAME = new QName("", "number_of_seasons");
    private final static QName _Value_QNAME = new QName("", "value");
    private final static QName _Languages_QNAME = new QName("", "languages");
    private final static QName _Profiles_QNAME = new QName("", "profiles");
    private final static QName _Writers_QNAME = new QName("", "writers");
    private final static QName _Nominations_QNAME = new QName("", "nominations");
    private final static QName _Narrator_QNAME = new QName("", "narrator");
    private final static QName _MusicalTheme_QNAME = new QName("", "musical_theme");
    private final static QName _ProgramCreators_QNAME = new QName("", "program_creators");
    private final static QName _Awards_QNAME = new QName("", "awards");
    private final static QName _Name_QNAME = new QName("", "name");
    private final static QName _SpinOff_QNAME = new QName("", "spin_off");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Rating }
     * 
     */
    public Rating createRating() {
        return new Rating();
    }

    /**
     * Create an instance of {@link Episode }
     * 
     */
    public Episode createEpisode() {
        return new Episode();
    }

    /**
     * Create an instance of {@link Cast }
     * 
     */
    public Cast createCast() {
        return new Cast();
    }

    /**
     * Create an instance of {@link Project }
     * 
     */
    public Project createProject() {
        return new Project();
    }

    /**
     * Create an instance of {@link Serie }
     * 
     */
    public Serie createSerie() {
        return new Serie();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "date")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDate(String value) {
        return new JAXBElement<String>(_Date_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "number_of_episodes")
    public JAXBElement<BigInteger> createNumberOfEpisodes(BigInteger value) {
        return new JAXBElement<BigInteger>(_NumberOfEpisodes_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "first_episode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createFirstEpisode(String value) {
        return new JAXBElement<String>(_FirstEpisode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "description")
    public JAXBElement<String> createDescription(String value) {
        return new JAXBElement<String>(_Description_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "source")
    public JAXBElement<String> createSource(String value) {
        return new JAXBElement<String>(_Source_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "title")
    public JAXBElement<String> createTitle(String value) {
        return new JAXBElement<String>(_Title_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "type")
    public JAXBElement<String> createType(String value) {
        return new JAXBElement<String>(_Type_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "network")
    public JAXBElement<String> createNetwork(String value) {
        return new JAXBElement<String>(_Network_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "number")
    public JAXBElement<BigInteger> createNumber(BigInteger value) {
        return new JAXBElement<BigInteger>(_Number_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "character")
    public JAXBElement<String> createCharacter(String value) {
        return new JAXBElement<String>(_Character_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "serie_name")
    public JAXBElement<String> createSerieName(String value) {
        return new JAXBElement<String>(_SerieName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "genre")
    public JAXBElement<String> createGenre(String value) {
        return new JAXBElement<String>(_Genre_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "season")
    public JAXBElement<BigInteger> createSeason(BigInteger value) {
        return new JAXBElement<BigInteger>(_Season_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "number_of_seasons")
    public JAXBElement<BigInteger> createNumberOfSeasons(BigInteger value) {
        return new JAXBElement<BigInteger>(_NumberOfSeasons_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "value")
    public JAXBElement<String> createValue(String value) {
        return new JAXBElement<String>(_Value_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "languages")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createLanguages(String value) {
        return new JAXBElement<String>(_Languages_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "profiles")
    public JAXBElement<String> createProfiles(String value) {
        return new JAXBElement<String>(_Profiles_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "writers")
    public JAXBElement<String> createWriters(String value) {
        return new JAXBElement<String>(_Writers_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "nominations")
    public JAXBElement<String> createNominations(String value) {
        return new JAXBElement<String>(_Nominations_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "narrator")
    public JAXBElement<String> createNarrator(String value) {
        return new JAXBElement<String>(_Narrator_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "musical_theme")
    public JAXBElement<String> createMusicalTheme(String value) {
        return new JAXBElement<String>(_MusicalTheme_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "program_creators")
    public JAXBElement<String> createProgramCreators(String value) {
        return new JAXBElement<String>(_ProgramCreators_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "awards")
    public JAXBElement<String> createAwards(String value) {
        return new JAXBElement<String>(_Awards_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "name")
    public JAXBElement<String> createName(String value) {
        return new JAXBElement<String>(_Name_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "spin_off")
    public JAXBElement<String> createSpinOff(String value) {
        return new JAXBElement<String>(_SpinOff_QNAME, String.class, null, value);
    }

}
