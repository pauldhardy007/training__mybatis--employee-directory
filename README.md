# training__mybatis--employee-directory

HOW TO
Abandon a Service Release
Add Contract Test using Rest Assured
Add CSV File Records to DB using Postman
Add to Email Send JMS Queue
Add NEXUM Payment by Queue
Add Prometheus Metrics
Add Selligent Email Template to System
Add TPM(Trusted Platform Module) Secret
AWS Configure to Use dBeaver
Change IDEA Intellij Version
Change Password
Connect from Home
Copy File in Linux from Command Line
Create a new database
Create Acceptable Passwords for Db Configuration etc
Deploy Application on jBoss
Deploy New Liquibase Version to Database
Determine Linux Port to Process Allocation
Disable the Mac Mouse Pad
Enable trace logs for RestTemplate
Find a Linux Process ID
Find Local Java JDK Version
Find if Application is Deployed on jBoss
Find Version Deployed using GlassFish on Staging
Get access to reach-jboss-dc2.dev
Get authorization to run open__ rest calls
Get Functional Tests Working
Get GAS End Point MPRN
Get JSON Field from SQL Field
Get Logs for Production Applications
Give Permissions to .sh File
Install Java JDK 17
Install old version of DBeaver
Login to the Staging Server
Monitor
Naming & Setup ActiveMQ JMS Queue
Navigate round LINUX less
Password Protect Files in Mac
Post foobot Request
Process a Generated Nexum Payment File
Rename GIT Branch Name
Remake Application using Java-Skeleton
Remove all Docker Images
Remove Port allocation Process
Replay XML on to JMS Queues
Run Rest Application Locally
Run Account Summary Locally from FE App
Screenshot of Desktop
Send Email via Selligent
Send Secure Data in Google Chat
Send Suspense Payload Messages Manually to JMS Queue
Send .War file to Remote Server
Set the PATH and JAVA_HOME
Set up a MDD Reassessment in Stage
Setting up Access to RDS AWS
Squash GIT Commits
Start a Spring Application
View EKS Application Logs
View Swagger Document
Install Java JDK 17
Open Terminal
Run: brew install openjdk
Run: sudo ln -sfn /usr/local/opt/openjdk/libexec/openjdk.jdk /Library/Java/JavaVirtualMachines/openjdk.jdk
Run: echo 'export PATH="/usr/local/opt/openjdk/bin:$PATH"' >> /Users/phardy/.bash_profile
Run: sudo gedit ~/.bash_profile
Amend the content of .bash_profile
Run: source ~/.bash_profile
Amend the content of .bash_profile
Content of .bash_profile should be:
export JAVA_HOME='/Library/Java/JavaVirtualMachines/openjdk.jdk/Contents/Home'

alias j17="export JAVA_HOME=`/usr/libexec/java_home -v17.0`; java -version"
alias j11="export JAVA_HOME=`/usr/libexec/java_home -v 11.0`; java -version"
alias j8="export JAVA_HOME=`/usr/libexec/java_home -v 1.8`; java -version"
alias j7="export JAVA_HOME=`/usr/libexec/java_home -v 1.7`; java -version"
alias j6="export JAVA_HOME=`/usr/libexec/java_home -v 1.6`; java -version"

export NVM_DIR="/Users/phardy/.nvm"
[ -s "$NVM_DIR/nvm.sh" ] && \. "$NVM_DIR/nvm.sh"
export PATH="/usr/local/opt/openjdk/bin:$PATH"
Detail & Help on how this works

The actual location is in /usr/local/opt/openjdk@<version>/libexec/openjdk.jdk
Eg.  /usr/local/opt/openjdk@17/libexec/openjdk.jdk
This is the Actual.
The JAVA_HOME is set to a directory which holds the Symbolic Links of the Actuals.
eg. /Library/Java/JavaVirtualMachines/openjdk-11.jdk
To Create a Symbolic Link
In the command line use:
ln -s existing_source_file optional_symbolic_link
eg. ln -s /usr/local/opt/openjdk@17/libexec/openjdk.jdk /Library/Java/JavaVirtualMachines/openjdk-17.jdk

