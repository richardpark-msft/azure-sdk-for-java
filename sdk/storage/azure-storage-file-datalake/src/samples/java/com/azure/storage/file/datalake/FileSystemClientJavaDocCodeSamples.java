// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.file.datalake;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.storage.blob.models.BlobErrorCode;
import com.azure.storage.blob.models.BlobStorageException;
import com.azure.storage.file.datalake.models.DataLakeRequestConditions;
import com.azure.storage.file.datalake.models.FileSystemProperties;
import com.azure.storage.file.datalake.models.ListPathsOptions;
import com.azure.storage.file.datalake.models.PathHttpHeaders;
import com.azure.storage.file.datalake.models.PublicAccessType;

import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.Map;

/**
 * Code snippets for {@link DataLakeFileSystemClient}
 */
@SuppressWarnings({"unused"})
public class FileSystemClientJavaDocCodeSamples {

    private DataLakeFileSystemClient client = JavaDocCodeSnippetsHelpers.getFileSystemClient();
    private String fileName = "fileName";
    private String directoryName = "directoryName";
    private String leaseId = "leaseId";
    private String proposedId = "proposedId";
    private int leaseDuration = (int) Duration.ofSeconds(30).getSeconds();
    private Duration timeout = Duration.ofSeconds(30);
    private String key1 = "key1";
    private String value1 = "value1";

    /**
     * Code snippet for {@link DataLakeFileSystemClient#getFileClient(String)}
     */
    public void getFileClient() {
        // BEGIN: com.azure.storage.file.datalake.DataLakeFileSystemClient.getFileClient#String
        DataLakeFileClient dataLakeFileClient = client.getFileClient(fileName);
        // END: com.azure.storage.file.datalake.DataLakeFileSystemClient.getFileClient#String
    }

    /**
     * Code snippet for {@link DataLakeFileSystemClient#getDirectoryClient(String)}
     */
    public void getDirectoryClient() {
        // BEGIN: com.azure.storage.file.datalake.DataLakeFileSystemClient.getDirectoryClient#String
        DataLakeDirectoryClient dataLakeDirectoryClient = client.getDirectoryClient(directoryName);
        // END: com.azure.storage.file.datalake.DataLakeFileSystemClient.getDirectoryClient#String
    }

    /**
     * Generates a code sample for using {@link DataLakeFileSystemClient#getFileSystemName()}
     */
    public void getFileSystemName() {
        // BEGIN: com.azure.storage.file.datalake.DataLakeFileSystemClient.getFileSystemName
        String fileSystemName = client.getFileSystemName();
        System.out.println("The name of the file system is " + fileSystemName);
        // END: com.azure.storage.file.datalake.DataLakeFileSystemClient.getFileSystemName
    }

    /**
     * Code snippet for {@link DataLakeFileSystemClient#create()}
     */
    public void create() {
        // BEGIN: com.azure.storage.file.datalake.DataLakeFileSystemClient.create
        try {
            client.create();
            System.out.printf("Create completed%n");
        } catch (BlobStorageException error) {
            if (error.getErrorCode().equals(BlobErrorCode.CONTAINER_ALREADY_EXISTS)) {
                System.out.printf("Can't create file system. It already exists %n");
            }
        }
        // END: com.azure.storage.file.datalake.DataLakeFileSystemClient.create
    }

    /**
     * Code snippet for {@link DataLakeFileSystemClient#createWithResponse(Map, PublicAccessType, Duration, Context)}
     */
    public void create2() {
        // BEGIN: com.azure.storage.file.datalake.DataLakeFileSystemClient.createWithResponse#Map-PublicAccessType-Duration-Context
        Map<String, String> metadata = Collections.singletonMap("metadata", "value");
        Context context = new Context("Key", "Value");

        System.out.printf("Create completed with status %d%n",
            client.createWithResponse(metadata, PublicAccessType.CONTAINER, timeout, context).getStatusCode());
        // END: com.azure.storage.file.datalake.DataLakeFileSystemClient.createWithResponse#Map-PublicAccessType-Duration-Context
    }

    /**
     * Code snippet for {@link DataLakeFileSystemClient#delete()}
     */
    public void setDelete() {
        // BEGIN: com.azure.storage.file.datalake.DataLakeFileSystemClient.delete
        try {
            client.delete();
            System.out.printf("Delete completed%n");
        } catch (BlobStorageException error) {
            if (error.getErrorCode().equals(BlobErrorCode.CONTAINER_NOT_FOUND)) {
                System.out.printf("Delete failed. File System was not found %n");
            }
        }
        // END: com.azure.storage.file.datalake.DataLakeFileSystemClient.delete
    }

