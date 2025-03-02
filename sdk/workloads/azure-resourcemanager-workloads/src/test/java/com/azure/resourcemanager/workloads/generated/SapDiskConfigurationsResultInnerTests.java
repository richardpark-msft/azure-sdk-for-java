// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.workloads.fluent.models.SapDiskConfigurationsResultInner;
import com.azure.resourcemanager.workloads.models.DiskDetails;
import com.azure.resourcemanager.workloads.models.DiskSku;
import com.azure.resourcemanager.workloads.models.DiskSkuName;
import com.azure.resourcemanager.workloads.models.DiskVolumeConfiguration;
import com.azure.resourcemanager.workloads.models.SapDiskConfiguration;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class SapDiskConfigurationsResultInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SapDiskConfigurationsResultInner model = BinaryData.fromString(
            "{\"volumeConfigurations\":{\"eitjz\":{\"recommendedConfiguration\":{\"count\":5896484997878560092,\"sizeGB\":5423097764274102889,\"sku\":{\"name\":\"Premium_LRS\"}},\"supportedConfigurations\":[{\"sku\":{\"name\":\"PremiumV2_LRS\"},\"sizeGB\":882146759164402004,\"minimumSupportedDiskCount\":7599786191320988946,\"maximumSupportedDiskCount\":1572773881645716486,\"iopsReadWrite\":733466437358115738,\"mbpsReadWrite\":8147558301655778049,\"diskTier\":\"qglhq\"},{\"sku\":{\"name\":\"PremiumV2_LRS\"},\"sizeGB\":1469917439884585301,\"minimumSupportedDiskCount\":3197942674543499860,\"maximumSupportedDiskCount\":8297233091141674615,\"iopsReadWrite\":8267854897045892024,\"mbpsReadWrite\":2166034557285678968,\"diskTier\":\"f\"},{\"sku\":{\"name\":\"Standard_LRS\"},\"sizeGB\":5170597749326153487,\"minimumSupportedDiskCount\":5859480146388896726,\"maximumSupportedDiskCount\":3221091086599604692,\"iopsReadWrite\":6421947061498150983,\"mbpsReadWrite\":6890840342903312019,\"diskTier\":\"zntocipaouajps\"},{\"sku\":{\"name\":\"UltraSSD_LRS\"},\"sizeGB\":251752643877319324,\"minimumSupportedDiskCount\":4121879659269768466,\"maximumSupportedDiskCount\":4388492999856032533,\"iopsReadWrite\":4312151874494673818,\"mbpsReadWrite\":4894427393547205979,\"diskTier\":\"jddeqsrdeupewnw\"}]},\"mglzufcy\":{\"recommendedConfiguration\":{\"count\":896849332932117440,\"sizeGB\":1171088672090265842,\"sku\":{\"name\":\"UltraSSD_LRS\"}},\"supportedConfigurations\":[{\"sku\":{\"name\":\"Standard_LRS\"},\"sizeGB\":8218653315746121665,\"minimumSupportedDiskCount\":4694777404080972802,\"maximumSupportedDiskCount\":1451077498278444174,\"iopsReadWrite\":8884891409748678125,\"mbpsReadWrite\":847445063403773556,\"diskTier\":\"txukcdmp\"},{\"sku\":{\"name\":\"Standard_LRS\"},\"sizeGB\":1406272711851439845,\"minimumSupportedDiskCount\":5907610585425555286,\"maximumSupportedDiskCount\":5619768786779734743,\"iopsReadWrite\":4808150664519020542,\"mbpsReadWrite\":7655054782448841652,\"diskTier\":\"hmwhfpmrqo\"},{\"sku\":{\"name\":\"Premium_LRS\"},\"sizeGB\":4785418804701652816,\"minimumSupportedDiskCount\":5612595688544592348,\"maximumSupportedDiskCount\":8451324547573976029,\"iopsReadWrite\":4274110393583912034,\"mbpsReadWrite\":5470433313051888734,\"diskTier\":\"zvgnwzs\"}]},\"xvd\":{\"recommendedConfiguration\":{\"count\":7560891333478343962,\"sizeGB\":5883470063929325724,\"sku\":{\"name\":\"Standard_LRS\"}},\"supportedConfigurations\":[{\"sku\":{\"name\":\"Premium_LRS\"},\"sizeGB\":187401234373090169,\"minimumSupportedDiskCount\":3259510585978002788,\"maximumSupportedDiskCount\":3872828993572496583,\"iopsReadWrite\":3143414343495446115,\"mbpsReadWrite\":3270115267401953205,\"diskTier\":\"ikxwc\"},{\"sku\":{\"name\":\"UltraSSD_LRS\"},\"sizeGB\":5945427691408997022,\"minimumSupportedDiskCount\":906792268568768998,\"maximumSupportedDiskCount\":7070010117025191964,\"iopsReadWrite\":7485728152654457617,\"mbpsReadWrite\":2791072871086967977,\"diskTier\":\"br\"}]}}}")
            .toObject(SapDiskConfigurationsResultInner.class);
        Assertions.assertEquals(5896484997878560092L,
            model.volumeConfigurations().get("eitjz").recommendedConfiguration().count());
        Assertions.assertEquals(5423097764274102889L,
            model.volumeConfigurations().get("eitjz").recommendedConfiguration().sizeGB());
        Assertions.assertEquals(DiskSkuName.PREMIUM_LRS,
            model.volumeConfigurations().get("eitjz").recommendedConfiguration().sku().name());
        Assertions.assertEquals(DiskSkuName.PREMIUM_V2_LRS,
            model.volumeConfigurations().get("eitjz").supportedConfigurations().get(0).sku().name());
        Assertions.assertEquals(882146759164402004L,
            model.volumeConfigurations().get("eitjz").supportedConfigurations().get(0).sizeGB());
        Assertions.assertEquals(7599786191320988946L,
            model.volumeConfigurations().get("eitjz").supportedConfigurations().get(0).minimumSupportedDiskCount());
        Assertions.assertEquals(1572773881645716486L,
            model.volumeConfigurations().get("eitjz").supportedConfigurations().get(0).maximumSupportedDiskCount());
        Assertions.assertEquals(733466437358115738L,
            model.volumeConfigurations().get("eitjz").supportedConfigurations().get(0).iopsReadWrite());
        Assertions.assertEquals(8147558301655778049L,
            model.volumeConfigurations().get("eitjz").supportedConfigurations().get(0).mbpsReadWrite());
        Assertions.assertEquals("qglhq",
            model.volumeConfigurations().get("eitjz").supportedConfigurations().get(0).diskTier());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SapDiskConfigurationsResultInner model
            = new SapDiskConfigurationsResultInner()
                .withVolumeConfigurations(
                    mapOf("eitjz",
                        new SapDiskConfiguration()
                            .withRecommendedConfiguration(new DiskVolumeConfiguration().withCount(5896484997878560092L)
                                .withSizeGB(5423097764274102889L)
                                .withSku(new DiskSku().withName(DiskSkuName.PREMIUM_LRS)))
                            .withSupportedConfigurations(Arrays.asList(
                                new DiskDetails().withSku(new DiskSku().withName(DiskSkuName.PREMIUM_V2_LRS))
                                    .withSizeGB(882146759164402004L)
                                    .withMinimumSupportedDiskCount(7599786191320988946L)
                                    .withMaximumSupportedDiskCount(1572773881645716486L)
                                    .withIopsReadWrite(733466437358115738L)
                                    .withMbpsReadWrite(8147558301655778049L)
                                    .withDiskTier("qglhq"),
                                new DiskDetails().withSku(new DiskSku().withName(DiskSkuName.PREMIUM_V2_LRS))
                                    .withSizeGB(1469917439884585301L)
                                    .withMinimumSupportedDiskCount(3197942674543499860L)
                                    .withMaximumSupportedDiskCount(8297233091141674615L)
                                    .withIopsReadWrite(8267854897045892024L)
                                    .withMbpsReadWrite(2166034557285678968L)
                                    .withDiskTier("f"),
                                new DiskDetails().withSku(new DiskSku().withName(DiskSkuName.STANDARD_LRS))
                                    .withSizeGB(5170597749326153487L)
                                    .withMinimumSupportedDiskCount(5859480146388896726L)
                                    .withMaximumSupportedDiskCount(3221091086599604692L)
                                    .withIopsReadWrite(6421947061498150983L)
                                    .withMbpsReadWrite(6890840342903312019L)
                                    .withDiskTier("zntocipaouajps"),
                                new DiskDetails().withSku(new DiskSku().withName(DiskSkuName.ULTRA_SSD_LRS))
                                    .withSizeGB(251752643877319324L)
                                    .withMinimumSupportedDiskCount(4121879659269768466L)
                                    .withMaximumSupportedDiskCount(4388492999856032533L)
                                    .withIopsReadWrite(4312151874494673818L)
                                    .withMbpsReadWrite(4894427393547205979L)
                                    .withDiskTier("jddeqsrdeupewnw"))),
                        "mglzufcy",
                        new SapDiskConfiguration()
                            .withRecommendedConfiguration(new DiskVolumeConfiguration().withCount(896849332932117440L)
                                .withSizeGB(1171088672090265842L)
                                .withSku(new DiskSku().withName(DiskSkuName.ULTRA_SSD_LRS)))
                            .withSupportedConfigurations(
                                Arrays
                                    .asList(
                                        new DiskDetails().withSku(new DiskSku().withName(DiskSkuName.STANDARD_LRS))
                                            .withSizeGB(8218653315746121665L)
                                            .withMinimumSupportedDiskCount(4694777404080972802L)
                                            .withMaximumSupportedDiskCount(1451077498278444174L)
                                            .withIopsReadWrite(8884891409748678125L)
                                            .withMbpsReadWrite(847445063403773556L)
                                            .withDiskTier("txukcdmp"),
                                        new DiskDetails().withSku(new DiskSku().withName(DiskSkuName.STANDARD_LRS))
                                            .withSizeGB(1406272711851439845L)
                                            .withMinimumSupportedDiskCount(5907610585425555286L)
                                            .withMaximumSupportedDiskCount(5619768786779734743L)
                                            .withIopsReadWrite(4808150664519020542L)
                                            .withMbpsReadWrite(7655054782448841652L)
                                            .withDiskTier("hmwhfpmrqo"),
                                        new DiskDetails().withSku(new DiskSku().withName(DiskSkuName.PREMIUM_LRS))
                                            .withSizeGB(4785418804701652816L)
                                            .withMinimumSupportedDiskCount(5612595688544592348L)
                                            .withMaximumSupportedDiskCount(8451324547573976029L)
                                            .withIopsReadWrite(4274110393583912034L)
                                            .withMbpsReadWrite(5470433313051888734L)
                                            .withDiskTier("zvgnwzs"))),
                        "xvd",
                        new SapDiskConfiguration()
                            .withRecommendedConfiguration(new DiskVolumeConfiguration().withCount(7560891333478343962L)
                                .withSizeGB(5883470063929325724L)
                                .withSku(new DiskSku().withName(DiskSkuName.STANDARD_LRS)))
                            .withSupportedConfigurations(Arrays.asList(
                                new DiskDetails().withSku(new DiskSku().withName(DiskSkuName.PREMIUM_LRS))
                                    .withSizeGB(187401234373090169L)
                                    .withMinimumSupportedDiskCount(3259510585978002788L)
                                    .withMaximumSupportedDiskCount(3872828993572496583L)
                                    .withIopsReadWrite(3143414343495446115L)
                                    .withMbpsReadWrite(3270115267401953205L)
                                    .withDiskTier("ikxwc"),
                                new DiskDetails().withSku(new DiskSku().withName(DiskSkuName.ULTRA_SSD_LRS))
                                    .withSizeGB(5945427691408997022L)
                                    .withMinimumSupportedDiskCount(906792268568768998L)
                                    .withMaximumSupportedDiskCount(7070010117025191964L)
                                    .withIopsReadWrite(7485728152654457617L)
                                    .withMbpsReadWrite(2791072871086967977L)
                                    .withDiskTier("br")))));
        model = BinaryData.fromObject(model).toObject(SapDiskConfigurationsResultInner.class);
        Assertions.assertEquals(5896484997878560092L,
            model.volumeConfigurations().get("eitjz").recommendedConfiguration().count());
        Assertions.assertEquals(5423097764274102889L,
            model.volumeConfigurations().get("eitjz").recommendedConfiguration().sizeGB());
        Assertions.assertEquals(DiskSkuName.PREMIUM_LRS,
            model.volumeConfigurations().get("eitjz").recommendedConfiguration().sku().name());
        Assertions.assertEquals(DiskSkuName.PREMIUM_V2_LRS,
            model.volumeConfigurations().get("eitjz").supportedConfigurations().get(0).sku().name());
        Assertions.assertEquals(882146759164402004L,
            model.volumeConfigurations().get("eitjz").supportedConfigurations().get(0).sizeGB());
        Assertions.assertEquals(7599786191320988946L,
            model.volumeConfigurations().get("eitjz").supportedConfigurations().get(0).minimumSupportedDiskCount());
        Assertions.assertEquals(1572773881645716486L,
            model.volumeConfigurations().get("eitjz").supportedConfigurations().get(0).maximumSupportedDiskCount());
        Assertions.assertEquals(733466437358115738L,
            model.volumeConfigurations().get("eitjz").supportedConfigurations().get(0).iopsReadWrite());
        Assertions.assertEquals(8147558301655778049L,
            model.volumeConfigurations().get("eitjz").supportedConfigurations().get(0).mbpsReadWrite());
        Assertions.assertEquals("qglhq",
            model.volumeConfigurations().get("eitjz").supportedConfigurations().get(0).diskTier());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
