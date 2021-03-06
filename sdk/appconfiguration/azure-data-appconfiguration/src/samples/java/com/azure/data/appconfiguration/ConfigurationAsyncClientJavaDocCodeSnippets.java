// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.data.appconfiguration;

import com.azure.data.appconfiguration.models.ConfigurationSetting;
import com.azure.data.appconfiguration.models.SettingSelector;
import reactor.util.context.Context;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;

/**
 * Code snippets for {@link ConfigurationAsyncClient}
 */
public class ConfigurationAsyncClientJavaDocCodeSnippets {

    private static final String NO_LABEL = null;
    private String key1 = "key1";
    private String key2 = "key2";
    private String value1 = "val1";
    private String value2 = "val2";

    /**
     * Code snippets for {@link ConfigurationAsyncClient#addConfigurationSetting(String, String, String)}
     */
    public void addConfigurationSettingsCodeSnippet() {
        ConfigurationAsyncClient client = getAsyncClient();
        // BEGIN: com.azure.data.appconfiguration.configurationasyncclient.addConfigurationSetting#string-string-string
        client.addConfigurationSetting("prodDBConnection", "westUS", "db_connection")
            .subscriberContext(Context.of(key1, value1, key2, value2))
            .subscribe(response -> System.out.printf("Key: %s, Label: %s, Value: %s",
                response.getKey(), response.getLabel(), response.getValue()));
        // END: com.azure.data.appconfiguration.configurationasyncclient.addConfigurationSetting#string-string-string

        /**
         * Code snippets for {@link ConfigurationAsyncClient#addConfigurationSettingWithResponse(ConfigurationSetting)}
         */
        // BEGIN: com.azure.data.appconfiguration.configurationasyncclient.addConfigurationSettingWithResponse#ConfigurationSetting
        client.addConfigurationSettingWithResponse(
            new ConfigurationSetting().setKey("prodDBConnection").setLabel("westUS").setValue("db_connection"))
            .subscriberContext(Context.of(key1, value1, key2, value2))
            .subscribe(response -> {
                ConfigurationSetting responseSetting = response.getValue();
                System.out.printf("Key: %s, Label: %s, Value: %s",
                    responseSetting.getKey(), responseSetting.getLabel(), responseSetting.getValue());
            });
        // END: com.azure.data.appconfiguration.configurationasyncclient.addConfigurationSettingWithResponse#ConfigurationSetting
    }

    /**
     * Code snippets for {@link ConfigurationAsyncClient#setConfigurationSetting(String, String, String)}
     */
    public void setConfigurationSettingsCodeSnippet() {
        ConfigurationAsyncClient client = getAsyncClient();
        // BEGIN: com.azure.data.appconfiguration.configurationasyncclient.setConfigurationSetting#string-string-string
        client.setConfigurationSetting("prodDBConnection", "westUS", "db_connection")
            .subscriberContext(Context.of(key1, value1, key2, value2))
            .subscribe(response -> System.out.printf("Key: %s, Label: %s, Value: %s",
                response.getKey(), response.getLabel(), response.getValue()));
        // Update the value of the setting to "updated_db_connection"
        client.setConfigurationSetting("prodDBConnection", "westUS", "updated_db_connection")
            .subscribe(response -> System.out.printf("Key: %s, Label: %s, Value: %s",
                response.getKey(), response.getLabel(), response.getValue()));
        // END: com.azure.data.appconfiguration.configurationasyncclient.setConfigurationSetting#string-string-string

        /**
         * Code snippets for
         * {@link ConfigurationAsyncClient#setConfigurationSettingWithResponse(ConfigurationSetting, boolean)}
         */
        // BEGIN: com.azure.data.appconfiguration.configurationasyncclient.setConfigurationSettingWithResponse#ConfigurationSetting-boolean
        client.setConfigurationSettingWithResponse(new ConfigurationSetting().setKey("prodDBConnection").setLabel("westUS")
            .setValue("db_connection"), false)
            .subscriberContext(Context.of(key1, value1, key2, value2))
            .subscribe(response -> {
                final ConfigurationSetting result = response.getValue();
                System.out.printf("Key: %s, Label: %s, Value: %s",
                    result.getKey(), result.getLabel(), result.getValue());
            });
        // Update the value of the setting to "updated_db_connection"
        client.setConfigurationSettingWithResponse(new ConfigurationSetting().setKey("prodDBConnection").setLabel("westUS")
            .setValue("updated_db_connection"), false)
            .subscribe(response -> {
                final ConfigurationSetting responseSetting = response.getValue();
                System.out.printf("Key: %s, Label: %s, Value: %s",
                    responseSetting.getKey(), responseSetting.getLabel(), responseSetting.getValue());
            });
        // END: com.azure.data.appconfiguration.configurationasyncclient.setConfigurationSettingWithResponse#ConfigurationSetting-boolean
    }

