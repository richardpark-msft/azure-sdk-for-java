// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * Backup properties of a server.
 */
@Fluent
public final class Backup implements JsonSerializable<Backup> {
    /*
     * Backup retention days for the server.
     */
    private Integer backupRetentionDays;

    /*
     * A value indicating whether Geo-Redundant backup is enabled on the server.
     */
    private GeoRedundantBackupEnum geoRedundantBackup;

    /*
     * The earliest restore point time (ISO8601 format) for server.
     */
    private OffsetDateTime earliestRestoreDate;

    /**
     * Creates an instance of Backup class.
     */
    public Backup() {
    }

    /**
     * Get the backupRetentionDays property: Backup retention days for the server.
     * 
     * @return the backupRetentionDays value.
     */
    public Integer backupRetentionDays() {
        return this.backupRetentionDays;
    }

    /**
     * Set the backupRetentionDays property: Backup retention days for the server.
     * 
     * @param backupRetentionDays the backupRetentionDays value to set.
     * @return the Backup object itself.
     */
    public Backup withBackupRetentionDays(Integer backupRetentionDays) {
        this.backupRetentionDays = backupRetentionDays;
        return this;
    }

    /**
     * Get the geoRedundantBackup property: A value indicating whether Geo-Redundant backup is enabled on the server.
     * 
     * @return the geoRedundantBackup value.
     */
    public GeoRedundantBackupEnum geoRedundantBackup() {
        return this.geoRedundantBackup;
    }

    /**
     * Set the geoRedundantBackup property: A value indicating whether Geo-Redundant backup is enabled on the server.
     * 
     * @param geoRedundantBackup the geoRedundantBackup value to set.
     * @return the Backup object itself.
     */
    public Backup withGeoRedundantBackup(GeoRedundantBackupEnum geoRedundantBackup) {
        this.geoRedundantBackup = geoRedundantBackup;
        return this;
    }

    /**
     * Get the earliestRestoreDate property: The earliest restore point time (ISO8601 format) for server.
     * 
     * @return the earliestRestoreDate value.
     */
    public OffsetDateTime earliestRestoreDate() {
        return this.earliestRestoreDate;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeNumberField("backupRetentionDays", this.backupRetentionDays);
        jsonWriter.writeStringField("geoRedundantBackup",
            this.geoRedundantBackup == null ? null : this.geoRedundantBackup.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Backup from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of Backup if the JsonReader was pointing to an instance of it, or null if it was pointing to
     * JSON null.
     * @throws IOException If an error occurs while reading the Backup.
     */
    public static Backup fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            Backup deserializedBackup = new Backup();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("backupRetentionDays".equals(fieldName)) {
                    deserializedBackup.backupRetentionDays = reader.getNullable(JsonReader::getInt);
                } else if ("geoRedundantBackup".equals(fieldName)) {
                    deserializedBackup.geoRedundantBackup = GeoRedundantBackupEnum.fromString(reader.getString());
                } else if ("earliestRestoreDate".equals(fieldName)) {
                    deserializedBackup.earliestRestoreDate = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedBackup;
        });
    }
}
