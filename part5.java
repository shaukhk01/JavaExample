                                 +------------------+
                                 | native Modifier  |
                                 +------------------+
"native IS MODIFIER IT IS APLICABLE ONLY FOR METHOD AND WE CANT APPLY ANYWHERE ELSE.'

*THE METHOD WHICH ARE IMPLEMENTED IN NON JAVA[MOSTLY C OR C++] OR CALLED NATIVE METHOD OR FOREIGN METHOD.

THE MAIN OBJECTIVE OF NATIVE KEYWORD ARE:
========================================

*TO IMPROVE PERFORMANCE OF THE SYSTEM
*TO ACHEIVED MACHINE LEVEL OR MEMORY LEVEL COMMUNICATION 
*TO USED ALREADY EXISTING LEGACY NON JAVA CODE

pseduo code to use native keyword:-
-----------------------------------
                                                  |   class client
class Native                                      |   {
{                                                 |     public static void main(String[]args)
                                                  |      {
    static                                        |         Native n = new Native();
    {                                             |          n.m1(); 'invoke the native method'
                                                  |       }
     System.loadlibrary("Native library path");   |     }
                here loading native library       |
    }                                             ++
    public native void m1();'declare native method'|
                                                   |
    }                                              |
                                                   |
                                                   

"FOR NATIVE METHOD IMPLEMENTATION IS ALREADY AVAILABLE IN OLD LANGUAGE LIKE C OR C++ AND WE ARE NOT 
"RESPONSIBLE TO PROVIDE IMPLEMENTATION HENCE NATIVE METHOD DECLARATION SHOULD ENDS WITH  ;[SEMICOLN]

EXAMPLE:-
--------
PUBLIC NATIVE VOID M1();==:VALID
PUBLIC NATIVE VOID M2(){} ==:INVALID CANNOT HAVE BODY NATIVE METHOD

*FOR NATIVE METHOD IMPLEMENTATION IS ALREADY AVAILABLE IN OLD LANGUAGE BUT FOR ABSTRACT METHOD 
*IMPLEMENTATION SHOULD NOT BE AVAILABLE HENCE WE CAN'T DECLARE NATIVE METHOD AS ABSTRACT i.e 
*NATIVE ABSTRACT COMBINATION,IS ILLEGAL COMBINATION FOR METHODS 

WE CAN'T DECLARE NATIVE METHOD AS STRICTFP BECAUSE THERE IS NOT GRANTEE OLD LANGUGES FOLLOW IEEE 754 STANDA-RD HENCE NATIVE STRICTFP COMBINATION IS ILLEGAL COMBINATION FOR METHOD 

THE MAIN ADVANTAGE OF NATIVE KEYWORD IS PERFORMANCE WILL BE IMPROVED BUT THE MAIN DISADVANTAGE OF THE 
NATIVE KEYWORD IS IT BREAKS PLATFORM INDEPENDENT NATURE OF JAVA.

****************************************************************************************************
transicent KEYWORD:-
===================

"TRANSICENT IS MODIFIER APLICABLE ONLY FOR VARIABLE WE CAN USE TRANSICENT KEYWORD IN SERIALIZATION CONTEXT
*AT THE TIME OF SERIALIZATION IF WE DONT WANT TO SAVE THE VALUE OF PARTICULAR VARIABLE' TO MEET SECURITY 
*CONSTRAINT THEN WE SHOULD DECLARE THAT VARIABLE THAT AS TRANSICENT

AT THE TIME OF SERIALIZATION JVM IGNORE ORIGNAL VALUE OFF TRAINSICENT VARIABLE AND SAVE DEFAULT VALUE TO 
THE FILE 
+---------------------------------------+
|hence transicent means not to serialize |
+---------------------------------------+

           *****                                   +--------------+
         **     **     serialization               |              |
        * usr:u1  * ----------------------+        |              |
   +--  * pas:123 *                       |        |              |
   |  +>*         *                       |        |   *******    |
   |  |  **     **                        |        | **       **  |
a1-+--+    *****                          +----->  ** usr:u1    **|
   |                                               * pwd:null    *|
transcient                                         **           **|
                                                   | **       **  |
           *****                                   |   *******    |
         **     **           Deserialization       |              |
        *usr:u1   *    +---------------------------|              |
        *         *    |                           |              |
        *pass:nul * <--+                           |              |
 +------>**     **                                 +--------------+
 |a2       *****                                       file.txt

****************************************************************************************************

Volatile:-
=========

