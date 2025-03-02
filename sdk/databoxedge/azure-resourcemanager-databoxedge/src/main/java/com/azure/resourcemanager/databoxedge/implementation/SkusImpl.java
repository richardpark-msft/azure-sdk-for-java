// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.databoxedge.fluent.SkusClient;
import com.azure.resourcemanager.databoxedge.fluent.models.ResourceTypeSkuInner;
import com.azure.resourcemanager.databoxedge.models.ResourceTypeSku;
import com.azure.resourcemanager.databoxedge.models.Skus;

public final class SkusImpl implements Skus {
    private static final ClientLogger LOGGER = new ClientLogger(SkusImpl.class);

    private final SkusClient innerClient;

    private final com.azure.resourcemanager.databoxedge.DataBoxEdgeManager serviceManager;

    public SkusImpl(SkusClient innerClient, com.azure.resourcemanager.databoxedge.DataBoxEdgeManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ResourceTypeSku> list() {
        PagedIterable<ResourceTypeSkuInner> inner = this.serviceClient().list();
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ResourceTypeSkuImpl(inner1, this.manager()));
    }

    public PagedIterable<ResourceTypeSku> list(String filter, Context context) {
        PagedIterable<ResourceTypeSkuInner> inner = this.serviceClient().list(filter, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ResourceTypeSkuImpl(inner1, this.manager()));
    }

    private SkusClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.databoxedge.DataBoxEdgeManager manager() {
        return this.serviceManager;
    }
}
