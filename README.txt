-----------------------------OUTPUT OF QUERY 1-----------------------------------------

XML Generated:
<rule id=1 group="subcheck-ValidationFailedAuthenticationSSHloginFailed">
    <test group="subcheck-ValidationFailedAuthenticationSSHloginFailed" id=1 operator="AND">
        <properties>
            <property id=1 name="subcheck-ValidationFailedAuthenticationSSHloginFailed" qualifier="ANY"
                name="subcheck-ValidationFailedAuthenticationSSHloginFailed" />
        </properties>
    </test>
    <test group="2minutesgreater than5" id=2 operator="and">
        <properties>
            <property id=1 name="time" value="2" unit="minutes" />
            <property id=2 operator="greater than" value="5" />
            <property id=3 value=different value="username" />
            <property id=4 value=same value="source" />
        </properties>
    </test>
</rule>
EPL Generated:
@Name'1 subcheck-ValidationFailedAuthenticationSSHloginFailed Rule1'
select *from eParsereventStream.win:timebatch(2 minutes)
where (subcheck-ValidationFailedAuthenticationSSHloginFailed)
group by source having count(*)>=5 and count(different username)>=5 and count(same source)>=5


-----------------------------EXAMPLES OF QUERIES-------------------------------------------
Query#1:
if any of subcheck-ValidationFailed Authentication SSH login Failed and if
within 2 minutes greater than 5 events occure having different username and
having same source ip

Query#2:
if any of MyEvent and if within 3 minutes less than 1 events occure having same ip and
having different macAddres and if any of users not valid

Query#3:
if within 3 minutes less than 1 events occure

(expr (statement (if_statement if (condition within (within (time 3 (tipo minutes)) (operador less than) (value 1)) (any events occure) (condition having (having same (value ip)))) and (condition having (having different (value macAddres)))) and (if_statement if (condition any of (any users not valid)))))
