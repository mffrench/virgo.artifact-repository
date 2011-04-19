/*******************************************************************************
 * Copyright (c) 2008, 2010 VMware Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   VMware Inc. - initial contribution
 *******************************************************************************/

package org.eclipse.virgo.repository.internal.watched;

import org.eclipse.virgo.repository.internal.LocationsRepository;


/**
 * A Repository which can also be asked to check its watched directory.
 * <p />
 *
 * <strong>Concurrent Semantics</strong><br />
 *
 * Implementations must be thread-safe.
 *
 */
public interface WatchableRepository extends LocationsRepository {
    
    /**
     * Synchronously check the directory being watched.
     * @throws Exception 
     */
    void forceCheck() throws Exception;
}