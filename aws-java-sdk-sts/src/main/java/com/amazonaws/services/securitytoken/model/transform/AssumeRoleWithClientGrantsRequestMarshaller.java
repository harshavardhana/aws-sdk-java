/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.securitytoken.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.securitytoken.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * AssumeRoleWithClientGrantsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssumeRoleWithClientGrantsRequestMarshaller implements Marshaller<Request<AssumeRoleWithClientGrantsRequest>, AssumeRoleWithClientGrantsRequest> {

    public Request<AssumeRoleWithClientGrantsRequest> marshall(AssumeRoleWithClientGrantsRequest assumeRoleWithClientGrantsRequest) {

        if (assumeRoleWithClientGrantsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<AssumeRoleWithClientGrantsRequest> request = new DefaultRequest<AssumeRoleWithClientGrantsRequest>(assumeRoleWithClientGrantsRequest,
                "AWSSecurityTokenService");
        request.addParameter("Action", "AssumeRoleWithClientGrants");
        request.addParameter("Version", "2011-06-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (assumeRoleWithClientGrantsRequest.getClientGrantsToken() != null) {
            request.addParameter("Token", StringUtils.fromString(assumeRoleWithClientGrantsRequest.getClientGrantsToken()));
        }

        if (assumeRoleWithClientGrantsRequest.getPolicy() != null) {
            request.addParameter("Policy", StringUtils.fromString(assumeRoleWithClientGrantsRequest.getPolicy()));
        }

        if (assumeRoleWithClientGrantsRequest.getDurationSeconds() != null) {
            request.addParameter("DurationSeconds", StringUtils.fromInteger(assumeRoleWithClientGrantsRequest.getDurationSeconds()));
        }

        return request;
    }

}
