/*
 * Copyright (c) 2008-2012, Hazel Bilisim Ltd. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hazelcast.config;

import com.hazelcast.core.ItemListener;

public class ItemListenerConfig extends ListenerConfig {

    private boolean includeValue = true;

    public ItemListenerConfig() {
        super();
    }

    public ItemListenerConfig(String className, boolean includeValue) {
        super(className);
        this.includeValue = includeValue;
    }

    public ItemListenerConfig(ItemListener implementation, boolean includeValue) {
        super(implementation);
        this.includeValue = includeValue;
    }

    public ItemListener getImplementation() {
        return (ItemListener) implementation;
    }

    public ItemListenerConfig setImplementation(final ItemListener implementation) {
        super.setImplementation(implementation);
        return this;
    }

    public boolean isIncludeValue() {
        return includeValue;
    }

    public ItemListenerConfig setIncludeValue(boolean includeValue) {
        this.includeValue = includeValue;
        return this;
    }
}
