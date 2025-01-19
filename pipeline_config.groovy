jdk_tool = 'Java-HSM'
maven_install = 'openpay-maven-3.9.6'
file_name = "build/distributions/mi-artfefacto.zip"
layer_file_name = "build/distributions/mi-artfefacto-layer.zip"
handler = "paquete.submodule.functionality.handler.MyHandler"

libraries {
	maven
	ecr
}

application_environments {
    dev {
    	ignore = false
    	ecr_registry = '232432.ecr_no_existe.amazonaws.com'
        ecr_region = 'us-east-1'
        aws_cred_id = 'aws-alejandro-id-noexiste'
        ecr_repo_name = 'ecr_no_existe_jejej'
	lambda_region = "us-east-1"
        function_name = "demo-function-dev"
        vars = [
            MICRONAUT_ENVIRONMENTS:"DEVELOP"
        ]    
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
