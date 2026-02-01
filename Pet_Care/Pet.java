import java.util.ArrayList;

public class Pet {

                                            // 1. Attributes
    private int petId;                      // Unique Pet ID
    private String name;                    // Pet name
    private String breed;            // Species or breed
    private int age;                        // Age in years
    private String ownerName;               // Owner's full name
    private String contactInfo;             // Phone or email
    private String registrationDate;        // Date of registration (String for simplicity)

    private ArrayList<Appointment> appointments;   // List of appointments

    // 2. Constructor
    public Pet(int petId, String name, String breed, int age,
               String ownerName, String contactInfo, String registrationDate) {

        this.petId = petId;
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.ownerName = ownerName;
        this.contactInfo = contactInfo;
        this.registrationDate = registrationDate;
        this.appointments = new ArrayList<>();  // initialize empty list
    }

    // 3. Getters
    public int getPetId() {
        return petId;
    }

    public String getName() {
        return name;
    }

    public String getbreed() {
        return breed ;
    }

    public int getAge() {
        return age;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public ArrayList<Appointment> getAppointments() {
        return appointments;
    }

    // 4. Setters
    public void setPetId(int petId) {
        this.petId = petId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    // Add appointment
    public void addAppointment(Appointment appointment) {
        this.appointments.add(appointment);
    }

    // 5. toString()
    @Override
    public String toString() {
        return "Pet ID: " + petId +
                ", Name: " + name +
                ", Species/Breed: " + breed +
                ", Age: " + age +
                ", Owner: " + ownerName +
                ", Contact: " + contactInfo +
                ", Registered On: " + registrationDate +
                ", Appointments: " + appointments.size();
    }
}
