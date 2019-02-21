package com.fms.services;

import com.fms.DAL.FacilityDAO;
import com.fms.DAL.UsageDAO;
import com.fms.usage.FacilityUse;
import com.fms.main.Facility;
import java.time.LocalDate;
import java.util.List;

public class FacilityService {

    private FacilityDAO facDAO = new FacilityDAO();
    private UsageDAO useDAO = new UsageDAO();

    //Add new Facility to DB
    public void addNewFacility(Facility facility) {
        try {
            facDAO.addNewFacility(facility);
        } catch (Exception se) {
            System.err.println("FacilityService: Threw an Exception adding new facility.");
            System.err.println(se.getMessage());
        }
    }

    //gets Facility's info
    public Facility getFacilityInformation(int id) {

        try {
            Facility facility = facDAO.getFacilityInformation(id);
            return facility;
        } catch (Exception se) {
            System.err.println("FacilityService: Threw an Exception retrieving facility.");
            System.err.println(se.getMessage());
        }
        return null;
    }

    //removes Facility listing from DB by ID
    public void removeFacility(int id) {

        try {
            facDAO.removeFacility(id);
        } catch (Exception se) {
            System.err.println("FacilityService: Threw an Exception removing facility.");
            System.err.println(se.getMessage());
        }
    }

    //adds phone number to a Facility listing in DB by Facility ID
    public void addFacilityDetail(int ID, int phoneNumber) {
        try {
            facDAO.addFacilityDetail(ID, phoneNumber);
        } catch (Exception se) {
            System.err.println("FacilityService: Threw an Exception updating phone in facility_detail.");
            System.err.println(se.getMessage());
        }
    }

    //lists available Facilities
    public List<Facility> listFacilities() {
        try {
            return facDAO.listFacilities();
        } catch (Exception se) {
            System.err.println("FacilityService: Threw an Exception retrieving list of facilities.");
            System.err.println(se.getMessage());
        }
        return null;
    }
}
