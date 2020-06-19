package com.github.vaibhavsinha.kong.api.admin;

import com.github.vaibhavsinha.kong.model.admin.route.Route;


public interface RouteService {
    Route addRoute(Route route);
    void DeleteRoute(String id);

//    CommonList<Route> listRoutesByService(String exampleService);
}
