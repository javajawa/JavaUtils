package com.harcourtprogramming.utils;

import java.io.File;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author benedict
 */
public class FileUtilsTest
{
	public FileUtilsTest()
	{
	}

	/**
	 * Test of realtivePath method, of class FileUtils.
	 * TODO: Document testRealtivePathUnix()
	 */
	@Test
	public void testRealtivePathUnix()
	{
		File base = new File("/etc/init.d/apache");
		File target = new File("/etc/passwd");
		String expResult = ".." + File.separatorChar + "passwd";

		String result = FileUtils.realtivePath(base, target);

		assertEquals(expResult, result);
	}

	/**
	 * Test of realtivePath method, of class FileUtils.
	 * TODO: Document testRealtivePathWindows1()
	 */
	@Test
	public void testRealtivePathWindows1()
	{
		File base = new File("C:\\Program Files\\Test\\text.exe");
		File target = new File("C:\\Windows\\System32\\virius.exe");

		String expResult = "..\\..\\Windows\\System32\\virius.exe";

		String result = FileUtils.realtivePath(base, target);

		assertEquals(expResult, result);
	}

	/**
	 * Test of realtivePath method, of class FileUtils.
	 * TODO: Document testRealtivePathWindows2()
	 */
	@Test
	public void testRealtivePathWindows2()
	{
		File base = new File("C:\\Windows\\System32\\virius.exe");
		File target = new File("D:\\users\\admin\\loadvirius.dll");
		String expResult = "D:\\users\\admin\\loadvirius.dll";

		String result = FileUtils.realtivePath(base, target);

		assertEquals(expResult, result);
	}

	/**
	 * Test of explodedPath method, of class FileUtils.
	 * TODO: Document testExplodedPathUnix()
	 */
	@Test
	public void testExplodedPathUnix()
	{
		File f = new File("/etc/passwd");
		String[] expResult = new String[3];

		expResult[0] = "";
		expResult[1] = "etc";
		expResult[2] = "passwd";

		String[] result = FileUtils.explodedPath(f);
		assertArrayEquals(expResult, result);
	}

	/**
	 * Test of explodedPath method, of class FileUtils.
	 * TODO: Document testExplodedPathWindows()
	 */
	@Test
	public void testExplodedPathWindows()
	{
		File f = new File("C:\\Windows\\system32");
		String[] expResult = new String[3];

		expResult[0] = "C:";
		expResult[1] = "Windows";
		expResult[2] = "system32";

		String[] result = FileUtils.explodedPath(f);
		assertArrayEquals(expResult, result);
	}
}
