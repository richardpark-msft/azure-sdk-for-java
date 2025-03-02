// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loadtesting.generated;

/**
 * Samples for LoadTests CreateOrUpdate.
 */
public final class LoadTestsCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/loadtestservice/resource-manager/Microsoft.LoadTestService/stable/2022-12-01/examples/
     * LoadTests_CreateOrUpdate.json
     */
    /**
     * Sample code: Create a LoadTestResource.
     * 
     * @param manager Entry point to LoadTestManager.
     */
    public static void createALoadTestResource(com.azure.resourcemanager.loadtesting.LoadTestManager manager) {
        manager.loadTests()
            .define("myLoadTest")
            .withRegion((String) null)
            .withExistingResourceGroup("dummyrg")
            .create();
    }
}
