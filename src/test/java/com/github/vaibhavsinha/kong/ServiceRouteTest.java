package com.github.vaibhavsinha.kong;

import com.github.vaibhavsinha.kong.model.admin.route.Route;
import com.github.vaibhavsinha.kong.model.admin.service.Service;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ServiceRouteTest extends BaseTest {

    public static final String EXAMPLE_SERVICE = "example-service";

    @Test
    public void createServiceAndRouteTest(){

        // 删除Route和Service
//        CommonList<Route> commonList = kongClient.getRouteService().listRoutesByService(EXAMPLE_SERVICE);
//        List<Route> routeList = commonList.getData();
//        if(null!=routeList && routeList.size()>0 ){
//            for (Route route : routeList) {
//                kongClient.getRouteService().DeleteRoute(route.getId());
//            }
//        }
//        kongClient.getServiceService().deleteService(EXAMPLE_SERVICE);


        // 新建Service和Route
        Service service = new Service();
        service.setUrl("http://mockbin.org");
        service.setName(EXAMPLE_SERVICE);
        Service response4service = kongClient.getServiceService().addService(service);
        printJson(response4service);
        List<String> hostList = new ArrayList<>();
        hostList.add("example.com");

        Route route = new Route();
        route.setHosts(hostList);
        Service otherService = new Service();
        otherService.setId(response4service.getId());
        route.setService(otherService);
        Route response4route = kongClient.getRouteService().addRoute(route);
        printJson(response4route);
    }

}