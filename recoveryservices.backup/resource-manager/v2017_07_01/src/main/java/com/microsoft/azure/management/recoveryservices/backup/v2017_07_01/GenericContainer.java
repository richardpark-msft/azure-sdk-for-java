/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2017_07_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.implementation.ProtectionContainerInner;

/**
 * Base class for generic container of backup items.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "containerType")
@JsonTypeName("GenericContainer")
public class GenericContainer extends ProtectionContainerInner {
    /**
     * Name of the container's fabric.
     */
    @JsonProperty(value = "fabricName")
    private String fabricName;

    /**
     * Extended information (not returned in List container API calls).
     */
    @JsonProperty(value = "extendedInformation")
    private GenericContainerExtendedInfo extendedInformation;

    /**
     * Get name of the container's fabric.
     *
     * @return the fabricName value
     */
    public String fabricName() {
        return this.fabricName;
    }

    /**
     * Set name of the container's fabric.
     *
     * @param fabricName the fabricName value to set
     * @return the GenericContainer object itself.
     */
    public GenericContainer withFabricName(String fabricName) {
        this.fabricName = fabricName;
        return this;
    }

    /**
     * Get extended information (not returned in List container API calls).
     *
     * @return the extendedInformation value
     */
    public GenericContainerExtendedInfo extendedInformation() {
        return this.extendedInformation;
    }

    /**
     * Set extended information (not returned in List container API calls).
     *
     * @param extendedInformation the extendedInformation value to set
     * @return the GenericContainer object itself.
     */
    public GenericContainer withExtendedInformation(GenericContainerExtendedInfo extendedInformation) {
        this.extendedInformation = extendedInformation;
        return this;
    }

}
