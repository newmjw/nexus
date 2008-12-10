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
package org.sonatype.nexus.proxy.router;

import org.codehaus.plexus.component.annotations.Component;
import org.sonatype.nexus.proxy.registry.ContentClass;

/**
 * The default grouping router, without any specific postprocessing.
 * 
 * @author cstamas
 */
@Component( role = RepositoryRouter.class, hint = "groups" )
public class DefaultGroupIdBasedRepositoryRouter
    extends GroupIdBasedRepositoryRouter
{
    public static final String ID = "groups";

    private ContentClass contentClass = new DefaultContentClass();

    public String getId()
    {
        return ID;
    }

    public ContentClass getHandledContentClass()
    {
        return contentClass;
    }
}
