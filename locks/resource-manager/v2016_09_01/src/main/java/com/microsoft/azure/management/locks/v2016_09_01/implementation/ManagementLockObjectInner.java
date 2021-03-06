/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.locks.v2016_09_01.implementation;

import com.microsoft.azure.management.locks.v2016_09_01.LockLevel;
import java.util.List;
import com.microsoft.azure.management.locks.v2016_09_01.ManagementLockOwner;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * The lock information.
 */
@JsonFlatten
public class ManagementLockObjectInner extends ProxyResource {
    /**
     * The level of the lock. Possible values are: NotSpecified, CanNotDelete,
     * ReadOnly. CanNotDelete means authorized users are able to read and
     * modify the resources, but not delete. ReadOnly means authorized users
     * can only read from a resource, but they can't modify or delete it.
     * Possible values include: 'NotSpecified', 'CanNotDelete', 'ReadOnly'.
     */
    @JsonProperty(value = "properties.level", required = true)
    private LockLevel level;

    /**
     * Notes about the lock. Maximum of 512 characters.
     */
    @JsonProperty(value = "properties.notes")
    private String notes;

    /**
     * The owners of the lock.
     */
    @JsonProperty(value = "properties.owners")
    private List<ManagementLockOwner> owners;

    /**
     * Get the level of the lock. Possible values are: NotSpecified, CanNotDelete, ReadOnly. CanNotDelete means authorized users are able to read and modify the resources, but not delete. ReadOnly means authorized users can only read from a resource, but they can't modify or delete it. Possible values include: 'NotSpecified', 'CanNotDelete', 'ReadOnly'.
     *
     * @return the level value
     */
    public LockLevel level() {
        return this.level;
    }

    /**
     * Set the level of the lock. Possible values are: NotSpecified, CanNotDelete, ReadOnly. CanNotDelete means authorized users are able to read and modify the resources, but not delete. ReadOnly means authorized users can only read from a resource, but they can't modify or delete it. Possible values include: 'NotSpecified', 'CanNotDelete', 'ReadOnly'.
     *
     * @param level the level value to set
     * @return the ManagementLockObjectInner object itself.
     */
    public ManagementLockObjectInner withLevel(LockLevel level) {
        this.level = level;
        return this;
    }

    /**
     * Get notes about the lock. Maximum of 512 characters.
     *
     * @return the notes value
     */
    public String notes() {
        return this.notes;
    }

    /**
     * Set notes about the lock. Maximum of 512 characters.
     *
     * @param notes the notes value to set
     * @return the ManagementLockObjectInner object itself.
     */
    public ManagementLockObjectInner withNotes(String notes) {
        this.notes = notes;
        return this;
    }

    /**
     * Get the owners of the lock.
     *
     * @return the owners value
     */
    public List<ManagementLockOwner> owners() {
        return this.owners;
    }

    /**
     * Set the owners of the lock.
     *
     * @param owners the owners value to set
     * @return the ManagementLockObjectInner object itself.
     */
    public ManagementLockObjectInner withOwners(List<ManagementLockOwner> owners) {
        this.owners = owners;
        return this;
    }

}
