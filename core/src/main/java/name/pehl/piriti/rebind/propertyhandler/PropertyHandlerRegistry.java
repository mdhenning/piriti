package name.pehl.piriti.rebind.propertyhandler;

import name.pehl.piriti.rebind.PropertyContext;

/**
 * Registry to find {@link PropertyHandler}s based on a {@link PropertyContext}.
 * 
 * @author $LastChangedBy: harald.pehl $
 * @version $LastChangedRevision: 139 $
 */
public interface PropertyHandlerRegistry
{
    /**
     * Looks up a property handler based on the information provided in the type
     * and property context.
     * 
     * @param propertyContext
     * @return
     */
    PropertyHandler findPropertyHandler(PropertyContext propertyContext);
}
