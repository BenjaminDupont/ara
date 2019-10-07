package com.decathlon.ara.cartography;

public class SquashExporter implements Exporter {
    @Override
    public String getName() {
        return "SquashTM";
    }

    @Override
    public String getDescription() {
        return "Export this cartography to import it as requirements in SquashTM";
    }

    @Override
    public String getFormat() {
        return "xls";
    }
}