Install old version of DBeaver
https://dbeaver.io/files/
Abandon a Service Release
This is found via the “Change in Flight” as part of the Weekly Update Meeting.
Google Sheet holding this information is:
https://docs.google.com/spreadsheets/d/16bIa3G2wxB97rtVsgeKeoq0NdHNjihalboESRVAfUTg/edit#gid=1042735328
Confluence Help
https://first-utility.atlassian.net/wiki/spaces/CICD/pages/4064542931/Release+Metrics
Via POSTMAN

PUT: http://hq-dev-ops01/release-metrics/releaseEvent
Accept: application/json
Content-Type: application/json
Body:
{
"id":8737,
"application":"reach-s0001-flow",
"tier":"ABANDONED",
"serverName":"",
"artifactVersion":"1.0.37",
"releaseDate":"2015-10-07T12:00:00",
"author":"adrian"
}
EXAMPLE - 2021-10-26
POST Request:
{
"application": "finance__experian--credit-check-adaptor",
"tier": "ABANDONED",
"serverName": "",
"artifactVersion": "1.25.0",
"releaseDate": "2021-10-26T14:00:00Z",
"author": "phardy"
}
Response
<?xml version="1.0" encoding="UTF-8"?>
<releaseEvent id="201678">
   <application>finance__experian--credit-check-adaptor</application>
   <artifactVersion>1.25.0</artifactVersion>
   <author>phardy</author>
   <releaseDate>2021-10-26 14:00:00.0 GMT</releaseDate>
   <serverName></serverName>
   <tier enumType="com.firstutility.release.metrics.web.Tier">ABANDONED</tier>
</releaseEvent>

Add Contract Test using Rest Assured
Create the <application>-contract-tests application
Add Docker configuration including Makefile
Add Jenkins file
Add this application to jobs--contract-tests
Add this application to jobs--contract-tests
GIT Repo: jobs--contract-tests
Add to /config/reos.groovy
Add CSV File Records to DB using Postman
EXAMPLE - Adding Pod Account Allocation Records
URL’s
STAGING: https://stage.secure.first-utility.com/customer__contact--group-allocation-service/accountmapping
PROD: https://www.secure.first-utility.com/customer__contact--group-allocation-service/accountmapping

Edit the CSV file to have only 3 columns [accountNo, podGroupid, enabledDate]
Open Postman
Click on Pod Mapping Requests
Click on Add Pod Group Mapping
Click on Runner
Click on Pod Mapping Requests
Leave Environment as is
Set the Iterations as to number of records
Under Data, Select the given .csv file
Click Run Pod Mapping…
Repeat Processing into PROD

Add to Email Send JMS Queue
JMS Queue Name: P2P.FINANCE.FINANCE.EMAIL_REQUEST.UK.1
{
"eventRequestId": null,
"eventName": "PAYMENT_RECEIPT",
"identity": "5017550",
"type": "customerNumber",
"source": "maxbill",
"properties": {
"property": [
{
"name": "CUSTOMERID",
"value": "5017550"
},
{
"name": "FIRSTNAME",
"value": "Ann"
},
{
"name": "PAYMENT_DATE",
"value": "10-05-2018"
},
{
"name": "PAYMENT_AMOUNT",
"value": "1.55"
},
{
"name": "TRANSACTION_REFERENCE",
"value": "W00000000002"
}
]
}
}


Add NEXUM Payment by Queue
JMS Queue: P2P.FINANCE.FINANCE.NEXUM_PAYMENT_REQUEST.UK.1
{
"accountNumber": "",
"amount": "",
"authCode": "",
"cardLast4Digits": "",
"sourceChannel": "",
"statusCode": "",
"statusMessage": "",
"transactionDate": "",
"transactionRef": "",
"transactionRefGUID": "",
"paymentType": "",
"receiptAccount": "",
"paymentSuccessful": ""
}
To get the name…
GET
https://services-alb-apps.prod.impello.co.uk/customer-service/customer/5003707


