// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.synapse.fluent.models.ManagedIdentitySqlControlSettingsModelInner;

/**
 * An instance of this class provides access to all the operations defined in
 * WorkspaceManagedIdentitySqlControlSettingsClient.
 */
public interface WorkspaceManagedIdentitySqlControlSettingsClient {
    /**
     * Get Managed Identity Sql Control Settings.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return managed Identity Sql Control Settings along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ManagedIdentitySqlControlSettingsModelInner> getWithResponse(String resourceGroupName,
        String workspaceName, Context context);

    /**
     * Get Managed Identity Sql Control Settings.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return managed Identity Sql Control Settings.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ManagedIdentitySqlControlSettingsModelInner get(String resourceGroupName, String workspaceName);

    /**
     * Create or update Managed Identity Sql Control Settings.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param managedIdentitySqlControlSettings Managed Identity Sql Control Settings.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of managed Identity Sql Control Settings.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ManagedIdentitySqlControlSettingsModelInner>, ManagedIdentitySqlControlSettingsModelInner>
        beginCreateOrUpdate(String resourceGroupName, String workspaceName,
            ManagedIdentitySqlControlSettingsModelInner managedIdentitySqlControlSettings);

    /**
     * Create or update Managed Identity Sql Control Settings.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param managedIdentitySqlControlSettings Managed Identity Sql Control Settings.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of managed Identity Sql Control Settings.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ManagedIdentitySqlControlSettingsModelInner>, ManagedIdentitySqlControlSettingsModelInner>
        beginCreateOrUpdate(String resourceGroupName, String workspaceName,
            ManagedIdentitySqlControlSettingsModelInner managedIdentitySqlControlSettings, Context context);

    /**
     * Create or update Managed Identity Sql Control Settings.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param managedIdentitySqlControlSettings Managed Identity Sql Control Settings.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return managed Identity Sql Control Settings.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ManagedIdentitySqlControlSettingsModelInner createOrUpdate(String resourceGroupName, String workspaceName,
        ManagedIdentitySqlControlSettingsModelInner managedIdentitySqlControlSettings);

    /**
     * Create or update Managed Identity Sql Control Settings.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param managedIdentitySqlControlSettings Managed Identity Sql Control Settings.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return managed Identity Sql Control Settings.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ManagedIdentitySqlControlSettingsModelInner createOrUpdate(String resourceGroupName, String workspaceName,
        ManagedIdentitySqlControlSettingsModelInner managedIdentitySqlControlSettings, Context context);
}
