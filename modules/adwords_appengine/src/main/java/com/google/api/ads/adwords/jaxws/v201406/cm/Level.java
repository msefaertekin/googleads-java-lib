
package com.google.api.ads.adwords.jaxws.v201406.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Level.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Level">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CREATIVE"/>
 *     &lt;enumeration value="ADGROUP"/>
 *     &lt;enumeration value="CAMPAIGN"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Level")
@XmlEnum
public enum Level {


    /**
     * 
     *                 The cap is applied at the creative level.
     *               
     * 
     */
    CREATIVE,

    /**
     * 
     *                 The cap is applied at the ad group level.
     *               
     * 
     */
    ADGROUP,

    /**
     * 
     *                 The cap is applied at the campaign level.
     *               
     * 
     */
    CAMPAIGN,

    /**
     * 
     *                 This value cannot be set by the user and sent to the AdWords API servers,
     *                 as it would generate a RejectedError.
     *                 It can only be received by the user from the AdWords API servers and it
     *                 means that a new value available in a newer API release version is not
     *                 known in the current API release version.
     *                 If the user encounters this value, it means an upgrade is required
     *                 in order to take advantage of the latest AdWords API functionality.
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static Level fromValue(String v) {
        return valueOf(v);
    }

}
