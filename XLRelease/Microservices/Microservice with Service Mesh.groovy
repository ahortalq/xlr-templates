// Exported from:        http://kubuntu:5516/#/templates/Folder2077150601dc4a849abb23e6ec547b04-Release30b71c3335734c01bd45d754a45306ad/releasefile
// XL Release version:   9.5.2
// Date created:         Thu Apr 23 18:21:45 CEST 2020

xlr {
  template('Microservice with Service Mesh') {
    folder('Microservices')
    variables {
      stringVariable('sha') {
        required false
        showOnReleaseStart false
        label 'sha'
        value '13b594c6a3eaa988ec7f130bc81438872d00bb04'
      }
      stringVariable('email') {
        required false
        showOnReleaseStart false
        label 'email'
        value 'josecarlos.lopezayala@gmail.com'
      }
      stringVariable('message') {
        required false
        showOnReleaseStart false
        label 'message'
        value 'Change log'
      }
      stringVariable('build-number') {
        required false
        showOnReleaseStart false
        label 'build-number'
        value '1'
      }
      stringVariable('build-status') {
        required false
        showOnReleaseStart false
        label 'build-status'
        value 'Passed'
      }
      stringVariable('microservice-name') {
        required false
        showOnReleaseStart false
        label 'microservice-name'
        value 'vote'
      }
      stringVariable('ms-version') {
        required false
        showOnReleaseStart false
        label 'ms-version'
        value '32.0.0-B49'
      }
      stringVariable('microservice-application') {
        required false
        showOnReleaseStart false
        label 'microservice-application'
        value 'voting-app'
      }
      stringVariable('issue') {
        required false
        showOnReleaseStart false
        label 'issue'
        value 'CAL-15'
      }
      listVariable('id_phases') {
        required false
        showOnReleaseStart false
        label 'Id de las fases de otros microservicios'
      }
      listVariable('id_phases_pre') {
        required false
        showOnReleaseStart false
        label 'Id de las fases de otros microservicios'
      }
      listVariable('id_phases_pro') {
        required false
        showOnReleaseStart false
        label 'Id de las fases de otros microservicios'
      }
      listVariable('Dependencias Microservicios') {
        required false
        showOnReleaseStart false
        label 'Dependencias Microservicios'
      }
      listBoxVariable('actions') {
        required false
        showOnReleaseStart false
        label 'Continue?'
        possibleValues 'Continue the deployment to the next environment', 'Execute Rollback to the previous version'
        value 'Continue the deployment to the next environment'
      }
      stringVariable('ms-previous-version-dev') {
        required false
        showOnReleaseStart false
        label 'ms-previous-version-dev'
        value '-'
      }
      stringVariable('ms-previous-version-pre') {
        required false
        showOnReleaseStart false
        label 'ms-previous-version-pre'
        value '-'
      }
      stringVariable('ms-previous-version-pro') {
        required false
        showOnReleaseStart false
        label 'ms-previous-version-pro'
        value '-'
      }
      booleanVariable('rollback_pro') {
        required false
        showOnReleaseStart false
        label 'Rollback?'
      }
      stringVariable('attributes-application-deployment') {
        required false
        showOnReleaseStart false
        value 'deployment-${microservice-name}'
      }
      stringVariable('attributes-application-service') {
        required false
        showOnReleaseStart false
        value 'service-${microservice-name}'
      }
      stringVariable('attributes-application-virtual-service') {
        required false
        showOnReleaseStart false
        value 'virtual-service-${microservice-name}'
      }
      stringVariable('attributes-environment-dev') {
        required false
        showOnReleaseStart false
        value 'application-${microservice-application}-k8s-dev'
      }
      stringVariable('attributes-environment-pre') {
        required false
        showOnReleaseStart false
        value 'application-${microservice-application}-k8s-pre'
      }
      stringVariable('attributes-environment-pro') {
        required false
        showOnReleaseStart false
        value 'application-${microservice-application}-k8s-pro'
      }
      stringVariable('attributes-version') {
        required false
        showOnReleaseStart false
        value '${ms-version}'
      }
      stringVariable('ms-previous-version-dev-number') {
        required false
        showOnReleaseStart false
        label 'ms-previous-version-dev-number'
        value '-'
      }
      stringVariable('ms-previous-version-pre-number') {
        required false
        showOnReleaseStart false
        label 'ms-previous-version-pre-number'
        value '-'
      }
      stringVariable('ms-previous-version-pro-number') {
        required false
        showOnReleaseStart false
        label 'ms-previous-version-pro-number'
        value '-'
      }
      stringVariable('yamls-directory') {
        required false
        showOnReleaseStart false
        label 'yamls-directory'
        value '/tmp/yamls'
      }
      listBoxVariable('deployment-type') {
        required false
        showOnReleaseStart false
        label 'Deployment method'
        possibleValues 'Canary deployment', 'A/B deployment', 'Replace deployment'
        value 'Replace deployment'
      }
      stringVariable('traffic-percentage-for-service-1') {
        required false
        showOnReleaseStart false
        label '% traffic old service'
        value '90'
      }
      stringVariable('traffic-percentage-for-service-2') {
        required false
        showOnReleaseStart false
        label '% traffic new service'
        value '10'
      }
      stringVariable('change-log') {
        required false
        showOnReleaseStart false
        value 'CL-1\n' +
              'CL-2'
        multiline true
      }
      stringVariable('sysId-application-snow') {
        required false
        showOnReleaseStart false
        value '1'
      }
      stringVariable('sysId-changerequest-snow') {
        required false
        showOnReleaseStart false
        value '1'
      }
      stringVariable('number-changerequest-snow') {
        required false
        showOnReleaseStart false
        value '1'
      }
      stringVariable('status-changerequest-snow') {
        required false
        showOnReleaseStart false
        value 'New'
      }
      stringVariable('attributes-transition-version') {
        required false
        showOnReleaseStart false
        value '1'
      }
      stringVariable('jiraComponent') {
        required false
        showOnReleaseStart false
        label 'Jira component name'
        value 'component'
      }
      stringVariable('jiraProjectKey') {
        required false
        showOnReleaseStart false
        label 'Jira project key'
        value 'KEY'
      }
      stringVariable('jiraVersion') {
        required false
        showOnReleaseStart false
        label 'Jira version'
        value '1'
      }
      stringVariable('jiraSummary') {
        required false
        showOnReleaseStart false
        label 'Jira summary'
        value 'Summary'
      }
      stringVariable('DeliveryID') {
        required false
        showOnReleaseStart false
        label 'ID of the new delivery'
        value '1'
      }
    }
    description '## Deploy microservices with Istio resources enabled'
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2019-10-16T09:00:00+0200')
    dueDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2019-11-28T13:17:37+0100')
    tags 'microservice', 'istio'
    scriptUsername 'admin'
    scriptUserPassword '{aes:v0}HxaBT77BiRHGIQ5KZ4HvZgExnjDQjUrhN+av3QYe9uc='
    phases {
      phase('REGISTER WITH DELIVERY') {
        color '#FFAB00'
        tasks {
          custom('Get project and component name') {
            script {
              type 'webhook.JsonWebhook'
              'URL' '${global.jira.url}/rest/api/2/issue/${issue}'
              username '${global.jira.user}'
              password variable('global.jira.password')
              result variable('jiraComponent')
              result2 variable('jiraProjectKey')
              result3 variable('microservice-name')
              jsonPathExpression 'fields.components[0].name'
              jsonPathExpression2 'fields.project.key'
              jsonPathExpression3 'fields.components[0].name'
            }
          }
          custom('Get version and summary') {
            script {
              type 'webhook.JsonWebhook'
              'URL' '${global.jira.url}/rest/api/2/issue/${issue}'
              username '${global.jira.user}'
              password variable('global.jira.password')
              result variable('jiraVersion')
              result2 variable('jiraSummary')
              jsonPathExpression 'fields.fixVersions[0].name'
              jsonPathExpression2 'fields.summary'
            }
          }
          custom('Get or create delivery') {
            script {
              type 'delivery.FindOrCreateDelivery'
              patternId 'Deliveries/Delivery1d1e6b3b85964ccbbbd5c63b3c289ec7'
              searchStrategy 'Search by criteria'
              nameFilter '${jiraProjectKey}: version ${jiraVersion}'
              fallback true
              title '${jiraProjectKey}: version ${jiraVersion}'
              deliveryId variable('DeliveryID')
            }
          }
          custom('Register tracked items in the delivery') {
            script {
              type 'delivery.RegisterTrackedItems'
              deliveryId '${DeliveryID}'
              trackedItems '${issue} ${jiraSummary}'
            }
          }
          custom('Mark tracked item: register') {
            script {
              type 'delivery.MarkTrackedItems'
              deliveryId '${DeliveryID}'
              patternId 'Deliveries/Delivery1d1e6b3b85964ccbbbd5c63b3c289ec7'
              trackedItems '${issue} ${jiraSummary}'
              stage 'Deliveries/Delivery1d1e6b3b85964ccbbbd5c63b3c289ec7/Stage1c3b4663a745479eb353d94d54cd0fc5'
              precedingStages false
            }
          }
          manual('Review') {
            owner 'admin'
          }
        }
      }
      phase('BUILD') {
        color '#0099CC'
        tasks {
          custom('Getting info from Git repository') {
            description 'This step gets some information from GitHub like:\n' +
                        '\n' +
                        '* CommitId\n' +
                        '* Author\n' +
                        '* Message'
            script {
              type 'webhook.JsonWebhook'
              'URL' 'https://api.github.com/repos/ahortalq/${microservice-name}/branches/master'
              result variable('sha')
              result2 variable('email')
              result3 variable('message')
              jsonPathExpression 'commit.sha'
              jsonPathExpression2 'commit.commit.author.email'
              jsonPathExpression3 'commit.commit.message'
            }
          }
          custom('Build Docker image') {
            description 'Jenkins will build the Docker image. We get the build number and build status as result in output properties.'
            precondition 
            script {
              type 'jenkins.Build'
              jenkinsServer 'Jenkins Server'
              jobName '${microservice-name}'
              jobParameters 'CHANGELOG=${message}\n' +
                            'EMAIL=${email}'
              buildNumber variable('build-number')
              buildStatus variable('build-status')
            }
          }
          custom('Get version from tag of the microservice') {
            description 'Get version from tag of the microservice'
            script {
              type 'github.GetVersionFromTag'
              server 'GitHub Server Azu'
              organization 
              repositoryName '${microservice-name}'
              commitId '${sha}'
              tagVersion variable('ms-version')
            }
          }
          notification('Microservice ${microservice-name} version ${ms-version} build successfully') {
            addresses '${email}'
            subject 'Microservice ${microservice-name} version ${ms-version} build successfully'
            body '### New microservice build succesfully\n' +
                 '\n' +
                 '* `Name`: ${microservice-name}\n' +
                 '* `Version`: ${ms-version}\n' +
                 '* `CommitId`: ${sha}\n' +
                 '* `ChangeLog`: ${message}\n' +
                 '\n' +
                 '### Jenkins Job\n' +
                 '\n' +
                 '* `Job name`: ${microservice-name}\n' +
                 '* `Build number`: ${build-number}\n' +
                 '* `Build status`: ${build-status}'
            replyTo 'lyhsoftcompany@gmail.com'
          }
          custom('Mark tracked item: build') {
            script {
              type 'delivery.MarkTrackedItems'
              deliveryId '${DeliveryID}'
              patternId 'Deliveries/Delivery1d1e6b3b85964ccbbbd5c63b3c289ec7'
              trackedItems '${issue} ${jiraSummary}'
              stage 'Deliveries/Delivery1d1e6b3b85964ccbbbd5c63b3c289ec7/Stageebc342a19de247e6857b5df9e13bb377'
              precedingStages false
            }
          }
          manual('Review') {
            owner 'admin'
          }
        }
      }
      phase('CREATE YAML FILES') {
        color '#D94C3D'
        tasks {
          sequentialGroup('Get the latest version deployed') {
            tasks {
              custom('Get lastest version deployed of microservice ${microservice-name} in PRO') {
                description 'Get last deployed version of microservice ${microservice-name} in DEV'
                taskFailureHandlerEnabled true
                taskRecoverOp com.xebialabs.xlrelease.domain.recover.TaskRecoverOp.SKIP_TASK
                script {
                  type 'xld.GetLastVersionDeployed'
                  server 'XL Deploy Server'
                  environmentId 'Environments/application-${microservice-application}-k8s/application-${microservice-application}-k8s-pro/application-${microservice-application}-k8s-pro'
                  applicationName 'deployment-${microservice-name}'
                  applicationId variable('ms-previous-version-pro')
                }
              }
              script('Getting the version number') {
                taskRecoverOp com.xebialabs.xlrelease.domain.recover.TaskRecoverOp.SKIP_TASK
                script (['''\
if releaseVariables["ms-previous-version-pro"] != "-":
    releaseVariables["ms-previous-version-pro-number"] = releaseVariables["ms-previous-version-pro"].split("/")[-1]
    releaseVariables["attributes-transition-version"] = releaseVariables["ms-previous-version-pro"].split("/")[-1] + "+" + "${ms-version}"
'''])
              }
            }
          }
          parallelGroup('Generate yaml files for XL Deploy') {
            tasks {
              manual('Canary release enabled') {
                description '### Create yaml files for XL Deploy (canary release enabled)\n' +
                '\n' +
                'You must use the blueprint feature:\n' +
                '```\n' +
                '$ xl blueprint\n' +
                '```\n' +
                'These are the data you will need:\n' +
                '\n' +
                '* **Blueprint name:** lyhsoft/microservices\n' +
                '* **Applicatoin name:** ${microservice-application}\n' +
                '* **Microservice name:** ${microservice-name}\n' +
                '* **Microservice version:** ${ms-version}\n' +
                '* **Port exposed by the container:**\n' +
                '* **Port exposed by the service:**\n' +
                '* **Are you updating an existing version of this microservice?:** Yes\n' +
                '* **Version of the microservice to replace:** ${ms-previous-version-pro-number}'
                owner 'ahortalq'
                precondition 'releaseVariables["ms-previous-version-pro"] != "-"'
              }
              manual('Canary release disabled') {
                description '### Create yaml files for XL Deploy\n' +
                '\n' +
                'You must use the blueprint feature:\n' +
                '```\n' +
                '$ xl blueprint\n' +
                '```\n' +
                'These are the data you will need:\n' +
                '\n' +
                '* **Blueprint name:** lyhsoft/microservices\n' +
                '* **Applicatoin name:** ${microservice-application}\n' +
                '* **Microservice name:** ${microservice-name}\n' +
                '* **Microservice version:** ${ms-version}\n' +
                '* **Port exposed by the container:**\n' +
                '* **Port exposed by the service:**\n' +
                '* **Are you updating an existing version of this microservice?:** No'
                owner 'ahortalq'
                precondition 'releaseVariables["ms-previous-version-pro"] == "-"'
              }
            }
          }
        }
      }
      phase('DEPLOY TO DEV') {
        color '#08B153'
        tasks {
          userInput('Provide the directory where the yaml files are') {
            description 'Provide the directory where the yaml files are'
            owner 'ycobo'
            variables {
              variable 'yamls-directory'
            }
          }
          custom('Apply resources to XL Deploy') {
            description 'Apply resources to XL Deploy'
            script {
              type 'remoteScript.Unix'
              script '#!/bin/bash\n' +
              '[ -d ${yamls-directory} ] || exit 1\n' +
              'echo "Directory ${yamls-directory} exists"\n' +
              'cd ${yamls-directory}\n' +
              'echo "Copy change log to xebialabs/resourcesFiles/change-log.txt"\n' +
              'cat /var/opt/xebialabs/yaml-maker/yamls-cfg-files/${microservice-application}-${microservice-name}-${ms-version}.log > xebialabs/resourcesFiles/change-log.txt\n' +
              'echo "Copy build info to xebialabs/values.xlvals"\n' +
              'cat /var/opt/xebialabs/yaml-maker/yamls-cfg-files/${microservice-application}-${microservice-name}-${ms-version}.cfg > xebialabs/values.xlvals\n' +
              'xl apply -f xebialabs.yaml'
              address 'localhost'
              username '${folder.localHostUser}'
              password variable('folder.localHostPassword')
            }
          }
          custom('Check cluster K8s available') {
            failureHandler 'taskApi.commentTask(getCurrentTask().getId(), "K8s cluster available validation completed with error")'
            taskFailureHandlerEnabled true
            taskRecoverOp com.xebialabs.xlrelease.domain.recover.TaskRecoverOp.RUN_SCRIPT
            script {
              type 'remoteScript.Unix'
              script './kubectl cluster-info'
              scriptIgnoreVariableInterpolation true
              remotePath '/snap/bin'
              address 'localhost'
              username '${folder.localHostUser}'
              password variable('folder.localHostPassword')
            }
          }
          sequentialGroup('Get the latest version deployed in DEV') {
            tasks {
              custom('Get lastest version deployed of microservice ${microservice-name} in DEV') {
                description 'Get last deployed version of microservice ${microservice-name} in DEV'
                taskFailureHandlerEnabled true
                taskRecoverOp com.xebialabs.xlrelease.domain.recover.TaskRecoverOp.SKIP_TASK
                script {
                  type 'xld.GetLastVersionDeployed'
                  server 'XL Deploy Server'
                  environmentId 'Environments/application-${microservice-application}-k8s/application-${microservice-application}-k8s-dev/application-${microservice-application}-k8s-dev'
                  applicationName 'deployment-${microservice-name}'
                  applicationId variable('ms-previous-version-dev')
                }
              }
              script('Getting the version number') {
                taskRecoverOp com.xebialabs.xlrelease.domain.recover.TaskRecoverOp.SKIP_TASK
                script (['''\
if releaseVariables["ms-previous-version-dev"] != "-":
    releaseVariables["ms-previous-version-dev-number"] = releaseVariables["ms-previous-version-dev"].split("/")[-1]
'''])
              }
            }
          }
          custom('Deploying microservice ${microservice-name} version ${ms-version} on DEV environment') {
            owner 'jsalguero'
            facets {
              facet('udm.DeploymentTaskFacet') {
                variableMapping 'version':'${ms-version}','environmentId':'${attributes-environment-dev}','applicationId':'${attributes-application-deployment}'
              }
              facet('udm.DeploymentTaskFacet') {
                variableMapping 'environmentId':'${attributes-environment-dev}','applicationId':'${attributes-application-service}'
                version '1.0.0-B1'
              }
              facet('udm.DeploymentTaskFacet') {
                variableMapping 'applicationId':'${attributes-application-virtual-service}','version':'${ms-version}','environmentId':'${attributes-environment-dev}'
              }
            }
            script {
              type 'xldeploy.Deploy'
              server 'XL Deploy Server'
              retryCounter 'currentContinueRetrial':'0','currentPollingTrial':'0'
              deploymentPackage 'Applications/Applications/application-${microservice-application}-k8s/deployment-${microservice-name}/${ms-version}'
              deploymentEnvironment 'Environments/application-${microservice-application}-k8s/application-${microservice-application}-k8s-dev/application-${microservice-application}-k8s-dev'
            }
          }
          custom('Update state ${issue} on Jira - integration') {
            script {
              type 'jira.UpdateIssue'
              jiraServer 'Jira Server 7.13.0'
              issueId '${issue}'
              newStatus 'EN INTEGRACIÓN'
              comment 'Deploying microservice on integration environment.'
            }
          }
          custom('Mark tracked item: dev') {
            script {
              type 'delivery.MarkTrackedItems'
              deliveryId '${DeliveryID}'
              patternId 'Deliveries/Delivery1d1e6b3b85964ccbbbd5c63b3c289ec7'
              trackedItems '${issue} ${jiraSummary}'
              stage 'Deliveries/Delivery1d1e6b3b85964ccbbbd5c63b3c289ec7/Stagee50c43b2615a40fe885cd6f6d75c83ce'
              precedingStages false
            }
          }
        }
      }
      phase('TEST AND VALIDATION') {
        color '#FD8D10'
        tasks {
          custom('Microservice ${microservice-name} version ${ms-version} deployed on DEV') {
            description 'Microservice ${microservice-name} version ${ms-version} deployed on DEV environment'
            script {
              type 'slack.Notification'
              server 'Slack Server'
              channel 'xlr-integration'
              message 'Microservice ${microservice-name} version ${ms-version} deployed on DEV environment'
            }
          }
          userInput('Manual testing. Continue the deployment to the next environment') {
            description 'Please enter the required information below.'
            owner 'cvalero'
            variables {
              variable 'actions'
            }
          }
          sequentialGroup('Rollback to the previous version') {
            precondition 'releaseVariables[\'actions\'] == \'Execute Rollback to the previous version\''
            tasks {
              custom('Undeploy microservice ${microservice-name} on the DEV environment') {
                description '### Application previously deployed\n' +
                '\n' +
                '${ms-previous-version-dev}'
                owner 'jccobo'
                facets {
                  facet('udm.DeploymentTaskFacet') {
                    variableMapping 'environmentId':'${attributes-environment-dev}','applicationId':'${attributes-application-deployment}'
                    version '-'
                  }
                  facet('udm.DeploymentTaskFacet') {
                    variableMapping 'environmentId':'${attributes-environment-dev}','applicationId':'${attributes-application-service}'
                    version '-'
                  }
                  facet('udm.DeploymentTaskFacet') {
                    variableMapping 'applicationId':'${attributes-application-virtual-service}','environmentId':'${attributes-environment-dev}'
                    version '-'
                  }
                }
                precondition 'releaseVariables[\'ms-previous-version-dev\'] == \'-\''
                script {
                  type 'xldeploy.Undeploy'
                  server 'XL Deploy Server'
                  retryCounter 'currentContinueRetrial':'0','currentPollingTrial':'0'
                  deployedApplication 'Environments/application-${microservice-application}-k8s/application-${microservice-application}-k8s-dev/application-${microservice-application}-k8s-dev/deployment-${microservice-name}'
                }
              }
              custom('Deploy the previous version of microservice ${microservice-name} on the DEV environment') {
                description '### Application previously deployed\n' +
                '\n' +
                '${ms-previous-version-dev}'
                owner 'ahartman'
                facets {
                  facet('udm.DeploymentTaskFacet') {
                    variableMapping 'version':'${ms-previous-version-dev-number}','environmentId':'${attributes-environment-dev}','applicationId':'${attributes-application-deployment}'
                  }
                  facet('udm.DeploymentTaskFacet') {
                    variableMapping 'environmentId':'${attributes-environment-dev}','applicationId':'${attributes-application-service}'
                    version '1.0.0-B1'
                  }
                  facet('udm.DeploymentTaskFacet') {
                    variableMapping 'version':'${ms-previous-version-dev-number}','applicationId':'${attributes-application-virtual-service}','environmentId':'${attributes-environment-dev}'
                  }
                }
                precondition 'releaseVariables[\'ms-previous-version-dev\'] != \'-\''
                script {
                  type 'xldeploy.Deploy'
                  server 'XL Deploy Server'
                  retryCounter 'currentContinueRetrial':'0','currentPollingTrial':'0'
                  deploymentPackage '${ms-previous-version-dev}'
                  deploymentEnvironment 'Environments/application-${microservice-application}-k8s/application-${microservice-application}-k8s-dev/application-${microservice-application}-k8s-dev'
                }
              }
              gate('Rollback executed, pipeline stopped') {
                description '### Rollback executed, pipeline stopped\n' +
                '\n' +
                'Rollback executed to the previous version. Now you have to decide what to do.'
                owner 'mvega'
              }
            }
          }
        }
      }
      phase('SOURCE CODE ANALYSIS') {
        color '#00875A'
        tasks {
          parallelGroup('Source code analysis') {
            tasks {
              custom('Check analysis Sonar') {
                script {
                  type 'sonar.checkCompliance'
                  sonarServer 'Sonar'
                  resource 'com.xebialabs.voting-app:vote'
                }
              }
              custom('Check analysis BlackDuck') {
                failureHandler 'import time\n' +
                'taskApi.completeTask(getCurrentTask().getId(), "Analysis ended properly")\n' +
                'time.sleep(2)'
                taskRecoverOp com.xebialabs.xlrelease.domain.recover.TaskRecoverOp.RUN_SCRIPT
                script {
                  type 'blackduck.checkCompliance'
                  blackduckServer 'BlackDuck Server'
                  projectName 'Project'
                  versionName 'version'
                }
              }
              custom('Check analysis Checkmarx (CxOSA)') {
                team 'team'
                script {
                  type 'checkmarx.checkOsaCompliance'
                  checkmarxServer 'CheckMarx Server'
                  projectName 'project'
                }
              }
              custom('Check analysis Checkmarx (CxSAST)') {
                team 'team'
                script {
                  type 'checkmarx.gitScan'
                  checkmarxServer 'CheckMarx Server'
                  projectName 'project'
                  preset 'preset'
                  configuration 'conf'
                  url 'url'
                  branch 'branch'
                }
              }
              custom('Check analysis Fortify') {
                script {
                  type 'fortify.checkCompliance'
                  fortifyServer 'Fortify Server'
                  projectName 'application'
                  projectVersion 'version'
                }
              }
            }
          }
          gate('Review code analysis') {
            owner 'ahortalq'
            conditions {
              condition('Review analysis Sonar')
              condition('Review analysis BlackDuck')
              condition('Review analysis Checkmarx CxOSA')
              condition('Review analysis Checkmarx CxSAST')
              condition('Review analysis Fortify')
            }
          }
          custom('Mark tracked item: test') {
            script {
              type 'delivery.MarkTrackedItems'
              deliveryId '${DeliveryID}'
              patternId 'Deliveries/Delivery1d1e6b3b85964ccbbbd5c63b3c289ec7'
              trackedItems '${issue} ${jiraSummary}'
              stage 'Deliveries/Delivery1d1e6b3b85964ccbbbd5c63b3c289ec7/Stagee4f35d1ce6b345d5a76587b530b88056'
              precedingStages false
            }
          }
        }
      }
      phase('DEPLOY TO PRE') {
        color '#999999'
        tasks {
          manual('Approve pass to PRE') {
            description '### Finish this task to start the deployment on PRE environment.\n' +
            '\n' +
            'Once finished, the deployment on PRE environmnet will start.'
            owner 'jcla'
            locked true
          }
          sequentialGroup('Get the latest version deployed in PRE') {
            tasks {
              custom('Get lastest version deployed of microservice ${microservice-name} in PRE') {
                description 'Get last deployed version of microservice ${microservice-name} in DEV'
                taskFailureHandlerEnabled true
                taskRecoverOp com.xebialabs.xlrelease.domain.recover.TaskRecoverOp.SKIP_TASK
                script {
                  type 'xld.GetLastVersionDeployed'
                  server 'XL Deploy Server'
                  environmentId 'Environments/application-${microservice-application}-k8s/application-${microservice-application}-k8s-pre/application-${microservice-application}-k8s-pre'
                  applicationName 'deployment-${microservice-name}'
                  applicationId variable('ms-previous-version-pre')
                }
              }
              script('Getting the version number') {
                taskRecoverOp com.xebialabs.xlrelease.domain.recover.TaskRecoverOp.SKIP_TASK
                script (['''\
if releaseVariables["ms-previous-version-pre"] != "-":
    releaseVariables["ms-previous-version-pre-number"] = releaseVariables["ms-previous-version-pre"].split("/")[-1]
'''])
              }
            }
          }
          custom('Update Ok Test Manager') {
            script {
              type 'xld.UpdateCIProperty'
              server 'XL Deploy Server'
              ciID 'Applications/Applications/application-${microservice-application}-k8s/deployment-${microservice-name}/${ms-version}'
              ciProperty 'satisfiesOkTestManager'
              propertyValue 'true'
            }
          }
          custom('Check cluster K8s available') {
            failureHandler 'taskApi.commentTask(getCurrentTask().getId(), "K8s cluster available validation completed with error")'
            taskFailureHandlerEnabled true
            taskRecoverOp com.xebialabs.xlrelease.domain.recover.TaskRecoverOp.RUN_SCRIPT
            script {
              type 'remoteScript.Unix'
              script './kubectl cluster-info'
              scriptIgnoreVariableInterpolation true
              remotePath '/snap/bin'
              address 'localhost'
              username '${folder.localHostUser}'
              password variable('folder.localHostPassword')
            }
          }
          custom('Deploying microservicio ${microservice-name} version ${ms-version} on PRE environment') {
            owner 'jsalguero'
            facets {
              facet('udm.DeploymentTaskFacet') {
                variableMapping 'version':'${ms-version}','applicationId':'${attributes-application-deployment}','environmentId':'${attributes-environment-pre}'
              }
              facet('udm.DeploymentTaskFacet') {
                variableMapping 'applicationId':'${attributes-application-service}','environmentId':'${attributes-environment-pre}'
                version '1.0.0-B1'
              }
              facet('udm.DeploymentTaskFacet') {
                variableMapping 'applicationId':'${attributes-application-virtual-service}','version':'${ms-version}','environmentId':'${attributes-environment-pre}'
              }
            }
            script {
              type 'xldeploy.Deploy'
              server 'XL Deploy Server'
              retryCounter 'currentContinueRetrial':'0','currentPollingTrial':'0'
              deploymentPackage 'Applications/Applications/application-${microservice-application}-k8s/deployment-${microservice-name}/${ms-version}'
              deploymentEnvironment 'Environments/application-${microservice-application}-k8s/application-${microservice-application}-k8s-pre/application-${microservice-application}-k8s-pre'
            }
          }
          custom('Update state ${issue} on Jira - preproduction') {
            script {
              type 'jira.UpdateIssue'
              jiraServer 'Jira Server 7.13.0'
              issueId '${issue}'
              newStatus 'EN PREPRODUCCIÓN'
              comment 'Deploying microservice on preproduction environment.'
            }
          }
          userInput('Manual testing and continue the deployment to the next environment') {
            description 'Please enter the required information below.'
            owner 'jsalguero'
            variables {
              variable 'actions'
            }
          }
          sequentialGroup('Rollback to the previous version') {
            precondition 'releaseVariables[\'actions\'] == \'Execute Rollback to the previous version\''
            tasks {
              custom('Undeploy microservice ${microservice-name} on the PRE environment') {
                description '### Application previously deployed\n' +
                '\n' +
                '${ms-previous-version-dev}'
                owner 'mvega'
                facets {
                  facet('udm.DeploymentTaskFacet') {
                    variableMapping 'applicationId':'${attributes-application-deployment}','environmentId':'${attributes-environment-pre}'
                    version '-'
                  }
                  facet('udm.DeploymentTaskFacet') {
                    variableMapping 'applicationId':'${attributes-application-service}','environmentId':'${attributes-environment-pre}'
                    version '-'
                  }
                  facet('udm.DeploymentTaskFacet') {
                    variableMapping 'applicationId':'${attributes-application-virtual-service}','version':'${ms-previous-version-pre}','environmentId':'${attributes-environment-pre}'
                  }
                }
                precondition 'releaseVariables[\'ms-previous-version-pre\'] == \'-\''
                script {
                  type 'xldeploy.Undeploy'
                  server 'XL Deploy Server'
                  retryCounter 'currentContinueRetrial':'0','currentPollingTrial':'0'
                  deployedApplication 'Environments/application-${microservice-application}-k8s/application-${microservice-application}-k8s-pre/application-${microservice-application}-k8s-pre/deployment-${microservice-name}'
                }
              }
              custom('Deploy the previous version of microservice ${microservice-name} on the PRE environment') {
                description '### Application previously deployed\n' +
                '\n' +
                '${ms-previous-version-dev}'
                owner 'ycobo'
                facets {
                  facet('udm.DeploymentTaskFacet') {
                    variableMapping 'version':'${ms-previous-version-pre-number}','applicationId':'${attributes-application-deployment}','environmentId':'${attributes-environment-pre}'
                  }
                  facet('udm.DeploymentTaskFacet') {
                    variableMapping 'applicationId':'${attributes-application-service}','environmentId':'${attributes-environment-pre}'
                    version '1.0.0-B1'
                  }
                  facet('udm.DeploymentTaskFacet') {
                    variableMapping 'applicationId':'${attributes-application-virtual-service}','version':'${ms-previous-version-pre-number}','environmentId':'${attributes-environment-pre}'
                  }
                }
                precondition 'releaseVariables[\'ms-previous-version-pre\'] != \'-\''
                script {
                  type 'xldeploy.Deploy'
                  server 'XL Deploy Server'
                  retryCounter 'currentContinueRetrial':'0','currentPollingTrial':'0'
                  deploymentPackage '${ms-previous-version-pre}'
                  deploymentEnvironment 'Environments/application-${microservice-application}-k8s/application-${microservice-application}-k8s-pre/application-${microservice-application}-k8s-pre'
                }
              }
              custom('Update state ${issue} on Jira - integration') {
                script {
                  type 'jira.UpdateIssue'
                  jiraServer 'Jira Server 7.13.0'
                  issueId '${issue}'
                  newStatus 'EN INTEGRACIÓN'
                  comment 'Rollback executed'
                }
              }
              gate('Rollback executed, pipeline stopped') {
                description '### Rollback executed, pipeline stopped\n' +
                '\n' +
                'Rollback executed to the previous version. Now you have to decide what to do.'
                owner 'jccobo'
              }
            }
          }
          custom('Wait for approvals to go to PRO') {
            locked true
            script {
              type 'jira.CheckIssue'
              jiraServer 'Jira Server 7.13.0'
              issueId '${issue}'
              expectedStatusList 'Autorizado paso a producción'
            }
          }
          custom('Mark tracked item: pre') {
            script {
              type 'delivery.MarkTrackedItems'
              deliveryId '${DeliveryID}'
              patternId 'Deliveries/Delivery1d1e6b3b85964ccbbbd5c63b3c289ec7'
              trackedItems '${issue} ${jiraSummary}'
              stage 'Deliveries/Delivery1d1e6b3b85964ccbbbd5c63b3c289ec7/Stageb711d9a1059a49a7a10f5e5acee7af82'
              precedingStages false
            }
          }
          manual('Wait for other microservices') {
            owner 'admin'
          }
          custom('Wait for other microservices to complete the build and test stage') {
            precondition 'False'
            script {
              type 'delivery.WaitForStage'
              patternId 'Deliveries/Delivery1d1e6b3b85964ccbbbd5c63b3c289ec7'
              deliveryId '${DeliveryID}'
              stage 'Deliveries/Delivery1d1e6b3b85964ccbbbd5c63b3c289ec7/Stageb711d9a1059a49a7a10f5e5acee7af82'
            }
          }
        }
      }
      phase('ITSM') {
        color '#00875A'
        tasks {
          sequentialGroup('Create or update application ${microservice-application} on ServiceNow') {
            tasks {
              custom('Find application') {
                taskFailureHandlerEnabled true
                taskRecoverOp com.xebialabs.xlrelease.domain.recover.TaskRecoverOp.SKIP_TASK
                script {
                  type 'servicenow.FindCIByName'
                  servicenowServer 'SerivceNow'
                  tableName 'cmdb_ci_appl'
                  ciName '${microservice-application}'
                  sysId variable('sysId-application-snow')
                }
              }
              custom('Create application on Service Now') {
                description 'Application ${microservice-application}'
                precondition 'releaseVariables[\'sysId-application-snow\'] == "1"'
                taskRecoverOp com.xebialabs.xlrelease.domain.recover.TaskRecoverOp.SKIP_TASK
                script {
                  type 'servicenow.Application'
                  servicenowServer 'SerivceNow'
                  ciName '${microservice-application}'
                  sysId variable('sysId-application-snow')
                }
              }
            }
          }
          custom('Get change log for microservice ${microservice-name} in version ${ms-version}') {
            script {
              type 'xld.GetCIStringProperty'
              server 'XL Deploy Server'
              ciID 'Applications/Applications/application-${microservice-application}-k8s/deployment-${microservice-name}/${ms-version}'
              ciPropertyName 'changeLog'
              ciPropertyValue variable('change-log')
            }
          }
          custom('Create change request on ServcieNow') {
            description '${change-log}'
            script {
              type 'servicenow.CreateChangeRequest'
              servicenowServer 'SerivceNow'
              shortDescription 'Microservice ${microservice-name} (${microservice-application}). Updating to ${ms-version} version'
              description '${change-log}'
              ciSysId '${sysId-application-snow}'
              assignmentGroup 'Change Management'
              state 'Assess'
              priority '3 - Moderate'
              sysId variable('sysId-changerequest-snow')
              'Ticket' variable('number-changerequest-snow')
            }
          }
        }
      }
      phase('DEPLOY TO PRO') {
        color '#D94C3D'
        tasks {
          custom('Wait for approval on change request') {
            locked true
            script {
              type 'servicenow.PollingCheckStatus'
              servicenowServer 'SerivceNow'
              sysId '${sysId-changerequest-snow}'
              checkForStatus 'Scheduled'
              ticket variable('number-changerequest-snow')
              status variable('status-changerequest-snow')
            }
          }
          custom('Update Ok Release Manager') {
            script {
              type 'xld.UpdateCIProperty'
              server 'XL Deploy Server'
              ciID 'Applications/Applications/application-${microservice-application}-k8s/deployment-${microservice-name}/${ms-version}'
              ciProperty 'satisfiesOkReleaseManager'
              propertyValue 'true'
            }
          }
          userInput('Select the deployment method') {
            description 'Please select the deployment method'
            owner 'amateos'
            precondition 'releaseVariables["ms-previous-version-pro"] != "-"'
            variables {
              variable 'deployment-type'
            }
          }
          sequentialGroup('Update authorizations in the transition version') {
            precondition 'releaseVariables[\'deployment-type\'] != "Replace deployment"'
            tasks {
              custom('Update Ok Test Manager in the transition version') {
                script {
                  type 'xld.UpdateCIProperty'
                  server 'XL Deploy Server'
                  ciID 'Applications/Applications/application-${microservice-application}-k8s/deployment-${microservice-name}/${attributes-transition-version}'
                  ciProperty 'satisfiesOkTestManager'
                  propertyValue 'true'
                }
              }
              custom('Update Ok Release Manager in the transition version') {
                script {
                  type 'xld.UpdateCIProperty'
                  server 'XL Deploy Server'
                  ciID 'Applications/Applications/application-${microservice-application}-k8s/deployment-${microservice-name}/${attributes-transition-version}'
                  ciProperty 'satisfiesOkReleaseManager'
                  propertyValue 'true'
                }
              }
            }
          }
          custom('Check cluster K8s available') {
            failureHandler 'taskApi.commentTask(getCurrentTask().getId(), "K8s cluster available validation completed with error")'
            taskFailureHandlerEnabled true
            taskRecoverOp com.xebialabs.xlrelease.domain.recover.TaskRecoverOp.RUN_SCRIPT
            script {
              type 'remoteScript.Unix'
              script './kubectl cluster-info'
              scriptIgnoreVariableInterpolation true
              remotePath '/snap/bin'
              address 'localhost'
              username '${folder.localHostUser}'
              password variable('folder.localHostPassword')
            }
          }
          custom('Register Deployment of microservice ${microservice-name} version ${ms-version} on PRO environment with Dynatrace') {
            script {
              type 'dynatrace.RegisterDeployment'
              
            }
          }
          sequentialGroup('Replace deployment') {
            precondition 'releaseVariables[\'deployment-type\'] == "Replace deployment"'
            tasks {
              custom('Deploying microservicio ${microservice-name} version ${ms-version} on PRO environment') {
                owner 'jsalguero'
                facets {
                  facet('udm.DeploymentTaskFacet') {
                    variableMapping 'version':'${ms-version}','environmentId':'${attributes-environment-pro}','applicationId':'${attributes-application-deployment}'
                  }
                  facet('udm.DeploymentTaskFacet') {
                    variableMapping 'environmentId':'${attributes-environment-pro}','applicationId':'${attributes-application-service}'
                    version '1.0.0-B1'
                  }
                  facet('udm.DeploymentTaskFacet') {
                    variableMapping 'applicationId':'${attributes-application-virtual-service}','version':'${ms-version}','environmentId':'${attributes-environment-pro}'
                  }
                }
                script {
                  type 'xldeploy.Deploy'
                  server 'XL Deploy Server'
                  retryCounter 'currentContinueRetrial':'0','currentPollingTrial':'0'
                  deploymentPackage 'Applications/Applications/application-${microservice-application}-k8s/deployment-${microservice-name}/${ms-version}'
                  deploymentEnvironment 'Environments/application-${microservice-application}-k8s/application-${microservice-application}-k8s-pro/application-${microservice-application}-k8s-pro'
                }
              }
            }
          }
          sequentialGroup('Canary deployment') {
            precondition 'releaseVariables[\'deployment-type\'] == "Canary deployment"'
            tasks {
              userInput('Percentage of traffic that will be sent to the new version ${ms-version}') {
                description 'Please enter the percentage of traffic that will be sent to the services'
                owner 'ahortalq'
                variables {
                  variable 'traffic-percentage-for-service-1'
                  variable 'traffic-percentage-for-service-2'
                }
              }
              custom('Updating the XL Deploy dictionaries with the new values') {
                script {
                  type 'xld.cliUrl'
                  cli 'XL Deploy CLI 9.0.5'
                  scriptUrl 'https://raw.githubusercontent.com/jclopeza/xlr-scripts/master/createXLDResourcesK8sCanaryDeploy.py'
                  options '${microservice-application} ${traffic-percentage-for-service-1} ${traffic-percentage-for-service-2} ${ms-previous-version-pro-number} ${ms-version}'
                }
              }
              custom('Deploying microservicio ${microservice-name} version ${ms-version} on PRO environment in canary release mode') {
                owner 'jsalguero'
                facets {
                  facet('udm.DeploymentTaskFacet') {
                    variableMapping 'version':'${attributes-transition-version}','environmentId':'${attributes-environment-pro}','applicationId':'${attributes-application-deployment}'
                  }
                }
                script {
                  type 'xldeploy.Deploy'
                  server 'XL Deploy Server'
                  retryCounter 'currentContinueRetrial':'0','currentPollingTrial':'0'
                  deploymentPackage 'Applications/Applications/application-${microservice-application}-k8s/deployment-${microservice-name}/${ms-previous-version-pro-number}+${ms-version}'
                  deploymentEnvironment 'Environments/application-${microservice-application}-k8s/application-${microservice-application}-k8s-pro/application-${microservice-application}-k8s-pro'
                }
              }
              custom('Deploying virtual-service on PRO environment') {
                owner 'cvalero'
                facets {
                  facet('udm.DeploymentTaskFacet') {
                    variableMapping 'applicationId':'${attributes-application-virtual-service}','version':'${attributes-transition-version}','environmentId':'${attributes-environment-pro}'
                  }
                }
                script {
                  type 'xldeploy.Deploy'
                  server 'XL Deploy Server'
                  retryCounter 'currentContinueRetrial':'0','currentPollingTrial':'0'
                  deploymentPackage 'Applications/Applications/application-${microservice-application}-k8s/virtual-service-${microservice-name}/${ms-previous-version-pro-number}+${ms-version}'
                  deploymentEnvironment 'Environments/application-${microservice-application}-k8s/application-${microservice-application}-k8s-pro/application-${microservice-application}-k8s-pro'
                }
              }
            }
          }
          sequentialGroup('A\\/B deployment') {
            precondition 'releaseVariables[\'deployment-type\'] == "A/B deployment"'
            tasks {
              custom('Updating the XL Deploy dictionaries with 50% of the traffic to each one') {
                script {
                  type 'xld.cliUrl'
                  cli 'XL Deploy CLI 9.0.5'
                  scriptUrl 'https://raw.githubusercontent.com/jclopeza/xlr-scripts/master/createXLDResourcesK8sCanaryDeploy.py'
                  options '${microservice-application} 50 50 ${ms-previous-version-pro-number} ${ms-version}'
                }
              }
              custom('Deploying microservicio ${microservice-name} version ${ms-version} on PRO environment in A\\/B mode') {
                owner 'ahartman'
                facets {
                  facet('udm.DeploymentTaskFacet') {
                    variableMapping 'version':'${attributes-transition-version}','environmentId':'${attributes-environment-pro}','applicationId':'${attributes-application-deployment}'
                  }
                }
                script {
                  type 'xldeploy.Deploy'
                  server 'XL Deploy Server'
                  retryCounter 'currentContinueRetrial':'0','currentPollingTrial':'0'
                  deploymentPackage 'Applications/Applications/application-${microservice-application}-k8s/deployment-${microservice-name}/${ms-previous-version-pro-number}+${ms-version}'
                  deploymentEnvironment 'Environments/application-${microservice-application}-k8s/application-${microservice-application}-k8s-pro/application-${microservice-application}-k8s-pro'
                }
              }
              custom('Deploying virtual-service on PRO environment') {
                owner 'ahortalq'
                facets {
                  facet('udm.DeploymentTaskFacet') {
                    variableMapping 'applicationId':'${attributes-application-virtual-service}','version':'${attributes-transition-version}','environmentId':'${attributes-environment-pro}'
                  }
                }
                script {
                  type 'xldeploy.Deploy'
                  server 'XL Deploy Server'
                  retryCounter 'currentContinueRetrial':'0','currentPollingTrial':'0'
                  deploymentPackage 'Applications/Applications/application-${microservice-application}-k8s/virtual-service-${microservice-name}/${ms-previous-version-pro-number}+${ms-version}'
                  deploymentEnvironment 'Environments/application-${microservice-application}-k8s/application-${microservice-application}-k8s-pro/application-${microservice-application}-k8s-pro'
                }
              }
            }
          }
          custom('Update change request status to Implement') {
            script {
              type 'servicenow.UpdateChangeRequest'
              servicenowServer 'SerivceNow'
              state 'Implement'
              'Ticket' variable('number-changerequest-snow')
              shortDescription 'Deploying ${microservice-name} (${microservice-application}) to production: version ${ms-version}'
              sysId '${sysId-changerequest-snow}'
            }
          }
        }
      }
      phase('GATHERING METRICS') {
        color '#00875A'
        tasks {
          custom('Register test run with Dynatrace') {
            script {
              type 'dynatrace.RegisterTestRun'
              
            }
          }
          script('Execute service-level tests') {
            script (['''\
import time
time.sleep(2)
print("Ejecucion de tests")
'''])
          }
          custom('Retrieve Dynatrace results') {
            script {
              type 'dynatrace.RetrieveTestResults'
              
            }
          }
          custom('Start Dynatrace recording') {
            script {
              type 'dynatrace.StartRecording'
              
            }
          }
          script('Execute performance tests') {
            script (['''\
import time
time.sleep(2)
print("Ejecucion de tests")
'''])
          }
          custom('Stop Dynatrace recording') {
            script {
              type 'dynatrace.StopRecording'
              
            }
          }
        }
      }
      phase('REVIEW') {
        color '#991C71'
        tasks {
          custom('Update change request status to Review') {
            script {
              type 'servicenow.UpdateChangeRequest'
              servicenowServer 'SerivceNow'
              state 'Review'
              'Ticket' variable('number-changerequest-snow')
              shortDescription 
              sysId '${sysId-changerequest-snow}'
            }
          }
          userInput('Review and decide wether or not execute rollback') {
            description 'Please enter the required information below.'
            owner 'agiraldo'
            variables {
              variable 'rollback_pro'
            }
          }
          sequentialGroup('Executing rollback to the previous version') {
            precondition 'releaseVariables[\'rollback_pro\'] == True'
            tasks {
              custom('Undeploy microservice ${microservice-name} on the PRO environment') {
                description '### Application previously deployed\n' +
                '\n' +
                '${ms-previous-version-dev}'
                owner 'agiraldo'
                facets {
                  facet('udm.DeploymentTaskFacet') {
                    variableMapping 'environmentId':'${attributes-environment-pro}','applicationId':'${attributes-application-deployment}'
                    version '-'
                  }
                  facet('udm.DeploymentTaskFacet') {
                    variableMapping 'environmentId':'${attributes-environment-pro}','applicationId':'${attributes-application-service}'
                    version '-'
                  }
                  facet('udm.DeploymentTaskFacet') {
                    variableMapping 'applicationId':'${attributes-application-virtual-service}','environmentId':'${attributes-environment-pro}'
                    version '-'
                  }
                }
                precondition 'releaseVariables[\'ms-previous-version-pro\'] == \'-\''
                script {
                  type 'xldeploy.Undeploy'
                  server 'XL Deploy Server'
                  retryCounter 'currentContinueRetrial':'0','currentPollingTrial':'0'
                  deployedApplication 'Environments/application-${microservice-application}-k8s/application-${microservice-application}-k8s-pro/application-${microservice-application}-k8s-pro/deployment-${microservice-name}'
                }
              }
              custom('Deploy the previous version of microservice ${microservice-name} on the PRO environment') {
                description '### Application previously deployed\n' +
                '\n' +
                '${ms-previous-version-dev}'
                owner 'isanchez'
                facets {
                  facet('udm.DeploymentTaskFacet') {
                    variableMapping 'version':'${ms-previous-version-pro-number}','environmentId':'${attributes-environment-pro}','applicationId':'${attributes-application-deployment}'
                  }
                  facet('udm.DeploymentTaskFacet') {
                    variableMapping 'environmentId':'${attributes-environment-pro}','applicationId':'${attributes-application-service}'
                    version '1.0.0-B1'
                  }
                  facet('udm.DeploymentTaskFacet') {
                    variableMapping 'applicationId':'${attributes-application-virtual-service}','version':'${ms-previous-version-pro-number}','environmentId':'${attributes-environment-pro}'
                  }
                }
                precondition 'releaseVariables[\'ms-previous-version-pro\'] != \'-\''
                script {
                  type 'xldeploy.Deploy'
                  server 'XL Deploy Server'
                  retryCounter 'currentContinueRetrial':'0','currentPollingTrial':'0'
                  deploymentPackage '${ms-previous-version-pro}'
                  deploymentEnvironment 'Environments/application-${microservice-application}-k8s/application-${microservice-application}-k8s-pro/application-${microservice-application}-k8s-pro'
                }
              }
              gate('Rollback executed, pipeline stopped') {
                description '### Rollback executed, pipeline stopped\n' +
                '\n' +
                'Rollback executed to the previous version. Now you have to decide what to do.'
                owner 'amateos'
              }
            }
          }
          sequentialGroup('Remove the old version of microservice') {
            precondition 'releaseVariables[\'deployment-type\'] != "Replace deployment" and releaseVariables[\'rollback_pro\'] == False'
            tasks {
              custom('Deploying microservicio ${microservice-name} version ${ms-version} on PRO environment') {
                owner 'charo'
                facets {
                  facet('udm.DeploymentTaskFacet') {
                    variableMapping 'version':'${ms-version}','environmentId':'${attributes-environment-dev}','applicationId':'${attributes-application-deployment}'
                  }
                }
                script {
                  type 'xldeploy.Deploy'
                  server 'XL Deploy Server'
                  retryCounter 'currentContinueRetrial':'0','currentPollingTrial':'0'
                  deploymentPackage 'Applications/Applications/application-${microservice-application}-k8s/deployment-${microservice-name}/${ms-version}'
                  deploymentEnvironment 'Environments/application-${microservice-application}-k8s/application-${microservice-application}-k8s-pro/application-${microservice-application}-k8s-pro'
                }
              }
            }
          }
        }
      }
      phase('POST DEPLOY') {
        color '#0099CC'
        tasks {
          script('Publish blog with new features') {
            owner 'admin'
            script (['''\
import time
time.sleep(5)
print("Publish blog")
'''])
          }
          custom('Update state ${issue} on Jira - production') {
            script {
              type 'jira.UpdateIssue'
              jiraServer 'Jira Server 7.13.0'
              issueId '${issue}'
              newStatus 'EN PRODUCCIÓN'
              comment 'Deploying microservice on production environment.'
            }
          }
          custom('Update change request status to Closed') {
            script {
              type 'servicenow.UpdateChangeRequest'
              servicenowServer 'SerivceNow'
              state 'Closed'
              'Ticket' variable('number-changerequest-snow')
              shortDescription 
              sysId '${sysId-changerequest-snow}'
              closeCode 'successful'
              closeNotes 'Microservice ${microservice-name} (${microservice-application}) updated to ${ms-version} version'
            }
          }
          custom('Create branch for maintenance') {
            description 'Creating maintenance branch for microservice ${microservice-name} and version ${ms-version}'
            script {
              type 'github.CreateBranch'
              server 'GitHub Server Azu'
              repositoryName '${microservice-name}'
              sha '${sha}'
              newBranch 'maintenance-${ms-version}'
            }
          }
          parallelGroup('Delete useless resources') {
            precondition 'releaseVariables[\'ms-previous-version-pro\'] != \'-\''
            tasks {
              custom('Delete deployment resources') {
                script {
                  type 'xld.DeleteCI'
                  server 'XL Deploy Server'
                  ciID 'Applications/Applications/application-${microservice-application}-k8s/deployment-${microservice-name}/${ms-previous-version-pro-number}+${ms-version}'
                }
              }
              custom('Delete virtual service resources') {
                script {
                  type 'xld.DeleteCI'
                  server 'XL Deploy Server'
                  ciID 'Applications/Applications/application-${microservice-application}-k8s/virtual-service-${microservice-name}/${ms-previous-version-pro-number}+${ms-version}'
                }
              }
            }
          }
          notification('Microservice ${microservice-name} version ${ms-version} is alive!!') {
            addresses '${email}'
            subject 'Microservice ${microservice-name} version ${ms-version} is alive!!'
            body '### New version is alive!!\n' +
            '\n' +
            '* `Name`: ${microservice-name}\n' +
            '* `Version`: ${ms-version}'
            replyTo 'lyhsoftcompany@gmail.com'
          }
          custom('Mark tracked item: pre (copy)') {
            script {
              type 'delivery.MarkTrackedItems'
              deliveryId '${DeliveryID}'
              patternId 'Deliveries/Delivery1d1e6b3b85964ccbbbd5c63b3c289ec7'
              trackedItems '${issue} ${jiraSummary}'
              stage 'Deliveries/Delivery1d1e6b3b85964ccbbbd5c63b3c289ec7/Stage51cdee56926842658e56812a7e61341d'
              precedingStages false
            }
          }
        }
      }
    }
    extensions {
      dashboard('Dashboard') {
        parentId 'Applications/Folder2077150601dc4a849abb23e6ec547b04/Release30b71c3335734c01bd45d754a45306ad'
        owner 'admin'
        tiles {
          releaseProgressTile('Release progress') {
            row 1
          }
          releaseSummaryTile('Release summary') {
            row 1
          }
          resourceUsageTile('Resource usage') {
            row 3
          }
          timelineTile('Release timeline') {
            row 2
          }
          jiraQueryTile('Preproducción') {
            row 0
            col 1
            jiraServer 'Jira Server 7.13.0'
            query 'project = "Voting App" AND status in ("En Preproducción", "Autorizado paso a producción", "En Producción")'
          }
          jiraQueryTile('Desarrollo') {
            row 0
            col 0
            jiraServer 'Jira Server 7.13.0'
            query 'project = "Voting App" AND status in ("En integración", "En Preproducción", "Autorizado paso a producción", "En Producción")'
          }
          jiraQueryTile('Producción') {
            row 0
            col 2
            jiraServer 'Jira Server 7.13.0'
            query 'project = "Voting App" AND status in ("En Producción")'
          }
          deploymentsDistributionTile('Deployments distribution') {
            row 1
            col 2
            height 1
          }
        }
      }
    }
    
  }
}