/**
 * Sonatype Nexus (TM) Open Source Version
 * Copyright (c) 2007-2012 Sonatype, Inc.
 * All rights reserved. Includes the third-party code listed at http://links.sonatype.com/products/nexus/oss/attributions.
 *
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License Version 1.0,
 * which accompanies this distribution and is available at http://www.eclipse.org/legal/epl-v10.html.
 *
 * Sonatype Nexus (TM) Professional Version is available from Sonatype, Inc. "Sonatype" and "Sonatype Nexus" are trademarks
 * of Sonatype, Inc. Apache Maven is a trademark of the Apache Software Foundation. M2eclipse is a trademark of the
 * Eclipse Foundation. All other trademarks are the property of their respective owners.
 */
package org.sonatype.nexus.rest.feeds.sources;

import org.sonatype.nexus.ApplicationStatusSource;
import org.sonatype.nexus.feeds.FeedRecorder;
import org.sonatype.nexus.logging.AbstractLoggingComponent;
import org.sonatype.nexus.proxy.registry.RepositoryRegistry;

import javax.inject.Inject;

/**
 * And abstract class for NexusArtifactEvent based feeds. This class implements all needed to create a feed,
 * implementors needs only to implement 3 abtract classes.
 * 
 * @author cstamas
 */
public abstract class AbstractFeedSource
    extends AbstractLoggingComponent
    implements FeedSource
{
    @Inject
    private ApplicationStatusSource applicationStatusSource;

    @Inject
    private RepositoryRegistry repositoryRegistry;

    @Inject
    private FeedRecorder feedRecorder;

    protected FeedRecorder getFeedRecorder()
    {
        return feedRecorder;
    }

    protected RepositoryRegistry getRepositoryRegistry()
    {
        return repositoryRegistry;
    }
    
    protected ApplicationStatusSource getApplicationStatusSource()
    {
        return applicationStatusSource;
    }

    public abstract String getTitle();

    public abstract String getDescription();
}
