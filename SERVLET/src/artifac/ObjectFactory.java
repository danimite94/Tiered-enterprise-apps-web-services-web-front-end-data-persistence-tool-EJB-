
package artifac;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the artifac package. 
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

    private final static QName _GetfullList_QNAME = new QName("http://webser/", "getfull_list");
    private final static QName _GetsingleResponse_QNAME = new QName("http://webser/", "getsingleResponse");
    private final static QName _GettitleList_QNAME = new QName("http://webser/", "gettitle_list");
    private final static QName _GetfullListResponse_QNAME = new QName("http://webser/", "getfull_listResponse");
    private final static QName _Getordenas_QNAME = new QName("http://webser/", "getordenas");
    private final static QName _Getsingle_QNAME = new QName("http://webser/", "getsingle");
    private final static QName _GetordenasResponse_QNAME = new QName("http://webser/", "getordenasResponse");
    private final static QName _GettitleListResponse_QNAME = new QName("http://webser/", "gettitle_listResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: artifac
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetfullListResponse }
     * 
     */
    public GetfullListResponse createGetfullListResponse() {
        return new GetfullListResponse();
    }

    /**
     * Create an instance of {@link Getsingle }
     * 
     */
    public Getsingle createGetsingle() {
        return new Getsingle();
    }

    /**
     * Create an instance of {@link GetordenasResponse }
     * 
     */
    public GetordenasResponse createGetordenasResponse() {
        return new GetordenasResponse();
    }

    /**
     * Create an instance of {@link GettitleListResponse }
     * 
     */
    public GettitleListResponse createGettitleListResponse() {
        return new GettitleListResponse();
    }

    /**
     * Create an instance of {@link Getordenas }
     * 
     */
    public Getordenas createGetordenas() {
        return new Getordenas();
    }

    /**
     * Create an instance of {@link GetsingleResponse }
     * 
     */
    public GetsingleResponse createGetsingleResponse() {
        return new GetsingleResponse();
    }

    /**
     * Create an instance of {@link GetfullList }
     * 
     */
    public GetfullList createGetfullList() {
        return new GetfullList();
    }

    /**
     * Create an instance of {@link GettitleList }
     * 
     */
    public GettitleList createGettitleList() {
        return new GettitleList();
    }

    /**
     * Create an instance of {@link Publicationoficial }
     * 
     */
    public Publicationoficial createPublicationoficial() {
        return new Publicationoficial();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetfullList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webser/", name = "getfull_list")
    public JAXBElement<GetfullList> createGetfullList(GetfullList value) {
        return new JAXBElement<GetfullList>(_GetfullList_QNAME, GetfullList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetsingleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webser/", name = "getsingleResponse")
    public JAXBElement<GetsingleResponse> createGetsingleResponse(GetsingleResponse value) {
        return new JAXBElement<GetsingleResponse>(_GetsingleResponse_QNAME, GetsingleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GettitleList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webser/", name = "gettitle_list")
    public JAXBElement<GettitleList> createGettitleList(GettitleList value) {
        return new JAXBElement<GettitleList>(_GettitleList_QNAME, GettitleList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetfullListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webser/", name = "getfull_listResponse")
    public JAXBElement<GetfullListResponse> createGetfullListResponse(GetfullListResponse value) {
        return new JAXBElement<GetfullListResponse>(_GetfullListResponse_QNAME, GetfullListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Getordenas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webser/", name = "getordenas")
    public JAXBElement<Getordenas> createGetordenas(Getordenas value) {
        return new JAXBElement<Getordenas>(_Getordenas_QNAME, Getordenas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Getsingle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webser/", name = "getsingle")
    public JAXBElement<Getsingle> createGetsingle(Getsingle value) {
        return new JAXBElement<Getsingle>(_Getsingle_QNAME, Getsingle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetordenasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webser/", name = "getordenasResponse")
    public JAXBElement<GetordenasResponse> createGetordenasResponse(GetordenasResponse value) {
        return new JAXBElement<GetordenasResponse>(_GetordenasResponse_QNAME, GetordenasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GettitleListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webser/", name = "gettitle_listResponse")
    public JAXBElement<GettitleListResponse> createGettitleListResponse(GettitleListResponse value) {
        return new JAXBElement<GettitleListResponse>(_GettitleListResponse_QNAME, GettitleListResponse.class, null, value);
    }

}