Add Prometheus Metrics
Example Application: finance__collections--payment-options-service
Rest Controller Addition:
@Timed(extraTags = {"name", "save.dd.setup.request"})
New Configuration
@Configuration
public class MetricsConfig {
@Bean
public TimedAspect timedAspect(MeterRegistry registry) {
return new TimedAspect(registry);
}
}
Add Selligent Email Template to System
Open the CustomerJourneyServiceParent project in Git.
Open the README.md.
Follow the Instruction as detailed under Selligent Template Migration.
When each stage is completed, update the Google Sheet: https://docs.google.com/spreadsheets/d/1HZmdwbtJN7660oRqbhYOZUNm-L_avE-p8BYguoL23yA/edit#gid=1219079018
NOTES.
Within the Template .csv make sure no “whitespace” between column headers.
Don’t forget to update the changeSet id & author in the reach-database git project.
To deploy use foobot deploy dev db_reach_database <version>.
Test the Selligent Migration using DEV in LocalHost & point Email Server to DEV
Follow the comms__email--selligent-contract-tests README to do this.
Remember the the Process must be performed on STAGING.
Database to be set to DEV. HOST=reach-jboss-dc2.dev.impello.co.uk
If the SingleTemplateStory fails, check that the Mapping has been applied from Gavin.
Asking for Approval from Business Owner
Send email to Gavin Bullivant & Supriya Sahni requesting them to check the Template Email as sent to the selligent.test.stage.transactional@first-utility.com mailbox.
Supriya will then inform us of the actual Business Owner(s).
Use JENKINS to send Emails using the said Template on STAGING to the BO(s).
Progres Status Document - Chithra
https://docs.google.com/document/d/15u8ESN71tLLY6GYfcUaglx8soUfHYAgJjiUCZkj_9sY/edit?ts=5a325e4a

STAGING & PRODUCTION - lhm-wks-ubuntu

Change IDEA Intellij Version
Install the JetBrains Toolbox
https://www.jetbrains.com/toolbox-app/
Change Password
in MacBook
If you are using a Apple Mac/Linux computer, or are an outsourced partner (i.e. non-Shell Energy):
go to https://adfs.impello.co.uk/adfs/portal/updatepassword/
enter username i.e. first initial and surname
enter current password
click change password
enter new password (See Password Guidelines below)
if successful you will be informed on screen
NOTE - The Username comes up with <domain_name>\<username> e.g. IMPELLO\phardy. This is wrong & the Username will not be recognised. Remove the Domain Name prefix thing i.e. in example would be phardy. It should then be OK (as long as you give the correct Password).
in Ubuntu
Use this link:
https://dc1-srv-pwm01.impello.co.uk/pwm/private/Login
Update Requirements to Docker
This is covered in the Microservices/Docker/HOW TO:
Changing Personal User Password
Copy File in Linux from Command Line
Open a Terminal.
Type in command:
Cp <source> <destination>
e.g.
cp /home/local/IMPELLO/phardy/Downloads/Payment.txt /home/local/IMPELLO/phardy/Payment.txt
Create a New Database
https://docs.google.com/document/d/1qYo8X5Kd-4tjFHObReyll-LSOJne6HHUm-8En7k6KLE/edit
Create Acceptable Passwords for DB
From terminal:
May have to enable the Mac tools to be able to run the Password Generator. This is usually disabled after Mac Update.
export LC_ALL=C		
</dev/urandom tr -dc 'A-Za-z0-9@#$%&_+=!~' | head -c 25 > test.txt
Cat test.txt
Where 25 is example of the password length setting
Set the PATH and JAVA_HOME
echo 'export PATH="/usr/local/opt/openjdk/bin:$PATH"' >> /Users/phardy/.bash_profile
Setting up Access to RDS AWS
AWS Configure to Use dBeaver
RDS - Relational Database Service
Document
STAGE Server: aurora-postgresql-stage.cluster-cti3js1cyaqg.eu-west-1.rds.amazonaws.com
PORT: 5432
Example
jdbc:postgresql://aurora-postgresql-stage.cluster-cti3js1cyaqg.eu-west-1.rds.amazonaws.com:5432/ccgroupallocation
Start a Spring Application
Use Spring Initialzr
https://start.spring.io/

Screenshot of Desktop
Press cmd+shift+3 together.
A picture of the current Desktop screen will be stored in the desktop directory.
Send .War file to Remote Server
Example
Sending the Customer Journey Service ‘war file to the Development Server root directory.
scp customer-journey-service.war phardy@reach-jboss-dc2.dev.impello.co.uk:~/




