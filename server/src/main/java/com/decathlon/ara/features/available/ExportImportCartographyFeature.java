package com.decathlon.ara.features.available;

import com.decathlon.ara.features.IFeature;

public class ExportImportCartographyFeature implements IFeature {
    @Override
    public String getCode() {
        return "xprt-mprt-crtg";
    }

    @Override
    public String getName() {
        return "Export/Import a Cartography";
    }

    @Override
    public String getDescription() {
        return "Enable Export and/or Import of a Cartography (filtered or not) of functionalities.";
    }
}
