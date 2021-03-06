/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2018_09_30_preview.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.containerservice.v2018_09_30_preview.OpenShiftManagedCluster;
import rx.Observable;
import com.microsoft.azure.management.containerservice.v2018_09_30_preview.PurchasePlan;
import com.microsoft.azure.management.containerservice.v2018_09_30_preview.NetworkProfile;
import java.util.List;
import com.microsoft.azure.management.containerservice.v2018_09_30_preview.OpenShiftRouterProfile;
import com.microsoft.azure.management.containerservice.v2018_09_30_preview.OpenShiftManagedClusterMasterPoolProfile;
import com.microsoft.azure.management.containerservice.v2018_09_30_preview.OpenShiftManagedClusterAgentPoolProfile;
import com.microsoft.azure.management.containerservice.v2018_09_30_preview.OpenShiftManagedClusterAuthProfile;

class OpenShiftManagedClusterImpl extends GroupableResourceCoreImpl<OpenShiftManagedCluster, OpenShiftManagedClusterInner, OpenShiftManagedClusterImpl, ContainerServiceManager> implements OpenShiftManagedCluster, OpenShiftManagedCluster.Definition, OpenShiftManagedCluster.Update {
    OpenShiftManagedClusterImpl(String name, OpenShiftManagedClusterInner inner, ContainerServiceManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<OpenShiftManagedCluster> createResourceAsync() {
        OpenShiftManagedClustersInner client = this.manager().inner().openShiftManagedClusters();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<OpenShiftManagedCluster> updateResourceAsync() {
        OpenShiftManagedClustersInner client = this.manager().inner().openShiftManagedClusters();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<OpenShiftManagedClusterInner> getInnerAsync() {
        OpenShiftManagedClustersInner client = this.manager().inner().openShiftManagedClusters();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public List<OpenShiftManagedClusterAgentPoolProfile> agentPoolProfiles() {
        return this.inner().agentPoolProfiles();
    }

    @Override
    public OpenShiftManagedClusterAuthProfile authProfile() {
        return this.inner().authProfile();
    }

    @Override
    public String fqdn() {
        return this.inner().fqdn();
    }

    @Override
    public OpenShiftManagedClusterMasterPoolProfile masterPoolProfile() {
        return this.inner().masterPoolProfile();
    }

    @Override
    public NetworkProfile networkProfile() {
        return this.inner().networkProfile();
    }

    @Override
    public String openShiftVersion() {
        return this.inner().openShiftVersion();
    }

    @Override
    public PurchasePlan plan() {
        return this.inner().plan();
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public String publicHostname() {
        return this.inner().publicHostname();
    }

    @Override
    public List<OpenShiftRouterProfile> routerProfiles() {
        return this.inner().routerProfiles();
    }

    @Override
    public OpenShiftManagedClusterImpl withOpenShiftVersion(String openShiftVersion) {
        this.inner().withOpenShiftVersion(openShiftVersion);
        return this;
    }

    @Override
    public OpenShiftManagedClusterImpl withAgentPoolProfiles(List<OpenShiftManagedClusterAgentPoolProfile> agentPoolProfiles) {
        this.inner().withAgentPoolProfiles(agentPoolProfiles);
        return this;
    }

    @Override
    public OpenShiftManagedClusterImpl withAuthProfile(OpenShiftManagedClusterAuthProfile authProfile) {
        this.inner().withAuthProfile(authProfile);
        return this;
    }

    @Override
    public OpenShiftManagedClusterImpl withFqdn(String fqdn) {
        this.inner().withFqdn(fqdn);
        return this;
    }

    @Override
    public OpenShiftManagedClusterImpl withMasterPoolProfile(OpenShiftManagedClusterMasterPoolProfile masterPoolProfile) {
        this.inner().withMasterPoolProfile(masterPoolProfile);
        return this;
    }

    @Override
    public OpenShiftManagedClusterImpl withNetworkProfile(NetworkProfile networkProfile) {
        this.inner().withNetworkProfile(networkProfile);
        return this;
    }

    @Override
    public OpenShiftManagedClusterImpl withPlan(PurchasePlan plan) {
        this.inner().withPlan(plan);
        return this;
    }

    @Override
    public OpenShiftManagedClusterImpl withPublicHostname(String publicHostname) {
        this.inner().withPublicHostname(publicHostname);
        return this;
    }

    @Override
    public OpenShiftManagedClusterImpl withRouterProfiles(List<OpenShiftRouterProfile> routerProfiles) {
        this.inner().withRouterProfiles(routerProfiles);
        return this;
    }

}
