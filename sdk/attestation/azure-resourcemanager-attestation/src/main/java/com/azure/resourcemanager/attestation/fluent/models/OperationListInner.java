// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.attestation.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.attestation.models.OperationsDefinition;
import java.io.IOException;
import java.util.List;

/**
 * List of supported operations.
 */
@Fluent
public final class OperationListInner implements JsonSerializable<OperationListInner> {
    /*
     * The system metadata relating to this resource
     */
    private SystemData systemData;

    /*
     * List of supported operations.
     */
    private List<OperationsDefinition> value;

    /**
     * Creates an instance of OperationListInner class.
     */
    public OperationListInner() {
    }

    /**
     * Get the systemData property: The system metadata relating to this resource.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the value property: List of supported operations.
     * 
     * @return the value value.
     */
    public List<OperationsDefinition> value() {
        return this.value;
    }

    /**
     * Set the value property: List of supported operations.
     * 
     * @param value the value value to set.
     * @return the OperationListInner object itself.
     */
    public OperationListInner withValue(List<OperationsDefinition> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of OperationListInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of OperationListInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the OperationListInner.
     */
    public static OperationListInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OperationListInner deserializedOperationListInner = new OperationListInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("systemData".equals(fieldName)) {
                    deserializedOperationListInner.systemData = SystemData.fromJson(reader);
                } else if ("value".equals(fieldName)) {
                    List<OperationsDefinition> value
                        = reader.readArray(reader1 -> OperationsDefinition.fromJson(reader1));
                    deserializedOperationListInner.value = value;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedOperationListInner;
        });
    }
}
