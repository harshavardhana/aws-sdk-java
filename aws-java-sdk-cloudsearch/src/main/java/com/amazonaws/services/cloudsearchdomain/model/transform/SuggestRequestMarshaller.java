/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.cloudsearchdomain.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import static com.amazonaws.util.StringUtils.COMMA_SEPARATOR;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cloudsearchdomain.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * SuggestRequest Marshaller
 */
public class SuggestRequestMarshaller implements
        Marshaller<Request<SuggestRequest>, SuggestRequest> {

    private static final String DEFAULT_CONTENT_TYPE = "application/x-amz-json-1.1";

    public Request<SuggestRequest> marshall(SuggestRequest suggestRequest) {

        if (suggestRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<SuggestRequest> request = new DefaultRequest<SuggestRequest>(
                suggestRequest, "AmazonCloudSearchDomain");

        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/2013-01-01/suggest?format=sdk&pretty=true";

        uriResourcePath = com.amazonaws.util.UriResourcePathUtils
                .addStaticQueryParamtersToRequest(request, uriResourcePath);

        request.setResourcePath(uriResourcePath);

        String query = (suggestRequest.getQuery() == null) ? null : StringUtils
                .fromString(suggestRequest.getQuery());
        if (query != null) {
            request.addParameter("q", query);
        }

        String suggester = (suggestRequest.getSuggester() == null) ? null
                : StringUtils.fromString(suggestRequest.getSuggester());
        if (suggester != null) {
            request.addParameter("suggester", suggester);
        }

        String size = (suggestRequest.getSize() == null) ? null : StringUtils
                .fromLong(suggestRequest.getSize());
        if (size != null) {
            request.addParameter("size", size);
        }

        request.setContent(new ByteArrayInputStream(new byte[0]));
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", DEFAULT_CONTENT_TYPE);
        }

        return request;
    }

}
