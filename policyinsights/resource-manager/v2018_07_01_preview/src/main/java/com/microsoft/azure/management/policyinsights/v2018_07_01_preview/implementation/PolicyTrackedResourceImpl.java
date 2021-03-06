/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.policyinsights.v2018_07_01_preview.implementation;

import com.microsoft.azure.management.policyinsights.v2018_07_01_preview.PolicyTrackedResource;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.policyinsights.v2018_07_01_preview.TrackedResourceModificationDetails;
import org.joda.time.DateTime;
import com.microsoft.azure.management.policyinsights.v2018_07_01_preview.PolicyDetails;

class PolicyTrackedResourceImpl extends WrapperImpl<PolicyTrackedResourceInner> implements PolicyTrackedResource {
    private final PolicyInsightsManager manager;
    PolicyTrackedResourceImpl(PolicyTrackedResourceInner inner, PolicyInsightsManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public PolicyInsightsManager manager() {
        return this.manager;
    }

    @Override
    public TrackedResourceModificationDetails createdBy() {
        return this.inner().createdBy();
    }

    @Override
    public TrackedResourceModificationDetails lastModifiedBy() {
        return this.inner().lastModifiedBy();
    }

    @Override
    public DateTime lastUpdateUtc() {
        return this.inner().lastUpdateUtc();
    }

    @Override
    public PolicyDetails policyDetails() {
        return this.inner().policyDetails();
    }

    @Override
    public String trackedResourceId() {
        return this.inner().trackedResourceId();
    }

}
