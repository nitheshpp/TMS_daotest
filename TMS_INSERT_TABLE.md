# TMS_daotest
use tms_dao;
show tables;
select * from task_list_user;
INSERT INTO `tms_dao`.`task_list_user` (`ID`, `User_Name`, `Password_Hash`, `is_Manager`, `is_Administrator`) VALUES (2, 'def', 'def123', 1, 0);
INSERT INTO `tms_dao`.`task_list_user` (`ID`, `User_Name`, `Password_Hash`, `is_Manager`, `is_Administrator`) VALUES (3, 'ghi', 'ghi123', 0, 0);
INSERT INTO `tms_dao`.`task_list_user` (`ID`,`User_Name`,`Password_Hash`,`is_Manager`,`is_Administrator`) VALUES (1,'abc','abc123',0,1);

select * from task_list_categories;
INSERT INTO `tms_dao`.`task_list_categories` (`ID`, `Description`) VALUES ('1', 'General');
INSERT INTO `tms_dao`.`task_list_categories` (`ID`, `Description`) VALUES ('2', 'Project1');
INSERT INTO `tms_dao`.`task_list_categories` (`ID`, `Description`) VALUES ('3', 'Information');

select * from task_list_name;
INSERT INTO `tms_dao`.`task_list_name` (`ID`, `Name`) VALUES ('1', 'General Task List');
INSERT INTO `tms_dao`.`task_list_name` (`ID`, `Name`) VALUES ('2', 'daoTest');
INSERT INTO `tms_dao`.`task_list_name` (`ID`, `Name`) VALUES ('3', 'Hliday');

select * from task_list_status;
INSERT INTO `tms_dao`.`task_list_status` (`ID`, `Status_Description`) VALUES ('1', 'open');
INSERT INTO `tms_dao`.`task_list_status` (`ID`, `Status_Description`) VALUES ('2 ', 'closed');
INSERT INTO `tms_dao`.`task_list_status` (`ID`, `Status_Description`) VALUES ('3', 'inProgress');


select * from task_list_items;
INSERT INTO `tms_dao`.`task_list_items` (`id`,`Task_List_ID`, `Owner_User_ID`, `Created_Date`, `Modefied_Date`, `Subject`, `Body`, `Status_id`, `Category_ID`) VALUES (1,'2', '1', curdate(),curdate(), 'DataBaseDesign', 'To create a test plan for db', '1', '2');
INSERT INTO `tms_dao`.`task_list_items` (`id`,`Task_List_ID`, `Owner_User_ID`, `Created_Date`, `Modefied_Date`, `Subject`, `Body`, `Status_id`, `Category_ID`) VALUES (2,'1', '1', '2021-03-02 00:00:00', curdate(), 'UMLDiagram', 'To draw uml diagram for TMS', '3', '2');
INSERT INTO `tms_dao`.`task_list_items` (`id`,`Task_List_ID`, `Owner_User_ID`, `Created_Date`, `Modefied_Date`, `Subject`, `Body`, `Status_id`, `Category_ID`) VALUES (3,'3', '1', curdate(),curdate(), 'Holiday', '8-3-2021 is holiday', '2', '3');

select * from task_list_assignment;
INSERT INTO `tms_dao`.`task_list_assignment` (`ID`, `User_ID`, `Task_List_ID`) VALUES (1,'1', '1');
INSERT INTO `tms_dao`.`task_list_assignment` (`ID`,`User_ID`, `Task_List_ID`) VALUES (2,'2', '1');
INSERT INTO `tms_dao`.`task_list_assignment` (`ID`,`User_ID`, `Task_List_ID`) VALUES (3,'3', '2');

select * from Task_List_Show_Preferences;
INSERT INTO `tms_dao`.`Task_List_Show_Preferences` (`ID`, `User_ID`, `Status_ID`) VALUES ('1', '1', '2');
INSERT INTO `tms_dao`.`Task_List_Show_Preferences` (`ID`, `User_ID`, `Status_ID`) VALUES ('2', '2', '2');
INSERT INTO `tms_dao`.`Task_List_Show_Preferences` (`ID`, `User_ID`, `Status_ID`) VALUES ('3', '3', '1');

