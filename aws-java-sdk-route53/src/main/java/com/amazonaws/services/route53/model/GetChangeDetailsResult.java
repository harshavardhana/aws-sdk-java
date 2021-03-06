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
package com.amazonaws.services.route53.model;

import java.io.Serializable;

/**
 * <p>
 * A complex type that contains the <code>ChangeBatchRecord</code>
 * element.
 * </p>
 */
public class GetChangeDetailsResult implements Serializable, Cloneable {

    /**
     * A complex type that contains information about the specified change
     * batch, including the change batch ID, the status of the change, and
     * the contained changes.
     */
    private ChangeBatchRecord changeBatchRecord;

    /**
     * A complex type that contains information about the specified change
     * batch, including the change batch ID, the status of the change, and
     * the contained changes.
     *
     * @return A complex type that contains information about the specified change
     *         batch, including the change batch ID, the status of the change, and
     *         the contained changes.
     */
    public ChangeBatchRecord getChangeBatchRecord() {
        return changeBatchRecord;
    }
    
    /**
     * A complex type that contains information about the specified change
     * batch, including the change batch ID, the status of the change, and
     * the contained changes.
     *
     * @param changeBatchRecord A complex type that contains information about the specified change
     *         batch, including the change batch ID, the status of the change, and
     *         the contained changes.
     */
    public void setChangeBatchRecord(ChangeBatchRecord changeBatchRecord) {
        this.changeBatchRecord = changeBatchRecord;
    }
    
    /**
     * A complex type that contains information about the specified change
     * batch, including the change batch ID, the status of the change, and
     * the contained changes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param changeBatchRecord A complex type that contains information about the specified change
     *         batch, including the change batch ID, the status of the change, and
     *         the contained changes.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetChangeDetailsResult withChangeBatchRecord(ChangeBatchRecord changeBatchRecord) {
        this.changeBatchRecord = changeBatchRecord;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getChangeBatchRecord() != null) sb.append("ChangeBatchRecord: " + getChangeBatchRecord() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getChangeBatchRecord() == null) ? 0 : getChangeBatchRecord().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetChangeDetailsResult == false) return false;
        GetChangeDetailsResult other = (GetChangeDetailsResult)obj;
        
        if (other.getChangeBatchRecord() == null ^ this.getChangeBatchRecord() == null) return false;
        if (other.getChangeBatchRecord() != null && other.getChangeBatchRecord().equals(this.getChangeBatchRecord()) == false) return false; 
        return true;
    }
    
    @Override
    public GetChangeDetailsResult clone() {
        try {
            return (GetChangeDetailsResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    