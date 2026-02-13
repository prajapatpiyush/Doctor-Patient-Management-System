# Doctor Patient Management System

A desktop-based Patient Management System developed using Java Swing and MySQL.  
This application helps doctors manage patient records efficiently in a completely offline and secure environment.

---

##  Project Overview

The Doctor Patient Management System is a standalone desktop application designed to:

- Add new patient records
- Search patients by ID, name, or mobile number
- Update patient details
- Delete patient records
- Store treatment details and medical notes
- Validate mobile numbers (10-digit format)

The system works fully offline and stores data locally using MySQL.

---

##  Tech Stack

- Java (Swing)
- JDBC
- MySQL
- MVC Architecture
- NetBeans IDE

---

## Project Architecture (MVC)

The application follows MVC architecture for clean structure and scalability:

- **Model** → `Patient.java`
- **View** → `MainFrame.java`, `SearchPatientFrame.java`
- **Controller** → `PatientController.java`
- **DAO Layer** → `PatientDAO.java`
- **Database Connection** → `DBConnection.java`

---

##  Database Details

### Database Name:

### Table Name:


### Table Structure:

```sql
CREATE TABLE patients (
    patient_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    mobile VARCHAR(10) NOT NULL,
    visit_date DATE NOT NULL,
    treatment TEXT NOT NULL,
    notes TEXT
);
```
---

## 🚀 Features

- Add patient records  
- Search patient (ID / Name / Mobile)  
- Update patient details  
- Delete patient records  
- Store treatment information  
- Store additional medical notes  
- Mobile number validation  
- Auto-generated patient ID  
- Clean user interface  
- Completely offline system  

---

## 🔒 Data Security

- Works completely offline  
- No internet required  
- All data stored locally in MySQL  
- No cloud integration  
- No external access  

Patient data remains private on the doctor's laptop.

---

## ⚙ Installation Guide (Client Setup)

### Step 1: Install Java

Install JDK 11 or higher.

Verify installation:

```
java -version
```

---

### Step 2: Install MySQL Server

- Username: `root`
- Port: `3306`
- Set password (remember it)

---

### Step 3: Create Database

Run:

```
CREATE DATABASE doctor_app_db;
USE doctor_app_db;
```
---

### Step 4: Create Table

Run:
```
CREATE TABLE patients (
patient_id INT AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(100) NOT NULL,
mobile VARCHAR(10) NOT NULL,
visit_date DATE NOT NULL,
treatment TEXT NOT NULL,
notes TEXT
);
```

---

### Step 5: Run Application
```
Double-click:

DoctorPatientManagementSystem.jar
```
```
Or run from command prompt:

java -jar DoctorPatientManagementSystem.jar
```

---

##  How to Use

1. Open the application  
2. Enter patient details  
3. Click **Save Patient**  
4. Use **Search** to find existing records  
5. Update or delete records when necessary  

---

##  Project Folder Structure
```
DoctorPatientManagementSystem/
│
├── src/
│ ├── model/
│ ├── view/
│ ├── controller/
│ ├── dao/
│ └── util/
│
├── database/
│ └── doctor_app_db.sql
│
└── DoctorPatientManagementSystem.jar
```

---

##  Screenshots

<img width="1007" height="949" alt="Screenshot 2026-02-13 163740" src="https://github.com/user-attachments/assets/96f34fb5-6c2e-4e91-918d-6f8154270407" />
<img width="528" height="834" alt="Screenshot 2026-02-13 163751" src="https://github.com/user-attachments/assets/5205c1b9-5b76-431b-9720-a7c25be4fea8" />


---

##  Developer

Developed by: Piyush Prajapati
Technology: Java | MySQL | Swing | MVC

---

##  Contact

Open to collaboration and opportunities in Java Development.


