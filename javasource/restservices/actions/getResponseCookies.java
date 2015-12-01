// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package restservices.actions;

import restservices.consume.RestConsumer;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.webui.CustomJavaAction;
import communitycommons.XPath;

/**
 * 
 */
public class getResponseCookies extends CustomJavaAction<java.util.List<IMendixObject>>
{
	private IMendixObject __requestResult;
	private restservices.proxies.RequestResult requestResult;

	public getResponseCookies(IContext context, IMendixObject requestResult)
	{
		super(context);
		this.__requestResult = requestResult;
	}

	@Override
	public java.util.List<IMendixObject> executeAction() throws Exception
	{
		this.requestResult = __requestResult == null ? null : restservices.proxies.RequestResult.initialize(getContext(), __requestResult);

		// BEGIN USER CODE
		return XPath.proxyListToMendixObjectList(RestConsumer.getResponseCookiesFromRequestResult(getContext(), requestResult));
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public String toString()
	{
		return "getResponseCookies";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
