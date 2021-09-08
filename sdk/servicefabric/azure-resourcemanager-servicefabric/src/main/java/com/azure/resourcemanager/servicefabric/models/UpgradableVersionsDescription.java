// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The UpgradableVersionsDescription model. */
@Fluent
public final class UpgradableVersionsDescription {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(UpgradableVersionsDescription.class);

    /*
     * The target code version.
     */
    @JsonProperty(value = "targetVersion", required = true)
    private String targetVersion;

    /**
     * Get the targetVersion property: The target code version.
     *
     * @return the targetVersion value.
     */
    public String targetVersion() {
        return this.targetVersion;
    }

    /**
     * Set the targetVersion property: The target code version.
     *
     * @param targetVersion the targetVersion value to set.
     * @return the UpgradableVersionsDescription object itself.
     */
    public UpgradableVersionsDescription withTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (targetVersion() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property targetVersion in model UpgradableVersionsDescription"));
        }
    }
}