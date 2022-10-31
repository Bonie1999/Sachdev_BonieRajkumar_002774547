/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastore;

import models.Hospital;
import models.Person;
import models.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

/**
 *
 * @author rinki
 */
public class DataStore {
public static ArrayList<Hospital> hospital_Screen_HospitalArrayList = new ArrayList<>();
public static ArrayList<Person> person_registration_ArrayList = new ArrayList<>();
public static ArrayList<User> userArrayList = new ArrayList<>();
public static String USERROLE = "";
public static String USERID = "";
public static String DOCTOR_HOSPITALID = "";

public static boolean userExistOrNot(String userid)
{
 boolean result = false;
 for (int i = 0; i < userArrayList.size(); i++)
 {
 if (userArrayList.get(i).getId().equals(userid))
 {
     result = true;
 }
 }
 return result;
}

public static String generateUUID() {
return UUID.randomUUID().toString();
}

}
