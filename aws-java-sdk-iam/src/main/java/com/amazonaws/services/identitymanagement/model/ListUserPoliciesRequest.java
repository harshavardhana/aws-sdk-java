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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.identitymanagement.AmazonIdentityManagement#listUserPolicies(ListUserPoliciesRequest) ListUserPolicies operation}.
 * <p>
 * Lists the names of the inline policies embedded in the specified user.
 * </p>
 * <p>
 * A user can also have managed policies attached to it. To list the
 * managed policies that are attached to a user, use
 * ListAttachedUserPolicies. For more information about policies, refer
 * to
 * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"> Managed Policies and Inline Policies </a>
 * in the <i>IAM User Guide</i> .
 * </p>
 * <p>
 * You can paginate the results using the <code>MaxItems</code> and
 * <code>Marker</code> parameters. If there are no inline policies
 * embedded with the specified user, the action returns an empty list.
 * </p>
 *
 * @see com.amazonaws.services.identitymanagement.AmazonIdentityManagement#listUserPolicies(ListUserPoliciesRequest)
 */
public class ListUserPoliciesRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The name of the user to list policies for.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     */
    private String userName;

    /**
     * Use this parameter only when paginating results and only after you
     * receive a response indicating that the results are truncated. Set it
     * to the value of the <code>Marker</code> element in the response that
     * you received to indicate where the next call should start.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;u00FF]+<br/>
     */
    private String marker;

    /**
     * Use this only when paginating results to indicate the maximum number
     * of items you want in the response. If additional items exist beyond
     * the maximum you specify, the <code>IsTruncated</code> response element
     * is <code>true</code>. <p>This parameter is optional. If you do not
     * include it, it defaults to 100. Note that IAM might return fewer
     * results, even when there are more results available. In that case, the
     * <code>IsTruncated</code> response element returns <code>true</code>
     * and <code>Marker</code> contains a value to include in the subsequent
     * call that tells the service where to continue from.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     */
    private Integer maxItems;

    /**
     * Default constructor for a new ListUserPoliciesRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public ListUserPoliciesRequest() {}
    
    /**
     * Constructs a new ListUserPoliciesRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param userName The name of the user to list policies for.
     */
    public ListUserPoliciesRequest(String userName) {
        setUserName(userName);
    }

    /**
     * The name of the user to list policies for.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @return The name of the user to list policies for.
     */
    public String getUserName() {
        return userName;
    }
    
    /**
     * The name of the user to list policies for.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param userName The name of the user to list policies for.
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    /**
     * The name of the user to list policies for.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param userName The name of the user to list policies for.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListUserPoliciesRequest withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * Use this parameter only when paginating results and only after you
     * receive a response indicating that the results are truncated. Set it
     * to the value of the <code>Marker</code> element in the response that
     * you received to indicate where the next call should start.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;u00FF]+<br/>
     *
     * @return Use this parameter only when paginating results and only after you
     *         receive a response indicating that the results are truncated. Set it
     *         to the value of the <code>Marker</code> element in the response that
     *         you received to indicate where the next call should start.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * Use this parameter only when paginating results and only after you
     * receive a response indicating that the results are truncated. Set it
     * to the value of the <code>Marker</code> element in the response that
     * you received to indicate where the next call should start.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;u00FF]+<br/>
     *
     * @param marker Use this parameter only when paginating results and only after you
     *         receive a response indicating that the results are truncated. Set it
     *         to the value of the <code>Marker</code> element in the response that
     *         you received to indicate where the next call should start.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * Use this parameter only when paginating results and only after you
     * receive a response indicating that the results are truncated. Set it
     * to the value of the <code>Marker</code> element in the response that
     * you received to indicate where the next call should start.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;u00FF]+<br/>
     *
     * @param marker Use this parameter only when paginating results and only after you
     *         receive a response indicating that the results are truncated. Set it
     *         to the value of the <code>Marker</code> element in the response that
     *         you received to indicate where the next call should start.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListUserPoliciesRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * Use this only when paginating results to indicate the maximum number
     * of items you want in the response. If additional items exist beyond
     * the maximum you specify, the <code>IsTruncated</code> response element
     * is <code>true</code>. <p>This parameter is optional. If you do not
     * include it, it defaults to 100. Note that IAM might return fewer
     * results, even when there are more results available. In that case, the
     * <code>IsTruncated</code> response element returns <code>true</code>
     * and <code>Marker</code> contains a value to include in the subsequent
     * call that tells the service where to continue from.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @return Use this only when paginating results to indicate the maximum number
     *         of items you want in the response. If additional items exist beyond
     *         the maximum you specify, the <code>IsTruncated</code> response element
     *         is <code>true</code>. <p>This parameter is optional. If you do not
     *         include it, it defaults to 100. Note that IAM might return fewer
     *         results, even when there are more results available. In that case, the
     *         <code>IsTruncated</code> response element returns <code>true</code>
     *         and <code>Marker</code> contains a value to include in the subsequent
     *         call that tells the service where to continue from.
     */
    public Integer getMaxItems() {
        return maxItems;
    }
    
    /**
     * Use this only when paginating results to indicate the maximum number
     * of items you want in the response. If additional items exist beyond
     * the maximum you specify, the <code>IsTruncated</code> response element
     * is <code>true</code>. <p>This parameter is optional. If you do not
     * include it, it defaults to 100. Note that IAM might return fewer
     * results, even when there are more results available. In that case, the
     * <code>IsTruncated</code> response element returns <code>true</code>
     * and <code>Marker</code> contains a value to include in the subsequent
     * call that tells the service where to continue from.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param maxItems Use this only when paginating results to indicate the maximum number
     *         of items you want in the response. If additional items exist beyond
     *         the maximum you specify, the <code>IsTruncated</code> response element
     *         is <code>true</code>. <p>This parameter is optional. If you do not
     *         include it, it defaults to 100. Note that IAM might return fewer
     *         results, even when there are more results available. In that case, the
     *         <code>IsTruncated</code> response element returns <code>true</code>
     *         and <code>Marker</code> contains a value to include in the subsequent
     *         call that tells the service where to continue from.
     */
    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }
    
    /**
     * Use this only when paginating results to indicate the maximum number
     * of items you want in the response. If additional items exist beyond
     * the maximum you specify, the <code>IsTruncated</code> response element
     * is <code>true</code>. <p>This parameter is optional. If you do not
     * include it, it defaults to 100. Note that IAM might return fewer
     * results, even when there are more results available. In that case, the
     * <code>IsTruncated</code> response element returns <code>true</code>
     * and <code>Marker</code> contains a value to include in the subsequent
     * call that tells the service where to continue from.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param maxItems Use this only when paginating results to indicate the maximum number
     *         of items you want in the response. If additional items exist beyond
     *         the maximum you specify, the <code>IsTruncated</code> response element
     *         is <code>true</code>. <p>This parameter is optional. If you do not
     *         include it, it defaults to 100. Note that IAM might return fewer
     *         results, even when there are more results available. In that case, the
     *         <code>IsTruncated</code> response element returns <code>true</code>
     *         and <code>Marker</code> contains a value to include in the subsequent
     *         call that tells the service where to continue from.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListUserPoliciesRequest withMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
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
        if (getUserName() != null) sb.append("UserName: " + getUserName() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() + ",");
        if (getMaxItems() != null) sb.append("MaxItems: " + getMaxItems() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListUserPoliciesRequest == false) return false;
        ListUserPoliciesRequest other = (ListUserPoliciesRequest)obj;
        
        if (other.getUserName() == null ^ this.getUserName() == null) return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        if (other.getMaxItems() == null ^ this.getMaxItems() == null) return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false) return false; 
        return true;
    }
    
    @Override
    public ListUserPoliciesRequest clone() {
        
            return (ListUserPoliciesRequest) super.clone();
    }

}
    