// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.managednetworkfabric.fluent.NetworkPacketBrokersClient;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.NetworkPacketBrokerInner;
import com.azure.resourcemanager.managednetworkfabric.models.NetworkPacketBroker;
import com.azure.resourcemanager.managednetworkfabric.models.NetworkPacketBrokers;

public final class NetworkPacketBrokersImpl implements NetworkPacketBrokers {
    private static final ClientLogger LOGGER = new ClientLogger(NetworkPacketBrokersImpl.class);

    private final NetworkPacketBrokersClient innerClient;

    private final com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager serviceManager;

    public NetworkPacketBrokersImpl(NetworkPacketBrokersClient innerClient,
        com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<NetworkPacketBroker> getByResourceGroupWithResponse(String resourceGroupName,
        String networkPacketBrokerName, Context context) {
        Response<NetworkPacketBrokerInner> inner
            = this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, networkPacketBrokerName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new NetworkPacketBrokerImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public NetworkPacketBroker getByResourceGroup(String resourceGroupName, String networkPacketBrokerName) {
        NetworkPacketBrokerInner inner
            = this.serviceClient().getByResourceGroup(resourceGroupName, networkPacketBrokerName);
        if (inner != null) {
            return new NetworkPacketBrokerImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String networkPacketBrokerName) {
        this.serviceClient().delete(resourceGroupName, networkPacketBrokerName);
    }

    public void delete(String resourceGroupName, String networkPacketBrokerName, Context context) {
        this.serviceClient().delete(resourceGroupName, networkPacketBrokerName, context);
    }

    public PagedIterable<NetworkPacketBroker> listByResourceGroup(String resourceGroupName) {
        PagedIterable<NetworkPacketBrokerInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new NetworkPacketBrokerImpl(inner1, this.manager()));
    }

    public PagedIterable<NetworkPacketBroker> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<NetworkPacketBrokerInner> inner
            = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new NetworkPacketBrokerImpl(inner1, this.manager()));
    }

    public PagedIterable<NetworkPacketBroker> list() {
        PagedIterable<NetworkPacketBrokerInner> inner = this.serviceClient().list();
        return ResourceManagerUtils.mapPage(inner, inner1 -> new NetworkPacketBrokerImpl(inner1, this.manager()));
    }

    public PagedIterable<NetworkPacketBroker> list(Context context) {
        PagedIterable<NetworkPacketBrokerInner> inner = this.serviceClient().list(context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new NetworkPacketBrokerImpl(inner1, this.manager()));
    }

    public NetworkPacketBroker getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String networkPacketBrokerName = ResourceManagerUtils.getValueFromIdByName(id, "networkPacketBrokers");
        if (networkPacketBrokerName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'networkPacketBrokers'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, networkPacketBrokerName, Context.NONE).getValue();
    }

    public Response<NetworkPacketBroker> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String networkPacketBrokerName = ResourceManagerUtils.getValueFromIdByName(id, "networkPacketBrokers");
        if (networkPacketBrokerName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'networkPacketBrokers'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, networkPacketBrokerName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String networkPacketBrokerName = ResourceManagerUtils.getValueFromIdByName(id, "networkPacketBrokers");
        if (networkPacketBrokerName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'networkPacketBrokers'.", id)));
        }
        this.delete(resourceGroupName, networkPacketBrokerName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String networkPacketBrokerName = ResourceManagerUtils.getValueFromIdByName(id, "networkPacketBrokers");
        if (networkPacketBrokerName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'networkPacketBrokers'.", id)));
        }
        this.delete(resourceGroupName, networkPacketBrokerName, context);
    }

    private NetworkPacketBrokersClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager manager() {
        return this.serviceManager;
    }

    public NetworkPacketBrokerImpl define(String name) {
        return new NetworkPacketBrokerImpl(name, this.manager());
    }
}
