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

package com.amazonaws.services.simplesystemsmanagement.model;

/**
 * 
 */
public enum CommandStatus {

    Pending("Pending"),
    InProgress("InProgress"),
    Cancelling("Cancelling"),
    Success("Success"),
    TimedOut("TimedOut"),
    Cancelled("Cancelled"),
    Failed("Failed");

    private String value;

    private CommandStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *        real value
     * @return CommandStatus corresponding to the value
     */
    public static CommandStatus fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if ("Pending".equals(value)) {
            return Pending;
        } else if ("InProgress".equals(value)) {
            return InProgress;
        } else if ("Cancelling".equals(value)) {
            return Cancelling;
        } else if ("Success".equals(value)) {
            return Success;
        } else if ("TimedOut".equals(value)) {
            return TimedOut;
        } else if ("Cancelled".equals(value)) {
            return Cancelled;
        } else if ("Failed".equals(value)) {
            return Failed;
        } else {
            throw new IllegalArgumentException("Cannot create enum from "
                    + value + " value!");
        }
    }
}