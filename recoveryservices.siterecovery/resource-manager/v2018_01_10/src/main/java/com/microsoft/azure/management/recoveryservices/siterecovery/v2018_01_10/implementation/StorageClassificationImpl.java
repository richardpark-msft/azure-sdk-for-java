/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10.implementation;

import com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10.StorageClassification;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10.StorageClassificationProperties;

class StorageClassificationImpl extends IndexableRefreshableWrapperImpl<StorageClassification, StorageClassificationInner> implements StorageClassification {
    private final RecoveryServicesManager manager;
    private String fabricName;
    private String storageClassificationName;

    StorageClassificationImpl(StorageClassificationInner inner,  RecoveryServicesManager manager) {
        super(null, inner);
        this.manager = manager;
        // set resource ancestor and positional variables
        this.fabricName = IdParsingUtils.getValueFromIdByName(inner.id(), "replicationFabrics");
        this.storageClassificationName = IdParsingUtils.getValueFromIdByName(inner.id(), "replicationStorageClassifications");
    }

    @Override
    public RecoveryServicesManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<StorageClassificationInner> getInnerAsync() {
        ReplicationStorageClassificationsInner client = this.manager().inner().replicationStorageClassifications();
        return client.getAsync(this.fabricName, this.storageClassificationName);
    }



    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public StorageClassificationProperties properties() {
        return this.inner().properties();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
