// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.apimanagement.fluent.models.IssueContractInner;
import java.time.OffsetDateTime;

/**
 * An immutable client-side representation of IssueContract.
 */
public interface IssueContract {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the title property: The issue title.
     * 
     * @return the title value.
     */
    String title();

    /**
     * Gets the description property: Text describing the issue.
     * 
     * @return the description value.
     */
    String description();

    /**
     * Gets the userId property: A resource identifier for the user created the issue.
     * 
     * @return the userId value.
     */
    String userId();

    /**
     * Gets the createdDate property: Date and time when the issue was created.
     * 
     * @return the createdDate value.
     */
    OffsetDateTime createdDate();

    /**
     * Gets the state property: Status of the issue.
     * 
     * @return the state value.
     */
    State state();

    /**
     * Gets the apiId property: A resource identifier for the API the issue was created for.
     * 
     * @return the apiId value.
     */
    String apiId();

    /**
     * Gets the name of the resource group.
     * 
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.apimanagement.fluent.models.IssueContractInner object.
     * 
     * @return the inner object.
     */
    IssueContractInner innerModel();

    /**
     * The entirety of the IssueContract definition.
     */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /**
     * The IssueContract definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the IssueContract definition.
         */
        interface Blank extends WithParentResource {
        }

        /**
         * The stage of the IssueContract definition allowing to specify parent resource.
         */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, serviceName, apiId.
             * 
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param serviceName The name of the API Management service.
             * @param apiId API identifier. Must be unique in the current API Management service instance.
             * @return the next definition stage.
             */
            WithCreate withExistingApi(String resourceGroupName, String serviceName, String apiId);
        }

        /**
         * The stage of the IssueContract definition which contains all the minimum required properties for the resource
         * to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithTitle, DefinitionStages.WithDescription,
            DefinitionStages.WithUserId, DefinitionStages.WithCreatedDate, DefinitionStages.WithState,
            DefinitionStages.WithApiId, DefinitionStages.WithIfMatch {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            IssueContract create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            IssueContract create(Context context);
        }

        /**
         * The stage of the IssueContract definition allowing to specify title.
         */
        interface WithTitle {
            /**
             * Specifies the title property: The issue title..
             * 
             * @param title The issue title.
             * @return the next definition stage.
             */
            WithCreate withTitle(String title);
        }

        /**
         * The stage of the IssueContract definition allowing to specify description.
         */
        interface WithDescription {
            /**
             * Specifies the description property: Text describing the issue..
             * 
             * @param description Text describing the issue.
             * @return the next definition stage.
             */
            WithCreate withDescription(String description);
        }

        /**
         * The stage of the IssueContract definition allowing to specify userId.
         */
        interface WithUserId {
            /**
             * Specifies the userId property: A resource identifier for the user created the issue..
             * 
             * @param userId A resource identifier for the user created the issue.
             * @return the next definition stage.
             */
            WithCreate withUserId(String userId);
        }

        /**
         * The stage of the IssueContract definition allowing to specify createdDate.
         */
        interface WithCreatedDate {
            /**
             * Specifies the createdDate property: Date and time when the issue was created..
             * 
             * @param createdDate Date and time when the issue was created.
             * @return the next definition stage.
             */
            WithCreate withCreatedDate(OffsetDateTime createdDate);
        }

        /**
         * The stage of the IssueContract definition allowing to specify state.
         */
        interface WithState {
            /**
             * Specifies the state property: Status of the issue..
             * 
             * @param state Status of the issue.
             * @return the next definition stage.
             */
            WithCreate withState(State state);
        }

        /**
         * The stage of the IssueContract definition allowing to specify apiId.
         */
        interface WithApiId {
            /**
             * Specifies the apiId property: A resource identifier for the API the issue was created for..
             * 
             * @param apiId A resource identifier for the API the issue was created for.
             * @return the next definition stage.
             */
            WithCreate withApiId(String apiId);
        }

        /**
         * The stage of the IssueContract definition allowing to specify ifMatch.
         */
        interface WithIfMatch {
            /**
             * Specifies the ifMatch property: ETag of the Entity. Not required when creating an entity, but required
             * when updating an entity..
             * 
             * @param ifMatch ETag of the Entity. Not required when creating an entity, but required when updating an
             * entity.
             * @return the next definition stage.
             */
            WithCreate withIfMatch(String ifMatch);
        }
    }

    /**
     * Begins update for the IssueContract resource.
     * 
     * @return the stage of resource update.
     */
    IssueContract.Update update();

    /**
     * The template for IssueContract update.
     */
    interface Update extends UpdateStages.WithTitle, UpdateStages.WithDescription, UpdateStages.WithUserId,
        UpdateStages.WithCreatedDate, UpdateStages.WithState, UpdateStages.WithApiId, UpdateStages.WithIfMatch {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        IssueContract apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        IssueContract apply(Context context);
    }

    /**
     * The IssueContract update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the IssueContract update allowing to specify title.
         */
        interface WithTitle {
            /**
             * Specifies the title property: The issue title..
             * 
             * @param title The issue title.
             * @return the next definition stage.
             */
            Update withTitle(String title);
        }

        /**
         * The stage of the IssueContract update allowing to specify description.
         */
        interface WithDescription {
            /**
             * Specifies the description property: Text describing the issue..
             * 
             * @param description Text describing the issue.
             * @return the next definition stage.
             */
            Update withDescription(String description);
        }

        /**
         * The stage of the IssueContract update allowing to specify userId.
         */
        interface WithUserId {
            /**
             * Specifies the userId property: A resource identifier for the user created the issue..
             * 
             * @param userId A resource identifier for the user created the issue.
             * @return the next definition stage.
             */
            Update withUserId(String userId);
        }

        /**
         * The stage of the IssueContract update allowing to specify createdDate.
         */
        interface WithCreatedDate {
            /**
             * Specifies the createdDate property: Date and time when the issue was created..
             * 
             * @param createdDate Date and time when the issue was created.
             * @return the next definition stage.
             */
            Update withCreatedDate(OffsetDateTime createdDate);
        }

        /**
         * The stage of the IssueContract update allowing to specify state.
         */
        interface WithState {
            /**
             * Specifies the state property: Status of the issue..
             * 
             * @param state Status of the issue.
             * @return the next definition stage.
             */
            Update withState(State state);
        }

        /**
         * The stage of the IssueContract update allowing to specify apiId.
         */
        interface WithApiId {
            /**
             * Specifies the apiId property: A resource identifier for the API the issue was created for..
             * 
             * @param apiId A resource identifier for the API the issue was created for.
             * @return the next definition stage.
             */
            Update withApiId(String apiId);
        }

        /**
         * The stage of the IssueContract update allowing to specify ifMatch.
         */
        interface WithIfMatch {
            /**
             * Specifies the ifMatch property: ETag of the Entity. ETag should match the current entity state from the
             * header response of the GET request or it should be * for unconditional update..
             * 
             * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of
             * the GET request or it should be * for unconditional update.
             * @return the next definition stage.
             */
            Update withIfMatch(String ifMatch);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    IssueContract refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    IssueContract refresh(Context context);
}
