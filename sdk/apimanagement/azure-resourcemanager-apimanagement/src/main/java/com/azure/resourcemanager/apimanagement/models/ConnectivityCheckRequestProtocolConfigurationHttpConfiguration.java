// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Configuration for HTTP or HTTPS requests. */
@Fluent
public final class ConnectivityCheckRequestProtocolConfigurationHttpConfiguration {
    /*
     * The HTTP method to be used.
     */
    @JsonProperty(value = "method")
    private Method method;

    /*
     * List of HTTP status codes considered valid for the request response.
     */
    @JsonProperty(value = "validStatusCodes")
    private List<Long> validStatusCodes;

    /*
     * List of headers to be included in the request.
     */
    @JsonProperty(value = "headers")
    private List<HttpHeader> headers;

    /**
     * Get the method property: The HTTP method to be used.
     *
     * @return the method value.
     */
    public Method method() {
        return this.method;
    }

    /**
     * Set the method property: The HTTP method to be used.
     *
     * @param method the method value to set.
     * @return the ConnectivityCheckRequestProtocolConfigurationHttpConfiguration object itself.
     */
    public ConnectivityCheckRequestProtocolConfigurationHttpConfiguration withMethod(Method method) {
        this.method = method;
        return this;
    }

    /**
     * Get the validStatusCodes property: List of HTTP status codes considered valid for the request response.
     *
     * @return the validStatusCodes value.
     */
    public List<Long> validStatusCodes() {
        return this.validStatusCodes;
    }

    /**
     * Set the validStatusCodes property: List of HTTP status codes considered valid for the request response.
     *
     * @param validStatusCodes the validStatusCodes value to set.
     * @return the ConnectivityCheckRequestProtocolConfigurationHttpConfiguration object itself.
     */
    public ConnectivityCheckRequestProtocolConfigurationHttpConfiguration withValidStatusCodes(
        List<Long> validStatusCodes) {
        this.validStatusCodes = validStatusCodes;
        return this;
    }

    /**
     * Get the headers property: List of headers to be included in the request.
     *
     * @return the headers value.
     */
    public List<HttpHeader> headers() {
        return this.headers;
    }

    /**
     * Set the headers property: List of headers to be included in the request.
     *
     * @param headers the headers value to set.
     * @return the ConnectivityCheckRequestProtocolConfigurationHttpConfiguration object itself.
     */
    public ConnectivityCheckRequestProtocolConfigurationHttpConfiguration withHeaders(List<HttpHeader> headers) {
        this.headers = headers;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (headers() != null) {
            headers().forEach(e -> e.validate());
        }
    }
}
