/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01.implementation;

import com.microsoft.azure.management.appservice.v2018_02_01.CustomHostnameAnalysisResult;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;
import com.microsoft.azure.management.appservice.v2018_02_01.ErrorEntity;
import com.microsoft.azure.management.appservice.v2018_02_01.DnsVerificationTestResult;

class CustomHostnameAnalysisResultImpl extends WrapperImpl<CustomHostnameAnalysisResultInner> implements CustomHostnameAnalysisResult {
    private final AppServiceManager manager;
    CustomHostnameAnalysisResultImpl(CustomHostnameAnalysisResultInner inner, AppServiceManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public AppServiceManager manager() {
        return this.manager;
    }

    @Override
    public List<String> alternateCNameRecords() {
        return this.inner().alternateCNameRecords();
    }

    @Override
    public List<String> alternateTxtRecords() {
        return this.inner().alternateTxtRecords();
    }

    @Override
    public List<String> aRecords() {
        return this.inner().aRecords();
    }

    @Override
    public List<String> cNameRecords() {
        return this.inner().cNameRecords();
    }

    @Override
    public String conflictingAppResourceId() {
        return this.inner().conflictingAppResourceId();
    }

    @Override
    public ErrorEntity customDomainVerificationFailureInfo() {
        return this.inner().customDomainVerificationFailureInfo();
    }

    @Override
    public DnsVerificationTestResult customDomainVerificationTest() {
        return this.inner().customDomainVerificationTest();
    }

    @Override
    public Boolean hasConflictAcrossSubscription() {
        return this.inner().hasConflictAcrossSubscription();
    }

    @Override
    public Boolean hasConflictOnScaleUnit() {
        return this.inner().hasConflictOnScaleUnit();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public Boolean isHostnameAlreadyVerified() {
        return this.inner().isHostnameAlreadyVerified();
    }

    @Override
    public String kind() {
        return this.inner().kind();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public List<String> txtRecords() {
        return this.inner().txtRecords();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
