
/*
  Estas configuraciones son especificas para este repositorio/proyecto
*/
// Configuraciones generales
project_app = "itam-reports"
jdk_tool = 'Java-OP11'

// Librerias que se usaran
libraries{
    maven    
}

// Variables a usar por ambiente
application_environments{
    sandbox{
        stage = 'sandbox'
    }
    prod{
        ignore = true
        stage = 'production'
    }
}

release_active = true
