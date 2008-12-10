/**
 * Sonatype NexusTM [Open Source Version].
 * Copyright � 2008 Sonatype, Inc. All rights reserved.
 * Includes the third-party code listed at ${thirdpartyurl}.
 *
 * This program is licensed to you under Version 3 only of the GNU General
 * Public License as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License
 * Version 3 for more details.
 *
 * You should have received a copy of the GNU General Public License
 * Version 3 along with this program. If not, see http://www.gnu.org/licenses/.
 */
package org.sonatype.nexus.rest.feeds;

import java.util.List;
import java.util.Map;

import org.codehaus.plexus.component.annotations.Component;
import org.sonatype.nexus.feeds.SystemEvent;

/**
 * The system changes feed.
 * 
 * @author cstamas
 */
@Component( role = FeedSource.class, hint = "systemChanges" )
public class SystemFeedSource
    extends AbstractSystemFeedSource
{
    public static final String CHANNEL_KEY = "systemChanges";

    public List<SystemEvent> getEventList( Integer from, Integer count, Map<String, String> params ) 
    {
        return getNexus().getSystemEvents( from, count );
    }

    public String getFeedKey()
    {
        return CHANNEL_KEY;
    }

    public String getFeedName()
    {
        return getDescription();
    }

    @Override
    public String getDescription()
    {
        return "System changes in Nexus.";
    }

    @Override
    public String getTitle()
    {
        return "System changes";
    }

}
