Drop Table If Exists employee;
Drop Table If Exists project;
Drop Table If Exists department;

Create Table department (
        department_id Serial Primary Key,
        name Varchar(60) Not Null
);

Create Table project (
        project_number Serial Primary Key,
        name Varchar(60) Not Null,
        start_date Date Not Null
);

Create Table employee (
        employee_number Serial Primary Key,
        job_title Varchar(35) Not Null,
        last_name Varchar(35) Not Null,
        first_name Varchar(35) Not Null,
        gender Varchar(10),
        date_of_birth Date Not Null,
        date_of_hire Date Not Null,
        department_id BigInt Not Null,
        other_gender Varchar(64),
        project_number BigInt Not Null,
        
        Constraint fk_department_department_id Foreign Key(department_id) References department(department_id),
        Constraint fk_project_project_number Foreign Key(project_number) References project(project_number),
        Constraint chk_employee_gender check(gender In ('Female','Male', 'Other')),
        Constraint chk_gender_description check ((gender = 'Other' And other_gender Is Not Null) Or (gender != 'Other' And other_gender Is Null))
);
 
Insert Into project (name, start_date) Values ('Mobile Reader App', '04/15/2017');
Insert Into project (name, start_date) Values ('New Database Design', '06/17/2019');
Insert Into project (name, start_date) Values ('Global Debugger', '11/02/2000');
Insert Into project (name, start_date) Values ('Neural Framework', '01/01/2001');

Insert Into department (name) Values ('Mobile');
Insert Into department (name) Values ('Database');
Insert Into department (name) Values ('Machine Learning');

Insert Into employee (job_title, last_name, first_name, gender, date_of_birth, date_of_hire, department_id, other_gender, project_number)
Values ('Machinist', 'Tam', 'River', 'Female', '07/13/2500', '02/24/2517',(Select department_id From department Where name = 'Machine Learning'), null, (Select project_number From project Where name = 'Neural Framework'));

Insert Into employee (job_title, last_name, first_name, gender, date_of_birth, date_of_hire, department_id, other_gender, project_number)
Values ('Database Engineer', 'Frye', 'Kaylee', 'Female', '03/21/2493', '08/11/2513',(Select department_id From department Where name = 'Database'), null, (Select project_number From project Where name = 'New Database Design'));

Insert Into employee (job_title, last_name, first_name, gender, date_of_birth, date_of_hire, department_id, other_gender, project_number)
Values ('Captain', 'Reynolds', 'Malcolm', 'Male', '09/20/2481', '04/01/2512',(Select department_id From department Where name = 'Mobile'), null, (Select project_number From project Where name = 'Global Debugger'));
      
Insert Into employee (job_title, last_name, first_name, gender, date_of_birth, date_of_hire, department_id, other_gender, project_number)
Values ('Doctor', 'Tam', 'Simon', 'Male', '11/07/2490', '02/24/2517',(Select department_id From department Where name = 'Machine Learning'), null, (Select project_number From project Where name = 'Neural Framework'));

Insert Into employee (job_title, last_name, first_name, gender, date_of_birth, date_of_hire, department_id, other_gender, project_number)
Values ('Shepherd', 'Book', 'Derrial', 'Male', '07/07/2470', '02/24/2517',(Select department_id From department Where name = 'Mobile'), null, (Select project_number From project Where name = 'Mobile Reader App'));

Insert Into employee (job_title, last_name, first_name, gender, date_of_birth, date_of_hire, department_id, other_gender, project_number)
Values ('PR Specialist', 'Cobb', 'Jayne', 'Male', '12/11/2483', '01/07/2513',(Select department_id From department Where name = 'Mobile'), null, (Select project_number From project Where name = 'Global Debugger'));

Insert Into employee (job_title, last_name, first_name, gender, date_of_birth, date_of_hire, department_id, other_gender, project_number)
Values ('Database Administrator', 'Washburne', 'Hoban', 'Male', '09/03/2484', '07/11/2513',(Select department_id From department Where name = 'Database'), null, (Select project_number From project Where name = 'New Database Design'));

Insert Into employee (job_title, last_name, first_name, gender, date_of_birth, date_of_hire, department_id, other_gender, project_number)
Values ('Product Tester', 'Niska', 'Adelai', 'Other', '05/03/2453', '04/07/2517',(Select department_id From department Where name = 'Mobile'), 'Gender does not apply', (Select project_number From project Where name = 'Global Debugger'));
