// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for AuthType. */
public final class AuthType extends ExpandableStringEnum<AuthType> {
    /** Static value Invalid for AuthType. */
    public static final AuthType INVALID = fromString("Invalid");

    /** Static value ACS for AuthType. */
    public static final AuthType ACS = fromString("ACS");

    /** Static value AAD for AuthType. */
    public static final AuthType AAD = fromString("AAD");

    /** Static value AccessControlService for AuthType. */
    public static final AuthType ACCESS_CONTROL_SERVICE = fromString("AccessControlService");

    /** Static value AzureActiveDirectory for AuthType. */
    public static final AuthType AZURE_ACTIVE_DIRECTORY = fromString("AzureActiveDirectory");

    /**
     * Creates or finds a AuthType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AuthType.
     */
    @JsonCreator
    public static AuthType fromString(String name) {
        return fromString(name, AuthType.class);
    }

    /**
     * Gets known AuthType values.
     *
     * @return known AuthType values.
     */
    public static Collection<AuthType> values() {
        return values(AuthType.class);
    }
}
