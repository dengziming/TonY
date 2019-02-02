/**
 * Copyright 2018 LinkedIn Corporation. All rights reserved. Licensed under the BSD-2 Clause license.
 * See LICENSE in the project root for license information.
 */
package com.linkedin.tony;

import org.apache.hadoop.security.authorize.PolicyProvider;
import org.apache.hadoop.security.authorize.Service;
import com.linkedin.tony.rpc.TensorFlowCluster;

/**
 * PolicyProvider for Client to AM protocol.
 **/
public class TFPolicyProvider extends PolicyProvider {
    @Override
    public Service[] getServices() {
        return new Service[]{new Service("security.tf.client-am-protocol.acl", TensorFlowCluster.class)};
    }
}
