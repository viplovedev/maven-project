pipeline {
	/* A Declarative Pipeline */
	agent any
	
	stages {
		stage('Init'){
			steps{
			    bat 'echo %Path%'
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