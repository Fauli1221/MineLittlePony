package com.minelittlepony.model.capabilities;

import com.minelittlepony.pony.data.IPonyData;

public interface IModelWrapper {
    /**
     * Initialises this wrapper's contained models.
     */
    void init();

    /**
     * Updates metadata values to this wrapper's contained models.
     */
    void apply(IPonyData meta);
}
