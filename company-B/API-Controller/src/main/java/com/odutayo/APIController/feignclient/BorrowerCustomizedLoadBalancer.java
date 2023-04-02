package com.odutayo.APIController.feignclient;


import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;

@LoadBalancerClient(name = "BORROWER-SERVICE", configuration = LoadBalancerConfiguration.class)
public class BorrowerCustomizedLoadBalancer {
}