    /**
     * Code snippet for {@link DataLakeFileSystemClient#deleteWithResponse(DataLakeRequestConditions, Duration, Context)}
     */
    public void delete2() {
        // BEGIN: com.azure.storage.file.datalake.DataLakeFileSystemClient.deleteWithResponse#DataLakeRequestConditions-Duration-Context
        DataLakeRequestConditions requestConditions = new DataLakeRequestConditions()
            .setLeaseId(leaseId)
            .setIfUnmodifiedSince(OffsetDateTime.now().minusDays(3));
        Context context = new Context("Key", "Value");

        System.out.printf("Delete completed with status %d%n", client.deleteWithResponse(
            requestConditions, timeout, context).getStatusCode());
        // END: com.azure.storage.file.datalake.DataLakeFileSystemClient.deleteWithResponse#DataLakeRequestConditions-Duration-Context
    }

    /**
     * Code snippet for {@link DataLakeFileSystemClient#getProperties()}
     */
    public void getProperties() {
        // BEGIN: com.azure.storage.file.datalake.DataLakeFileSystemClient.getProperties
        FileSystemProperties properties = client.getProperties();
        System.out.printf("Public Access Type: %s, Legal Hold? %b, Immutable? %b%n",
            properties.getPublicAccess(),
            properties.hasLegalHold(),
            properties.hasImmutabilityPolicy());
        // END: com.azure.storage.file.datalake.DataLakeFileSystemClient.getProperties
    }

    /**
     * Code snippet for {@link DataLakeFileSystemClient#getPropertiesWithResponse(String, Duration, Context)}
     */
    public void getProperties2() {
        // BEGIN: com.azure.storage.file.datalake.DataLakeFileSystemClient.getPropertiesWithResponse#String-Duration-Context
        Context context = new Context("Key", "Value");

        FileSystemProperties properties = client.getPropertiesWithResponse(leaseId, timeout, context)
            .getValue();
        System.out.printf("Public Access Type: %s, Legal Hold? %b, Immutable? %b%n",
            properties.getPublicAccess(),
            properties.hasLegalHold(),
            properties.hasImmutabilityPolicy());
        // END: com.azure.storage.file.datalake.DataLakeFileSystemClient.getPropertiesWithResponse#String-Duration-Context
    }

    /**
     * Code snippet for {@link DataLakeFileSystemClient#setMetadata(Map)}
     */
    public void setMetadata() {
        // BEGIN: com.azure.storage.file.datalake.DataLakeFileSystemClient.setMetadata#Map
        Map<String, String> metadata = Collections.singletonMap("metadata", "value");
        try {
            client.setMetadata(metadata);
            System.out.printf("Set metadata completed with status %n");
        } catch (UnsupportedOperationException error) {
            System.out.printf("Fail while setting metadata %n");
        }
        // END: com.azure.storage.file.datalake.DataLakeFileSystemClient.setMetadata#Map
    }

    /**
     * Code snippet for {@link DataLakeFileSystemClient#setMetadataWithResponse(Map, DataLakeRequestConditions, Duration,
     * Context)}
     */
    public void setMetadata2() {
        // BEGIN: com.azure.storage.file.datalake.DataLakeFileSystemClient.setMetadataWithResponse#Map-DataLakeRequestConditions-Duration-Context
        Map<String, String> metadata = Collections.singletonMap("metadata", "value");
        DataLakeRequestConditions requestConditions = new DataLakeRequestConditions()
            .setLeaseId(leaseId)
            .setIfUnmodifiedSince(OffsetDateTime.now().minusDays(3));
        Context context = new Context("Key", "Value");

        System.out.printf("Set metadata completed with status %d%n",
            client.setMetadataWithResponse(metadata, requestConditions, timeout, context).getStatusCode());
        // END: com.azure.storage.file.datalake.DataLakeFileSystemClient.setMetadataWithResponse#Map-DataLakeRequestConditions-Duration-Context
    }

    /**
     * Code snippets for {@link DataLakeFileSystemClient#createFile(String)} and
     * {@link DataLakeFileSystemClient#createFileWithResponse(String, String, String, PathHttpHeaders, Map, DataLakeRequestConditions, Duration, Context)}
     */
    public void createFileCodeSnippets() {
        // BEGIN: com.azure.storage.file.datalake.DataLakeFileSystemClient.createFile#String
        DataLakeFileClient fileClient = client.createFile(fileName);
        // END: com.azure.storage.file.datalake.DataLakeFileSystemClient.createFile#String

        // BEGIN: com.azure.storage.file.datalake.DataLakeFileSystemClient.createFileWithResponse#String-String-String-PathHttpHeaders-Map-DataLakeRequestConditions-Duration-Context
        PathHttpHeaders httpHeaders = new PathHttpHeaders()
            .setContentLanguage("en-US")
            .setContentType("binary");
        DataLakeRequestConditions requestConditions = new DataLakeRequestConditions()
            .setLeaseId(leaseId);
        String permissions = "permissions";
        String umask = "umask";
        Response<DataLakeFileClient> newFileClient = client.createFileWithResponse(fileName, permissions, umask, httpHeaders,
            Collections.singletonMap("metadata", "value"), requestConditions,
            timeout, new Context(key1, value1));
        // END: com.azure.storage.file.datalake.DataLakeFileSystemClient.createFileWithResponse#String-String-String-PathHttpHeaders-Map-DataLakeRequestConditions-Duration-Context
    }

