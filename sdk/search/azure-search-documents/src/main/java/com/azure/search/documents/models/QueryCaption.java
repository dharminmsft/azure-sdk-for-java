// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for QueryCaption. */
public final class QueryCaption extends ExpandableStringEnum<QueryCaption> {
    /** Static value none for QueryCaption. */
    public static final QueryCaption NONE = fromString("none");

    /** Static value extractive for QueryCaption. */
    public static final QueryCaption EXTRACTIVE = fromString("extractive");

    /**
     * Creates or finds a QueryCaption from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding QueryCaption.
     */
    @JsonCreator
    public static QueryCaption fromString(String name) {
        return fromString(name, QueryCaption.class);
    }

    /** @return known QueryCaption values. */
    public static Collection<QueryCaption> values() {
        return values(QueryCaption.class);
    }
}