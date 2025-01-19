project_app= 'mi-app'
jdk_tool = 'Java-HSM'
maven_install = 'openpay-maven-3.9.6'
file_name = 'target/mi-layer-merchants-manager-${projectVersion}.jar'
layer_file_name = 'target/mi-layer-merchants-manager-layer.zip'
handler = 'mx.handler.MiHandler::handleRequest'
snap_start = 'false'

libraries{
    maven
    lambda
}

application_environments{
    dev{
        lambda_conf {
            mx {
                lambda_region='us-east-1'
                function_name='mi_funcion_dsfds'
            }
        }
        vars = []
    }
    qa{
         ignore = true
    }
    sandbox{
         ignore = true
    }
    prod{
        ignore = true
    }
}

aws_account='mi_cuenta_imaginaria'
release_active = false

