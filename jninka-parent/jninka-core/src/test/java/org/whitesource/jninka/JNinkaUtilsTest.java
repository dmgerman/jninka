/**
 *  Copyright (C) 2012 White Source (www.whitesourcesoftware.com)
 *  This program is free software; you can redistribute it and/or modify
 *  it under the terms of the GNU Affero General Public License as
 *  published by the Free Software Foundation, either version 3 of the
 *  License, or (at your option) any later version.
 *
 *  This patch is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Affero General Public License for more details.
 *
 *  You should have received a copy of the GNU Affero General Public License
 *  along with this patch.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.whitesource.jninka;

import org.junit.Test;

import java.util.regex.Pattern;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class JNinkaUtilsTest {

    @Test
	public void testAlphabeticalCount() {
        assertEquals(0, JNinkaUtils.alphabeticCount(""));
        assertEquals(3, JNinkaUtils.alphabeticCount("abc"));
        assertEquals(3, JNinkaUtils.alphabeticCount("abc "));
        assertEquals(3, JNinkaUtils.alphabeticCount("abc \n"));
        assertEquals(5, JNinkaUtils.alphabeticCount("abc \nbn"));
        assertEquals(5, JNinkaUtils.alphabeticCount("abc \nbn 1 "));
        assertEquals(5, JNinkaUtils.alphabeticCount("abc \nBn 12"));
    }



}