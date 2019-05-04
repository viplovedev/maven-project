pipeline {
	/* A Declarative Pipeline */
	agent any
	
	stages {
		stage('Init'){
			steps{
			    bat 'echo JRE_HOME = %JRE_HOME%'
			    bat 'mvn clean package'
			    bat 'set JAVA_HOME=C:/Program Files/Java/jdk-9.0.1'
			    bat 'echo JAVA_HOME = %JAVA_HOME%'
			}
		}

		stage('Build'){
			steps {
				echo 'Building...'
			}
		}

		stage('Deploy'){
			steps {
				echo 'Code Deployed.'
			}
		}
		
		stage('Deploy to Staging'){
			/* agent section could go here as well */
			steps {
				echo 'Now Archiving...'
				//archiveArtifacts artifacts: '**/*war'
			}
		}
	}
}