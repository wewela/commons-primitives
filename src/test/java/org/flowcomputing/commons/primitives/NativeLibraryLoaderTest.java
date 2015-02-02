package org.flowcomputing.commons.primitives;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class NativeLibraryLoaderTest {

	/**
	 * test to retrieve extension of native library.
	 */
	@Test
	public void getNativeLibraryExtension() {
		String ext = NativeLibraryLoader.getNativeLibraryExtension();
		System.out.println(String.format(
				"The extension of native library is %s.", ext));
		assertNotNull(ext);
		assertFalse(ext.isEmpty());
	}

	/**
	 * test to retrieve suffix of native library.
	 */
	@Test
	public void getNativeLibraryExtSuffix() {
		String ext = NativeLibraryLoader.getNativeLibraryExtSuffix();
		System.out.println(String.format(
				"The suffix of extension of native library is %s.", ext));
		assertNotNull(ext);
		assertFalse(ext.isEmpty());
	}
}