Replay Nexum Adaptor Request
To replay the suspense in Nexum Adaptor you can use the attached class. The only condition is that you need to put this file in the Nexum Adaptor project because it is looking for Suspense.java.

We have tested it and it works as expected. Currently, it points to staging but I have provided comments on how to do the same for production.
Repost Payment Transactions to NEXUM
Send Email via Selligent
Application: comms__email--selligent-contract-tests
Jenkins: Run Jenkins
Send Secure Data in Google Chat
Use the following URL Link to acquire a Link URL you can paste into the Chat.
http://pastebin01-dc2.dev.impello.co.uk/
This link will expire after a period of time.
Get GAS End Point MPRN
Open Postman
Run the API
https://www.secure.first-utility.com/output/gasendpoint/<mprn>
E.g.
https://www.secure.first-utility.com/output/gasendpoint/7701695500

Available MPRN’s can be obtained from the mpr database within the audit table
Server Location: reach-psql92-dc1.prod.impello.co.uk
Get JSON Field from SQL Field
<datavase_table_field>::jsonb ->> ‘<what_to_get>’
Example: payload::jsonb ->> 'transactionDate'
Get Logs for Production Applications
Create a SOPS JIRA Request
Inform Service Operations
Create a SOPS JIRA Request
Example JIRA
http://jira.impello.co.uk/jira/browse/SOPS-149366
Inform Service Operations
IT Operations Engineer • Service Operations
Current Contact (2022-05-04) Kris Dutton


Report a Problem with FocalPoint
Raise TRE JIRA with Time Recording.
Example:
http://jira.impello.co.uk/jira/browse/TRE-404

User Name: Cloud\DM5621P.Hardy
Email: paul.hardy@shellenergy.co.uk
I see no option to enable resetting of password.
SOPS JIRA: SOPS-227103
Run Rest Application Locally
Setup within the Run/Debug Configurations and Application Configuration.
Click on Edit Configuration
Click on + symbol
Select Application
Set Main class: to the Class with main(final String[] args)
Get Copy & Paste Environment Variables from Puppet.apps into Text Editor
Amend the Environment Variables Text as in example below
After formatted, copy to the Environment Variables: under
EXAMPLE - Environment Variable Text
From…
spring_metrics_export_statsd_prefix   => 'stage.ivr-payments',
spring_metrics_export_statsd_hostname => 'ops-stats-dc2.prod.impello.co.uk',
spring_metrics_export_statsd_port     => 8125,
spring_metrics_export_statsd_enabled  => true,
...to...
SPRING_METRICS_EXPORT_STATSD_PREFIX=stage.ivr-payments
SPRING_METRICS_EXPORT_STATSD_HOSTNAME=ops-stats-dc2.prod.impello.co.uk
SPRING_METRICS_EXPORT_STATSD_PORT=8125
SPRING_METRICS_EXPORT_STATSD_ENABLED=true
NOTES
Will normally have more parameters.
The variable names should be the same as those held in the application.properties place holders e.g. ${SPRING_METRICS_EXPORT_STATSD_PREFIX}
Run Account Summary Locally from FE App
Set up Test Account
https://docs.google.com/document/d/18ZLWJ9f7kMGFzHCse8n8isu5imlj-FqdT1sZ-WgpC_I/edit#heading=h.qwtilfjuz4bn
Start Account Summary app Locally
https://docs.google.com/document/d/1ryTmzKWVgINOx8f3lw2VrcS6IdkF-ByCKohHN3mQMgc/edit#heading=h.vzqzvr9hmtjw
Login to the Staging Server
1. Open Terminal.
2. Type in Command:
   ssh <user>@<server_url>
   e.g. ssh phardy@lhm-stg-app04.stg.impello.co.uk
3. Type in Password if required.
   Location
   Deployment Platform
   Environment
   Server URL
   GlassFish
   Staging
   lhm-stg-app04.stg.impello.co.uk
   GlassFish
   QA Mirror
   app04-mirror.qa.impello.co.uk

Notes:
In QA Mirror use User=root with Development Password.
All the team should now (2018-01-03) have access to this.
If access is denied, ask TechOps (Dionysios Paraskevopoulos - Dennis).
Monitor
Monitor Applications

