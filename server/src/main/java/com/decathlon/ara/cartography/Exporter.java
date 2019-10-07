package com.decathlon.ara.cartography;

/**
 * Describe the API to implement for exporting a ARA Cartography to a file.
 *
 * @author Sylvain Nieuwlandt
 * @since 4.1.0
 */
public interface Exporter {
    /**
     * The name of the exporter to display in ARA.
     *
     * @return the name of the exporter
     */
    String getName();

    /**
     * The description of the exporter to display in ARA.
     *
     * @return the description of the exporter
     */
    String getDescription();

    /**
     * The format of the export used by the implemented exporter.
     *
     * @return the format of the export
     */
    String getFormat();
}
