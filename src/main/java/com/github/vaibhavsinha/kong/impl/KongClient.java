package com.github.vaibhavsinha.kong.impl;

import com.github.vaibhavsinha.kong.api.admin.*;
import com.github.vaibhavsinha.kong.impl.helper.RetrofitServiceCreator;
import com.github.vaibhavsinha.kong.internal.admin.*;

/**
 * Created by vaibhav on 12/06/17.
 *
 * Updated by fanhua on 2017-08-07.
 *
 * Updated by dvilela on 17/10/17.
 *
 * Update by nimo on 2020-06-19
 */
public class KongClient {

    private ConsumerService consumerService;
    private PluginService pluginService;
    private PluginRepoService pluginRepoService;

    private ServiceService serviceService;
    private RouteService routeService;

    public ConsumerService getConsumerService() {
        return consumerService;
    }

    public void setConsumerService(ConsumerService consumerService) {
        this.consumerService = consumerService;
    }

    public PluginService getPluginService() {
        return pluginService;
    }

    public void setPluginService(PluginService pluginService) {
        this.pluginService = pluginService;
    }

    public PluginRepoService getPluginRepoService() {
        return pluginRepoService;
    }

    public void setPluginRepoService(PluginRepoService pluginRepoService) {
        this.pluginRepoService = pluginRepoService;
    }

    public ServiceService getServiceService() {
        return serviceService;
    }

    public void setServiceService(ServiceService serviceService) {
        this.serviceService = serviceService;
    }

    public RouteService getRouteService() {
        return routeService;
    }

    public void setRouteService(RouteService routeService) {
        this.routeService = routeService;
    }

    public KongClient(String adminUrl, String proxyUrl) {
        if (adminUrl == null || adminUrl.isEmpty()) {
            throw new IllegalArgumentException("The adminUrl cannot be null or empty!");
        }
        RetrofitServiceCreator retrofitServiceCreatorForAdminUrl = new RetrofitServiceCreator(adminUrl);

        consumerService = retrofitServiceCreatorForAdminUrl.create(ConsumerService.class, RetrofitConsumerService.class);
        serviceService = retrofitServiceCreatorForAdminUrl.create(ServiceService.class,RetrofitServiceService.class);
        routeService = retrofitServiceCreatorForAdminUrl.create(RouteService.class,RetrofitRouteService.class);
        pluginService = retrofitServiceCreatorForAdminUrl.create(PluginService.class, RetrofitPluginService.class);
        pluginRepoService = retrofitServiceCreatorForAdminUrl.create(PluginRepoService.class, RetrofitPluginRepoService.class);
    }


}