Rename GIT Branch Name
Rename your local branch
Delete the old-name remote branch and push the new-name local branch
Reset the upstream branch for the new-name local branch
Rename your local branch
This can be done within IDEA if on the Branch you wish to change.
Via Command Line
If you are on the branch you want to rename:


git branch -m new-name

If you are on a different branch:


git branch -m old-name new-name

Delete the old-name remote branch and push the new-name local branch
git push origin :old-name new-name
e.g.
git push origin :feature/RS-8124-replay-suspense-when-payment-not-in-Nexum feature/RS-8124-check-nexum-when-suspense-replayed

Reset the upstream branch for the new-name local branch
Switch to the branch and then:


git push origin -u new-name


Process a Generated Nexum Payment File
Given the Nexum Payment File (see Payment File Definition), place the file in the application input directory. This file should then be picked up by the Application Process & the Payment Detail then added to Nexum Embassy, LogNet & the IVR Payment Confirmation (if applicable).
Payment File Definition
The Nexum Payment File must contain “payments” & is a text file with extension .txt.
e.g. paymentsv14.txt
Example File
Application Process to Transfer file content to NEXUM Embassy
finance-nexum-payment-journey
Operation Steps
Open the Ubuntu Linux Files application.
Click on the Connect to Server.
Type in the to the Server Address the following:
sftp://<username>@lhm-stg-app04.stg.impello.co.uk/home/<username>
e.g.
sftp://phardy@lhm-stg-app04.stg.impello.co.uk/home/phardy
This will open the STAGING user folder on lhm-stg-app04
Copy the given file here from, for instance, email download.
Login to the Staging Server.
Your home directory within STAGING should now contain the Payment File.
Copy this file to the input folder by using command:
cp paymentsv27.txt /var/data/distribution/payment/

PATH: 		/var/data/distribution/payment
FILE NAME: 	payment.txt
SERVER: 	
STAGING: 	lhm-stg-app04.stg.impello.co.uk
Q.A.: 		app04-mirror.qa.impello.co.uk
GIT Branch to transfer Payment Confirmations to IVR Database
https://git.impello.co.uk/projects/NEX/repos/finance-nexum-payment-journey/pull-requests/9/overview

Find Version Deployed using GlassFish on Staging
Login to the Staging Server.
Go to the /applications directory. Path shown below.
Run the "grep" command as shown.
Should see something like:
./finance-nexum-payment-journey/META-INF/maven/org.firstutility.domain-services.finance/finance-nexum-payment-journey/pom.properties:version=0.0.22

In this case the version is 0.0.22.

PATH: 		/var/lib/glassfishv3/glassfish/domains/domain1/applications
COMMAND: 	grep version= `find . -name pom.properties`
SERVER: 	lhm-stg-app04.stg.impello.co.uk

Remake Application using Java-Skeleton
Copy Java-Skeleton Clone into Clipboard
Create New Directory to Hold new version of Application
Run Git Clone of Skeleton
Open the file .tools/init.sh
Delete lines git push -u origin ${BRANCH} & git checkout -b ${BRANCH}
Save new init.sh file
Run the init.sh using bash
Delete from Destination directory
Copy from Source & paste to Destination
Amendments to pom.xml file
Amend the Docker Files as required
Add any missing files from GIT
Add Required pom build Plugins
Run: mvn pmd:check
Copy Java-Skeleton Clone into Clipboard
Java Skeleton URL:
ssh://git@git.impello.co.uk:7999/skel/java-skeleton.git
Run Git Clone of Skeleton
Open Terminal
Navigate to new Directory
Run Command: git clone <skeleton url> <application name>
Example:
git clone ssh://git@git.impello.co.uk:7999/skel/java-skeleton.git finance__nexum--account-adaptor
Run the init.sh using bash
Run the command:
bash .tools/init.sh <stash identifier> <application_name>
e.g.
bash .tools/init.sh fin finance__nexum--account-adaptor
Delete from Destination directory
Delete following from the Destination directory:
scr
functiontest
Pom.xml
Copy from Source & paste to Destination
Copy & Paste following from Source to Destination: scr & acceptance/functiontest DIRECTORIES; pom.xml  & README.md FILES.
NOTE If acceptance Directory Name, rename to functiontest in destination.
Amendments to pom.xml file
Within the ransfered pom.xml file, the Service name has to match the Application name & a line must be added to the <build> section.
<name><service_name></name>
<description>NEXUM Account Adaptor</description>

    <build>
        <finalName>app</finalName> 	added line
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
        </plugins>
    </build>
