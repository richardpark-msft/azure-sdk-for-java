// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.realtime.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Returned when input audio transcription is enabled and a transcription succeeds.
 */
@Immutable
public final class ConversationItemInputAudioTranscriptionCompletedEvent extends RealtimeServerEvent {

    /*
     * The type property.
     */
    @Generated
    private RealtimeServerEventType type
        = RealtimeServerEventType.CONVERSATION_ITEM_INPUT_AUDIO_TRANSCRIPTION_COMPLETED;

    /*
     * The ID of the user message item.
     */
    @Generated
    private final String itemId;

    /*
     * The index of the content part containing the audio.
     */
    @Generated
    private final int contentIndex;

    /*
     * The transcribed text.
     */
    @Generated
    private final String transcript;

    /**
     * Creates an instance of ConversationItemInputAudioTranscriptionCompletedEvent class.
     *
     * @param eventId the eventId value to set.
     * @param itemId the itemId value to set.
     * @param contentIndex the contentIndex value to set.
     * @param transcript the transcript value to set.
     */
    @Generated
    private ConversationItemInputAudioTranscriptionCompletedEvent(String eventId, String itemId, int contentIndex,
        String transcript) {
        super(eventId);
        this.itemId = itemId;
        this.contentIndex = contentIndex;
        this.transcript = transcript;
    }

    /**
     * Get the type property: The type property.
     *
     * @return the type value.
     */
    @Generated
    @Override
    public RealtimeServerEventType getType() {
        return this.type;
    }

    /**
     * Get the itemId property: The ID of the user message item.
     *
     * @return the itemId value.
     */
    @Generated
    public String getItemId() {
        return this.itemId;
    }

    /**
     * Get the contentIndex property: The index of the content part containing the audio.
     *
     * @return the contentIndex value.
     */
    @Generated
    public int getContentIndex() {
        return this.contentIndex;
    }

    /**
     * Get the transcript property: The transcribed text.
     *
     * @return the transcript value.
     */
    @Generated
    public String getTranscript() {
        return this.transcript;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("event_id", getEventId());
        jsonWriter.writeStringField("item_id", this.itemId);
        jsonWriter.writeIntField("content_index", this.contentIndex);
        jsonWriter.writeStringField("transcript", this.transcript);
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ConversationItemInputAudioTranscriptionCompletedEvent from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of ConversationItemInputAudioTranscriptionCompletedEvent if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ConversationItemInputAudioTranscriptionCompletedEvent.
     */
    @Generated
    public static ConversationItemInputAudioTranscriptionCompletedEvent fromJson(JsonReader jsonReader)
        throws IOException {
        return jsonReader.readObject(reader -> {
            String eventId = null;
            String itemId = null;
            int contentIndex = 0;
            String transcript = null;
            RealtimeServerEventType type
                = RealtimeServerEventType.CONVERSATION_ITEM_INPUT_AUDIO_TRANSCRIPTION_COMPLETED;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("event_id".equals(fieldName)) {
                    eventId = reader.getString();
                } else if ("item_id".equals(fieldName)) {
                    itemId = reader.getString();
                } else if ("content_index".equals(fieldName)) {
                    contentIndex = reader.getInt();
                } else if ("transcript".equals(fieldName)) {
                    transcript = reader.getString();
                } else if ("type".equals(fieldName)) {
                    type = RealtimeServerEventType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }
            ConversationItemInputAudioTranscriptionCompletedEvent deserializedConversationItemInputAudioTranscriptionCompletedEvent
                = new ConversationItemInputAudioTranscriptionCompletedEvent(eventId, itemId, contentIndex, transcript);
            deserializedConversationItemInputAudioTranscriptionCompletedEvent.type = type;
            return deserializedConversationItemInputAudioTranscriptionCompletedEvent;
        });
    }
}
