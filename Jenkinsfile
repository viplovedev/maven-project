pipeline {
	/* A Declarative Pipeline */
	agent any
	
	stages {
		stage('Build'){
			steps {
				bat 'mvn clean package'
			}
		}
		
		stage('Deploy to Staging'){
			/* agent section could go here as well */
			steps {
				echo 'Now Archiving...'
				archiveArtifacts artifacts: '**/*war'
			}
		}
	}
}