Add any missing files from GIT
Use git status to determine missing file
Add those missing file required by GIT
Note:
If we want to add all the files, we can type “git add .”
Add Required pom build Plugins
Compare the plugins with existing applications such as finance__nexum--account-adaptor.
Connect from Home
Read: https://mail.google.com/mail/u/0/?ui=2&view=btop&ver=oipjw4qr3poo&search=inbox&th=16045365b5a7fb58&cvid=2
Open Search your computer and online sources.
Search for Cisco Anyconnect Secure Mobility Client.
Open Cisco Anyconnect Secure Mobility Client.
Enter “vpn.first-utility.com” into the Connect to: field.
Set Group: as Development_GA
Password is PIN (clue: 2/8/x) + digits from Authenticator on phone.
Where <connect_to> can be:
hqvpn.first-utility.com
vpn.first-utility.com
dc1vpn.first-utility.com


Give Permissions to .sh File
Sometimes a newly imported file give error “Permission denied” when trying to execute.
Example
./ReadyAPI-x64-2.2.0_R154911594759.sh
Returns
bash: ./ReadyAPI-x64-2.2.0_R154911594759.sh: Permission denied
Solution
In this case the “chmod” should be used to unlock.
E.g. chmod 755 ReadyAPI-x64-2.2.0_R154911594759.sh
Navigate round LINUX less
Note that the ? search searches from bottom up. Best to go to end-of-file first.
Use Shift+G to goto end of the file.
Use ?<thing to search for> to find something (Case Sensitive).
To look at ZIPPED (.gz) files, use zless instead of less.
Type q to exit



Password Protect Files in Mac
Make new Folder to holder files to Password Protect: mkdir folder-name
Rename Folder if necessary: mv oldfilename newfilename
Copy Files to Folder
Open Terminal
Goto Directory where new Folder is located
Run: zip -er <new_zip_file_name>.zip <folder_name>
Add the required new password as instructed
Example
zip -er FiTS_Access_Dimension_customer_data fits


Get authorization to run open__ rest calls
So you are getting a response like…
{
"title": "Internal Server Error",
"description": "Missing request header 'Authorization' for method parameter of type String",
"code": "DEFAULT_EXCEPTION",
"httpStatusCode": 500
}
This example is from the rest call:
GET
/open__customer--usage-service/v2/usage/{productNumber}/GAS/halfhourly?start=2022-11-01&end=2022-11-02
SOLUTION
Run this to get the Bearer Key:
/online__identity--provisioning-service/v1/admin/jwt
?productNumber={account_number}
&username={first_name}.{last_name}+{account_number}@shellenergy.co.uk
&scope=profile
Example
/online__identity--provisioning-service/v1/admin/jwt
?productNumber=377083
&username=rajeshwari.vaddiparthi+377083@shellenergy.co.uk
&scope=profile

/online__identity--provisioning-service/v1/admin/jwt?productNumber=397538&username=paul.hardy+13@shellenergy.co.uk&scope=profile
To Run the open__ Do This..
Example
Environment: STAGE
Application: open__customer--financial-service
Rest Call: /v1/financial/account/summary/2017091
Click on the Authorization tab
Click on the Bearer Token type
Add the jwt (Token) in the Token field
Click Send
Get Functional Tests Working
Sometimes the “make functional-tests” has an Error like:
Xxx
If this happens, run:
IMAGE=docker.impello.co.uk/finance__nexum-embassy--api:0.5.0-SNAPSHOT USER_ID=294127175:294126081 docker-compose --project-name finance__nexum-embassy--apifeature_RS-6262-add-entity-and-repository -f docker-compose.build.yml -f docker-compose.services.yml -f docker-compose.test.yml run --rm mvn -B package -DskipTests
Replay XML on to JMS Queues
ITOPS have a cool tool for replaying XML messages onto queues. As long as you can get the XML, which in the case of comms__customer-journey--notifications is added to a log file when the message is consumed, you can pick a queue to post it onto.

