// This file was generated by Mendix Business Modeler 4.0.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package restservices.actions;

import com.mendix.systemwideinterfaces.core.UserAction;
import com.mendix.systemwideinterfaces.core.IMendixObject;

/**
 * 
 */
public class getFile extends UserAction<IMendixObject>
{
	private String url;
	private IMendixObject __stub;
	private system.proxies.FileDocument stub;
	private String optEtag;

	public getFile(String url, IMendixObject stub, String optEtag)
	{
		super();
		this.url = url;
		this.__stub = stub;
		this.optEtag = optEtag;
	}

	@Override
	public IMendixObject executeAction() throws Exception
	{
		this.stub = __stub == null ? null : system.proxies.FileDocument.initialize(getContext(), __stub);

		// BEGIN USER CODE
		throw new com.mendix.systemwideinterfaces.MendixRuntimeException("Java action was not implemented");
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public String toString()
	{
		return "getFile";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
