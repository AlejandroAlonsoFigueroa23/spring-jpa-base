jdk_tool = 'Java-HSM '
maven_install = 'openpay-maven-3.9.6'

libraries {
	maven
	ecr
}

application_environments {
    dev {
    	ignore = false
    	ecr_registry = '378653672129.ecr_no_existe.amazonaws.com'
        ecr_region = 'us-east-1'
        aws_cred_id = 'aws-openpay-dev'
        ecr_repo_name = 'ecr_no_existe_jejej'
    }
    
    qa {
    	ignore = true
    }
    
    sandbox {
    	ignore = true
    }
    
    prod {
    	ignore = true
    }
}

release_active = true