Network username and password should work.
ActiveMQ - New JMS Technology
http://ops-soc01-dc1.prod.impello.co.uk/QueueManagement/ApacheMQ/replay/index.php
HornetQ - Original Reach JMS Technology
http://dc1-srv-soc01.impello.co.uk/replay/replaytool.php
Get access to reach-jboss-dc2.dev
From the Terminal type:
ssh phardy@reach-jboss-dc2.dev.impello.co.uk
First need to set up in the Puppet apps by adding section in Puppet/users/manifest/accounts/cor_platform.pp
@adduser {...
Find the sshkey from the following file:
id_rsa.pub
Sometime might be id_rsa.pub.pub


Deploy Application on jBoss
Use HipChat
Go to the Optimisations Development
Type the foobot instruction as defined
Instruction Definition
Type in:
foobot deploy <location> <module>::<application name> <version>
Where:
Location is where to deploy i.e.Dev
Dev
qamirror
automation
fuse
stage
prod
Note - These can be combined by separating be commas e.g.
stage,dev,fuse
Module is found in Puppet/Module (search for modules in GIT Stash).
Open modules in java & search the appropriate Module Package.
Look at the following example.
Version is the Application Version & is best found under the Jenkins Changes (latest) within Project.
Example - Asking foobot to Deploy the Endpoint Adaptor
Search Puppet Modules for the app name endpoint_adaptor or endpoint-adaptor.
Will be found in the endpoint_adaptor.pp file.
The <module>::<application name> is defined as the class at top of file.
Hence...
Syntax:
foobot deploy dev app_adaptors::endpoint_adaptor 1.1.3
Post foobot Request
Follow link suggested by foobot. This should open Rundeck
Log on to Rundeck using “usual” credentials.
Look under Log Output.
Check failures.
Finished when (blue line indicates progress). Under Summary will show 100%
Open Ping Dashboard & search application name.
Find if Application is Deployed on jBoss
It is required to know if the Application is Deployed on jBoss in order to know what Log to search in.
Open the Application pom.xml & record the artifactId
Search for this artifactId in the Ping Dashboard Application
Record the applications/name
Open Ping Dashboard WEB Page
Search for the applications/name
The jBoss should be obvious in the Header if jBoss Environment
Example
Application Name: ElectricityRegistrationOfSupplyProcessors
artifactId = electricity-registration-of-supply-processors
applications/name = elec-ros-processors
environment = reach-jboss01-dc2 under Staging
Go to View Application Logs in Staging to find Logs.
Find a Linux Process ID
Type in Terminal:
Run from cmd line.
nslookup <ip address>
nbtstat -a <ip address>

Find Local Java JDK Version
From Terminal type

java -version


Determine Linux Port to Process Allocation
Apple MacBook
lsof -i :8080
UBUNTU
Type in Terminal:
sudo netstat -pnlt | grep "<port number>"
E.g.
sudo netstat -pnlt | grep "8080"

This will return something like:
tcp6	0	0 :::<port>	:::*	LISTEN	<process>/docker-proxy
E.g. 	
tcp6	0	0 :::8080	:::*	LISTEN	18714/docker-proxy

Disable the Mac Mouse Pad
Select the “Apple logo” (Main Menu) in the top left and then click on “System Preferences.” Select “Accessibility.” Click on the “Pointer Control” menu item on the left. Check the box next to “Ignore built-in trackpad when mouse or wireless trackpad is present.”

Enable trace logs for RestTemplate
Still not sure what to do but Sunny suggested this...
Add logging.level.org.apache.http=DEBUG to the application.properties file
Test by
Setting up Application run configuration in IDEA

Remove All Docker Images
Lick to the microservice How Too...
https://docs.google.com/document/d/1RIz04QKDLU007d48cO9OWW5mECf94Um7Lr7zmHFkHsQ/edit#heading=h.sveh267wa46n
Remove Port allocation Process
First Determine Linux Port to Process Allocation
MAC: lsof -i :8080
First have to determine the Port Allocation by following the link.
sudo kill <process>
E.g.	sudo kill 1783
NOTE - Process is to PID

What does JPA stand for?
Java Persistence API

What does SCM stand for?
View Swagger Document
Note - You have to run the application up first
Goto: http://localhost:8080/<application-name>/swagger-ui.html
E.g. http://localhost:8080/comms__consent--management-api/swagger-ui.html