    /**
     * Code snippets for {@link ConfigurationAsyncClient#getConfigurationSetting(String, String)}
     */
    public void getConfigurationSettingsCodeSnippet() {
        ConfigurationAsyncClient client = getAsyncClient();

        // BEGIN: com.azure.data.appconfiguration.configurationasyncclient.getConfigurationSetting#string-string
        client.getConfigurationSetting("prodDBConnection", null)
            .subscriberContext(Context.of(key1, value1, key2, value2))
            .subscribe(response -> System.out.printf("Key: %s, Label: %s, Value: %s",
                response.getKey(), response.getLabel(), response.getValue()));
        // END: com.azure.data.appconfiguration.configurationasyncclient.getConfigurationSetting#string-string

        /**
         * Code snippets for {@link ConfigurationAsyncClient#getConfigurationSetting(String, String, OffsetDateTime)}
         */
        // BEGIN: com.azure.data.appconfiguration.configurationasyncclient.getConfigurationSetting#string-string-OffsetDateTime
        client.getConfigurationSetting(
            "prodDBConnection", null, OffsetDateTime.now(ZoneOffset.UTC).minusMinutes(1))
            .subscriberContext(Context.of(key1, value1, key2, value2))
            .subscribe(response -> System.out.printf("Key: %s, Label: %s, Value: %s",
                response.getKey(), response.getLabel(), response.getValue()));
        // END: com.azure.data.appconfiguration.configurationasyncclient.getConfigurationSetting#string-string-OffsetDateTime

        /**
         * Code snippets for {@link ConfigurationAsyncClient#getConfigurationSettingWithResponse(
         * ConfigurationSetting, OffsetDateTime, boolean)}
         */
        // BEGIN: com.azure.data.appconfiguration.configurationasyncclient.getConfigurationSettingWithResponse#ConfigurationSetting-OffsetDateTime-boolean
        client.getConfigurationSettingWithResponse(
            new ConfigurationSetting().setKey("prodDBConnection").setLabel("westUS"), null, false)
            .subscriberContext(Context.of(key1, value1, key2, value2))
            .subscribe(response -> {
                final ConfigurationSetting result = response.getValue();
                System.out.printf("Key: %s, Label: %s, Value: %s",
                    result.getKey(), result.getLabel(), result.getValue());
            });
        // END: com.azure.data.appconfiguration.configurationasyncclient.getConfigurationSettingWithResponse#ConfigurationSetting-OffsetDateTime-boolean
    }

    /**
     * Code snippets for {@link ConfigurationAsyncClient#deleteConfigurationSetting(String, String)}
     */
    public void deleteConfigurationSettingsCodeSnippet() {
        ConfigurationAsyncClient client = getAsyncClient();
        // BEGIN: com.azure.data.appconfiguration.configurationasyncclient.deleteConfigurationSetting#string-string
        client.deleteConfigurationSetting("prodDBConnection", null)
            .subscriberContext(Context.of(key1, value1, key2, value2))
            .subscribe(response -> System.out.printf("Key: %s, Label: %s, Value: %s",
                response.getKey(), response.getLabel(), response.getValue()));
        // END: com.azure.data.appconfiguration.configurationasyncclient.deleteConfigurationSetting#string-string

        /**
         * Code snippets for
         * {@link ConfigurationAsyncClient#deleteConfigurationSettingWithResponse(ConfigurationSetting, boolean)}
         */
        // BEGIN: com.azure.data.appconfiguration.configurationasyncclient.deleteConfigurationSettingWithResponse#ConfigurationSetting-boolean
        client.deleteConfigurationSettingWithResponse(
            new ConfigurationSetting().setKey("prodDBConnection").setLabel("westUS"), false)
            .subscriberContext(Context.of(key1, value1, key2, value2))
            .subscribe(response -> {
                final ConfigurationSetting responseSetting = response.getValue();
                System.out.printf("Key: %s, Label: %s, Value: %s",
                    responseSetting.getKey(), responseSetting.getLabel(), responseSetting.getValue());
            });
        // END: com.azure.data.appconfiguration.configurationasyncclient.deleteConfigurationSettingWithResponse#ConfigurationSetting-boolean
    }

