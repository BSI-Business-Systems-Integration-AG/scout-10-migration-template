package org.eclipse.scout.migration.ecma6.template;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.eclipse.scout.migration.ecma6.configuration.Configuration;
import org.eclipse.scout.rt.platform.Replace;

@Replace
public class Config extends Configuration {

	/**
	 * Specifies the absolute path to the Maven module that should be migrated.
	 * If you have a Scout Classic application this is the module that ends with .ui.html.
	 * If you have a Scout JS application there may be 2 modules: .ui and .ui.app. Just migrate the modules one after another.
	 */
	@Override
	public Path getSourceModuleDirectory() {
		// TODO adjust
		return Paths.get("C:/path/to/your/project/com.abc.ui.html");
	}

	/**
	 * Specifies where the migrated files should be stored.
	 * Just return getSourceModuleDirectory() if you want to perform an in-place migration
	 * and commit the changes to VCS afterwards (regular migration).
	 */
	@Override
	public Path getTargetModuleDirectory() {
		return getSourceModuleDirectory();
	}

	/**
	 * Specifies the folder name where your JS and CSS files are stored, e.g. com.abc.ui.html/src/main/js/--> folder <--
	 * <p>
	 * If you don't have the folder because you don't have any JS or CSS files you can omit it.
	 */
	@Override
	public String getJsFolderName() {
		// TODO adjust
		return "abc";
	}

	/**
	 * Specifies the namespace used by your JS file. It is typically the same value as for {@link #getJsFolderName()}.
	 * The namespace is defined in your JS module (e.g. abc-module.js) and used in your JS classes
	 * (e.g. If you have a class called abc.MyClass.prototype, then the namespace is abc).
	 * <p>
	 * If you don't have any JS or CSS files you can omit it.
	 */
	@Override
	public String getNamespace() {
		// TODO adjust
		return "abc";
	}

	/**
	 * The application will create an API file for your project too and put it into the api folder. 
	 * This property specifies the name of your module under migration which you will later put in the package.json.
	 * (see also https://eclipsescout.github.io/10.0/migration-guide.html#build-stack-migration, Step 4 and 5).
	 * It will be used for import generation from another module or from the specs.
	 * The scope (@abc) can be your application name, your company name or whatever you like.
	 * <p>
	 * If you don't have any JS or CSS files you can omit it.
	 */
	@Override
	public String getPersistLibraryName() {
		// TODO adjust
		return "@abc/ui";
	}

	/**
	 * Specifies the name of the file that contains your api, choose what you want.
	 * <p>
	 * If you don't have any JS or CSS files you can omit it.
	 */
	@Override
	public String getPersistLibraryFileName() {
		// TODO adjust
		return "abc.json";
	}


	/**
	 * Specifies the folder where the api files to migrate against are stored.
	 */
	@Override
	protected Path getConfiguredApiBase() {
		return Paths.get("api");
	}
}
