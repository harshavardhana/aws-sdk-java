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

package com.amazonaws.services.elasticsearch.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.elasticsearch.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ElasticsearchDomainStatus JSON Unmarshaller
 */
public class ElasticsearchDomainStatusJsonUnmarshaller implements
        Unmarshaller<ElasticsearchDomainStatus, JsonUnmarshallerContext> {

    public ElasticsearchDomainStatus unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        ElasticsearchDomainStatus elasticsearchDomainStatus = new ElasticsearchDomainStatus();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL)
            return null;

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("DomainId", targetDepth)) {
                    context.nextToken();
                    elasticsearchDomainStatus
                            .setDomainId(StringJsonUnmarshaller.getInstance()
                                    .unmarshall(context));
                }
                if (context.testExpression("DomainName", targetDepth)) {
                    context.nextToken();
                    elasticsearchDomainStatus
                            .setDomainName(StringJsonUnmarshaller.getInstance()
                                    .unmarshall(context));
                }
                if (context.testExpression("ARN", targetDepth)) {
                    context.nextToken();
                    elasticsearchDomainStatus.setARN(StringJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("Created", targetDepth)) {
                    context.nextToken();
                    elasticsearchDomainStatus
                            .setCreated(BooleanJsonUnmarshaller.getInstance()
                                    .unmarshall(context));
                }
                if (context.testExpression("Deleted", targetDepth)) {
                    context.nextToken();
                    elasticsearchDomainStatus
                            .setDeleted(BooleanJsonUnmarshaller.getInstance()
                                    .unmarshall(context));
                }
                if (context.testExpression("Endpoint", targetDepth)) {
                    context.nextToken();
                    elasticsearchDomainStatus
                            .setEndpoint(StringJsonUnmarshaller.getInstance()
                                    .unmarshall(context));
                }
                if (context.testExpression("Processing", targetDepth)) {
                    context.nextToken();
                    elasticsearchDomainStatus
                            .setProcessing(BooleanJsonUnmarshaller
                                    .getInstance().unmarshall(context));
                }
                if (context.testExpression("ElasticsearchClusterConfig",
                        targetDepth)) {
                    context.nextToken();
                    elasticsearchDomainStatus
                            .setElasticsearchClusterConfig(ElasticsearchClusterConfigJsonUnmarshaller
                                    .getInstance().unmarshall(context));
                }
                if (context.testExpression("EBSOptions", targetDepth)) {
                    context.nextToken();
                    elasticsearchDomainStatus
                            .setEBSOptions(EBSOptionsJsonUnmarshaller
                                    .getInstance().unmarshall(context));
                }
                if (context.testExpression("AccessPolicies", targetDepth)) {
                    context.nextToken();
                    elasticsearchDomainStatus
                            .setAccessPolicies(StringJsonUnmarshaller
                                    .getInstance().unmarshall(context));
                }
                if (context.testExpression("SnapshotOptions", targetDepth)) {
                    context.nextToken();
                    elasticsearchDomainStatus
                            .setSnapshotOptions(SnapshotOptionsJsonUnmarshaller
                                    .getInstance().unmarshall(context));
                }
                if (context.testExpression("AdvancedOptions", targetDepth)) {
                    context.nextToken();
                    elasticsearchDomainStatus
                            .setAdvancedOptions(new MapUnmarshaller<String, String>(
                                    StringJsonUnmarshaller.getInstance(),
                                    StringJsonUnmarshaller.getInstance())
                                    .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null
                        || context.getLastParsedParentElement().equals(
                                currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return elasticsearchDomainStatus;
    }

    private static ElasticsearchDomainStatusJsonUnmarshaller instance;

    public static ElasticsearchDomainStatusJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ElasticsearchDomainStatusJsonUnmarshaller();
        return instance;
    }
}
