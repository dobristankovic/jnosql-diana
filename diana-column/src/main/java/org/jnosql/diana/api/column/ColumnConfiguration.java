/*
 *
 *  Copyright (c) 2017 Otávio Santana and others
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v1.0
 *   and Apache License v2.0 which accompanies this distribution.
 *   The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 *   and the Apache License v2.0 is available at http://www.opensource.org/licenses/apache2.0.php.
 *
 *   You may elect to redistribute this code under either of these licenses.
 *
 *   Contributors:
 *
 *   Otavio Santana
 *
 */

package org.jnosql.diana.api.column;

import org.jnosql.diana.api.Settings;


/**
 * The diana configuration to create a {@link ColumnFamilyManagerFactory}
 *
 * @param <SYNC> the ColumnFamilyManagerFactory type
 */
public interface ColumnConfiguration<SYNC extends ColumnFamilyManagerFactory> {

    /**
     * Reads configuration either from default configuration or a file defined by NoSQL
     * provider and then creates a {@link ColumnFamilyManagerFactory} instance.
     *
     * @return a {@link ColumnFamilyManagerFactory}
     */
    SYNC get();


    /**
     * Reads configuration from the {@link Settings} instance, the parameters are defined by NoSQL
     * provider, then creates a {@link ColumnFamilyManagerFactory} instance.
     *
     * @param settings the settings
     * @return a {@link ColumnFamilyManagerFactory}
     * @throws NullPointerException when settings is null
     * @see Settings
     * @see Settings {@link java.util.Map}
     */
    SYNC get(Settings settings);

}
