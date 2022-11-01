# HOSPITAL MANAGEMENT SYSTEM
- INFO5100 - Application Engineering Development
- Professor Kal Bugrara
- Name: Bonie Rajkumar Sachdev
- NUID: 002774547
- Email ID: sachdev.bo@northeastern.edu

This application consists for several classes like System Admin, City, Community, Hospital, Doctor, Patient, Person, Encounter.
The flow of this application is shown as below:

1. System Admin
  - System Admin have all the CRUD access on each class like Patient Directory, Doctor Directory, Hospital, Encounter Directory
  - First System Admin will do the login and create the hospital and then next operations can be done
  - System Admin will act as a super user who can control each and every thing in this system
 
2. Hospital
  - Once the Hospital is created then either hospital admin or system admin can add doctor first and then based on the hospital's community and city address the admin needs to assign the patients to the near by hospital.

3. Community Admin
  - Community Admin have access for the informtion under his/her community (Ex. if the community is boston then admin of boston community can only access the hospital/doctors/patients information which are under boston community)

4. Doctor
  - Doctor can view the records of the assigned patients and he/she can leave the encounter based on the vital signs of the patients
 
5. Patients
  - There are multiple types to register the patient
  - 1. To go through the registration page which will allow patient to select the hospital under which community he/she lies and then fill up the details which will later get approved either by hospital admin or system admin. Once the patient gets approved then the doctor will be assigned and the encouter will be given by the doctor accordingly.
  - 2. System admin will login and go to patient tab after logging in and then admin can add patient
  - 3. Hospital admin will login then he/she will create a patient and add that patient to the doctor under the near by community

6. Encounter
  - Encounter will be used by doctors to provide the details on the patients health
  - Also it will be used by patients to check the history of his/her own

7. Person
  - Person class is used to assign the role under each and every department which helped to maintain the authentication in this whole application
