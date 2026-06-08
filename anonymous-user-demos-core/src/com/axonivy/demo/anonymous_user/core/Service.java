package com.axonivy.demo.anyonymous_user.core;

import java.net.URI;

import ch.ivyteam.ivy.environment.Ivy;

public class Service {
  private static final String APP_BASE_URL = "com.axonivy.demo.anyonymous_user.baseUrl";
  private static final Service INSTANCE = new Service();


  public static Service get() {
    return INSTANCE;
  }

  /**
   * Get an application relative link to the current request.
   * 
   * @param rel without leading slash, e.g. anonymous-user-demos-open/19C23640F9AD30D8/register.ivp
   * @return
   */
  public String appRelativeLink(String rel) {
    return URI.create(String.join("/", Ivy.var().get(APP_BASE_URL), rel)).normalize().toString();
  }
}
