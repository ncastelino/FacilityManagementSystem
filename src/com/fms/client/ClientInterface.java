package com.fms.client;

public class ClientInterface {
    /**
     * Select one of the client interfaces below to run by commenting out the other two.
     *
     * EXAMPLE - RUNNING MaintenanceClient:
     *      //FacilityClient facilityClient = new FacilityClient();
     *      //UsageClient usageClient = new UsageClient();
     *      MaintenanceClient maintenanceClient = new MaintenanceClient();
     *
     */
    public static void main(String[] args) throws Exception {

        FacilityClient facilityClient = new FacilityClient();
        //UsageClient usageClient = new UsageClient();
        //MaintenanceClient maintenanceClient = new MaintenanceClient();
    }
}
