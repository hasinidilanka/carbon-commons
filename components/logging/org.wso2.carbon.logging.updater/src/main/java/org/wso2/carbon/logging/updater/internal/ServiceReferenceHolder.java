/*
 * Copyright (c) 2019, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 */

package org.wso2.carbon.logging.updater.internal;

import org.osgi.service.cm.ConfigurationAdmin;

import java.util.concurrent.ScheduledExecutorService;

public class ServiceReferenceHolder {
    private static ConfigurationAdmin configurationAdmin;
    private static ScheduledExecutorService scheduledExecutorService;
    private static final ServiceReferenceHolder instance = new ServiceReferenceHolder();


    private ServiceReferenceHolder(){

    }

    public  ConfigurationAdmin getConfigurationAdmin() {

        return configurationAdmin;
    }

    public static ServiceReferenceHolder getInstance() {

        return instance;
    }

    public  void setConfigurationAdmin(ConfigurationAdmin configurationAdmin) {

        ServiceReferenceHolder.configurationAdmin = configurationAdmin;
    }

    public  void setScheduledExecutorService(ScheduledExecutorService scheduledExecutorService) {

        ServiceReferenceHolder.scheduledExecutorService = scheduledExecutorService;
    }

    public  ScheduledExecutorService getScheduledExecutorService() {

        return scheduledExecutorService;
    }
}
