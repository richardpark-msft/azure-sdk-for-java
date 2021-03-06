/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2018_04_01.implementation;

import com.microsoft.azure.management.iothub.v2018_04_01.EventHubConsumerGroupInfo;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import java.util.Map;

class EventHubConsumerGroupInfoImpl extends CreatableUpdatableImpl<EventHubConsumerGroupInfo, EventHubConsumerGroupInfoInner, EventHubConsumerGroupInfoImpl> implements EventHubConsumerGroupInfo, EventHubConsumerGroupInfo.Definition, EventHubConsumerGroupInfo.Update {
    private final IoTHubManager manager;
    private String resourceGroupName;
    private String resourceName;
    private String eventHubEndpointName;
    private String name;

    EventHubConsumerGroupInfoImpl(String name, IoTHubManager manager) {
        super(name, new EventHubConsumerGroupInfoInner());
        this.manager = manager;
        // Set resource name
        this.name = name;
        //
    }

    EventHubConsumerGroupInfoImpl(EventHubConsumerGroupInfoInner inner, IoTHubManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.name = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.resourceName = IdParsingUtils.getValueFromIdByName(inner.id(), "IotHubs");
        this.eventHubEndpointName = IdParsingUtils.getValueFromIdByName(inner.id(), "eventHubEndpoints");
        this.name = IdParsingUtils.getValueFromIdByName(inner.id(), "ConsumerGroups");
        //
    }

    @Override
    public IoTHubManager manager() {
        return this.manager;
    }

    @Override
    public Observable<EventHubConsumerGroupInfo> createResourceAsync() {
        IotHubResourcesInner client = this.manager().inner().iotHubResources();
        return client.createEventHubConsumerGroupAsync(this.resourceGroupName, this.resourceName, this.eventHubEndpointName, this.name)
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<EventHubConsumerGroupInfo> updateResourceAsync() {
        IotHubResourcesInner client = this.manager().inner().iotHubResources();
        return client.createEventHubConsumerGroupAsync(this.resourceGroupName, this.resourceName, this.eventHubEndpointName, this.name)
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<EventHubConsumerGroupInfoInner> getInnerAsync() {
        IotHubResourcesInner client = this.manager().inner().iotHubResources();
        return client.getEventHubConsumerGroupAsync(this.resourceGroupName, this.resourceName, this.eventHubEndpointName, this.name);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public Map<String, String> properties() {
        return this.inner().properties();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public EventHubConsumerGroupInfoImpl withExistingEventHubEndpoint(String resourceGroupName, String resourceName, String eventHubEndpointName) {
        this.resourceGroupName = resourceGroupName;
        this.resourceName = resourceName;
        this.eventHubEndpointName = eventHubEndpointName;
        return this;
    }

}
