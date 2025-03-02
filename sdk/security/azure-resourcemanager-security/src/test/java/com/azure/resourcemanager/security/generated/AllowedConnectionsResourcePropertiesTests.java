// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.fluent.models.AllowedConnectionsResourceProperties;

public final class AllowedConnectionsResourcePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AllowedConnectionsResourceProperties model = BinaryData.fromString(
            "{\"calculatedDateTime\":\"2021-03-30T12:46:09Z\",\"connectableResources\":[{\"id\":\"sdszue\",\"inboundConnectedResources\":[{\"connectedResourceId\":\"zkfzbeyv\",\"tcpPorts\":\"qi\",\"udpPorts\":\"invkjjxdxrbuu\"},{\"connectedResourceId\":\"clewyhm\",\"tcpPorts\":\"paztzpofncck\",\"udpPorts\":\"fz\"}],\"outboundConnectedResources\":[{\"connectedResourceId\":\"xbuy\",\"tcpPorts\":\"xzfe\",\"udpPorts\":\"tpp\"}]},{\"id\":\"o\",\"inboundConnectedResources\":[{\"connectedResourceId\":\"jaltolmnc\",\"tcpPorts\":\"obqwcsdbnwdcfh\",\"udpPorts\":\"qdpfuvglsbjjca\"}],\"outboundConnectedResources\":[{\"connectedResourceId\":\"vtvudutncormr\",\"tcpPorts\":\"qtvcofudflvkgj\",\"udpPorts\":\"gdknnqv\"},{\"connectedResourceId\":\"znqntoru\",\"tcpPorts\":\"gsahmkycgrauw\",\"udpPorts\":\"etaebu\"}]}]}")
            .toObject(AllowedConnectionsResourceProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AllowedConnectionsResourceProperties model = new AllowedConnectionsResourceProperties();
        model = BinaryData.fromObject(model).toObject(AllowedConnectionsResourceProperties.class);
    }
}
