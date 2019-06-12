pipeline {
	agent any
	
	parameters {
		string(name: 'tomcat_dev', defaultValue: '3.16.43.121', description: 'Staging Server')
		string(name: 'tomcat_prod', defaultValue: '18.223.122.22', description: 'Production Server')
		string(name: 'pem_file_loc', defaultValue: 'E:\\Jenkins\\AWS\\tomcat-demo.pem')
	}
	
	triggers {
		pollSCM('* * * * *')
	}
	
	stages{
        stage('Build'){
            steps {
                bat 'mvn clean package'
            }
            post {
                success {
                    echo 'Now Archiving...'
                    archiveArtifacts artifacts: '**/target/*.war'
                }
            }
        }

        stage ('Deployments'){
            parallel{
                stage ('Deploy to Staging'){
                    steps {
                        bat "C:\\"Program Files (x86)"\\Jenkins\\workspace\\package(through file)\\copy_war_to_ec2.bat"
                    }
                }
            }
        }
    }
}