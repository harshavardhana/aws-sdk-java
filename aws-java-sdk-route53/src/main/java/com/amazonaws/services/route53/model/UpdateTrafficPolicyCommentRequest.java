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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.route53.AmazonRoute53#updateTrafficPolicyComment(UpdateTrafficPolicyCommentRequest) UpdateTrafficPolicyComment operation}.
 * <p>
 * Updates the comment for a specified traffic policy version.
 * </p>
 * <p>
 * To update the comment, send a <code>POST</code> request to the
 * <code>/2013-04-01/trafficpolicy/</code> resource.
 * </p>
 * <p>
 * The request body must include an XML document with an
 * <code>UpdateTrafficPolicyCommentRequest</code> element.
 * </p>
 *
 * @see com.amazonaws.services.route53.AmazonRoute53#updateTrafficPolicyComment(UpdateTrafficPolicyCommentRequest)
 */
public class UpdateTrafficPolicyCommentRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The value of <code>Id</code> for the traffic policy for which you want
     * to update the comment.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 36<br/>
     */
    private String id;

    /**
     * The value of <code>Version</code> for the traffic policy for which you
     * want to update the comment.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     */
    private Integer version;

    /**
     * The new comment for the specified traffic policy and version.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     */
    private String comment;

    /**
     * The value of <code>Id</code> for the traffic policy for which you want
     * to update the comment.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 36<br/>
     *
     * @return The value of <code>Id</code> for the traffic policy for which you want
     *         to update the comment.
     */
    public String getId() {
        return id;
    }
    
    /**
     * The value of <code>Id</code> for the traffic policy for which you want
     * to update the comment.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 36<br/>
     *
     * @param id The value of <code>Id</code> for the traffic policy for which you want
     *         to update the comment.
     */
    public void setId(String id) {
        this.id = id;
    }
    
    /**
     * The value of <code>Id</code> for the traffic policy for which you want
     * to update the comment.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 36<br/>
     *
     * @param id The value of <code>Id</code> for the traffic policy for which you want
     *         to update the comment.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateTrafficPolicyCommentRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * The value of <code>Version</code> for the traffic policy for which you
     * want to update the comment.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @return The value of <code>Version</code> for the traffic policy for which you
     *         want to update the comment.
     */
    public Integer getVersion() {
        return version;
    }
    
    /**
     * The value of <code>Version</code> for the traffic policy for which you
     * want to update the comment.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param version The value of <code>Version</code> for the traffic policy for which you
     *         want to update the comment.
     */
    public void setVersion(Integer version) {
        this.version = version;
    }
    
    /**
     * The value of <code>Version</code> for the traffic policy for which you
     * want to update the comment.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param version The value of <code>Version</code> for the traffic policy for which you
     *         want to update the comment.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateTrafficPolicyCommentRequest withVersion(Integer version) {
        this.version = version;
        return this;
    }

    /**
     * The new comment for the specified traffic policy and version.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @return The new comment for the specified traffic policy and version.
     */
    public String getComment() {
        return comment;
    }
    
    /**
     * The new comment for the specified traffic policy and version.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param comment The new comment for the specified traffic policy and version.
     */
    public void setComment(String comment) {
        this.comment = comment;
    }
    
    /**
     * The new comment for the specified traffic policy and version.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param comment The new comment for the specified traffic policy and version.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateTrafficPolicyCommentRequest withComment(String comment) {
        this.comment = comment;
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
        if (getId() != null) sb.append("Id: " + getId() + ",");
        if (getVersion() != null) sb.append("Version: " + getVersion() + ",");
        if (getComment() != null) sb.append("Comment: " + getComment() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode()); 
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode()); 
        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdateTrafficPolicyCommentRequest == false) return false;
        UpdateTrafficPolicyCommentRequest other = (UpdateTrafficPolicyCommentRequest)obj;
        
        if (other.getId() == null ^ this.getId() == null) return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false) return false; 
        if (other.getVersion() == null ^ this.getVersion() == null) return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false) return false; 
        if (other.getComment() == null ^ this.getComment() == null) return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false) return false; 
        return true;
    }
    
    @Override
    public UpdateTrafficPolicyCommentRequest clone() {
        
            return (UpdateTrafficPolicyCommentRequest) super.clone();
    }

}
    