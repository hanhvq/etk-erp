/*
 * Copyright (C) 2003-2012 eXo Platform SAS.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package etk.web.core.impl.application;

import java.util.List;

import etk.web.core.impl.application.metadata.AppDescriptor;
import etk.web.core.impl.spi.request.RequestEvent;
import etk.web.core.plugin.Plugin;

/**
 * Created by The eXo Platform SAS
 * Author : eXoPlatform
 *          exo@exoplatform.com
 * Mar 21, 2012  
 */
public abstract class AppContext {
  
  public AppContext() {
    
  }

  /**
   * Holds the classloader for current Web application
   * @return
   */
  public abstract ClassLoader getClassLoader();
  
  /**
   * Holds the plugins which uses to process for Web Application
   * @TODO user interceptor to replace
   * 
   * @return
   */
  public abstract List<Plugin> getPlugins();
  
  /**
   * Invokes the Request to Web Application
   * @param event
   * @throws AppException
   */
  public abstract void invoke(RequestEvent event) throws AppException;

  /**
   * Descriptor which holds the Controller to process the request.
   * @return
   */
  public abstract AppDescriptor getDescription();
}
