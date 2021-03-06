/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_12_01;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * AzureWorkload SAP Hana-specific restore.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "objectType")
@JsonTypeName("AzureWorkloadSAPHanaRestoreRequest")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "AzureWorkloadSAPHanaPointInTimeRestoreRequest", value = AzureWorkloadSAPHanaPointInTimeRestoreRequest.class)
})
public class AzureWorkloadSAPHanaRestoreRequest extends RestoreRequest {
    /**
     * Details of target database.
     */
    @JsonProperty(value = "targetInfo")
    private TargetRestoreInfo targetInfo;

    /**
     * OLR/ALR, RestoreDisks is invalid option. Possible values include:
     * 'Invalid', 'OriginalLocation', 'AlternateLocation', 'RestoreDisks'.
     */
    @JsonProperty(value = "recoveryType")
    private RecoveryType recoveryType;

    /**
     * Fully qualified ARM ID of the VM on which workload that was running is
     * being recovered.
     */
    @JsonProperty(value = "sourceResourceId")
    private String sourceResourceId;

    /**
     * Workload specific property bag.
     */
    @JsonProperty(value = "propertyBag")
    private Map<String, String> propertyBag;

    /**
     * Get details of target database.
     *
     * @return the targetInfo value
     */
    public TargetRestoreInfo targetInfo() {
        return this.targetInfo;
    }

    /**
     * Set details of target database.
     *
     * @param targetInfo the targetInfo value to set
     * @return the AzureWorkloadSAPHanaRestoreRequest object itself.
     */
    public AzureWorkloadSAPHanaRestoreRequest withTargetInfo(TargetRestoreInfo targetInfo) {
        this.targetInfo = targetInfo;
        return this;
    }

    /**
     * Get oLR/ALR, RestoreDisks is invalid option. Possible values include: 'Invalid', 'OriginalLocation', 'AlternateLocation', 'RestoreDisks'.
     *
     * @return the recoveryType value
     */
    public RecoveryType recoveryType() {
        return this.recoveryType;
    }

    /**
     * Set oLR/ALR, RestoreDisks is invalid option. Possible values include: 'Invalid', 'OriginalLocation', 'AlternateLocation', 'RestoreDisks'.
     *
     * @param recoveryType the recoveryType value to set
     * @return the AzureWorkloadSAPHanaRestoreRequest object itself.
     */
    public AzureWorkloadSAPHanaRestoreRequest withRecoveryType(RecoveryType recoveryType) {
        this.recoveryType = recoveryType;
        return this;
    }

    /**
     * Get fully qualified ARM ID of the VM on which workload that was running is being recovered.
     *
     * @return the sourceResourceId value
     */
    public String sourceResourceId() {
        return this.sourceResourceId;
    }

    /**
     * Set fully qualified ARM ID of the VM on which workload that was running is being recovered.
     *
     * @param sourceResourceId the sourceResourceId value to set
     * @return the AzureWorkloadSAPHanaRestoreRequest object itself.
     */
    public AzureWorkloadSAPHanaRestoreRequest withSourceResourceId(String sourceResourceId) {
        this.sourceResourceId = sourceResourceId;
        return this;
    }

    /**
     * Get workload specific property bag.
     *
     * @return the propertyBag value
     */
    public Map<String, String> propertyBag() {
        return this.propertyBag;
    }

    /**
     * Set workload specific property bag.
     *
     * @param propertyBag the propertyBag value to set
     * @return the AzureWorkloadSAPHanaRestoreRequest object itself.
     */
    public AzureWorkloadSAPHanaRestoreRequest withPropertyBag(Map<String, String> propertyBag) {
        this.propertyBag = propertyBag;
        return this;
    }

}
