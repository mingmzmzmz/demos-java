/*
 * Created on Jan 29, 2006
 */
package dp.composite;

public interface XMLBuilder
{
	public void buildVersion(String xmlVersion);
	
	public void build(XMLElement element);

	public String getFormattedXML();
}
