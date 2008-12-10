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
package org.sonatype.nexus.integrationtests.nexus586;

import org.junit.Assert;
import org.junit.Test;
import org.restlet.data.Response;
import org.sonatype.nexus.integrationtests.AbstractNexusIntegrationTest;
import org.sonatype.nexus.integrationtests.nexus393.ResetPasswordUtils;


/**
 * Saving the Nexus config needs to validate the anonymous user information 
 */
public class Nexus586AnonymousResetPasswordTest
    extends AbstractNexusIntegrationTest
{

    @Test
    public void resetPassword()
        throws Exception
    {
        String username = "anonymous";
        Response response = ResetPasswordUtils.resetPassword( username );
        Assert.assertEquals( 400, response.getStatus().getCode() );
    }
}
