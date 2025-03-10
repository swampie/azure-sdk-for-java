// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * Blob restore parameters.
 */
@Fluent
public final class BlobRestoreParameters {
    /*
     * Restore blob to the specified time.
     */
    @JsonProperty(value = "timeToRestore", required = true)
    private OffsetDateTime timeToRestore;

    /*
     * Blob ranges to restore.
     */
    @JsonProperty(value = "blobRanges", required = true)
    private List<BlobRestoreRange> blobRanges;

    /**
     * Creates an instance of BlobRestoreParameters class.
     */
    public BlobRestoreParameters() {
    }

    /**
     * Get the timeToRestore property: Restore blob to the specified time.
     * 
     * @return the timeToRestore value.
     */
    public OffsetDateTime timeToRestore() {
        return this.timeToRestore;
    }

    /**
     * Set the timeToRestore property: Restore blob to the specified time.
     * 
     * @param timeToRestore the timeToRestore value to set.
     * @return the BlobRestoreParameters object itself.
     */
    public BlobRestoreParameters withTimeToRestore(OffsetDateTime timeToRestore) {
        this.timeToRestore = timeToRestore;
        return this;
    }

    /**
     * Get the blobRanges property: Blob ranges to restore.
     * 
     * @return the blobRanges value.
     */
    public List<BlobRestoreRange> blobRanges() {
        return this.blobRanges;
    }

    /**
     * Set the blobRanges property: Blob ranges to restore.
     * 
     * @param blobRanges the blobRanges value to set.
     * @return the BlobRestoreParameters object itself.
     */
    public BlobRestoreParameters withBlobRanges(List<BlobRestoreRange> blobRanges) {
        this.blobRanges = blobRanges;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (timeToRestore() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property timeToRestore in model BlobRestoreParameters"));
        }
        if (blobRanges() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property blobRanges in model BlobRestoreParameters"));
        } else {
            blobRanges().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(BlobRestoreParameters.class);
}
