// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devtestlabs.fluent.models.CustomImageProperties;
import com.azure.resourcemanager.devtestlabs.models.CustomImageOsType;
import com.azure.resourcemanager.devtestlabs.models.CustomImagePropertiesCustom;
import com.azure.resourcemanager.devtestlabs.models.CustomImagePropertiesFromPlan;
import com.azure.resourcemanager.devtestlabs.models.CustomImagePropertiesFromVm;
import com.azure.resourcemanager.devtestlabs.models.DataDiskStorageTypeInfo;
import com.azure.resourcemanager.devtestlabs.models.LinuxOsInfo;
import com.azure.resourcemanager.devtestlabs.models.LinuxOsState;
import com.azure.resourcemanager.devtestlabs.models.StorageType;
import com.azure.resourcemanager.devtestlabs.models.WindowsOsInfo;
import com.azure.resourcemanager.devtestlabs.models.WindowsOsState;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class CustomImagePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CustomImageProperties model = BinaryData.fromString(
            "{\"vm\":{\"sourceVmId\":\"rgzdwmsweyp\",\"windowsOsInfo\":{\"windowsOsState\":\"SysprepApplied\"},\"linuxOsInfo\":{\"linuxOsState\":\"DeprovisionRequested\"}},\"vhd\":{\"imageName\":\"cnxqhuexmkttlst\",\"sysPrep\":true,\"osType\":\"None\"},\"description\":\"emhzrncsdtc\",\"author\":\"siypbs\",\"creationDate\":\"2021-03-20T23:23:02Z\",\"managedImageId\":\"gusl\",\"managedSnapshotId\":\"adcy\",\"dataDiskStorageInfo\":[{\"lun\":\"yhejhzisxgfp\",\"storageType\":\"Premium\"},{\"lun\":\"p\",\"storageType\":\"Premium\"},{\"lun\":\"r\",\"storageType\":\"Standard\"}],\"customImagePlan\":{\"id\":\"zraehtwd\",\"publisher\":\"ftswibyrcdlbhsh\",\"offer\":\"p\"},\"isPlanAuthorized\":false,\"provisioningState\":\"twitykhev\",\"uniqueIdentifier\":\"cedcpnmdy\"}")
            .toObject(CustomImageProperties.class);
        Assertions.assertEquals("rgzdwmsweyp", model.vm().sourceVmId());
        Assertions.assertEquals(WindowsOsState.SYSPREP_APPLIED, model.vm().windowsOsInfo().windowsOsState());
        Assertions.assertEquals(LinuxOsState.DEPROVISION_REQUESTED, model.vm().linuxOsInfo().linuxOsState());
        Assertions.assertEquals("cnxqhuexmkttlst", model.vhd().imageName());
        Assertions.assertEquals(true, model.vhd().sysPrep());
        Assertions.assertEquals(CustomImageOsType.NONE, model.vhd().osType());
        Assertions.assertEquals("emhzrncsdtc", model.description());
        Assertions.assertEquals("siypbs", model.author());
        Assertions.assertEquals("gusl", model.managedImageId());
        Assertions.assertEquals("adcy", model.managedSnapshotId());
        Assertions.assertEquals("yhejhzisxgfp", model.dataDiskStorageInfo().get(0).lun());
        Assertions.assertEquals(StorageType.PREMIUM, model.dataDiskStorageInfo().get(0).storageType());
        Assertions.assertEquals("zraehtwd", model.customImagePlan().id());
        Assertions.assertEquals("ftswibyrcdlbhsh", model.customImagePlan().publisher());
        Assertions.assertEquals("p", model.customImagePlan().offer());
        Assertions.assertEquals(false, model.isPlanAuthorized());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CustomImageProperties model = new CustomImageProperties()
            .withVm(new CustomImagePropertiesFromVm().withSourceVmId("rgzdwmsweyp")
                .withWindowsOsInfo(new WindowsOsInfo().withWindowsOsState(WindowsOsState.SYSPREP_APPLIED))
                .withLinuxOsInfo(new LinuxOsInfo().withLinuxOsState(LinuxOsState.DEPROVISION_REQUESTED)))
            .withVhd(new CustomImagePropertiesCustom().withImageName("cnxqhuexmkttlst")
                .withSysPrep(true)
                .withOsType(CustomImageOsType.NONE))
            .withDescription("emhzrncsdtc")
            .withAuthor("siypbs")
            .withManagedImageId("gusl")
            .withManagedSnapshotId("adcy")
            .withDataDiskStorageInfo(Arrays.asList(
                new DataDiskStorageTypeInfo().withLun("yhejhzisxgfp").withStorageType(StorageType.PREMIUM),
                new DataDiskStorageTypeInfo().withLun("p").withStorageType(StorageType.PREMIUM),
                new DataDiskStorageTypeInfo().withLun("r").withStorageType(StorageType.STANDARD)))
            .withCustomImagePlan(
                new CustomImagePropertiesFromPlan().withId("zraehtwd").withPublisher("ftswibyrcdlbhsh").withOffer("p"))
            .withIsPlanAuthorized(false);
        model = BinaryData.fromObject(model).toObject(CustomImageProperties.class);
        Assertions.assertEquals("rgzdwmsweyp", model.vm().sourceVmId());
        Assertions.assertEquals(WindowsOsState.SYSPREP_APPLIED, model.vm().windowsOsInfo().windowsOsState());
        Assertions.assertEquals(LinuxOsState.DEPROVISION_REQUESTED, model.vm().linuxOsInfo().linuxOsState());
        Assertions.assertEquals("cnxqhuexmkttlst", model.vhd().imageName());
        Assertions.assertEquals(true, model.vhd().sysPrep());
        Assertions.assertEquals(CustomImageOsType.NONE, model.vhd().osType());
        Assertions.assertEquals("emhzrncsdtc", model.description());
        Assertions.assertEquals("siypbs", model.author());
        Assertions.assertEquals("gusl", model.managedImageId());
        Assertions.assertEquals("adcy", model.managedSnapshotId());
        Assertions.assertEquals("yhejhzisxgfp", model.dataDiskStorageInfo().get(0).lun());
        Assertions.assertEquals(StorageType.PREMIUM, model.dataDiskStorageInfo().get(0).storageType());
        Assertions.assertEquals("zraehtwd", model.customImagePlan().id());
        Assertions.assertEquals("ftswibyrcdlbhsh", model.customImagePlan().publisher());
        Assertions.assertEquals("p", model.customImagePlan().offer());
        Assertions.assertEquals(false, model.isPlanAuthorized());
    }
}
