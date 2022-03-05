package org.launchcode.techjobs_oo;

import org.launchcode.techjobs_oo.PositionType;

import java.util.Objects;

public class Job {

    private final int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public String toString() {
        String sName;
        if (name == null || name == "") {
            sName = "Data not available";
        } else {
            sName = name;
        }
        String aEmployer;
        if (employer == null || employer.equals(new Employer(""))) {
            aEmployer = "Data not available";
        } else {
            aEmployer = employer.toString();
        }
        String aLocation;
        if (location == null || location.equals(new Location(""))) {
            aLocation = "Data not available";
        } else {
            aLocation = location.toString();
        }
        String aPositionType;
        if (positionType == null || positionType.equals(new PositionType(""))) {
            aPositionType = "Data not available";
        } else {
            aPositionType = positionType.toString();
        }
        String aCoreCompetency;
        if (coreCompetency == null || coreCompetency.equals(new CoreCompetency(""))) {
            aCoreCompetency = "Data not available";
        } else {
            aCoreCompetency = coreCompetency.toString();
        }
        if (name == null && employer == null && location == null && positionType == null && coreCompetency == null) {
            return "OOPS! This job does not seem to exist.\n";
        }

        return "ID: " + id + "\n" +
                "Name: " + sName + "\n" +
                "Employer: " + aEmployer + "\n" +
                "Location: " + aLocation + "\n" +
                "Position Type: " + aPositionType + "\n" +
                "Core Competency: " + aCoreCompetency + "\n";

    }
}

/*package org.launchcode.techjobs_oo;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
}
*/