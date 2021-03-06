// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.amqp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MessageConstantTest {

    /**
     * Verifies we correctly parse the enumeration value from a string.
     */
    @Test
    public void createFromString() {
        String header = "absolute-expiry-time";
        MessageConstant actual = MessageConstant.fromString(header);

        Assertions.assertEquals(MessageConstant.ABSOLUTE_EXPIRY_TIME, actual);
    }

    /**
     * Verifies we correctly get the header value from a {@link MessageConstant}.
     */
    @Test
    public void getHeaderValue() {
        String expected = "x-opt-enqueued-time";
        String actual = MessageConstant.ENQUEUED_TIME_UTC_ANNOTATION_NAME.getValue();

        Assertions.assertEquals(expected, actual);
    }
}