    /**
     * Code snippets for {@link ConfigurationAsyncClient#setReadOnly(String, String)}
     */
    public void lockSettingsCodeSnippet() {
        ConfigurationAsyncClient client = getAsyncClient();
        // BEGIN: com.azure.data.appconfiguration.configurationasyncclient.setReadOnly#string-string
        client.setReadOnly("prodDBConnection", "westUS")
            .subscriberContext(Context.of(key1, value1, key2, value2))
            .subscribe(response -> System.out.printf("Key: %s, Label: %s, Value: %s",
                response.getKey(), response.getLabel(), response.getValue()));
        // END: com.azure.data.appconfiguration.configurationasyncclient.setReadOnly#string-string

        /**
         * Code snippets for {@link ConfigurationAsyncClient#setReadOnlyWithResponse(ConfigurationSetting)}
         */
        // BEGIN: com.azure.data.appconfiguration.configurationasyncclient.setReadOnlyWithResponse#ConfigurationSetting
        client.setReadOnlyWithResponse(new ConfigurationSetting().setKey("prodDBConnection").setLabel("westUS"))
            .subscriberContext(Context.of(key1, value1, key2, value2))
            .subscribe(response -> {
                final ConfigurationSetting result = response.getValue();
                System.out.printf("Key: %s, Label: %s, Value: %s",
                    result.getKey(), result.getLabel(), result.getValue());
            });
        // END: com.azure.data.appconfiguration.configurationasyncclient.setReadOnlyWithResponse#ConfigurationSetting
    }

    /**
     * Code snippets for {@link ConfigurationAsyncClient#clearReadOnly(String, String)}
     */
    public void unlockSettingsCodeSnippet() {
        ConfigurationAsyncClient client = getAsyncClient();
        // BEGIN: com.azure.data.appconfiguration.configurationasyncclient.clearReadOnly#string-string
        client.clearReadOnly("prodDBConnection", "westUS")
            .subscriberContext(Context.of(key1, value1, key2, value2))
            .subscribe(response -> System.out.printf("Key: %s, Value: %s", response.getKey(), response.getValue()));
        // END: com.azure.data.appconfiguration.configurationasyncclient.clearReadOnly#string-string

        /**
         * Code snippets for {@link ConfigurationAsyncClient#clearReadOnlyWithResponse(ConfigurationSetting)}
         */
        // BEGIN: com.azure.data.appconfiguration.configurationasyncclient.clearReadOnlyWithResponse#ConfigurationSetting
        client.clearReadOnlyWithResponse(new ConfigurationSetting().setKey("prodDBConnection").setLabel("westUS"))
            .subscriberContext(Context.of(key1, value1, key2, value2))
            .subscribe(response -> {
                ConfigurationSetting result = response.getValue();
                System.out.printf("Key: %s, Value: %s", result.getKey(), result.getValue());
            });
        // END: com.azure.data.appconfiguration.configurationasyncclient.clearReadOnlyWithResponse#ConfigurationSetting
    }


    /**
     * Code snippets for {@link ConfigurationAsyncClient#listConfigurationSettings(SettingSelector)}
     */
    public void listSettingCodeSnippet() {
        ConfigurationAsyncClient client = getAsyncClient();
        // BEGIN: com.azure.data.appconfiguration.configurationasyncclient.listsettings
        client.listConfigurationSettings(new SettingSelector().setKeys("prodDBConnection"))
            .subscriberContext(Context.of(key1, value1, key2, value2))
            .subscribe(setting ->
                System.out.printf("Key: %s, Value: %s", setting.getKey(), setting.getValue()));
        // END: com.azure.data.appconfiguration.configurationasyncclient.listsettings
    }

    /**
     * Code snippets for {@link ConfigurationAsyncClient#listRevisions(SettingSelector)}
     */
    public void listRevisionsCodeSnippet() {
        ConfigurationAsyncClient client = getAsyncClient();
        // BEGIN: com.azure.data.appconfiguration.configurationasyncclient.listsettingrevisions
        client.listRevisions(new SettingSelector().setKeys("prodDBConnection"))
            .subscriberContext(Context.of(key1, value1, key2, value2))
            .subscribe(setting ->
                System.out.printf("Key: %s, Value: %s", setting.getKey(), setting.getValue()));
        // END: com.azure.data.appconfiguration.configurationasyncclient.listsettingrevisions
    }

    /**
     * Implementation not provided
     *
     * @return {@code null}
     */
    private ConfigurationAsyncClient getAsyncClient() {
        return new ConfigurationClientBuilder().connectionString("connectionString").buildAsyncClient();
    }
}
