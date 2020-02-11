package org.eclipse.scout.migration.ecma6.template;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.eclipse.scout.migration.ecma6.configuration.Configuration;
import org.eclipse.scout.rt.platform.Replace;

@Replace
public class Config extends Configuration {

	/**
	 * Specifies the path to your project to migrate.
	 */
	@Override
	public Path getSourceModuleDirectory() {
		// TODO adjust
		return Paths.get("C:/path/to/your/project/com.abc.ui.html");
	}

	@Override
	public Path getTargetModuleDirectory() {
		return getSourceModuleDirectory();
	}

	/**
	 * Specifies the folder name where your JS and CSS files are stored, e.g. com.abc.ui.html/src/main/js/--> folder <--
	 */
	@Override
	public String getJsFolderName() {
		// TODO adjust
		return "folder";
	}

	/**
	 * Specifies the namespace used by your JS file. It is typically the same value as for {@link #getJsFolderName()}.
	 * The namespace is defined in your JS module (e.g. abc-module.js).
	 * If you don't have any JS files you can omit it.
	 */
	@Override
	public String getNamespace() {
		// TODO adjust
		return "namespace";
	}

	/**
	 * Specifies the name of your ui.html module which you will later put in package.json. It will be used for import generation.
	 * Scope can be your company name, or your product name or whathever you like.
	 */
	@Override
	public String getPersistLibraryName() {
		// TODO adjust
		return "@abc/core";
	}

	/**
	 * Specifies the name of the file that contains your api, choose what you want.
	 */
	@Override
	public String getPersistLibraryFileName() {
		// TODO adjust
		return "abc.json";
	}

	/**
	 * Specifies the folder where the api files are stored.
	 */
	@Override
	protected Path getConfiguredApiBase() {
		return Paths.get("api");
	}
}