    /**
     * Code snippets for {@link DataLakeFileSystemClient#deleteFile(String)} and
     * {@link DataLakeFileSystemClient#deleteFileWithResponse(String, DataLakeRequestConditions, Duration, Context)}
     */
    public void deleteFileCodeSnippets() {
        // BEGIN: com.azure.storage.file.datalake.DataLakeFileSystemClient.deleteFile#String
        client.deleteFile(fileName);
        System.out.println("Delete request completed");
        // END: com.azure.storage.file.datalake.DataLakeFileSystemClient.deleteFile#String

        // BEGIN: com.azure.storage.file.datalake.DataLakeFileSystemClient.deleteFileWithResponse#String-DataLakeRequestConditions-Duration-Context
        DataLakeRequestConditions requestConditions = new DataLakeRequestConditions()
            .setLeaseId(leaseId);

        client.deleteFileWithResponse(fileName, requestConditions, timeout, new Context(key1, value1));
        System.out.println("Delete request completed");
        // END: com.azure.storage.file.datalake.DataLakeFileSystemClient.deleteFileWithResponse#String-DataLakeRequestConditions-Duration-Context
    }

    /**
     * Code snippets for {@link DataLakeFileSystemClient#createDirectory(String)} and
     * {@link DataLakeFileSystemClient#createDirectoryWithResponse(String, String, String, PathHttpHeaders, Map, DataLakeRequestConditions, Duration, Context)}
     */
    public void createDirectoryCodeSnippets() {
        // BEGIN: com.azure.storage.file.datalake.DataLakeFileSystemClient.createDirectory#String
        DataLakeDirectoryClient directoryClient = client.createDirectory(directoryName);
        // END: com.azure.storage.file.datalake.DataLakeFileSystemClient.createDirectory#String

        // BEGIN: com.azure.storage.file.datalake.DataLakeFileSystemClient.createDirectoryWithResponse#String-String-String-PathHttpHeaders-Map-DataLakeRequestConditions-Duration-Context
        PathHttpHeaders httpHeaders = new PathHttpHeaders()
            .setContentLanguage("en-US")
            .setContentType("binary");
        DataLakeRequestConditions requestConditions = new DataLakeRequestConditions()
            .setLeaseId(leaseId);
        String permissions = "permissions";
        String umask = "umask";
        Response<DataLakeDirectoryClient> newDirectoryClient = client.createDirectoryWithResponse(directoryName,
            permissions, umask, httpHeaders, Collections.singletonMap("metadata", "value"), requestConditions,
            timeout, new Context(key1, value1));
        // END: com.azure.storage.file.datalake.DataLakeFileSystemClient.createDirectoryWithResponse#String-String-String-PathHttpHeaders-Map-DataLakeRequestConditions-Duration-Context
    }

    /**
     * Code snippets for {@link DataLakeFileSystemClient#deleteDirectory(String)} and
     * {@link DataLakeFileSystemClient#deleteDirectoryWithResponse(String, boolean, DataLakeRequestConditions, Duration, Context)}
     */
    public void deleteDirectoryCodeSnippets() {
        // BEGIN: com.azure.storage.file.datalake.DataLakeFileSystemClient.deleteDirectory#String
        client.deleteDirectory(directoryName);
        System.out.println("Delete request completed");
        // END: com.azure.storage.file.datalake.DataLakeFileSystemClient.deleteDirectory#String

        // BEGIN: com.azure.storage.file.datalake.DataLakeFileSystemClient.deleteDirectoryWithResponse#String-boolean-DataLakeRequestConditions-Duration-Context
        DataLakeRequestConditions requestConditions = new DataLakeRequestConditions()
            .setLeaseId(leaseId);
        boolean recursive = false; // Default value

        client.deleteDirectoryWithResponse(directoryName, recursive, requestConditions, timeout,
            new Context(key1, value1));
        System.out.println("Delete request completed");
        // END: com.azure.storage.file.datalake.DataLakeFileSystemClient.deleteDirectoryWithResponse#String-boolean-DataLakeRequestConditions-Duration-Context
    }

    /**
     * Code snippets for {@link DataLakeFileSystemClient#listPaths()} and
     * {@link DataLakeFileSystemClient#listPaths(ListPathsOptions, Duration)}
     */
    public void listPaths() {
        // BEGIN: com.azure.storage.file.datalake.DataLakeFileSystemClient.listPaths
        client.listPaths().forEach(path -> System.out.printf("Name: %s%n", path.getName()));
        // END: com.azure.storage.file.datalake.DataLakeFileSystemClient.listPaths

        // BEGIN: com.azure.storage.file.datalake.DataLakeFileSystemClient.listPaths#ListPathsOptions-Duration
        ListPathsOptions options = new ListPathsOptions()
            .setPath("pathPrefixToMatch")
            .setMaxResults(10);

        client.listPaths(options, timeout).forEach(path -> System.out.printf("Name: %s%n", path.getName()));
        // END: com.azure.storage.file.datalake.DataLakeFileSystemClient.listPaths#ListPathsOptions-Duration
    }

}