"VOLATILE IS MODIFIER APPLICABLE ONLY FOR VARIABLE AND WE CANT APPLY ANYWHERE ELSE' 
*IF THE VALUE OF A VARIABLE KEEP ON CHANGING BY MULTIPLE THREAD THEN THERE MAY BE A CHANCE OF DATA 
*INCONSISTANCY PROBLEM WE CAN SOLVE THIS PROBLEM BY USING VOLATILE MODIFIER.' 

IF A VARIABLE DECLARE AS VOLATILE THEN FOR EVERY THREAD JVM WILL CREATE A SEPRATE LOCAL COPY EVERY 
MODIFCATION PERFORMED BY THE THREAD WILL TAKES PLACE IN LOCAL COPY SO THAT THERE IS NOT EFFECT ON THE REMAINING,THREAD.

"THE MAIN ADVANTAGE OF VOLATILE IS WE CAN OVERCOME DATAINCONSISTANCE  PROBLEM' 
*BUT THE MAIN DISADVANTAGE OF volatile keyword is creating and maintaning  a seprate copy for every thread 
 increases complexity of' 

PROGRAM-MING AND CRETES PERFORMANCE PROBLEM' HENCE IF THERE IS NO SPACIFIC REQUIREMENT IT IS NEVER RECOMMENDED TO USE VOLATILE KEYWORD AND IT IS ALMOST DEPRECATED KEYWORD

*FINAL VARIALBE MEANS THE VALUE NEVER CHANGES WHERE AS VOLATILE VARIABLE MEANS THE VALUE KEEP ON CHANGING
*HENCE VOLATILE FINAL IS ILLEGAL COMBINATION FOR VARIABLE.


                 class                                     interface        enum
_________________ _^___________________________________________^_______________^______________________
| modifier    | outer | inner | method | variable | block | outer | inner | outer | inner | constructor |
|-------------+-------+-------+--------+----------+-------+-------+-------+-------+-------+-------------|
| public      | /     | /     | /      | /        |       | /     | /     | /     | /     | /           |
|-------------+-------+-------+--------+----------+-------+-------+-------+-------+-------+-------------|
| private     |       | /     | /      | /        |       |       | /     |       | /     | /           |
|-------------+-------+-------+--------+----------+-------+-------+-------+-------+-------+-------------|
| protected   |       | /     | /      | /        |       |       | /     |       | /     | /           |
|-------------+-------+-------+--------+----------+-------+-------+-------+-------+-------+-------------|
| <default>   | /     | /     | /      | /        |       | /     | /     | /     | /     | /           |
|-------------+-------+-------+--------+----------+-------+-------+-------+-------+-------+-------------|
| final       | /     | /     | /      | /        |       |       |       |       |       |             |
|-------------+-------+-------+--------+----------+-------+-------+-------+-------+-------+-------------|
| abstract    | /     | /     | /      |          |       | /     | /     |       |       |             |
|-------------+-------+-------+--------+----------+-------+-------+-------+-------+-------+-------------|
| static      |       | /     | /      | /        | /     |       | /     |       | /     |             |
|-------------+-------+-------+--------+----------+-------+-------+-------+-------+-------+-------------|
| synchronize |       |       | /      |          | /     |       |       |       |       |             |
|-------------+-------+-------+--------+----------+-------+-------+-------+-------+-------+-------------|
| native      |       |       | /      |          |       |       |       |       |       |             |
|-------------+-------+-------+--------+----------+-------+-------+-------+-------+-------+-------------|
| strictfp    | /     | /     | /      |          |       | /     | /     | /     | /     |             |
|-------------+-------+-------+--------+----------+-------+-------+-------+-------+-------+-------------|
| transient   |       |       |        | /        |       |       |       |       |       |             |
|-------------+-------+-------+--------+----------+-------+-------+-------+-------+-------+-------------|
| volatile    |       |       |        | /        |       |       |       |       |       |             |
|-------------+-------+-------+--------+----------+-------+-------+-------+-------+-------+-------------|

"THE ONLY APLICABLE MODIFIER FOR LOCAL VARIABLE IS final. 
"THE ONLY APLICABLE MODIFIER FOR CONSTRUCTOR ARE [public,private,protected,<default>]
"THE MODIFIER WHICH ARE APLICABLE ONLY FOR VARIABLE [volatile AND transicent]
"THE MODIFIER WHICH ARE APLICABLE FOR CLASS BUT NOT FOR INTERFACE[final]
"THE MODFIER WHICH ARE APLICABLE FOR CLASSES BUT NOT FOR ENUM[final,abstract]
